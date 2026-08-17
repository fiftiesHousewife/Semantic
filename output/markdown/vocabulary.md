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

**8,054 occurrences of 959 distinct words**, read against ordinary English and the platform's own API. The 258 that clear the bar hold 62.1% of what was written and 86.4% of the divergence, and 100.0% of their occurrences are names. 227 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0159%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 959, over 999 draws yielding 2,839,202 scored words from that reference's own distribution. A word is here where it beats **0.0192%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 959, over 999 draws yielding 1,599,881 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4402% | 252 | 100.0% | 3.1289% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9711% | 165 | 100.0% | 2.0487% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.7717% | 127 | 100.0% | 1.5769% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `concept` | 0.4892% | 83 | 100.0% | 1.0305% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `occurrences` | 0.4807% | 78 | 100.0% | 0.9685% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 7 | `share` | 0.4568% | 83 | 100.0% | 1.0305% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 8 | `concepts` | 0.4565% | 76 | 100.0% | 0.9436% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 9 | `written` | 0.4512% | 80 | 100.0% | 0.9933% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 10 | `scope` | 0.4053% | 80 | 100.0% | 0.9933% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:18` |
| 11 | `sense` | 0.3813% | 68 | 100.0% | 0.8443% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 12 | `topics` | 0.3412% | 57 | 100.0% | 0.7077% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:34` |
| 13 | `label` | 0.2969% | 73 | 100.0% | 0.9064% | 0.0028% | 0.0770% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 14 | `mass` | 0.2888% | 51 | 100.0% | 0.6332% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 15 | `reading` | 0.2837% | 50 | 100.0% | 0.6208% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 16 | `files` | 0.2836% | 55 | 100.0% | 0.6829% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 17 | `divergence` | 0.2761% | 45 | 100.0% | 0.5587% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 18 | `source` | 0.2557% | 85 | 100.0% | 1.0554% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 19 | `stated` | 0.2462% | 44 | 100.0% | 0.5463% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportSchema.java:34` |
| 20 | `rung` | 0.2421% | 39 | 100.0% | 0.4842% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 21 | `broader` | 0.2381% | 40 | 100.0% | 0.4966% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 22 | `path` | 0.2286% | 84 | 100.0% | 1.0430% | 0.0055% | 0.1967% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 23 | `repository` | 0.2237% | 39 | 100.0% | 0.4842% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 24 | `bits` | 0.2121% | 41 | 100.0% | 0.5091% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 25 | `chance` | 0.2066% | 38 | 100.0% | 0.4718% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 26 | `published` | 0.2032% | 40 | 100.0% | 0.4966% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:54` |
| 27 | `site` | 0.1909% | 39 | 100.0% | 0.4842% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 28 | `domains` | 0.1688% | 29 | 100.0% | 0.3601% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 29 | `term` | 0.1617% | 33 | 100.0% | 0.4097% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 30 | `matched` | 0.1606% | 27 | 100.0% | 0.3352% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:60` |
| 31 | `terms` | 0.1600% | 33 | 100.0% | 0.4097% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:171` |
| 32 | `themes` | 0.1573% | 27 | 100.0% | 0.3352% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:98` |
| 33 | `subject` | 0.1512% | 34 | 100.0% | 0.4222% | 0.0117% | 0.0268% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 34 | `phrase` | 0.1461% | 25 | 100.0% | 0.3104% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:60` |
| 35 | `prose` | 0.1446% | 24 | 100.0% | 0.2980% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 36 | `vocabulary` | 0.1439% | 24 | 100.0% | 0.2980% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:85` |
| 37 | `nearest` | 0.1433% | 24 | 100.0% | 0.2980% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 38 | `token` | 0.1417% | 35 | 100.0% | 0.4346% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 39 | `senses` | 0.1377% | 23 | 100.0% | 0.2856% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 40 | `lemma` | 0.1366% | 22 | 100.0% | 0.2732% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 41 | `witnesses` | 0.1353% | 23 | 100.0% | 0.2856% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 42 | `citations` | 0.1340% | 22 | 100.0% | 0.2732% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `summary` | 0.1313% | 27 | 100.0% | 0.3352% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:97` |
| 44 | `legibility` | 0.1304% | 21 | 100.0% | 0.2607% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:88` |
| 45 | `tsv` | 0.1242% | 20 | 100.0% | 0.2483% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 46 | `cited` | 0.1216% | 21 | 100.0% | 0.2607% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 47 | `entry` | 0.1203% | 61 | 100.0% | 0.7574% | 0.0051% | 0.2073% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 48 | `placed` | 0.1194% | 23 | 100.0% | 0.2856% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 49 | `named` | 0.1167% | 26 | 100.0% | 0.3228% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 50 | `occurrence` | 0.1164% | 22 | 100.0% | 0.2732% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `taxonomy` | 0.1151% | 19 | 100.0% | 0.2359% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:138` |

<details>
<summary>208 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1131% | 19 | 100.0% | 0.2359% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1108% | 19 | 100.0% | 0.2359% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `resamples` | 0.1055% | 17 | 100.0% | 0.2111% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 55 | `lines` | 0.1052% | 23 | 100.0% | 0.2856% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 56 | `scopes` | 0.1004% | 17 | 100.0% | 0.2111% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 57 | `dictionary` | 0.1004% | 18 | 100.0% | 0.2235% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 58 | `part_of_speech` | 0.0993% | 16 | 100.0% | 0.1987% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 59 | `lexicon` | 0.0969% | 16 | 100.0% | 0.1987% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 60 | `line` | 0.0966% | 52 | 100.0% | 0.6456% | 0.0313% | 0.1866% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 61 | `render` | 0.0960% | 20 | 100.0% | 0.2483% | 0.0014% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 62 | `phrases` | 0.0944% | 16 | 100.0% | 0.1987% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 63 | `pref` | 0.0943% | 16 | 100.0% | 0.1987% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 64 | `lemmas` | 0.0931% | 15 | 100.0% | 0.1862% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 65 | `mark_down` | 0.0931% | 15 | 100.0% | 0.1862% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 66 | `parsed` | 0.0922% | 17 | 100.0% | 0.2111% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:172` |
| 67 | `kept` | 0.0914% | 18 | 100.0% | 0.2235% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:181` |
| 68 | `ranked` | 0.0912% | 16 | 100.0% | 0.1987% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:85` |
| 69 | `labels` | 0.0903% | 17 | 100.0% | 0.2111% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:19` |
| 70 | `semantics` | 0.0895% | 15 | 100.0% | 0.1862% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 71 | `english` | 0.0884% | 20 | 100.0% | 0.2483% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 72 | `subjects` | 0.0881% | 16 | 100.0% | 0.1987% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 74 | `owl` | 0.0842% | 14 | 100.0% | 0.1738% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 75 | `specificity` | 0.0834% | 14 | 100.0% | 0.1738% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 76 | `names` | 0.0819% | 32 | 100.0% | 0.3973% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 77 | `comparison` | 0.0819% | 15 | 100.0% | 0.1862% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 78 | `drawn` | 0.0817% | 15 | 100.0% | 0.1862% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 79 | `bearers` | 0.0807% | 13 | 100.0% | 0.1614% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 80 | `commonest` | 0.0807% | 13 | 100.0% | 0.1614% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 81 | `longest` | 0.0802% | 14 | 100.0% | 0.1738% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:84` |
| 82 | `rows` | 0.0789% | 21 | 100.0% | 0.2607% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 83 | `sighting` | 0.0785% | 13 | 100.0% | 0.1614% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 84 | `form` | 0.0778% | 23 | 100.0% | 0.2856% | 0.0376% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:125` |
| 85 | `sightings` | 0.0777% | 13 | 100.0% | 0.1614% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 86 | `tally` | 0.0775% | 13 | 100.0% | 0.1614% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 87 | `tokens` | 0.0746% | 13 | 100.0% | 0.1614% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 88 | `corroborated` | 0.0745% | 12 | 100.0% | 0.1490% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 89 | `rungs` | 0.0745% | 12 | 100.0% | 0.1490% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 90 | `synset` | 0.0745% | 12 | 100.0% | 0.1490% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 91 | `weight` | 0.0745% | 18 | 100.0% | 0.2235% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 92 | `piece` | 0.0743% | 15 | 100.0% | 0.1862% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 93 | `ranks` | 0.0735% | 13 | 100.0% | 0.1614% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 94 | `pooled` | 0.0734% | 13 | 100.0% | 0.1614% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 95 | `reference` | 0.0707% | 31 | 100.0% | 0.3849% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 96 | `noun` | 0.0703% | 12 | 100.0% | 0.1490% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:61` |
| 97 | `carried` | 0.0691% | 14 | 100.0% | 0.1738% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 98 | `unplaced` | 0.0683% | 11 | 100.0% | 0.1366% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 99 | `exported` | 0.0673% | 13 | 100.0% | 0.1614% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 101 | `branch` | 0.0666% | 14 | 100.0% | 0.1738% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 102 | `root` | 0.0642% | 29 | 100.0% | 0.3601% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 103 | `commit` | 0.0640% | 17 | 100.0% | 0.2111% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 104 | `seed` | 0.0634% | 15 | 100.0% | 0.1862% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:88` |
| 105 | `siblings` | 0.0634% | 11 | 100.0% | 0.1366% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 106 | `readings` | 0.0634% | 11 | 100.0% | 0.1366% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:57` |
| 107 | `runs` | 0.0627% | 13 | 100.0% | 0.1614% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 108 | `headword` | 0.0621% | 10 | 100.0% | 0.1242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 109 | `normalisation` | 0.0621% | 10 | 100.0% | 0.1242% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 110 | `references` | 0.0608% | 13 | 100.0% | 0.1614% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 111 | `dominant` | 0.0608% | 11 | 100.0% | 0.1366% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 112 | `rank` | 0.0603% | 11 | 100.0% | 0.1366% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 113 | `sha` | 0.0602% | 10 | 100.0% | 0.1242% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 114 | `signals` | 0.0593% | 11 | 100.0% | 0.1366% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:85` |
| 115 | `shared` | 0.0590% | 17 | 100.0% | 0.2111% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 116 | `class` | 0.0581% | 79 | 100.0% | 0.9809% | 0.0143% | 0.4972% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 117 | `total` | 0.0575% | 16 | 100.0% | 0.1987% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 118 | `extraction` | 0.0572% | 10 | 100.0% | 0.1242% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 119 | `function` | 0.0572% | 16 | 100.0% | 0.1987% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 120 | `comment` | 0.0564% | 22 | 100.0% | 0.2732% | 0.0046% | 0.0559% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 121 | `field` | 0.0563% | 37 | 100.0% | 0.4594% | 0.0234% | 0.1562% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 122 | `file` | 0.0561% | 59 | 100.0% | 0.7326% | 0.0066% | 0.3309% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 123 | `wiktionary` | 0.0559% | 9 | 100.0% | 0.1117% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 124 | `distinctive` | 0.0555% | 10 | 100.0% | 0.1242% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:155` |
| 125 | `blob` | 0.0550% | 15 | 100.0% | 0.1862% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 126 | `first` | 0.0523% | 36 | 100.0% | 0.4470% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 127 | `leading` | 0.0517% | 13 | 100.0% | 0.1614% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 128 | `weights` | 0.0515% | 9 | 100.0% | 0.1117% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 129 | `every` | 0.0507% | 20 | 100.0% | 0.2483% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 130 | `claim` | 0.0502% | 11 | 100.0% | 0.1366% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 131 | `sources` | 0.0501% | 11 | 100.0% | 0.1366% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 132 | `declared` | 0.0499% | 17 | 100.0% | 0.2111% | 0.0042% | 0.0356% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 133 | `arxiv` | 0.0497% | 8 | 100.0% | 0.0993% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 134 | `chosen` | 0.0495% | 10 | 100.0% | 0.1242% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:89` |
| 135 | `ontology` | 0.0474% | 8 | 100.0% | 0.0993% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 136 | `abbreviation` | 0.0472% | 8 | 100.0% | 0.0993% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 137 | `spans` | 0.0472% | 9 | 100.0% | 0.1117% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 138 | `placements` | 0.0466% | 8 | 100.0% | 0.0993% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 139 | `archive` | 0.0465% | 10 | 100.0% | 0.1242% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 140 | `counts` | 0.0463% | 9 | 100.0% | 0.1117% | 0.0021% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:44` |
| 141 | `contribution` | 0.0458% | 9 | 100.0% | 0.1117% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 142 | `merged` | 0.0457% | 8 | 100.0% | 0.0993% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:27` |
| 143 | `resource` | 0.0455% | 23 | 100.0% | 0.2856% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 144 | `export` | 0.0453% | 12 | 100.0% | 0.1490% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 145 | `ranking` | 0.0446% | 8 | 100.0% | 0.0993% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:61` |
| 146 | `suffix` | 0.0444% | 11 | 100.0% | 0.1366% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 147 | `cost` | 0.0443% | 13 | 100.0% | 0.1614% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 148 | `header` | 0.0442% | 21 | 100.0% | 0.2607% | 0.0012% | 0.0669% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 149 | `draws` | 0.0441% | 8 | 100.0% | 0.0993% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 150 | `apart` | 0.0437% | 9 | 100.0% | 0.1117% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 151 | `offered` | 0.0436% | 10 | 100.0% | 0.1242% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:31` |
| 152 | `collocated` | 0.0435% | 7 | 100.0% | 0.0869% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 153 | `taxonomies` | 0.0435% | 7 | 100.0% | 0.0869% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:106` |
| 154 | `reads` | 0.0431% | 10 | 100.0% | 0.1242% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 155 | `held` | 0.0431% | 14 | 100.0% | 0.1738% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 156 | `odds` | 0.0429% | 8 | 100.0% | 0.0993% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 157 | `row` | 0.0415% | 31 | 100.0% | 0.3849% | 0.0032% | 0.1430% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 158 | `distribution` | 0.0414% | 9 | 100.0% | 0.1117% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:53` |
| 159 | `withheld` | 0.0413% | 7 | 100.0% | 0.0869% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 160 | `ordinary` | 0.0411% | 8 | 100.0% | 0.0993% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:34` |
| 161 | `shown` | 0.0408% | 10 | 100.0% | 0.1242% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 162 | `foreign` | 0.0407% | 10 | 100.0% | 0.1242% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 163 | `votes` | 0.0405% | 8 | 100.0% | 0.0993% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:48` |
| 164 | `extract` | 0.0401% | 9 | 100.0% | 0.1117% | 0.0016% | 0.0070% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 165 | `verdict` | 0.0391% | 7 | 100.0% | 0.0869% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 166 | `domain` | 0.0390% | 12 | 100.0% | 0.1490% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 167 | `anchor` | 0.0389% | 10 | 100.0% | 0.1242% | 0.0015% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 168 | `revision` | 0.0389% | 7 | 100.0% | 0.0869% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 169 | `items` | 0.0378% | 9 | 100.0% | 0.1117% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:76` |
| 170 | `intensity` | 0.0374% | 7 | 100.0% | 0.0869% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:210` |
| 171 | `set_aside` | 0.0372% | 6 | 100.0% | 0.0745% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:170` |
| 172 | `sentence` | 0.0372% | 8 | 100.0% | 0.0993% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 173 | `quantity` | 0.0372% | 7 | 100.0% | 0.0869% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 174 | `median` | 0.0365% | 7 | 100.0% | 0.0869% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 175 | `labelled` | 0.0365% | 8 | 100.0% | 0.0993% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:107` |
| 176 | `fields` | 0.0357% | 12 | 100.0% | 0.1490% | 0.0051% | 0.0246% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 177 | `mean` | 0.0350% | 9 | 100.0% | 0.1117% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 178 | `glued` | 0.0350% | 6 | 100.0% | 0.0745% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 179 | `crossings` | 0.0344% | 6 | 100.0% | 0.0745% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 181 | `admitted` | 0.0341% | 7 | 100.0% | 0.0869% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 182 | `vote` | 0.0340% | 8 | 100.0% | 0.0993% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 183 | `chain` | 0.0339% | 8 | 100.0% | 0.0993% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 184 | `freeze` | 0.0338% | 6 | 100.0% | 0.0745% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:76` |
| 185 | `canonical` | 0.0336% | 9 | 100.0% | 0.1117% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 186 | `depth` | 0.0336% | 9 | 100.0% | 0.1117% | 0.0035% | 0.0119% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 187 | `nothing` | 0.0335% | 9 | 100.0% | 0.1117% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 188 | `runner` | 0.0334% | 6 | 100.0% | 0.0745% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:59` |
| 189 | `refused` | 0.0323% | 7 | 100.0% | 0.0869% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 190 | `pieces` | 0.0315% | 7 | 100.0% | 0.0869% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 191 | `net` | 0.0315% | 8 | 100.0% | 0.0993% | 0.0063% | 0.0092% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 192 | `carries` | 0.0312% | 6 | 100.0% | 0.0745% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 193 | `descendants` | 0.0311% | 6 | 100.0% | 0.0745% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:20` |
| 194 | `json` | 0.0311% | 6 | 100.0% | 0.0745% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 195 | `fibo` | 0.0310% | 5 | 100.0% | 0.0621% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 196 | `ontologies` | 0.0310% | 5 | 100.0% | 0.0621% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 197 | `translingual` | 0.0310% | 5 | 100.0% | 0.0621% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 198 | `title` | 0.0310% | 14 | 100.0% | 0.1738% | 0.0105% | 0.0422% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 199 | `qualified` | 0.0306% | 9 | 100.0% | 0.1117% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 200 | `compound` | 0.0304% | 10 | 100.0% | 0.1242% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 201 | `endpoint` | 0.0303% | 6 | 100.0% | 0.0745% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 202 | `excluded` | 0.0303% | 6 | 100.0% | 0.0745% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 203 | `read` | 0.0299% | 64 | 100.0% | 0.7946% | 0.0143% | 0.4722% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:96` |
| 204 | `functions` | 0.0298% | 7 | 100.0% | 0.0869% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 205 | `entries` | 0.0297% | 9 | 100.0% | 0.1117% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 206 | `restated` | 0.0292% | 5 | 100.0% | 0.0621% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 207 | `report` | 0.0284% | 12 | 100.0% | 0.1490% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 208 | `thresholds` | 0.0281% | 5 | 100.0% | 0.0621% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 209 | `definition` | 0.0280% | 9 | 100.0% | 0.1117% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:41` |
| 210 | `statements` | 0.0279% | 6 | 100.0% | 0.0745% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 211 | `residual` | 0.0279% | 5 | 100.0% | 0.0621% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 212 | `theme` | 0.0274% | 6 | 100.0% | 0.0745% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 213 | `behaviours` | 0.0273% | 5 | 100.0% | 0.0621% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 214 | `second` | 0.0272% | 16 | 100.0% | 0.1987% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 215 | `expansion` | 0.0270% | 6 | 100.0% | 0.0745% | 0.0045% | 0.0044% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:11` |
| 217 | `accumulator` | 0.0261% | 5 | 100.0% | 0.0621% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:38` |
| 218 | `reader` | 0.0252% | 17 | 100.0% | 0.2111% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:60` |
| 219 | `pinned` | 0.0252% | 5 | 100.0% | 0.0621% | 0.0007% | 0.0022% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 220 | `collocations` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:151` |
| 221 | `csf` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 222 | `hypernym` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 223 | `hypernyms` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:161` |
| 224 | `initialisms` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 225 | `normal_form` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 226 | `olia` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 227 | `seeded` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 228 | `skos` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 229 | `unreadable` | 0.0248% | 4 | 100.0% | 0.0497% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedSource.java:23` |
| 230 | `unread` | 0.0244% | 5 | 100.0% | 0.0621% | 0.0000% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:126` |
| 231 | `witness` | 0.0242% | 5 | 100.0% | 0.0621% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 232 | `evidence` | 0.0240% | 8 | 100.0% | 0.0993% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 233 | `heading` | 0.0237% | 5 | 100.0% | 0.0621% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 234 | `imports` | 0.0236% | 5 | 100.0% | 0.0621% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:152` |
| 235 | `contributions` | 0.0235% | 5 | 100.0% | 0.0621% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 236 | `chose` | 0.0234% | 5 | 100.0% | 0.0621% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 237 | `abbreviations` | 0.0231% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 238 | `batches` | 0.0231% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:105` |
| 239 | `population` | 0.0230% | 8 | 100.0% | 0.0993% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:56` |
| 240 | `quotations` | 0.0230% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 241 | `authorship` | 0.0230% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:17` |
| 242 | `letter` | 0.0222% | 6 | 100.0% | 0.0745% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 243 | `links` | 0.0221% | 5 | 100.0% | 0.0621% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:113` |
| 244 | `elapsed` | 0.0221% | 4 | 100.0% | 0.0497% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryLegibility.java:16` |
| 245 | `stands` | 0.0220% | 5 | 100.0% | 0.0621% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 246 | `folder` | 0.0219% | 6 | 100.0% | 0.0745% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 247 | `copied` | 0.0217% | 4 | 100.0% | 0.0497% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 248 | `rankings` | 0.0214% | 4 | 100.0% | 0.0497% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 249 | `reach` | 0.0212% | 6 | 100.0% | 0.0745% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:94` |
| 250 | `behaviour` | 0.0211% | 5 | 100.0% | 0.0621% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 251 | `origin` | 0.0211% | 7 | 100.0% | 0.0869% | 0.0041% | 0.0141% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 252 | `archives` | 0.0206% | 4 | 100.0% | 0.0497% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 253 | `batch` | 0.0203% | 5 | 100.0% | 0.0621% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:27` |
| 254 | `catalog` | 0.0203% | 7 | 100.0% | 0.0869% | 0.0009% | 0.0150% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 255 | `defaults` | 0.0202% | 17 | 100.0% | 0.2111% | 0.0000% | 0.0845% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 256 | `fragment` | 0.0200% | 6 | 100.0% | 0.0745% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 257 | `base` | 0.0195% | 16 | 100.0% | 0.1987% | 0.0115% | 0.0783% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 272 | `percentage` | 0.0176% | 4 | 100.0% | 0.0497% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 274 | `areas` | 0.0175% | 9 | 100.0% | 0.1117% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 276 | `carrying` | 0.0170% | 4 | 100.0% | 0.0497% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:191` |
| 280 | `changes` | 0.0166% | 7 | 100.0% | 0.0869% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 282 | `here` | 0.0165% | 11 | 100.0% | 0.1366% | 0.0470% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:74` |
| 283 | `coverage` | 0.0164% | 4 | 100.0% | 0.0497% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:50` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5528% | 218 | 100.0% | 2.7067% | 0.5613% | 0.1008% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 73 | `from` | 0.0865% | 87 | 100.0% | 1.0802% | 0.4771% | 0.3415% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 100 | `below` | 0.0672% | 17 | 100.0% | 0.2111% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 180 | `wiki` | 0.0343% | 6 | 100.0% | 0.0745% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 216 | `beside` | 0.0269% | 5 | 100.0% | 0.0621% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:32` |
| 347 | `per` | 0.0110% | 10 | 100.0% | 0.1242% | 0.0519% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:34` |
| 435 | `against` | 0.0066% | 10 | 100.0% | 0.1242% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 493 | `sql` | 0.0057% | 4 | 100.0% | 0.0497% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 554 | `genuinely` | 0.0039% | 1 | 100.0% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 574 | `among` | 0.0036% | 5 | 100.0% | 0.0621% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:64` |
| 591 | `anybody` | 0.0033% | 1 | 100.0% | 0.0124% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 592 | `lex` | 0.0033% | 1 | 100.0% | 0.0124% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 598 | `before` | 0.0031% | 11 | 100.0% | 0.1366% | 0.0926% | 0.0440% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:28` |
| 657 | `once` | 0.0011% | 4 | 100.0% | 0.0497% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 672 | `api` | 0.0008% | 1 | 100.0% | 0.0124% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 674 | `login` | 0.0007% | 2 | 100.0% | 0.0248% | 0.0008% | 0.0158% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:19` |
| 680 | `inline` | 0.0006% | 2 | 100.0% | 0.0248% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 706 | `keyword` | 0.0001% | 1 | 100.0% | 0.0124% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 727 | `between` | 0.0000% | 8 | 100.0% | 0.0993% | 0.0974% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 730 | `again` | 0.0000% | 3 | 100.0% | 0.0372% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 252 | 1 |
| `of` | 232 | 944 |
| `by` | 218 | 4 |
| `words` | 165 | 2 |
| `topic` | 127 | 3 |
| `name` | 99 | 273 |
| `from` | 87 | 73 |
| `source` | 85 | 18 |
| `path` | 84 | 22 |
| `concept` | 83 | 5 |
| `share` | 83 | 7 |
| `scope` | 80 | 10 |
| `written` | 80 | 9 |
| `class` | 79 | 116 |
| `occurrences` | 78 | 6 |
| `concepts` | 76 | 8 |
| `label` | 73 | 13 |
| `in` | 71 | 923 |
| `sense` | 68 | 11 |
| `read` | 64 | 203 |

## What it called the things that check it

**14,452 occurrences of 1,585 distinct words**, read against ordinary English and the platform's own API. The 285 that clear the bar hold 52.3% of what was written and 81.4% of the divergence, and 100.0% of their occurrences are names. 438 words in the ranking are ones a reference writes more densely than this repository does, and 102 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0099%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,585, over 999 draws yielding 4,312,312 scored words from that reference's own distribution. A word is here where it beats **0.0119%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,585, over 999 draws yielding 2,068,489 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.6887% | 209 | 100.0% | 1.4462% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5621% | 192 | 100.0% | 1.3285% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `test` | 0.4136% | 180 | 100.0% | 1.2455% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 4 | `a` | 0.4125% | 664 | 100.0% | 4.5945% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 5 | `words` | 0.4081% | 131 | 100.0% | 0.9064% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `nothing` | 0.3150% | 102 | 100.0% | 0.7058% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `concept` | 0.3048% | 95 | 100.0% | 0.6573% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 8 | `carries` | 0.2916% | 87 | 100.0% | 0.6020% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 9 | `topic` | 0.2902% | 88 | 100.0% | 0.6089% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 10 | `reading` | 0.2812% | 89 | 100.0% | 0.6158% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:136` |
| 11 | `written` | 0.2772% | 92 | 100.0% | 0.6366% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 12 | `refuses` | 0.2750% | 81 | 100.0% | 0.5605% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 13 | `states` | 0.2673% | 107 | 100.0% | 0.7404% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 14 | `every` | 0.2211% | 95 | 100.0% | 0.6573% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `names` | 0.1961% | 99 | 100.0% | 0.6850% | 0.0081% | 0.0814% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 16 | `keeps` | 0.1941% | 59 | 100.0% | 0.4082% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 18 | `no` | 0.1918% | 114 | 100.0% | 0.7888% | 0.1272% | 0.0625% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 19 | `its` | 0.1870% | 139 | 100.0% | 0.9618% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 20 | `scope` | 0.1838% | 75 | 100.0% | 0.5190% | 0.0029% | 0.0343% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 21 | `taxonomy` | 0.1838% | 54 | 100.0% | 0.3737% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:57` |
| 22 | `repository` | 0.1796% | 57 | 100.0% | 0.3944% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 23 | `term` | 0.1741% | 63 | 100.0% | 0.4359% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 24 | `root` | 0.1723% | 93 | 100.0% | 0.6435% | 0.0033% | 0.0876% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 25 | `topics` | 0.1721% | 53 | 100.0% | 0.3667% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 26 | `share` | 0.1483% | 56 | 100.0% | 0.3875% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 27 | `broader` | 0.1464% | 45 | 100.0% | 0.3114% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 28 | `own` | 0.1406% | 73 | 100.0% | 0.5051% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 29 | `counts` | 0.1367% | 43 | 100.0% | 0.2975% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `dictionary` | 0.1367% | 43 | 100.0% | 0.2975% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 31 | `one` | 0.1304% | 124 | 100.0% | 0.8580% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 32 | `it` | 0.1252% | 224 | 100.0% | 1.5500% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 33 | `concepts` | 0.1229% | 39 | 100.0% | 0.2699% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 36 | `published` | 0.1161% | 45 | 100.0% | 0.3114% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 37 | `chance` | 0.1160% | 41 | 100.0% | 0.2837% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 38 | `matched` | 0.1110% | 34 | 100.0% | 0.2353% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:49` |
| 39 | `writes` | 0.1087% | 34 | 100.0% | 0.2353% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:51` |
| 40 | `terms` | 0.1080% | 43 | 100.0% | 0.2975% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 41 | `sense` | 0.1075% | 40 | 100.0% | 0.2768% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 42 | `stated` | 0.1022% | 36 | 100.0% | 0.2491% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 43 | `subject` | 0.1015% | 45 | 100.0% | 0.3114% | 0.0117% | 0.0268% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:25` |
| 44 | `ontology` | 0.1012% | 30 | 100.0% | 0.2076% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 45 | `publisher` | 0.0994% | 32 | 100.0% | 0.2214% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 46 | `source` | 0.0984% | 90 | 100.0% | 0.6228% | 0.0130% | 0.1712% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 47 | `parsed` | 0.0973% | 32 | 100.0% | 0.2214% | 0.0000% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 48 | `scopes` | 0.0953% | 29 | 100.0% | 0.2007% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 49 | `label` | 0.0947% | 61 | 100.0% | 0.4221% | 0.0028% | 0.0770% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 51 | `themes` | 0.0910% | 29 | 100.0% | 0.2007% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 52 | `report` | 0.0901% | 44 | 100.0% | 0.3045% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 53 | `branch` | 0.0890% | 32 | 100.0% | 0.2214% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 54 | `senses` | 0.0887% | 27 | 100.0% | 0.1868% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |

<details>
<summary>235 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `does` | 0.0884% | 49 | 100.0% | 0.3391% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 56 | `vocabulary` | 0.0853% | 26 | 100.0% | 0.1799% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |
| 57 | `placement` | 0.0832% | 26 | 100.0% | 0.1799% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 59 | `noun` | 0.0788% | 24 | 100.0% | 0.1661% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 60 | `files` | 0.0786% | 35 | 100.0% | 0.2422% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:54` |
| 62 | `leaves` | 0.0779% | 27 | 100.0% | 0.1868% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 63 | `abstains` | 0.0761% | 22 | 100.0% | 0.1522% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 64 | `says` | 0.0760% | 40 | 100.0% | 0.2768% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 65 | `phrase` | 0.0750% | 24 | 100.0% | 0.1661% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 66 | `bundled` | 0.0702% | 21 | 100.0% | 0.1453% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:29` |
| 67 | `occurrences` | 0.0666% | 20 | 100.0% | 0.1384% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 68 | `apart` | 0.0662% | 23 | 100.0% | 0.1591% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 69 | `wrote` | 0.0658% | 29 | 100.0% | 0.2007% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 70 | `reports` | 0.0658% | 26 | 100.0% | 0.1799% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 71 | `verb` | 0.0648% | 20 | 100.0% | 0.1384% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 72 | `mass` | 0.0631% | 24 | 100.0% | 0.1661% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 73 | `tsv` | 0.0623% | 18 | 100.0% | 0.1246% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 74 | `pooled` | 0.0621% | 20 | 100.0% | 0.1384% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 75 | `as` | 0.0617% | 203 | 100.0% | 1.4046% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 76 | `draws` | 0.0599% | 19 | 100.0% | 0.1315% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 77 | `witnesses` | 0.0593% | 19 | 100.0% | 0.1315% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 78 | `carried` | 0.0589% | 22 | 100.0% | 0.1522% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 79 | `resolves` | 0.0588% | 17 | 100.0% | 0.1176% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 80 | `ranked` | 0.0583% | 19 | 100.0% | 0.1315% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 81 | `divergence` | 0.0563% | 17 | 100.0% | 0.1176% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 83 | `token` | 0.0550% | 33 | 100.0% | 0.2283% | 0.0013% | 0.0374% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 84 | `extraction` | 0.0540% | 17 | 100.0% | 0.1176% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:99` |
| 85 | `occurrence` | 0.0524% | 20 | 100.0% | 0.1384% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 86 | `subjects` | 0.0522% | 18 | 100.0% | 0.1246% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:74` |
| 87 | `prose` | 0.0517% | 16 | 100.0% | 0.1107% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 88 | `distribution` | 0.0505% | 19 | 100.0% | 0.1315% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 89 | `ranking` | 0.0502% | 16 | 100.0% | 0.1107% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 90 | `domains` | 0.0500% | 17 | 100.0% | 0.1176% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 91 | `evidence` | 0.0487% | 23 | 100.0% | 0.1591% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 92 | `vote` | 0.0487% | 19 | 100.0% | 0.1315% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 93 | `nearest` | 0.0472% | 15 | 100.0% | 0.1038% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 94 | `placed` | 0.0469% | 19 | 100.0% | 0.1315% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 95 | `rendered` | 0.0465% | 17 | 100.0% | 0.1176% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 96 | `runs` | 0.0456% | 18 | 100.0% | 0.1246% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 97 | `alone` | 0.0455% | 18 | 100.0% | 0.1246% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 98 | `ranks` | 0.0454% | 15 | 100.0% | 0.1038% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 99 | `arxiv` | 0.0450% | 13 | 100.0% | 0.0900% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:10` |
| 100 | `legibility` | 0.0450% | 13 | 100.0% | 0.0900% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 101 | `takes` | 0.0448% | 20 | 100.0% | 0.1384% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 102 | `named` | 0.0446% | 23 | 100.0% | 0.1591% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:53` |
| 103 | `finds` | 0.0430% | 15 | 100.0% | 0.1038% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:35` |
| 104 | `run` | 0.0429% | 57 | 100.0% | 0.3944% | 0.0270% | 0.1457% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 105 | `weighs` | 0.0418% | 13 | 100.0% | 0.0900% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 106 | `cited` | 0.0414% | 14 | 100.0% | 0.0969% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 108 | `carry` | 0.0398% | 16 | 100.0% | 0.1107% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 109 | `citations` | 0.0394% | 12 | 100.0% | 0.0830% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 110 | `graph` | 0.0393% | 15 | 100.0% | 0.1038% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 111 | `stands` | 0.0382% | 14 | 100.0% | 0.0969% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 112 | `rung` | 0.0381% | 11 | 100.0% | 0.0761% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 113 | `holds` | 0.0374% | 14 | 100.0% | 0.0969% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:74` |
| 114 | `lines` | 0.0369% | 19 | 100.0% | 0.1315% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 115 | `heading` | 0.0369% | 13 | 100.0% | 0.0900% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 116 | `votes` | 0.0361% | 13 | 100.0% | 0.0900% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 117 | `renders` | 0.0359% | 11 | 100.0% | 0.0761% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 118 | `carrying` | 0.0356% | 13 | 100.0% | 0.0900% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 119 | `site` | 0.0356% | 20 | 100.0% | 0.1384% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 120 | `contribution` | 0.0355% | 13 | 100.0% | 0.0900% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 121 | `whole` | 0.0348% | 18 | 100.0% | 0.1246% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 122 | `commonest` | 0.0346% | 10 | 100.0% | 0.0692% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 123 | `theme` | 0.0346% | 13 | 100.0% | 0.0900% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 124 | `same` | 0.0340% | 34 | 100.0% | 0.2353% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 125 | `under` | 0.0337% | 35 | 100.0% | 0.2422% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 127 | `hierarchy` | 0.0337% | 16 | 100.0% | 0.1107% | 0.0013% | 0.0114% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 128 | `sha` | 0.0329% | 10 | 100.0% | 0.0692% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 129 | `function` | 0.0327% | 20 | 100.0% | 0.1384% | 0.0113% | 0.0233% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 130 | `sighting` | 0.0327% | 10 | 100.0% | 0.0692% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 131 | `publishes` | 0.0322% | 10 | 100.0% | 0.0692% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 132 | `placements` | 0.0317% | 10 | 100.0% | 0.0692% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:65` |
| 133 | `inflection` | 0.0311% | 9 | 100.0% | 0.0623% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 135 | `reaches` | 0.0294% | 10 | 100.0% | 0.0692% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 136 | `rows` | 0.0294% | 20 | 100.0% | 0.1384% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 137 | `drawn` | 0.0290% | 11 | 100.0% | 0.0761% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 138 | `abbreviation` | 0.0289% | 9 | 100.0% | 0.0623% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 139 | `framework` | 0.0289% | 11 | 100.0% | 0.0761% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 140 | `sets` | 0.0286% | 12 | 100.0% | 0.0830% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 141 | `english` | 0.0285% | 16 | 100.0% | 0.1107% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:22` |
| 142 | `folder` | 0.0285% | 13 | 100.0% | 0.0900% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:101` |
| 143 | `rank` | 0.0278% | 10 | 100.0% | 0.0692% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 144 | `corroborated` | 0.0277% | 8 | 100.0% | 0.0554% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 145 | `provenance` | 0.0277% | 8 | 100.0% | 0.0554% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 146 | `readings` | 0.0270% | 9 | 100.0% | 0.0623% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 147 | `ordinary` | 0.0268% | 10 | 100.0% | 0.0692% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 148 | `file` | 0.0263% | 85 | 100.0% | 0.5882% | 0.0066% | 0.3309% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:55` |
| 149 | `stating` | 0.0257% | 9 | 100.0% | 0.0623% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 150 | `page` | 0.0250% | 18 | 100.0% | 0.1246% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 151 | `inside` | 0.0249% | 13 | 100.0% | 0.0900% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 152 | `archive` | 0.0248% | 11 | 100.0% | 0.0761% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 153 | `witness` | 0.0243% | 9 | 100.0% | 0.0623% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 154 | `refused` | 0.0242% | 10 | 100.0% | 0.0692% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 155 | `fibo` | 0.0242% | 7 | 100.0% | 0.0484% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 156 | `git` | 0.0242% | 7 | 100.0% | 0.0484% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 157 | `unsegmented` | 0.0242% | 7 | 100.0% | 0.0484% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 158 | `probe` | 0.0242% | 11 | 100.0% | 0.0761% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 159 | `catalogue` | 0.0238% | 8 | 100.0% | 0.0554% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 161 | `siblings` | 0.0237% | 8 | 100.0% | 0.0554% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 162 | `segments` | 0.0228% | 8 | 100.0% | 0.0554% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 163 | `longest` | 0.0226% | 8 | 100.0% | 0.0554% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 164 | `places` | 0.0225% | 11 | 100.0% | 0.0761% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 165 | `silent` | 0.0225% | 8 | 100.0% | 0.0554% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 166 | `lexicon` | 0.0223% | 7 | 100.0% | 0.0484% | 0.0006% | 0.0000% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 167 | `gives` | 0.0218% | 11 | 100.0% | 0.0761% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 168 | `tally` | 0.0217% | 7 | 100.0% | 0.0484% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 170 | `exported` | 0.0210% | 9 | 100.0% | 0.0623% | 0.0010% | 0.0048% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:13` |
| 171 | `extracted` | 0.0208% | 7 | 100.0% | 0.0484% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 172 | `rankings` | 0.0208% | 7 | 100.0% | 0.0484% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:63` |
| 173 | `legible` | 0.0208% | 6 | 100.0% | 0.0415% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 174 | `author` | 0.0207% | 9 | 100.0% | 0.0623% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 175 | `evaluation` | 0.0206% | 8 | 100.0% | 0.0554% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 176 | `declares` | 0.0205% | 7 | 100.0% | 0.0484% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 177 | `each` | 0.0202% | 46 | 100.0% | 0.3183% | 0.0830% | 0.1567% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 178 | `revision` | 0.0202% | 7 | 100.0% | 0.0484% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 179 | `line` | 0.0202% | 52 | 100.0% | 0.3598% | 0.0313% | 0.1866% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 181 | `descriptions` | 0.0196% | 7 | 100.0% | 0.0484% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 182 | `tokens` | 0.0196% | 7 | 100.0% | 0.0484% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:71` |
| 183 | `qualified` | 0.0192% | 12 | 100.0% | 0.0830% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 184 | `intensity` | 0.0190% | 7 | 100.0% | 0.0484% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 185 | `initials` | 0.0190% | 6 | 100.0% | 0.0415% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:199` |
| 186 | `depth` | 0.0189% | 11 | 100.0% | 0.0761% | 0.0035% | 0.0119% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 187 | `declared` | 0.0188% | 18 | 100.0% | 0.1246% | 0.0042% | 0.0356% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 188 | `pinned` | 0.0188% | 7 | 100.0% | 0.0484% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 189 | `zero` | 0.0186% | 15 | 100.0% | 0.1038% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 190 | `resource` | 0.0184% | 28 | 100.0% | 0.1937% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 191 | `distance` | 0.0183% | 10 | 100.0% | 0.0692% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 192 | `orders` | 0.0182% | 8 | 100.0% | 0.0554% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 193 | `preamble` | 0.0181% | 6 | 100.0% | 0.0415% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:31` |
| 194 | `morphology` | 0.0181% | 6 | 100.0% | 0.0415% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 195 | `residual` | 0.0179% | 6 | 100.0% | 0.0415% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 196 | `chosen` | 0.0178% | 8 | 100.0% | 0.0554% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 197 | `shared` | 0.0177% | 15 | 100.0% | 0.1038% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PinnedSubjectFindings.java:56` |
| 198 | `member` | 0.0174% | 17 | 100.0% | 0.1176% | 0.0176% | 0.0343% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 199 | `labels` | 0.0174% | 8 | 100.0% | 0.0554% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 200 | `collocations` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 201 | `denominator` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 202 | `initialism` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 203 | `lemmas` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 204 | `parses` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 205 | `part_of_speech` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 206 | `segmenter` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:11` |
| 207 | `unplaced` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:22` |
| 208 | `unreached` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 209 | `wiktionary` | 0.0173% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 210 | `phrases` | 0.0173% | 6 | 100.0% | 0.0415% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:119` |
| 211 | `manifest` | 0.0173% | 9 | 100.0% | 0.0623% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 212 | `held` | 0.0172% | 15 | 100.0% | 0.1038% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:39` |
| 213 | `rolls` | 0.0170% | 6 | 100.0% | 0.0415% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 214 | `fraction` | 0.0168% | 8 | 100.0% | 0.0554% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:35` |
| 215 | `stays` | 0.0168% | 6 | 100.0% | 0.0415% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 216 | `asked` | 0.0164% | 12 | 100.0% | 0.0830% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 217 | `nested` | 0.0163% | 8 | 100.0% | 0.0554% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 218 | `describes` | 0.0163% | 7 | 100.0% | 0.0484% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:30` |
| 219 | `drops` | 0.0163% | 6 | 100.0% | 0.0415% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:41` |
| 220 | `functions` | 0.0160% | 8 | 100.0% | 0.0554% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 221 | `bits` | 0.0158% | 11 | 100.0% | 0.0761% | 0.0024% | 0.0154% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 222 | `asks` | 0.0154% | 6 | 100.0% | 0.0415% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 223 | `ignores` | 0.0154% | 5 | 100.0% | 0.0346% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 224 | `glued` | 0.0154% | 5 | 100.0% | 0.0346% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 225 | `nests` | 0.0153% | 5 | 100.0% | 0.0346% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:36` |
| 226 | `squash` | 0.0152% | 5 | 100.0% | 0.0346% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 227 | `sightings` | 0.0151% | 5 | 100.0% | 0.0346% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 228 | `branches` | 0.0151% | 6 | 100.0% | 0.0415% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 229 | `bars` | 0.0150% | 6 | 100.0% | 0.0415% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 230 | `identifier` | 0.0150% | 19 | 100.0% | 0.1315% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 231 | `licence` | 0.0149% | 6 | 100.0% | 0.0415% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:36` |
| 232 | `cites` | 0.0149% | 5 | 100.0% | 0.0346% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 233 | `resources` | 0.0148% | 11 | 100.0% | 0.0761% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 234 | `shown` | 0.0148% | 9 | 100.0% | 0.0623% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 235 | `commits` | 0.0148% | 5 | 100.0% | 0.0346% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 236 | `figure` | 0.0148% | 8 | 100.0% | 0.0554% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 237 | `ones` | 0.0146% | 8 | 100.0% | 0.0554% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 238 | `rare` | 0.0145% | 7 | 100.0% | 0.0484% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 239 | `definition` | 0.0145% | 11 | 100.0% | 0.0761% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 240 | `claim` | 0.0145% | 8 | 100.0% | 0.0554% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 241 | `copied` | 0.0144% | 5 | 100.0% | 0.0346% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 242 | `sentence` | 0.0144% | 7 | 100.0% | 0.0484% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 243 | `sweep` | 0.0144% | 5 | 100.0% | 0.0346% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 244 | `seed` | 0.0143% | 10 | 100.0% | 0.0692% | 0.0033% | 0.0141% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReadingTest.java:46` |
| 245 | `explains` | 0.0142% | 6 | 100.0% | 0.0415% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 246 | `letter` | 0.0142% | 8 | 100.0% | 0.0554% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 247 | `rest` | 0.0142% | 9 | 100.0% | 0.0623% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 249 | `references` | 0.0140% | 8 | 100.0% | 0.0554% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:29` |
| 250 | `header` | 0.0140% | 23 | 100.0% | 0.1591% | 0.0012% | 0.0669% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 251 | `none` | 0.0139% | 7 | 100.0% | 0.0484% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 252 | `artefact` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:70` |
| 253 | `collocated` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:41` |
| 254 | `csf` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 255 | `decomposes` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 256 | `fetched` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 257 | `generalises` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 258 | `headword` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 259 | `lemma` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 260 | `olia` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 261 | `ontologys` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 262 | `permalink` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 263 | `pull_request` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 264 | `translingual` | 0.0138% | 4 | 100.0% | 0.0277% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 265 | `reference` | 0.0138% | 28 | 100.0% | 0.1937% | 0.0064% | 0.0906% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:44` |
| 266 | `prints` | 0.0138% | 5 | 100.0% | 0.0346% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:32` |
| 268 | `script` | 0.0136% | 8 | 100.0% | 0.0554% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 269 | `publishers` | 0.0136% | 5 | 100.0% | 0.0346% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 270 | `only` | 0.0135% | 36 | 100.0% | 0.2491% | 0.1307% | 0.0999% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 271 | `accumulator` | 0.0131% | 5 | 100.0% | 0.0346% | 0.0000% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 272 | `cite` | 0.0131% | 5 | 100.0% | 0.0346% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 273 | `statements` | 0.0130% | 6 | 100.0% | 0.0415% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 274 | `links` | 0.0130% | 6 | 100.0% | 0.0415% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SourceLinks.java:25` |
| 275 | `answered` | 0.0129% | 5 | 100.0% | 0.0346% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 276 | `beat` | 0.0126% | 6 | 100.0% | 0.0415% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 277 | `quantity` | 0.0124% | 5 | 100.0% | 0.0346% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 278 | `describing` | 0.0124% | 5 | 100.0% | 0.0346% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 279 | `directory` | 0.0122% | 20 | 100.0% | 0.1384% | 0.0017% | 0.0581% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:50` |
| 280 | `behaviour` | 0.0122% | 6 | 100.0% | 0.0415% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 281 | `acronym` | 0.0122% | 4 | 100.0% | 0.0277% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 282 | `strange` | 0.0121% | 5 | 100.0% | 0.0346% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 283 | `adjective` | 0.0120% | 4 | 100.0% | 0.0277% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 284 | `owl` | 0.0119% | 4 | 100.0% | 0.0277% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassesTest.java:14` |
| 286 | `chart` | 0.0117% | 5 | 100.0% | 0.0346% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 287 | `supplied` | 0.0117% | 5 | 100.0% | 0.0346% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 288 | `answers` | 0.0116% | 5 | 100.0% | 0.0346% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 289 | `folds` | 0.0116% | 4 | 100.0% | 0.0277% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 290 | `standing` | 0.0115% | 6 | 100.0% | 0.0415% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 293 | `passes` | 0.0114% | 5 | 100.0% | 0.0346% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 295 | `fixture` | 0.0113% | 4 | 100.0% | 0.0277% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:26` |
| 300 | `spells` | 0.0111% | 4 | 100.0% | 0.0277% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 301 | `contributions` | 0.0110% | 5 | 100.0% | 0.0346% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:55` |
| 303 | `chose` | 0.0110% | 5 | 100.0% | 0.0346% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 306 | `merged` | 0.0109% | 4 | 100.0% | 0.0277% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 307 | `an` | 0.0107% | 88 | 100.0% | 0.6089% | 0.4337% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 334 | `moves` | 0.0103% | 5 | 100.0% | 0.0346% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 335 | `findings` | 0.0103% | 5 | 100.0% | 0.0346% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:25` |
| 337 | `carriers` | 0.0102% | 4 | 100.0% | 0.0277% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 338 | `defines` | 0.0102% | 4 | 100.0% | 0.0277% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 17 | `rather` | 0.1939% | 73 | 100.0% | 0.5051% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 34 | `than` | 0.1207% | 92 | 100.0% | 0.6366% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `where` | 0.1203% | 78 | 100.0% | 0.5397% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 50 | `what` | 0.0918% | 77 | 100.0% | 0.5328% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 58 | `itself` | 0.0818% | 33 | 100.0% | 0.2283% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 61 | `beside` | 0.0779% | 24 | 100.0% | 0.1661% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:258` |
| 82 | `not` | 0.0551% | 110 | 100.0% | 0.7611% | 0.3534% | 0.1355% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 107 | `twice` | 0.0404% | 15 | 100.0% | 0.1038% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 126 | `below` | 0.0337% | 19 | 100.0% | 0.1315% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 134 | `beneath` | 0.0294% | 10 | 100.0% | 0.0692% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 160 | `without` | 0.0237% | 24 | 100.0% | 0.1661% | 0.0500% | 0.0233% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 169 | `whose` | 0.0215% | 11 | 100.0% | 0.0761% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 180 | `once` | 0.0201% | 18 | 100.0% | 0.1246% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 248 | `never` | 0.0140% | 17 | 100.0% | 0.1176% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:223` |
| 267 | `cannot` | 0.0136% | 10 | 100.0% | 0.0692% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 296 | `else` | 0.0112% | 9 | 100.0% | 0.0623% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 299 | `against` | 0.0111% | 21 | 100.0% | 0.1453% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 304 | `elsewhere` | 0.0109% | 5 | 100.0% | 0.0346% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 340 | `everything` | 0.0099% | 8 | 100.0% | 0.0554% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 343 | `something` | 0.0099% | 12 | 100.0% | 0.0830% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 845 | 1,581 |
| `a` | 664 | 4 |
| `it` | 224 | 32 |
| `reads` | 209 | 1 |
| `as` | 203 | 75 |
| `word` | 192 | 2 |
| `of` | 191 | 1,584 |
| `test` | 180 | 3 |
| `its` | 139 | 19 |
| `and` | 133 | 1,583 |
| `words` | 131 | 5 |
| `one` | 124 | 31 |
| `is` | 120 | 1,553 |
| `to` | 118 | 1,579 |
| `no` | 114 | 18 |
| `that` | 114 | 1,442 |
| `in` | 113 | 1,561 |
| `not` | 110 | 82 |
| `states` | 107 | 13 |
| `nothing` | 102 | 6 |

## And what it wrote about all of it

**97,017 occurrences of 4,080 distinct words**, read against ordinary English and the platform's own API. The 698 that clear the bar hold 48.8% of what was written and 84.2% of the divergence, and 26.9% of their occurrences are names. 1,585 words in the ranking are ones a reference writes more densely than this repository does, and 198 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0019%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 4,080, over 999 draws yielding 13,022,010 scored words from that reference's own distribution. A word is here where it beats **0.0023%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 4,080, over 999 draws yielding 3,913,780 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5466% | 4,957 | 13.8% | 5.1094% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4757% | 1,114 | 39.9% | 1.1483% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3083% | 651 | 21.4% | 0.6710% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3029% | 670 | 44.2% | 0.6906% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `it` | 0.2577% | 1,985 | 11.3% | 2.0460% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 7 | `one` | 0.2517% | 1,173 | 11.8% | 1.2091% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 8 | `repository` | 0.2330% | 488 | 19.7% | 0.5030% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `nothing` | 0.1971% | 449 | 24.7% | 0.4628% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 10 | `topic` | 0.1949% | 404 | 53.2% | 0.4164% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `reads` | 0.1782% | 397 | 55.2% | 0.4092% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `written` | 0.1717% | 405 | 42.5% | 0.4175% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `own` | 0.1557% | 525 | 14.9% | 0.5411% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1548% | 491 | 23.4% | 0.5061% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `is` | 0.1490% | 2,914 | 4.9% | 3.0036% | 1.3630% | 1.6303% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 17 | `concept` | 0.1489% | 329 | 54.1% | 0.3391% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 18 | `taxonomy` | 0.1455% | 288 | 25.3% | 0.2969% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:138` |
| 19 | `its` | 0.1302% | 773 | 18.4% | 0.7968% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 20 | `carries` | 0.1239% | 256 | 36.3% | 0.2639% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1187% | 662 | 5.6% | 0.6824% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 22 | `share` | 0.1136% | 303 | 45.9% | 0.3123% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 23 | `dictionary` | 0.1106% | 237 | 25.7% | 0.2443% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 25 | `subject` | 0.1033% | 306 | 25.8% | 0.3154% | 0.0117% | 0.0268% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 26 | `topics` | 0.1012% | 216 | 50.9% | 0.2226% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 27 | `states` | 0.0989% | 347 | 32.3% | 0.3577% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 28 | `term` | 0.0973% | 263 | 36.5% | 0.2711% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `published` | 0.0943% | 256 | 33.2% | 0.2639% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `concepts` | 0.0942% | 205 | 56.1% | 0.2113% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `writes` | 0.0909% | 193 | 18.7% | 0.1989% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `vocabulary` | 0.0886% | 181 | 27.6% | 0.1866% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 33 | `sense` | 0.0875% | 227 | 47.6% | 0.2340% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 34 | `scope` | 0.0821% | 279 | 55.6% | 0.2876% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 35 | `divergence` | 0.0818% | 164 | 37.8% | 0.1690% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 36 | `no` | 0.0738% | 451 | 27.3% | 0.4649% | 0.1272% | 0.0625% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 37 | `bundled` | 0.0738% | 148 | 16.2% | 0.1526% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 39 | `occurrences` | 0.0685% | 138 | 71.0% | 0.1422% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 40 | `prose` | 0.0652% | 134 | 29.9% | 0.1381% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 41 | `same` | 0.0645% | 316 | 12.0% | 0.3257% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 42 | `stated` | 0.0621% | 159 | 50.3% | 0.1639% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 43 | `phrase` | 0.0613% | 134 | 36.6% | 0.1381% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:60` |
| 44 | `does` | 0.0609% | 261 | 19.2% | 0.2690% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 45 | `chance` | 0.0604% | 160 | 49.4% | 0.1649% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 46 | `mass` | 0.0588% | 152 | 49.3% | 0.1567% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 47 | `senses` | 0.0580% | 121 | 41.3% | 0.1247% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 48 | `names` | 0.0573% | 318 | 41.2% | 0.3278% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 50 | `refuses` | 0.0533% | 111 | 73.0% | 0.1144% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 51 | `says` | 0.0513% | 209 | 19.6% | 0.2154% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 52 | `ontology` | 0.0487% | 99 | 38.4% | 0.1020% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 53 | `matched` | 0.0485% | 105 | 58.1% | 0.1082% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:60` |
| 54 | `branch` | 0.0482% | 130 | 35.4% | 0.1340% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 56 | `keeps` | 0.0476% | 107 | 55.1% | 0.1103% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |

<details>
<summary>648 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 57 | `rung` | 0.0464% | 90 | 55.6% | 0.0928% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 58 | `whole` | 0.0462% | 147 | 15.0% | 0.1515% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 59 | `nearest` | 0.0454% | 97 | 40.2% | 0.1000% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 60 | `broader` | 0.0447% | 101 | 84.2% | 0.1041% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:79` |
| 61 | `files` | 0.0447% | 158 | 57.0% | 0.1629% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 62 | `publishes` | 0.0423% | 87 | 12.6% | 0.0897% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 63 | `placement` | 0.0415% | 92 | 48.9% | 0.0948% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 64 | `net` | 0.0409% | 117 | 12.8% | 0.1206% | 0.0063% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 65 | `repository's` | 0.0407% | 79 | 0.0% | 0.0814% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 67 | `terms` | 0.0404% | 140 | 54.3% | 0.1443% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 68 | `subjects` | 0.0395% | 95 | 35.8% | 0.0979% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 71 | `holds` | 0.0379% | 95 | 14.7% | 0.0979% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 72 | `counts` | 0.0377% | 91 | 57.1% | 0.0938% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 73 | `english` | 0.0377% | 129 | 27.9% | 0.1330% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 74 | `evidence` | 0.0376% | 129 | 24.0% | 0.1330% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 75 | `publisher` | 0.0372% | 90 | 35.6% | 0.0928% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:120` |
| 76 | `two` | 0.0353% | 350 | 9.1% | 0.3608% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 77 | `carried` | 0.0353% | 98 | 36.7% | 0.1010% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 78 | `wrote` | 0.0351% | 125 | 26.4% | 0.1288% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 79 | `each` | 0.0349% | 370 | 13.5% | 0.3814% | 0.0830% | 0.1567% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 80 | `stands` | 0.0348% | 87 | 21.8% | 0.0897% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 81 | `noun` | 0.0345% | 74 | 48.6% | 0.0763% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 82 | `scopes` | 0.0345% | 75 | 61.3% | 0.0773% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 83 | `ranking` | 0.0339% | 75 | 32.0% | 0.0773% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:84` |
| 84 | `verb` | 0.0338% | 73 | 53.4% | 0.0752% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 85 | `domains` | 0.0337% | 81 | 56.8% | 0.0835% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 86 | `here` | 0.0332% | 184 | 7.6% | 0.1897% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 87 | `cited` | 0.0330% | 77 | 45.5% | 0.0794% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 88 | `runs` | 0.0326% | 93 | 33.3% | 0.0959% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 89 | `1` | 0.0320% | 74 | 0.0% | 0.0763% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 90 | `labels` | 0.0318% | 85 | 29.4% | 0.0876% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 91 | `carry` | 0.0317% | 90 | 18.9% | 0.0928% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 92 | `draws` | 0.0315% | 71 | 38.0% | 0.0732% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 96 | `answers` | 0.0305% | 73 | 9.6% | 0.0752% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 97 | `alone` | 0.0302% | 88 | 22.7% | 0.0907% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:52` |
| 98 | `report` | 0.0300% | 149 | 37.6% | 0.1536% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 99 | `pooled` | 0.0300% | 70 | 47.1% | 0.0722% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 100 | `distribution` | 0.0299% | 84 | 33.3% | 0.0866% | 0.0062% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 101 | `answer` | 0.0298% | 84 | 1.2% | 0.0866% | 0.0063% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 102 | `library` | 0.0297% | 103 | 2.9% | 0.1062% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 104 | `figure` | 0.0294% | 87 | 13.8% | 0.0897% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 105 | `0` | 0.0285% | 65 | 0.0% | 0.0670% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 106 | `tsv` | 0.0283% | 55 | 69.1% | 0.0567% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 107 | `git` | 0.0278% | 54 | 18.5% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 108 | `lemma` | 0.0278% | 54 | 48.1% | 0.0557% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 109 | `oli` | 0.0273% | 53 | 0.0% | 0.0546% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 110 | `apart` | 0.0273% | 74 | 43.2% | 0.0763% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 111 | `label` | 0.0272% | 218 | 61.5% | 0.2247% | 0.0028% | 0.0770% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 113 | `sentence` | 0.0267% | 74 | 20.3% | 0.0763% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 114 | `readings` | 0.0263% | 59 | 33.9% | 0.0608% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 115 | `ordinary` | 0.0263% | 66 | 27.3% | 0.0680% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 116 | `ar` | 0.0262% | 56 | 0.0% | 0.0577% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 117 | `themes` | 0.0259% | 64 | 87.5% | 0.0660% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:98` |
| 118 | `named` | 0.0258% | 109 | 45.0% | 0.1124% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 119 | `reports` | 0.0258% | 87 | 32.2% | 0.0897% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 120 | `drawn` | 0.0252% | 66 | 39.4% | 0.0680% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:128` |
| 122 | `carrying` | 0.0249% | 65 | 26.2% | 0.0670% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 123 | `extraction` | 0.0247% | 56 | 48.2% | 0.0577% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 124 | `placed` | 0.0247% | 79 | 53.2% | 0.0814% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 125 | `source` | 0.0242% | 347 | 50.4% | 0.3577% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 126 | `about` | 0.0240% | 368 | 9.2% | 0.3793% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 127 | `comparison` | 0.0240% | 63 | 30.2% | 0.0649% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 128 | `e` | 0.0237% | 66 | 4.5% | 0.0680% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 129 | `claim` | 0.0232% | 74 | 25.7% | 0.0763% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 131 | `topical` | 0.0230% | 49 | 2.0% | 0.0505% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 132 | `commonest` | 0.0227% | 44 | 52.3% | 0.0454% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenMass.java:5` |
| 133 | `word's` | 0.0227% | 44 | 0.0% | 0.0454% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 134 | `resource` | 0.0225% | 203 | 25.1% | 0.2092% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 135 | `frequency_list` | 0.0222% | 43 | 7.0% | 0.0443% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 136 | `witnesses` | 0.0222% | 53 | 79.2% | 0.0546% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:32` |
| 138 | `inside` | 0.0218% | 80 | 16.3% | 0.0825% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 139 | `pinned` | 0.0217% | 53 | 22.6% | 0.0546% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 141 | `legibility` | 0.0211% | 41 | 82.9% | 0.0423% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:88` |
| 142 | `declares` | 0.0210% | 48 | 16.7% | 0.0495% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:39` |
| 143 | `test` | 0.0208% | 233 | 78.5% | 0.2402% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 144 | `part_of_speech` | 0.0206% | 40 | 52.5% | 0.0412% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 145 | `none` | 0.0205% | 62 | 17.7% | 0.0639% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 146 | `rank` | 0.0205% | 52 | 40.4% | 0.0536% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 147 | `ranked` | 0.0204% | 51 | 68.6% | 0.0526% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:85` |
| 148 | `whatever` | 0.0203% | 59 | 8.5% | 0.0608% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 149 | `neither` | 0.0201% | 57 | 7.0% | 0.0588% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 150 | `author` | 0.0200% | 59 | 22.0% | 0.0608% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:19` |
| 151 | `kept` | 0.0200% | 66 | 31.8% | 0.0680% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 152 | `chosen` | 0.0198% | 58 | 31.0% | 0.0598% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 153 | `citations` | 0.0198% | 42 | 81.0% | 0.0433% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 154 | `parsed` | 0.0196% | 56 | 87.5% | 0.0577% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 155 | `asks` | 0.0196% | 49 | 12.2% | 0.0505% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 156 | `abstains` | 0.0196% | 38 | 57.9% | 0.0392% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 157 | `wiktionary` | 0.0196% | 38 | 36.8% | 0.0392% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 159 | `token` | 0.0192% | 125 | 54.4% | 0.1288% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 160 | `occurrence` | 0.0189% | 62 | 67.7% | 0.0639% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 161 | `declared` | 0.0189% | 121 | 28.9% | 0.1247% | 0.0042% | 0.0356% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 162 | `resources` | 0.0187% | 84 | 13.1% | 0.0866% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 163 | `catalogue` | 0.0185% | 43 | 25.6% | 0.0443% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 164 | `rule` | 0.0183% | 98 | 8.2% | 0.1010% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 165 | `renders` | 0.0182% | 39 | 28.2% | 0.0402% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 166 | `votes` | 0.0182% | 50 | 42.0% | 0.0515% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 167 | `counted` | 0.0180% | 47 | 19.1% | 0.0484% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 168 | `headword` | 0.0180% | 35 | 40.0% | 0.0361% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 169 | `segmenter` | 0.0180% | 35 | 22.9% | 0.0361% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 170 | `2` | 0.0180% | 42 | 2.4% | 0.0433% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 171 | `revision` | 0.0178% | 42 | 33.3% | 0.0433% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 172 | `vote` | 0.0177% | 60 | 45.0% | 0.0618% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 173 | `resolves` | 0.0175% | 34 | 50.0% | 0.0350% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 174 | `lexicon` | 0.0173% | 37 | 62.2% | 0.0381% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 175 | `under` | 0.0171% | 178 | 27.0% | 0.1835% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 176 | `only` | 0.0170% | 258 | 14.7% | 0.2659% | 0.1307% | 0.0999% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 177 | `ranks` | 0.0170% | 43 | 65.1% | 0.0443% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 178 | `denominator` | 0.0165% | 32 | 15.6% | 0.0330% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 179 | `fibo` | 0.0165% | 32 | 37.5% | 0.0330% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 180 | `grammar` | 0.0164% | 40 | 5.0% | 0.0412% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 181 | `tokens` | 0.0162% | 40 | 50.0% | 0.0412% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 182 | `theme` | 0.0161% | 48 | 39.6% | 0.0495% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 183 | `reaches` | 0.0161% | 40 | 25.0% | 0.0412% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 184 | `computer_science` | 0.0160% | 31 | 3.2% | 0.0320% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 185 | `lemmas` | 0.0160% | 31 | 64.5% | 0.0320% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 186 | `longest` | 0.0159% | 40 | 55.0% | 0.0412% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 187 | `sits` | 0.0155% | 39 | 2.6% | 0.0402% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 188 | `xiv` | 0.0154% | 34 | 0.0% | 0.0350% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 190 | `phrases` | 0.0152% | 36 | 61.1% | 0.0371% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 192 | `bits` | 0.0151% | 72 | 72.2% | 0.0742% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 193 | `run` | 0.0150% | 269 | 27.5% | 0.2773% | 0.0270% | 0.1457% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 194 | `extjwnl` | 0.0149% | 29 | 0.0% | 0.0299% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 195 | `markdown` | 0.0149% | 29 | 0.0% | 0.0299% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 196 | `synset` | 0.0149% | 29 | 51.7% | 0.0299% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 197 | `chose` | 0.0148% | 42 | 23.8% | 0.0433% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 198 | `codebase` | 0.0144% | 28 | 0.0% | 0.0289% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 199 | `permalink` | 0.0144% | 28 | 21.4% | 0.0289% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 200 | `provenance` | 0.0144% | 28 | 28.6% | 0.0289% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 201 | `measured` | 0.0144% | 43 | 7.0% | 0.0443% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 202 | `refused` | 0.0141% | 45 | 37.8% | 0.0464% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 204 | `3` | 0.0140% | 30 | 0.0% | 0.0309% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 205 | `domain` | 0.0140% | 80 | 22.5% | 0.0825% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 206 | `asked` | 0.0137% | 73 | 17.8% | 0.0752% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 207 | `leaves` | 0.0136% | 46 | 58.7% | 0.0474% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 208 | `corroborated` | 0.0134% | 26 | 76.9% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 209 | `publisher's` | 0.0134% | 26 | 0.0% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 210 | `resamples` | 0.0134% | 26 | 76.9% | 0.0268% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 211 | `archive` | 0.0134% | 48 | 43.8% | 0.0495% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 213 | `form` | 0.0132% | 106 | 34.0% | 0.1093% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 214 | `mean` | 0.0132% | 57 | 28.1% | 0.0588% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:34` |
| 215 | `corpus` | 0.0132% | 30 | 6.7% | 0.0309% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 216 | `apache` | 0.0129% | 29 | 3.4% | 0.0299% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:86` |
| 217 | `topic's` | 0.0129% | 25 | 0.0% | 0.0258% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 218 | `bounded` | 0.0126% | 38 | 7.9% | 0.0392% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 219 | `normalisation` | 0.0124% | 24 | 45.8% | 0.0247% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 220 | `normalised` | 0.0124% | 24 | 20.8% | 0.0247% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 221 | `tika` | 0.0124% | 24 | 0.0% | 0.0247% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 222 | `belongs` | 0.0122% | 30 | 3.3% | 0.0309% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 223 | `needs` | 0.0122% | 76 | 5.3% | 0.0783% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 225 | `places` | 0.0121% | 49 | 30.6% | 0.0505% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 226 | `siblings` | 0.0120% | 30 | 63.3% | 0.0309% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 227 | `sha` | 0.0120% | 26 | 76.9% | 0.0268% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 229 | `decides` | 0.0119% | 30 | 0.0% | 0.0309% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 230 | `ast` | 0.0119% | 23 | 0.0% | 0.0237% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 231 | `intensity` | 0.0118% | 32 | 43.8% | 0.0330% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 232 | `piece` | 0.0118% | 46 | 43.5% | 0.0474% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 233 | `thing` | 0.0118% | 67 | 1.5% | 0.0691% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 234 | `tally` | 0.0117% | 27 | 74.1% | 0.0278% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 235 | `knows` | 0.0116% | 38 | 18.4% | 0.0392% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 236 | `statements` | 0.0116% | 37 | 32.4% | 0.0381% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 237 | `nobody` | 0.0116% | 32 | 12.5% | 0.0330% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 239 | `sighting` | 0.0113% | 25 | 92.0% | 0.0258% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 240 | `keyed` | 0.0113% | 22 | 13.6% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 241 | `ontologies` | 0.0113% | 22 | 36.4% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 242 | `scope's` | 0.0113% | 22 | 0.0% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 243 | `xiv's` | 0.0113% | 22 | 0.0% | 0.0227% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 244 | `framework` | 0.0113% | 36 | 30.6% | 0.0371% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 245 | `site` | 0.0111% | 70 | 84.3% | 0.0722% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 247 | `letters` | 0.0111% | 39 | 15.4% | 0.0402% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 249 | `measurement` | 0.0109% | 32 | 0.0% | 0.0330% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 251 | `stays` | 0.0109% | 28 | 21.4% | 0.0289% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 252 | `arxiv` | 0.0108% | 21 | 100.0% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 253 | `cso` | 0.0108% | 21 | 14.3% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:60` |
| 254 | `net's` | 0.0108% | 21 | 0.0% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 255 | `nist` | 0.0108% | 21 | 28.6% | 0.0216% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 256 | `definition` | 0.0107% | 63 | 31.7% | 0.0649% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 257 | `summary` | 0.0107% | 58 | 62.1% | 0.0598% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:97` |
| 258 | `hub` | 0.0106% | 30 | 0.0% | 0.0309% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 259 | `stating` | 0.0105% | 29 | 31.0% | 0.0299% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 260 | `labelled` | 0.0105% | 39 | 33.3% | 0.0402% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:107` |
| 261 | `reported` | 0.0103% | 61 | 6.6% | 0.0629% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:71` |
| 262 | `rungs` | 0.0103% | 20 | 75.0% | 0.0206% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 263 | `unplaced` | 0.0103% | 20 | 80.0% | 0.0206% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:49` |
| 264 | `licence` | 0.0102% | 30 | 20.0% | 0.0309% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 265 | `glued` | 0.0101% | 23 | 47.8% | 0.0237% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 266 | `evaluation` | 0.0101% | 31 | 25.8% | 0.0320% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 267 | `4` | 0.0100% | 24 | 0.0% | 0.0247% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 268 | `abbreviation` | 0.0100% | 23 | 73.9% | 0.0237% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 269 | `splitter` | 0.0100% | 22 | 13.6% | 0.0227% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:23` |
| 270 | `ones` | 0.0099% | 42 | 19.0% | 0.0433% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 271 | `answered` | 0.0098% | 27 | 18.5% | 0.0278% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 272 | `artefact` | 0.0098% | 19 | 26.3% | 0.0196% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 273 | `file's` | 0.0098% | 19 | 0.0% | 0.0196% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 274 | `initialism` | 0.0098% | 19 | 42.1% | 0.0196% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 275 | `taxonomies` | 0.0098% | 19 | 47.4% | 0.0196% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:106` |
| 276 | `page` | 0.0097% | 76 | 27.6% | 0.0783% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 277 | `odds` | 0.0096% | 28 | 39.3% | 0.0289% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 278 | `shown` | 0.0096% | 47 | 40.4% | 0.0484% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 279 | `lines` | 0.0095% | 58 | 72.4% | 0.0598% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 280 | `letter` | 0.0095% | 42 | 33.3% | 0.0433% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 281 | `owl` | 0.0095% | 22 | 81.8% | 0.0227% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 282 | `javadoc` | 0.0095% | 26 | 26.9% | 0.0268% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 283 | `single` | 0.0094% | 72 | 16.7% | 0.0742% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 284 | `sightings` | 0.0094% | 22 | 81.8% | 0.0227% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 285 | `inflection` | 0.0093% | 18 | 61.1% | 0.0186% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 286 | `mark_down` | 0.0093% | 18 | 100.0% | 0.0186% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 287 | `parses` | 0.0093% | 18 | 38.9% | 0.0186% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 288 | `worth` | 0.0092% | 58 | 6.9% | 0.0598% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 289 | `reader` | 0.0092% | 143 | 18.2% | 0.1474% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 291 | `specificity` | 0.0091% | 22 | 81.8% | 0.0227% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 292 | `question` | 0.0090% | 53 | 0.0% | 0.0546% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 293 | `hundred` | 0.0090% | 30 | 0.0% | 0.0309% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:6` |
| 294 | `naming` | 0.0089% | 41 | 12.2% | 0.0423% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 295 | `narrows` | 0.0088% | 17 | 0.0% | 0.0175% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 296 | `rows` | 0.0087% | 74 | 55.4% | 0.0763% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 297 | `spans` | 0.0087% | 28 | 46.4% | 0.0289% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 298 | `nouns` | 0.0086% | 22 | 13.6% | 0.0227% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:26` |
| 299 | `morphology` | 0.0086% | 21 | 38.1% | 0.0216% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 300 | `distinct` | 0.0085% | 31 | 29.0% | 0.0320% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 301 | `root` | 0.0085% | 159 | 76.7% | 0.1639% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 302 | `pieces` | 0.0085% | 33 | 27.3% | 0.0340% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 303 | `caller` | 0.0084% | 49 | 8.2% | 0.0505% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 304 | `asking` | 0.0083% | 31 | 9.7% | 0.0320% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 305 | `999` | 0.0082% | 16 | 0.0% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 306 | `collocations` | 0.0082% | 16 | 56.3% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 307 | `corroboration` | 0.0082% | 16 | 25.0% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 308 | `platform's` | 0.0082% | 16 | 0.0% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 309 | `quantile` | 0.0082% | 16 | 25.0% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 310 | `taxonomy's` | 0.0082% | 16 | 0.0% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:39` |
| 311 | `unreadable` | 0.0082% | 16 | 43.8% | 0.0165% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:52` |
| 312 | `offered` | 0.0081% | 39 | 41.0% | 0.0402% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 313 | `finding` | 0.0080% | 33 | 15.2% | 0.0340% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 314 | `score` | 0.0080% | 33 | 15.2% | 0.0340% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 315 | `function` | 0.0079% | 65 | 55.4% | 0.0670% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 316 | `compares` | 0.0079% | 20 | 5.0% | 0.0206% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 317 | `survives` | 0.0078% | 19 | 10.5% | 0.0196% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 318 | `nearer` | 0.0078% | 18 | 5.6% | 0.0186% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 319 | `dominant` | 0.0077% | 24 | 62.5% | 0.0247% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 320 | `abstention` | 0.0077% | 15 | 20.0% | 0.0155% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 321 | `field's` | 0.0077% | 15 | 0.0% | 0.0155% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 322 | `normal_form` | 0.0077% | 15 | 46.7% | 0.0155% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 323 | `rests` | 0.0077% | 19 | 15.8% | 0.0196% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 324 | `statistic` | 0.0077% | 18 | 5.6% | 0.0186% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 326 | `commits` | 0.0076% | 19 | 26.3% | 0.0196% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 327 | `contribution` | 0.0075% | 27 | 81.5% | 0.0278% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 328 | `somebody` | 0.0074% | 22 | 4.5% | 0.0227% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 329 | `initials` | 0.0073% | 17 | 52.9% | 0.0175% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:45` |
| 330 | `fails` | 0.0072% | 21 | 9.5% | 0.0216% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 331 | `bearers` | 0.0072% | 14 | 100.0% | 0.0144% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:53` |
| 332 | `dictionary's` | 0.0072% | 14 | 0.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 333 | `fetched` | 0.0072% | 14 | 28.6% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 334 | `hypernym` | 0.0072% | 14 | 50.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 335 | `skos` | 0.0072% | 14 | 42.9% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 336 | `wikidata` | 0.0072% | 14 | 0.0% | 0.0144% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 337 | `placements` | 0.0072% | 18 | 100.0% | 0.0186% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 338 | `cite` | 0.0072% | 21 | 33.3% | 0.0216% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 339 | `honest` | 0.0072% | 23 | 0.0% | 0.0237% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:16` |
| 340 | `commit` | 0.0071% | 60 | 38.3% | 0.0618% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 341 | `semantics` | 0.0071% | 18 | 83.3% | 0.0186% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 342 | `references` | 0.0071% | 36 | 58.3% | 0.0371% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 343 | `functions` | 0.0071% | 32 | 46.9% | 0.0330% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 344 | `residual` | 0.0070% | 18 | 61.1% | 0.0186% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 345 | `beat` | 0.0069% | 27 | 22.2% | 0.0278% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 346 | `partition` | 0.0069% | 19 | 15.8% | 0.0196% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:111` |
| 347 | `contributes` | 0.0069% | 19 | 10.5% | 0.0196% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 348 | `hierarchy` | 0.0068% | 41 | 48.8% | 0.0423% | 0.0013% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 349 | `language` | 0.0068% | 55 | 27.3% | 0.0567% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 350 | `cites` | 0.0067% | 17 | 41.2% | 0.0175% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 351 | `descriptions` | 0.0067% | 20 | 50.0% | 0.0206% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 352 | `scheme` | 0.0067% | 44 | 13.6% | 0.0454% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 353 | `folder` | 0.0067% | 35 | 54.3% | 0.0361% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 354 | `collocation` | 0.0067% | 13 | 38.5% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 355 | `generalises` | 0.0067% | 13 | 30.8% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 356 | `permutation` | 0.0067% | 13 | 15.4% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 357 | `reading's` | 0.0067% | 13 | 0.0% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 358 | `reference's` | 0.0067% | 13 | 0.0% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 359 | `resource's` | 0.0067% | 13 | 0.0% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 360 | `set_aside` | 0.0067% | 13 | 53.8% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:170` |
| 361 | `source's` | 0.0067% | 13 | 0.0% | 0.0134% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 362 | `distributions` | 0.0067% | 18 | 27.8% | 0.0186% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 363 | `lets` | 0.0067% | 20 | 15.0% | 0.0206% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 364 | `chain` | 0.0066% | 33 | 42.4% | 0.0340% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 365 | `heading` | 0.0065% | 23 | 78.3% | 0.0237% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 366 | `writing` | 0.0065% | 40 | 2.5% | 0.0412% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 367 | `pooling` | 0.0065% | 15 | 6.7% | 0.0155% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 368 | `standing` | 0.0065% | 28 | 21.4% | 0.0289% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 369 | `arrives` | 0.0065% | 19 | 5.3% | 0.0196% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 371 | `makes` | 0.0065% | 54 | 3.7% | 0.0557% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 372 | `silent` | 0.0065% | 20 | 40.0% | 0.0206% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 373 | `folded` | 0.0065% | 17 | 35.3% | 0.0175% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 374 | `boundary` | 0.0064% | 21 | 9.5% | 0.0216% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 375 | `pref` | 0.0064% | 18 | 100.0% | 0.0186% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 377 | `prints` | 0.0064% | 18 | 27.8% | 0.0186% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 378 | `produces` | 0.0063% | 22 | 4.5% | 0.0227% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 379 | `branches` | 0.0063% | 21 | 38.1% | 0.0216% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 380 | `above` | 0.0062% | 57 | 21.1% | 0.0588% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 381 | `json` | 0.0062% | 20 | 30.0% | 0.0206% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 382 | `matching` | 0.0062% | 20 | 10.0% | 0.0206% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 383 | `fasterxml` | 0.0062% | 12 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 384 | `repositories` | 0.0062% | 12 | 0.0% | 0.0124% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 385 | `translingual` | 0.0062% | 12 | 75.0% | 0.0124% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 386 | `adjective` | 0.0062% | 15 | 40.0% | 0.0155% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 387 | `weighs` | 0.0062% | 16 | 81.3% | 0.0165% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:7` |
| 388 | `documentation` | 0.0061% | 22 | 27.3% | 0.0227% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 389 | `weight` | 0.0061% | 50 | 52.0% | 0.0515% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 390 | `exported` | 0.0061% | 26 | 84.6% | 0.0268% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 391 | `compared` | 0.0060% | 40 | 15.0% | 0.0412% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 392 | `spelled` | 0.0060% | 15 | 13.3% | 0.0155% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 393 | `observed` | 0.0059% | 36 | 19.4% | 0.0371% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 394 | `disagree` | 0.0059% | 16 | 6.3% | 0.0165% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 396 | `withheld` | 0.0058% | 14 | 64.3% | 0.0144% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:79` |
| 397 | `publishing` | 0.0058% | 21 | 4.8% | 0.0216% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 399 | `graph` | 0.0057% | 26 | 57.7% | 0.0268% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 400 | `clears` | 0.0057% | 11 | 18.2% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 401 | `collocated` | 0.0057% | 11 | 100.0% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 402 | `csf` | 0.0057% | 11 | 72.7% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 403 | `rdf` | 0.0057% | 11 | 18.2% | 0.0113% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 404 | `read_off` | 0.0057% | 11 | 0.0% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 405 | `revision's` | 0.0057% | 11 | 0.0% | 0.0113% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 406 | `spellings` | 0.0057% | 11 | 9.1% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 407 | `vocabularies` | 0.0057% | 11 | 0.0% | 0.0113% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:47` |
| 408 | `wiktextract` | 0.0057% | 11 | 0.0% | 0.0113% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 409 | `rendered` | 0.0057% | 25 | 68.0% | 0.0258% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 410 | `imports` | 0.0057% | 21 | 47.6% | 0.0216% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 411 | `judged` | 0.0056% | 16 | 12.5% | 0.0165% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:40` |
| 412 | `weights` | 0.0056% | 16 | 68.8% | 0.0165% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 413 | `linguistic` | 0.0055% | 16 | 18.8% | 0.0165% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 414 | `pools` | 0.0055% | 16 | 25.0% | 0.0165% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 415 | `finds` | 0.0055% | 21 | 71.4% | 0.0216% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 416 | `moves` | 0.0054% | 22 | 22.7% | 0.0227% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 417 | `taken` | 0.0054% | 59 | 3.4% | 0.0608% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 418 | `printed` | 0.0054% | 21 | 9.5% | 0.0216% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 419 | `hold` | 0.0054% | 39 | 17.9% | 0.0402% | 0.0128% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 420 | `means` | 0.0054% | 58 | 17.2% | 0.0598% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 421 | `rest` | 0.0053% | 36 | 27.8% | 0.0371% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 422 | `figures` | 0.0053% | 26 | 15.4% | 0.0268% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 423 | `signals` | 0.0053% | 20 | 65.0% | 0.0206% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:85` |
| 424 | `identifiers` | 0.0053% | 24 | 20.8% | 0.0247% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 425 | `jensen` | 0.0053% | 13 | 15.4% | 0.0134% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 426 | `unread` | 0.0053% | 19 | 47.4% | 0.0196% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 427 | `shannon` | 0.0053% | 14 | 14.3% | 0.0144% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 428 | `dropped` | 0.0053% | 24 | 4.2% | 0.0247% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 429 | `bundles` | 0.0052% | 14 | 7.1% | 0.0144% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 430 | `say` | 0.0052% | 72 | 5.6% | 0.0742% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 431 | `distance` | 0.0052% | 33 | 30.3% | 0.0340% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 432 | `discarded` | 0.0052% | 14 | 14.3% | 0.0144% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 433 | `witness` | 0.0052% | 19 | 73.7% | 0.0196% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:76` |
| 434 | `14` | 0.0052% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 435 | `a's` | 0.0052% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:45` |
| 436 | `bian` | 0.0052% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 437 | `classpath` | 0.0052% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:41` |
| 438 | `oscal` | 0.0052% | 10 | 30.0% | 0.0103% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 439 | `λ` | 0.0052% | 10 | 0.0% | 0.0103% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 440 | `sets` | 0.0051% | 26 | 57.7% | 0.0268% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 441 | `takes` | 0.0051% | 37 | 54.1% | 0.0381% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 442 | `median` | 0.0050% | 18 | 55.6% | 0.0186% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 443 | `candidate` | 0.0048% | 28 | 14.3% | 0.0289% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 444 | `supplied` | 0.0048% | 18 | 33.3% | 0.0186% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 445 | `far` | 0.0048% | 57 | 12.3% | 0.0588% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 446 | `held` | 0.0048% | 59 | 49.2% | 0.0608% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 447 | `records` | 0.0048% | 28 | 21.4% | 0.0289% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 448 | `lists` | 0.0047% | 18 | 16.7% | 0.0186% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 450 | `sum` | 0.0047% | 30 | 23.3% | 0.0309% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 451 | `deepest` | 0.0047% | 13 | 46.2% | 0.0134% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 452 | `produced` | 0.0047% | 36 | 5.6% | 0.0371% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 453 | `ladder` | 0.0047% | 14 | 28.6% | 0.0144% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 454 | `152` | 0.0046% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 455 | `636` | 0.0046% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 456 | `classifies` | 0.0046% | 9 | 11.1% | 0.0093% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:11` |
| 457 | `decomposes` | 0.0046% | 9 | 55.6% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 458 | `else's` | 0.0046% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 459 | `framework's` | 0.0046% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 460 | `library's` | 0.0046% | 9 | 0.0% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 461 | `pull_request` | 0.0046% | 9 | 55.6% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 462 | `seeded` | 0.0046% | 9 | 55.6% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:62` |
| 463 | `weighting` | 0.0046% | 9 | 22.2% | 0.0093% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 464 | `puts` | 0.0046% | 17 | 23.5% | 0.0175% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 465 | `meant` | 0.0046% | 25 | 8.0% | 0.0258% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 466 | `fixture` | 0.0046% | 13 | 30.8% | 0.0134% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 467 | `distinctive` | 0.0046% | 16 | 62.5% | 0.0165% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:155` |
| 468 | `markup` | 0.0046% | 14 | 21.4% | 0.0144% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:35` |
| 469 | `sentences` | 0.0046% | 15 | 26.7% | 0.0155% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:132` |
| 470 | `consumer` | 0.0046% | 50 | 2.0% | 0.0515% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 471 | `bars` | 0.0045% | 17 | 52.9% | 0.0175% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:64` |
| 472 | `copied` | 0.0045% | 13 | 69.2% | 0.0134% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 473 | `verbs` | 0.0045% | 13 | 23.1% | 0.0134% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 474 | `alike` | 0.0045% | 15 | 6.7% | 0.0155% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 475 | `quantity` | 0.0045% | 16 | 75.0% | 0.0165% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 476 | `chart` | 0.0044% | 17 | 41.2% | 0.0175% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 477 | `clause` | 0.0044% | 25 | 20.0% | 0.0258% | 0.0019% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 478 | `frequency` | 0.0044% | 21 | 23.8% | 0.0216% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 479 | `merged` | 0.0043% | 13 | 92.3% | 0.0134% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:27` |
| 480 | `walk` | 0.0043% | 26 | 30.8% | 0.0268% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:50` |
| 481 | `attribution` | 0.0043% | 12 | 25.0% | 0.0124% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 482 | `dotted` | 0.0042% | 11 | 36.4% | 0.0113% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 483 | `somewhere` | 0.0042% | 16 | 12.5% | 0.0165% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 484 | `squash` | 0.0041% | 11 | 54.5% | 0.0113% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 485 | `legible` | 0.0041% | 8 | 75.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 486 | `olia` | 0.0041% | 8 | 100.0% | 0.0082% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:32` |
| 487 | `stylesheet` | 0.0041% | 8 | 0.0% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 488 | `sunburst` | 0.0041% | 8 | 37.5% | 0.0082% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 489 | `removes` | 0.0041% | 12 | 16.7% | 0.0124% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 490 | `identifier` | 0.0041% | 83 | 27.7% | 0.0856% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 491 | `accumulator` | 0.0041% | 14 | 71.4% | 0.0144% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 492 | `counting` | 0.0041% | 19 | 15.8% | 0.0196% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 493 | `weighed` | 0.0040% | 13 | 23.1% | 0.0134% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 494 | `excluded` | 0.0040% | 16 | 43.8% | 0.0165% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:103` |
| 495 | `fold` | 0.0040% | 16 | 37.5% | 0.0165% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 496 | `outcome` | 0.0040% | 19 | 10.5% | 0.0196% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 497 | `spells` | 0.0040% | 12 | 33.3% | 0.0124% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 498 | `reached` | 0.0040% | 26 | 26.9% | 0.0268% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 499 | `capitals` | 0.0040% | 11 | 36.4% | 0.0113% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 500 | `first` | 0.0040% | 215 | 31.6% | 0.2216% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 501 | `distinguishing` | 0.0040% | 11 | 45.5% | 0.0113% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:97` |
| 502 | `partitions` | 0.0040% | 10 | 10.0% | 0.0103% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 503 | `applies` | 0.0040% | 16 | 0.0% | 0.0165% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 504 | `separates` | 0.0040% | 11 | 18.2% | 0.0113% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 505 | `declaration` | 0.0039% | 41 | 19.5% | 0.0423% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 506 | `extracted` | 0.0039% | 12 | 58.3% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 507 | `unchanged` | 0.0039% | 12 | 16.7% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 508 | `seed` | 0.0039% | 36 | 69.4% | 0.0371% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:88` |
| 509 | `categories` | 0.0039% | 18 | 16.7% | 0.0186% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 510 | `follows` | 0.0039% | 20 | 5.0% | 0.0206% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 511 | `export` | 0.0039% | 38 | 39.5% | 0.0392% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 512 | `acronym` | 0.0039% | 10 | 50.0% | 0.0103% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 513 | `registry` | 0.0038% | 31 | 12.9% | 0.0320% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 514 | `defect` | 0.0038% | 11 | 9.1% | 0.0113% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 515 | `shared` | 0.0038% | 54 | 59.3% | 0.0557% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 516 | `meanings` | 0.0038% | 12 | 16.7% | 0.0124% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 517 | `5` | 0.0038% | 11 | 0.0% | 0.0113% | 0.0000% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 518 | `decide` | 0.0038% | 18 | 5.6% | 0.0186% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 519 | `happens` | 0.0038% | 19 | 5.3% | 0.0196% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 520 | `sides` | 0.0038% | 21 | 9.5% | 0.0216% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 521 | `script` | 0.0037% | 27 | 48.1% | 0.0278% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 522 | `unit` | 0.0037% | 56 | 26.8% | 0.0577% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 523 | `confidence` | 0.0037% | 20 | 35.0% | 0.0206% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 524 | `declarations` | 0.0037% | 12 | 41.7% | 0.0124% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 525 | `quoted` | 0.0037% | 17 | 23.5% | 0.0175% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 526 | `coordinate` | 0.0037% | 13 | 30.8% | 0.0134% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:51` |
| 527 | `reach` | 0.0037% | 27 | 37.0% | 0.0278% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:94` |
| 528 | `step` | 0.0036% | 31 | 16.1% | 0.0320% | 0.0093% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 529 | `meaning` | 0.0036% | 27 | 22.2% | 0.0278% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 530 | `enough` | 0.0036% | 47 | 14.9% | 0.0484% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 531 | `000` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:40` |
| 532 | `12` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 533 | `caller's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 534 | `category's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 535 | `concept's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:72` |
| 536 | `fibo's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 537 | `furthest` | 0.0036% | 7 | 14.3% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 538 | `inflections` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 539 | `initialisms` | 0.0036% | 7 | 85.7% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 540 | `lombok` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 541 | `narrowest` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 542 | `omits` | 0.0036% | 7 | 28.6% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 543 | `phrase's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 544 | `refusals` | 0.0036% | 7 | 42.9% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 545 | `subject's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 546 | `tika's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:17` |
| 547 | `tree's` | 0.0036% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:59` |
| 548 | `unsegmented` | 0.0036% | 7 | 100.0% | 0.0072% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 549 | `manifest` | 0.0036% | 25 | 56.0% | 0.0258% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 550 | `sources` | 0.0036% | 25 | 60.0% | 0.0258% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 551 | `stops` | 0.0036% | 14 | 7.1% | 0.0144% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 552 | `coverage` | 0.0036% | 18 | 33.3% | 0.0186% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 553 | `extracts` | 0.0036% | 10 | 30.0% | 0.0103% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:17` |
| 554 | `both` | 0.0035% | 135 | 8.9% | 0.1392% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 555 | `admitted` | 0.0035% | 17 | 52.9% | 0.0175% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 556 | `nowhere` | 0.0035% | 12 | 25.0% | 0.0124% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 557 | `asserted` | 0.0035% | 11 | 0.0% | 0.0113% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 558 | `depth` | 0.0034% | 31 | 64.5% | 0.0320% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 559 | `rankings` | 0.0034% | 11 | 100.0% | 0.0113% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 560 | `defines` | 0.0034% | 12 | 33.3% | 0.0124% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/SourceScope.java:7` |
| 561 | `thousand` | 0.0034% | 15 | 6.7% | 0.0155% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 562 | `cc` | 0.0034% | 10 | 0.0% | 0.0103% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:52` |
| 563 | `quotations` | 0.0034% | 9 | 77.8% | 0.0093% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 564 | `punctuation` | 0.0034% | 10 | 20.0% | 0.0103% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:52` |
| 565 | `seam` | 0.0034% | 9 | 11.1% | 0.0093% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 566 | `links` | 0.0033% | 17 | 64.7% | 0.0175% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 568 | `publish` | 0.0033% | 15 | 33.3% | 0.0155% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 569 | `agree` | 0.0032% | 18 | 11.1% | 0.0186% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 570 | `boundaries` | 0.0032% | 14 | 28.6% | 0.0144% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 571 | `observation` | 0.0032% | 13 | 23.1% | 0.0134% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 572 | `ambiguous` | 0.0032% | 14 | 14.3% | 0.0144% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 573 | `picture` | 0.0032% | 21 | 23.8% | 0.0216% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:38` |
| 574 | `weighted` | 0.0032% | 10 | 20.0% | 0.0103% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 575 | `zero` | 0.0031% | 49 | 30.6% | 0.0505% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 576 | `turns` | 0.0031% | 16 | 6.3% | 0.0165% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:13` |
| 577 | `spelling` | 0.0031% | 11 | 9.1% | 0.0113% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 578 | `wrong` | 0.0031% | 22 | 4.5% | 0.0227% | 0.0066% | 0.0070% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 579 | `resting` | 0.0031% | 10 | 30.0% | 0.0103% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 580 | `antonymous` | 0.0031% | 6 | 100.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 581 | `apostrophe` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 582 | `capitalisation` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:77` |
| 583 | `composes` | 0.0031% | 6 | 50.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:23` |
| 584 | `cso's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:8` |
| 585 | `derivational` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 586 | `dumps` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 587 | `hypernyms` | 0.0031% | 6 | 83.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 588 | `inventing` | 0.0031% | 6 | 16.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 589 | `language's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 590 | `list's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 591 | `ontology's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:24` |
| 592 | `open_class` | 0.0031% | 6 | 33.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 593 | `permuted` | 0.0031% | 6 | 83.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 594 | `plan's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 595 | `project's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 596 | `rarest` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 597 | `reproducible` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 598 | `statistic's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 599 | `svg` | 0.0031% | 6 | 66.7% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 600 | `toolchain` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 601 | `type's` | 0.0031% | 6 | 0.0% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 602 | `unreached` | 0.0031% | 6 | 83.3% | 0.0062% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:59` |
| 604 | `settled` | 0.0031% | 14 | 7.1% | 0.0144% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 605 | `everyday` | 0.0030% | 14 | 14.3% | 0.0144% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 606 | `archives` | 0.0030% | 11 | 63.6% | 0.0113% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 607 | `carriers` | 0.0030% | 11 | 54.5% | 0.0113% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 608 | `why` | 0.0030% | 54 | 5.6% | 0.0557% | 0.0293% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 609 | `behind` | 0.0030% | 36 | 22.2% | 0.0371% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 610 | `cheapest` | 0.0030% | 9 | 33.3% | 0.0093% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 611 | `guess` | 0.0029% | 14 | 14.3% | 0.0144% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 613 | `splits` | 0.0029% | 15 | 20.0% | 0.0155% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 614 | `thresholds` | 0.0029% | 9 | 77.8% | 0.0093% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 615 | `settle` | 0.0029% | 12 | 16.7% | 0.0124% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:39` |
| 616 | `behaviour` | 0.0028% | 17 | 64.7% | 0.0175% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 617 | `committed` | 0.0028% | 19 | 5.3% | 0.0196% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 620 | `contributions` | 0.0028% | 14 | 71.4% | 0.0144% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 621 | `nests` | 0.0028% | 8 | 62.5% | 0.0082% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:27` |
| 622 | `reference` | 0.0028% | 128 | 46.1% | 0.1319% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 623 | `stood` | 0.0028% | 14 | 28.6% | 0.0144% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 624 | `segments` | 0.0028% | 11 | 72.7% | 0.0113% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 625 | `gives` | 0.0027% | 24 | 45.8% | 0.0247% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 626 | `percentage` | 0.0027% | 14 | 28.6% | 0.0144% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 627 | `covers` | 0.0027% | 15 | 26.7% | 0.0155% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 629 | `distinguishes` | 0.0027% | 8 | 25.0% | 0.0082% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 630 | `statement` | 0.0027% | 63 | 28.6% | 0.0649% | 0.0125% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 631 | `stand` | 0.0027% | 21 | 4.8% | 0.0216% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 632 | `assumed` | 0.0027% | 13 | 0.0% | 0.0134% | 0.0028% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 633 | `qualified` | 0.0027% | 32 | 65.6% | 0.0330% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 634 | `recorded` | 0.0026% | 24 | 20.8% | 0.0247% | 0.0083% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 635 | `choosing` | 0.0026% | 12 | 0.0% | 0.0124% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 636 | `lowercase` | 0.0026% | 7 | 0.0% | 0.0072% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 637 | `expansion` | 0.0026% | 16 | 62.5% | 0.0165% | 0.0045% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 638 | `holding` | 0.0026% | 18 | 27.8% | 0.0186% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 639 | `29` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 640 | `6` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 641 | `972` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `README.md:45` |
| 642 | `accumulates` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 643 | `author's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:132` |
| 644 | `broadest` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 645 | `caveat` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 646 | `cc0` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:16` |
| 647 | `corroborating` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 648 | `divergences` | 0.0026% | 5 | 60.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:80` |
| 649 | `fetches` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 650 | `generalisation` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 651 | `jsonl` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 652 | `jwnl` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:47` |
| 653 | `load_bearing` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 654 | `name's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 655 | `nist's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 656 | `noun_phrase` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 657 | `obeys` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 658 | `outranks` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 659 | `own_right` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 660 | `page's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburstDocument.java:6` |
| 661 | `qlever` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 662 | `read_out` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 663 | `readme` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 664 | `repo` | 0.0026% | 5 | 80.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:25` |
| 665 | `sparql` | 0.0026% | 5 | 20.0% | 0.0052% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 666 | `standard's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 667 | `uax` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 668 | `unsound` | 0.0026% | 5 | 80.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 669 | `wedges` | 0.0026% | 5 | 60.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 670 | `winner's` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 671 | `ρ` | 0.0026% | 5 | 0.0% | 0.0052% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 672 | `tagged` | 0.0026% | 10 | 10.0% | 0.0103% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:45` |
| 673 | `choice` | 0.0026% | 24 | 20.8% | 0.0247% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 674 | `doctrine` | 0.0026% | 11 | 0.0% | 0.0113% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 675 | `runner` | 0.0026% | 9 | 77.8% | 0.0093% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 676 | `difference` | 0.0026% | 23 | 4.3% | 0.0237% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 677 | `abbreviations` | 0.0025% | 7 | 85.7% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 678 | `settles` | 0.0025% | 7 | 14.3% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 679 | `mit` | 0.0025% | 8 | 0.0% | 0.0082% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 680 | `guessed` | 0.0025% | 7 | 0.0% | 0.0072% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 681 | `implied` | 0.0025% | 9 | 33.3% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 682 | `judgement` | 0.0025% | 9 | 0.0% | 0.0093% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 683 | `ordering` | 0.0025% | 13 | 0.0% | 0.0134% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 684 | `uniform` | 0.0025% | 12 | 16.7% | 0.0124% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:66` |
| 685 | `speaks` | 0.0025% | 11 | 0.0% | 0.0113% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 686 | `pointed` | 0.0025% | 13 | 0.0% | 0.0134% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 687 | `preamble` | 0.0025% | 8 | 100.0% | 0.0082% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 688 | `endpoint` | 0.0025% | 12 | 66.7% | 0.0124% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 689 | `reason` | 0.0025% | 41 | 7.3% | 0.0423% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 690 | `place` | 0.0025% | 88 | 25.0% | 0.0907% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 691 | `lexical` | 0.0024% | 11 | 0.0% | 0.0113% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 692 | `linguistics` | 0.0024% | 8 | 0.0% | 0.0082% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 693 | `scores` | 0.0024% | 12 | 16.7% | 0.0124% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 694 | `checkout` | 0.0024% | 7 | 28.6% | 0.0072% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 695 | `weakest` | 0.0024% | 7 | 0.0% | 0.0072% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 696 | `closes` | 0.0024% | 8 | 12.5% | 0.0082% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 697 | `verdict` | 0.0024% | 9 | 88.9% | 0.0093% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 698 | `drops` | 0.0024% | 10 | 60.0% | 0.0103% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 699 | `sentinel` | 0.0024% | 7 | 28.6% | 0.0072% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 700 | `answering` | 0.0024% | 8 | 25.0% | 0.0082% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 702 | `describes` | 0.0024% | 14 | 57.1% | 0.0144% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:93` |
| 703 | `joins` | 0.0024% | 9 | 44.4% | 0.0093% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:25` |
| 704 | `quoting` | 0.0024% | 8 | 12.5% | 0.0082% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 705 | `spread` | 0.0024% | 18 | 33.3% | 0.0186% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 707 | `pins` | 0.0023% | 8 | 25.0% | 0.0082% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 708 | `half` | 0.0023% | 40 | 17.5% | 0.0412% | 0.0214% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 709 | `gets` | 0.0023% | 19 | 0.0% | 0.0196% | 0.0069% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:47` |
| 710 | `denotes` | 0.0023% | 7 | 42.9% | 0.0072% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 712 | `sit` | 0.0023% | 14 | 7.1% | 0.0144% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 713 | `branding` | 0.0022% | 8 | 37.5% | 0.0082% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 714 | `edges` | 0.0022% | 10 | 50.0% | 0.0103% | 0.0020% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 715 | `rare` | 0.0022% | 16 | 43.8% | 0.0165% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 716 | `leads` | 0.0022% | 15 | 26.7% | 0.0155% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:62` |
| 717 | `spaces` | 0.0022% | 14 | 14.3% | 0.0144% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:52` |
| 718 | `arithmetic` | 0.0022% | 8 | 12.5% | 0.0082% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 719 | `restriction` | 0.0022% | 8 | 37.5% | 0.0082% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 721 | `winner` | 0.0021% | 15 | 33.3% | 0.0155% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 722 | `adds` | 0.0021% | 12 | 25.0% | 0.0124% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 724 | `viewer` | 0.0021% | 8 | 0.0% | 0.0082% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 725 | `meets` | 0.0021% | 11 | 0.0% | 0.0113% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 726 | `admits` | 0.0021% | 8 | 37.5% | 0.0082% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportSchema.java:42` |
| 727 | `divides` | 0.0021% | 7 | 14.3% | 0.0072% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:74` |
| 728 | `crossings` | 0.0021% | 7 | 100.0% | 0.0072% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 729 | `jackson` | 0.0021% | 12 | 0.0% | 0.0124% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 730 | `behaviours` | 0.0021% | 8 | 87.5% | 0.0082% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 731 | `synonym` | 0.0021% | 6 | 16.7% | 0.0062% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 790 | `adjacent` | 0.0021% | 10 | 0.0% | 0.0103% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 791 | `restated` | 0.0021% | 6 | 83.3% | 0.0062% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 795 | `bare` | 0.0020% | 8 | 12.5% | 0.0082% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 796 | `agreeing` | 0.0020% | 7 | 71.4% | 0.0072% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 797 | `concentrated` | 0.0020% | 9 | 66.7% | 0.0093% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:43` |
| 798 | `artefacts` | 0.0020% | 7 | 28.6% | 0.0072% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 799 | `failing` | 0.0020% | 10 | 10.0% | 0.0103% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:26` |
| 801 | `identifies` | 0.0020% | 8 | 37.5% | 0.0082% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 802 | `agrees` | 0.0020% | 8 | 37.5% | 0.0082% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 803 | `shorter` | 0.0020% | 10 | 30.0% | 0.0103% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 804 | `departs` | 0.0020% | 6 | 0.0% | 0.0062% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:35` |
| 805 | `underscores` | 0.0020% | 6 | 16.7% | 0.0062% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 806 | `argues` | 0.0020% | 10 | 10.0% | 0.0103% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 807 | `forms` | 0.0019% | 22 | 31.8% | 0.0227% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2534% | 932 | 9.3% | 0.9607% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1709% | 442 | 16.5% | 0.4556% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 24 | `than` | 0.1040% | 571 | 16.8% | 0.5886% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0734% | 398 | 19.6% | 0.4102% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0535% | 113 | 25.7% | 0.1165% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 55 | `not` | 0.0477% | 706 | 16.1% | 0.7277% | 0.3534% | 0.1355% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 66 | `itself` | 0.0404% | 131 | 25.2% | 0.1350% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 69 | `against` | 0.0391% | 236 | 13.1% | 0.2433% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 70 | `cannot` | 0.0381% | 127 | 7.9% | 0.1309% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 93 | `how` | 0.0314% | 279 | 5.7% | 0.2876% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 94 | `because` | 0.0313% | 253 | 8.7% | 0.2608% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 95 | `which` | 0.0312% | 508 | 2.0% | 0.5236% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 103 | `whose` | 0.0294% | 92 | 12.0% | 0.0948% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 112 | `whether` | 0.0271% | 127 | 3.9% | 0.1309% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 121 | `never` | 0.0252% | 149 | 11.4% | 0.1536% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 130 | `exactly` | 0.0232% | 70 | 7.1% | 0.0722% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 137 | `beneath` | 0.0220% | 52 | 19.2% | 0.0536% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:36` |
| 140 | `com` | 0.0213% | 45 | 0.0% | 0.0464% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 158 | `them` | 0.0193% | 259 | 6.6% | 0.2670% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 189 | `already` | 0.0153% | 92 | 7.6% | 0.0948% | 0.0256% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,555 | 4,064 |
| `a` | 4,957 | 1 |
| `is` | 2,914 | 16 |
| `and` | 2,220 | 3,991 |
| `it` | 1,985 | 5 |
| `of` | 1,941 | 4,077 |
| `one` | 1,173 | 7 |
| `word` | 1,114 | 2 |
| `that` | 1,068 | 1,971 |
| `what` | 932 | 6 |
| `in` | 931 | 4,001 |
| `to` | 917 | 4,072 |
| `as` | 828 | 1,282 |
| `its` | 773 | 19 |
| `not` | 706 | 55 |
| `by` | 682 | 398 |
| `words` | 670 | 4 |
| `so` | 662 | 21 |
| `reading` | 651 | 3 |
| `this` | 605 | 628 |
