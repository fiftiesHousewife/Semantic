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

**7,509 occurrences of 960 distinct words**, read against ordinary English and the platform's own API. The 250 that clear the bar hold 61.0% of what was written and 85.4% of the divergence, and 100.0% of their occurrences are names. 230 words in the ranking are ones a reference writes more densely than this repository does, and 39 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0170%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 960, over 999 draws yielding 2,699,796 scored words from that reference's own distribution. A word is here where it beats **0.0205%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 960, over 999 draws yielding 1,548,676 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `word` | 1.4929% | 243 | 100.0% | 3.2361% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 2 | `words` | 0.9260% | 147 | 100.0% | 1.9577% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:33` |
| 3 | `topic` | 0.7491% | 115 | 100.0% | 1.5315% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 5 | `concept` | 0.4669% | 74 | 100.0% | 0.9855% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 6 | `concepts` | 0.4243% | 66 | 100.0% | 0.8789% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 7 | `written` | 0.4213% | 70 | 100.0% | 0.9322% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 8 | `occurrences` | 0.3894% | 59 | 100.0% | 0.7857% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 9 | `sense` | 0.3852% | 64 | 100.0% | 0.8523% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 10 | `share` | 0.3767% | 65 | 100.0% | 0.8656% | 0.0187% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 11 | `scope` | 0.3763% | 70 | 100.0% | 0.9322% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:16` |
| 12 | `topics` | 0.3402% | 53 | 100.0% | 0.7058% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 13 | `reading` | 0.3124% | 51 | 100.0% | 0.6792% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:65` |
| 14 | `label` | 0.2731% | 64 | 100.0% | 0.8523% | 0.0028% | 0.0770% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:53` |
| 15 | `path` | 0.2625% | 85 | 100.0% | 1.1320% | 0.0055% | 0.1967% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 16 | `mass` | 0.2591% | 43 | 100.0% | 0.5726% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:22` |
| 17 | `stated` | 0.2590% | 43 | 100.0% | 0.5726% | 0.0083% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportSchema.java:34` |
| 18 | `divergence` | 0.2564% | 39 | 100.0% | 0.5194% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 19 | `source` | 0.2440% | 77 | 100.0% | 1.0254% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 20 | `rung` | 0.2331% | 35 | 100.0% | 0.4661% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 21 | `files` | 0.2311% | 43 | 100.0% | 0.5726% | 0.0039% | 0.0211% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:44` |
| 22 | `broader` | 0.2296% | 36 | 100.0% | 0.4794% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:75` |
| 23 | `published` | 0.2204% | 40 | 100.0% | 0.5327% | 0.0169% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:54` |
| 24 | `repository` | 0.2082% | 34 | 100.0% | 0.4528% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:17` |
| 25 | `domains` | 0.1817% | 29 | 100.0% | 0.3862% | 0.0013% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:17` |
| 26 | `terms` | 0.1740% | 33 | 100.0% | 0.4395% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:71` |
| 27 | `site` | 0.1700% | 33 | 100.0% | 0.4395% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 28 | `term` | 0.1694% | 32 | 100.0% | 0.4262% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 29 | `chance` | 0.1652% | 29 | 100.0% | 0.3862% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 30 | `matched` | 0.1594% | 25 | 100.0% | 0.3329% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:59` |
| 31 | `themes` | 0.1561% | 25 | 100.0% | 0.3329% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:107` |
| 32 | `token` | 0.1498% | 34 | 100.0% | 0.4528% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 33 | `vocabulary` | 0.1480% | 23 | 100.0% | 0.3063% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:94` |
| 34 | `senses` | 0.1480% | 23 | 100.0% | 0.3063% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:59` |
| 35 | `legibility` | 0.1465% | 22 | 100.0% | 0.2930% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:97` |
| 36 | `phrase` | 0.1440% | 23 | 100.0% | 0.3063% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 37 | `entry` | 0.1429% | 62 | 100.0% | 0.8257% | 0.0051% | 0.2073% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:26` |
| 38 | `prose` | 0.1421% | 22 | 100.0% | 0.2930% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 39 | `subject` | 0.1409% | 30 | 100.0% | 0.3995% | 0.0117% | 0.0268% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 40 | `lemma` | 0.1398% | 21 | 100.0% | 0.2797% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:64` |
| 41 | `witnesses` | 0.1390% | 22 | 100.0% | 0.2930% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:31` |
| 42 | `citations` | 0.1372% | 21 | 100.0% | 0.2797% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 43 | `summary` | 0.1365% | 26 | 100.0% | 0.3463% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:106` |
| 44 | `tsv` | 0.1332% | 20 | 100.0% | 0.2663% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 45 | `cited` | 0.1310% | 21 | 100.0% | 0.2797% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 46 | `taxonomy` | 0.1303% | 20 | 100.0% | 0.2663% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:147` |
| 47 | `bits` | 0.1287% | 25 | 100.0% | 0.3329% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 48 | `nearest` | 0.1276% | 20 | 100.0% | 0.2663% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 49 | `named` | 0.1275% | 26 | 100.0% | 0.3463% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 50 | `occurrence` | 0.1259% | 22 | 100.0% | 0.2930% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 51 | `placed` | 0.1165% | 21 | 100.0% | 0.2797% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |

<details>
<summary>200 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 52 | `verb` | 0.1150% | 18 | 100.0% | 0.2397% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 53 | `placement` | 0.1127% | 18 | 100.0% | 0.2397% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 54 | `dictionary` | 0.1083% | 18 | 100.0% | 0.2397% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:45` |
| 56 | `kept` | 0.1055% | 19 | 100.0% | 0.2530% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:174` |
| 57 | `render` | 0.1045% | 20 | 100.0% | 0.2663% | 0.0014% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 58 | `lexicon` | 0.1040% | 16 | 100.0% | 0.2131% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 59 | `lemmas` | 0.0999% | 15 | 100.0% | 0.1998% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:35` |
| 60 | `mark_down` | 0.0999% | 15 | 100.0% | 0.1998% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 61 | `line` | 0.0988% | 49 | 100.0% | 0.6526% | 0.0313% | 0.1866% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:64` |
| 62 | `semantics` | 0.0962% | 15 | 100.0% | 0.1998% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 63 | `phrases` | 0.0950% | 15 | 100.0% | 0.1998% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:49` |
| 64 | `pref` | 0.0948% | 15 | 100.0% | 0.1998% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:76` |
| 65 | `part_of_speech` | 0.0932% | 14 | 100.0% | 0.1864% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 66 | `resamples` | 0.0932% | 14 | 100.0% | 0.1864% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 67 | `parsed` | 0.0932% | 16 | 100.0% | 0.2131% | 0.0000% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:181` |
| 68 | `ranked` | 0.0918% | 15 | 100.0% | 0.1998% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:94` |
| 69 | `labels` | 0.0912% | 16 | 100.0% | 0.2131% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 70 | `owl` | 0.0904% | 14 | 100.0% | 0.1864% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 71 | `class` | 0.0885% | 84 | 100.0% | 1.1187% | 0.0143% | 0.4972% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 72 | `bearers` | 0.0866% | 13 | 100.0% | 0.1731% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:55` |
| 73 | `commonest` | 0.0866% | 13 | 100.0% | 0.1731% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/WordSpecificity.java:23` |
| 74 | `rungs` | 0.0866% | 13 | 100.0% | 0.1731% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 75 | `longest` | 0.0864% | 14 | 100.0% | 0.1864% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:80` |
| 76 | `english` | 0.0845% | 18 | 100.0% | 0.2397% | 0.0161% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:48` |
| 77 | `sighting` | 0.0843% | 13 | 100.0% | 0.1731% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 78 | `lines` | 0.0843% | 18 | 100.0% | 0.2397% | 0.0101% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:36` |
| 79 | `tally` | 0.0833% | 13 | 100.0% | 0.1731% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 80 | `comparison` | 0.0820% | 14 | 100.0% | 0.1864% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:47` |
| 81 | `drawn` | 0.0818% | 14 | 100.0% | 0.1864% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:27` |
| 82 | `scopes` | 0.0816% | 13 | 100.0% | 0.1731% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 83 | `rows` | 0.0813% | 20 | 100.0% | 0.2663% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 84 | `form` | 0.0809% | 22 | 100.0% | 0.2930% | 0.0376% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:130` |
| 85 | `piece` | 0.0807% | 15 | 100.0% | 0.1998% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 86 | `tokens` | 0.0803% | 13 | 100.0% | 0.1731% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:13` |
| 87 | `corroborated` | 0.0799% | 12 | 100.0% | 0.1598% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:21` |
| 88 | `ranks` | 0.0793% | 13 | 100.0% | 0.1731% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:22` |
| 89 | `pooled` | 0.0791% | 13 | 100.0% | 0.1731% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 90 | `specificity` | 0.0764% | 12 | 100.0% | 0.1598% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 91 | `noun` | 0.0757% | 12 | 100.0% | 0.1598% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:61` |
| 92 | `subjects` | 0.0757% | 13 | 100.0% | 0.1731% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:29` |
| 93 | `readings` | 0.0748% | 12 | 100.0% | 0.1598% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:54` |
| 94 | `root` | 0.0733% | 29 | 100.0% | 0.3862% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:42` |
| 95 | `synset` | 0.0732% | 11 | 100.0% | 0.1465% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 96 | `names` | 0.0731% | 28 | 100.0% | 0.3729% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:79` |
| 97 | `exported` | 0.0730% | 13 | 100.0% | 0.1731% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 98 | `reference` | 0.0711% | 29 | 100.0% | 0.3862% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 99 | `shared` | 0.0710% | 18 | 100.0% | 0.2397% | 0.0091% | 0.0264% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:53` |
| 100 | `sightings` | 0.0703% | 11 | 100.0% | 0.1465% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 101 | `seed` | 0.0695% | 15 | 100.0% | 0.1998% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:97` |
| 102 | `headword` | 0.0666% | 10 | 100.0% | 0.1332% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 103 | `rank` | 0.0651% | 11 | 100.0% | 0.1465% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 104 | `comment` | 0.0637% | 22 | 100.0% | 0.2930% | 0.0046% | 0.0559% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:28` |
| 105 | `total` | 0.0636% | 16 | 100.0% | 0.2131% | 0.0230% | 0.0220% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReport.java:50` |
| 106 | `function` | 0.0633% | 16 | 100.0% | 0.2131% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 107 | `carried` | 0.0625% | 12 | 100.0% | 0.1598% | 0.0070% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:19` |
| 109 | `siblings` | 0.0617% | 10 | 100.0% | 0.1332% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 110 | `extraction` | 0.0616% | 10 | 100.0% | 0.1332% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:1` |
| 111 | `blob` | 0.0607% | 15 | 100.0% | 0.1998% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 112 | `normalisation` | 0.0599% | 9 | 100.0% | 0.1199% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 113 | `wiktionary` | 0.0599% | 9 | 100.0% | 0.1199% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 114 | `file` | 0.0592% | 56 | 100.0% | 0.7458% | 0.0066% | 0.3309% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:46` |
| 115 | `field` | 0.0582% | 35 | 100.0% | 0.4661% | 0.0234% | 0.1562% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolKind.java:8` |
| 116 | `declared` | 0.0559% | 17 | 100.0% | 0.2264% | 0.0042% | 0.0356% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:32` |
| 117 | `runs` | 0.0557% | 11 | 100.0% | 0.1465% | 0.0073% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 118 | `weights` | 0.0555% | 9 | 100.0% | 0.1199% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 119 | `references` | 0.0540% | 11 | 100.0% | 0.1465% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 120 | `offered` | 0.0538% | 11 | 100.0% | 0.1465% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:60` |
| 121 | `chosen` | 0.0537% | 10 | 100.0% | 0.1332% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:98` |
| 122 | `arxiv` | 0.0533% | 8 | 100.0% | 0.1065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 123 | `unplaced` | 0.0533% | 8 | 100.0% | 0.1065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 124 | `dominant` | 0.0526% | 9 | 100.0% | 0.1199% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 125 | `weight` | 0.0525% | 13 | 100.0% | 0.1731% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 126 | `ontology` | 0.0510% | 8 | 100.0% | 0.1065% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:58` |
| 127 | `abbreviation` | 0.0508% | 8 | 100.0% | 0.1065% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 128 | `header` | 0.0506% | 21 | 100.0% | 0.2797% | 0.0012% | 0.0669% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:22` |
| 129 | `first` | 0.0502% | 33 | 100.0% | 0.4395% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:30` |
| 130 | `placements` | 0.0502% | 8 | 100.0% | 0.1065% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 131 | `export` | 0.0500% | 12 | 100.0% | 0.1598% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 132 | `contribution` | 0.0497% | 9 | 100.0% | 0.1199% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 133 | `row` | 0.0493% | 31 | 100.0% | 0.4128% | 0.0032% | 0.1430% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:60` |
| 134 | `suffix` | 0.0487% | 11 | 100.0% | 0.1465% | 0.0007% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:57` |
| 135 | `claim` | 0.0486% | 10 | 100.0% | 0.1332% | 0.0079% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:57` |
| 136 | `sources` | 0.0485% | 10 | 100.0% | 0.1332% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 137 | `ranking` | 0.0481% | 8 | 100.0% | 0.1065% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeReport.java:56` |
| 138 | `held` | 0.0481% | 14 | 100.0% | 0.1864% | 0.0272% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:31` |
| 139 | `commit` | 0.0480% | 13 | 100.0% | 0.1731% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 140 | `resource` | 0.0479% | 22 | 100.0% | 0.2930% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:26` |
| 141 | `branch` | 0.0479% | 10 | 100.0% | 0.1332% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 142 | `draws` | 0.0477% | 8 | 100.0% | 0.1065% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:55` |
| 143 | `reads` | 0.0472% | 10 | 100.0% | 0.1332% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:47` |
| 144 | `distinctive` | 0.0469% | 8 | 100.0% | 0.1065% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:164` |
| 145 | `collocated` | 0.0466% | 7 | 100.0% | 0.0932% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 146 | `odds` | 0.0463% | 8 | 100.0% | 0.1065% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:20` |
| 147 | `leading` | 0.0452% | 11 | 100.0% | 0.1465% | 0.0146% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:48` |
| 148 | `signals` | 0.0448% | 8 | 100.0% | 0.1065% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:113` |
| 149 | `shown` | 0.0448% | 10 | 100.0% | 0.1332% | 0.0105% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:37` |
| 150 | `spans` | 0.0447% | 8 | 100.0% | 0.1065% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:47` |
| 151 | `votes` | 0.0439% | 8 | 100.0% | 0.1065% | 0.0034% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:47` |
| 152 | `extract` | 0.0438% | 9 | 100.0% | 0.1199% | 0.0016% | 0.0070% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:46` |
| 153 | `cost` | 0.0436% | 12 | 100.0% | 0.1598% | 0.0209% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 154 | `domain` | 0.0434% | 12 | 100.0% | 0.1598% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 155 | `every` | 0.0428% | 17 | 100.0% | 0.2264% | 0.0516% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 156 | `merged` | 0.0427% | 7 | 100.0% | 0.0932% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 157 | `verdict` | 0.0422% | 7 | 100.0% | 0.0932% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 158 | `revision` | 0.0420% | 7 | 100.0% | 0.0932% | 0.0014% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:24` |
| 159 | `items` | 0.0414% | 9 | 100.0% | 0.1199% | 0.0086% | 0.0075% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:79` |
| 160 | `apart` | 0.0413% | 8 | 100.0% | 0.1065% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 161 | `sentence` | 0.0406% | 8 | 100.0% | 0.1065% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:30` |
| 162 | `taxonomies` | 0.0400% | 6 | 100.0% | 0.0799% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:115` |
| 163 | `fields` | 0.0399% | 12 | 100.0% | 0.1598% | 0.0051% | 0.0246% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:67` |
| 164 | `labelled` | 0.0398% | 8 | 100.0% | 0.1065% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 165 | `distribution` | 0.0390% | 8 | 100.0% | 0.1065% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:53` |
| 166 | `foreign` | 0.0388% | 9 | 100.0% | 0.1199% | 0.0105% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ForeignWords.java:26` |
| 167 | `mean` | 0.0386% | 9 | 100.0% | 0.1199% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:62` |
| 168 | `archive` | 0.0384% | 8 | 100.0% | 0.1065% | 0.0014% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 169 | `sha` | 0.0382% | 6 | 100.0% | 0.0799% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 170 | `withheld` | 0.0379% | 6 | 100.0% | 0.0799% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 171 | `counts` | 0.0375% | 7 | 100.0% | 0.0932% | 0.0021% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:44` |
| 172 | `vote` | 0.0373% | 8 | 100.0% | 0.1065% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:13` |
| 173 | `admitted` | 0.0371% | 7 | 100.0% | 0.0932% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:56` |
| 174 | `chain` | 0.0371% | 8 | 100.0% | 0.1065% | 0.0047% | 0.0075% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:24` |
| 175 | `canonical` | 0.0371% | 9 | 100.0% | 0.1199% | 0.0008% | 0.0119% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:96` |
| 176 | `depth` | 0.0371% | 9 | 100.0% | 0.1199% | 0.0035% | 0.0119% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:51` |
| 177 | `nothing` | 0.0370% | 9 | 100.0% | 0.1199% | 0.0120% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenByDepth.java:21` |
| 179 | `freeze` | 0.0364% | 6 | 100.0% | 0.0799% | 0.0011% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WikidataInitialisms.java:75` |
| 180 | `refused` | 0.0352% | 7 | 100.0% | 0.0932% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:25` |
| 181 | `archives` | 0.0352% | 6 | 100.0% | 0.0799% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 182 | `net` | 0.0346% | 8 | 100.0% | 0.1065% | 0.0063% | 0.0092% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:22` |
| 183 | `qualified` | 0.0340% | 9 | 100.0% | 0.1199% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 184 | `compound` | 0.0340% | 10 | 100.0% | 0.1332% | 0.0020% | 0.0198% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 185 | `carries` | 0.0338% | 6 | 100.0% | 0.0799% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:26` |
| 186 | `descendants` | 0.0337% | 6 | 100.0% | 0.0799% | 0.0012% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:18` |
| 187 | `json` | 0.0337% | 6 | 100.0% | 0.0799% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:15` |
| 188 | `fibo` | 0.0333% | 5 | 100.0% | 0.0666% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:42` |
| 189 | `ontologies` | 0.0333% | 5 | 100.0% | 0.0666% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:46` |
| 190 | `set_aside` | 0.0333% | 5 | 100.0% | 0.0666% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:179` |
| 191 | `translingual` | 0.0333% | 5 | 100.0% | 0.0666% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDump.java:36` |
| 192 | `endpoint` | 0.0328% | 6 | 100.0% | 0.0799% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 193 | `excluded` | 0.0328% | 6 | 100.0% | 0.0799% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:35` |
| 194 | `functions` | 0.0326% | 7 | 100.0% | 0.0932% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 195 | `report` | 0.0323% | 12 | 100.0% | 0.1598% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:15` |
| 196 | `ordinary` | 0.0319% | 6 | 100.0% | 0.0799% | 0.0032% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PhraseSpecificity.java:44` |
| 197 | `second` | 0.0317% | 16 | 100.0% | 0.2131% | 0.0620% | 0.0163% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:29` |
| 198 | `crossings` | 0.0305% | 5 | 100.0% | 0.0666% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:47` |
| 199 | `statements` | 0.0304% | 6 | 100.0% | 0.0799% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:68` |
| 200 | `thresholds` | 0.0303% | 5 | 100.0% | 0.0666% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 201 | `deepest` | 0.0302% | 5 | 100.0% | 0.0666% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 202 | `residual` | 0.0301% | 5 | 100.0% | 0.0666% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 203 | `copied` | 0.0299% | 5 | 100.0% | 0.0666% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 204 | `theme` | 0.0299% | 6 | 100.0% | 0.0799% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:18` |
| 205 | `reader` | 0.0297% | 17 | 100.0% | 0.2264% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:60` |
| 207 | `pieces` | 0.0283% | 6 | 100.0% | 0.0799% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 208 | `accumulator` | 0.0283% | 5 | 100.0% | 0.0666% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:37` |
| 209 | `intensity` | 0.0276% | 5 | 100.0% | 0.0666% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:135` |
| 210 | `entries` | 0.0276% | 8 | 100.0% | 0.1065% | 0.0021% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DocumentationScope.java:44` |
| 211 | `quantity` | 0.0274% | 5 | 100.0% | 0.0666% | 0.0022% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSense.java:12` |
| 212 | `pinned` | 0.0274% | 5 | 100.0% | 0.0666% | 0.0007% | 0.0022% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:53` |
| 213 | `median` | 0.0268% | 5 | 100.0% | 0.0666% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:84` |
| 214 | `evidence` | 0.0268% | 8 | 100.0% | 0.1065% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 215 | `collocations` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:144` |
| 216 | `csf` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:24` |
| 217 | `hypernym` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:54` |
| 218 | `hypernyms` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:154` |
| 219 | `initialisms` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 220 | `normal_form` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 221 | `olia` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:30` |
| 222 | `seeded` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 223 | `skos` | 0.0266% | 4 | 100.0% | 0.0533% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:47` |
| 224 | `counted` | 0.0265% | 5 | 100.0% | 0.0666% | 0.0015% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:19` |
| 225 | `witness` | 0.0263% | 5 | 100.0% | 0.0666% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 226 | `heading` | 0.0258% | 5 | 100.0% | 0.0666% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 227 | `imports` | 0.0257% | 5 | 100.0% | 0.0666% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:145` |
| 228 | `chose` | 0.0255% | 5 | 100.0% | 0.0666% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/VocabularyReport.java:118` |
| 229 | `abbreviations` | 0.0249% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 230 | `batches` | 0.0248% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:108` |
| 231 | `restated` | 0.0248% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:52` |
| 232 | `authorship` | 0.0247% | 4 | 100.0% | 0.0533% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:17` |
| 233 | `glued` | 0.0245% | 4 | 100.0% | 0.0533% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierReading.java:10` |
| 234 | `letter` | 0.0245% | 6 | 100.0% | 0.0799% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 235 | `read` | 0.0243% | 57 | 100.0% | 0.7591% | 0.0143% | 0.4722% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:93` |
| 236 | `defaults` | 0.0243% | 17 | 100.0% | 0.2264% | 0.0000% | 0.0845% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:72` |
| 237 | `folder` | 0.0242% | 6 | 100.0% | 0.0799% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:35` |
| 238 | `origin` | 0.0236% | 7 | 100.0% | 0.0932% | 0.0041% | 0.0141% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 239 | `behaviour` | 0.0232% | 5 | 100.0% | 0.0666% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:1` |
| 240 | `runner` | 0.0231% | 4 | 100.0% | 0.0533% | 0.0012% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:56` |
| 241 | `behaviours` | 0.0230% | 4 | 100.0% | 0.0533% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:30` |
| 242 | `catalog` | 0.0227% | 7 | 100.0% | 0.0932% | 0.0009% | 0.0150% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/NistCsfExtraction.java:45` |
| 243 | `batch` | 0.0223% | 5 | 100.0% | 0.0666% | 0.0019% | 0.0053% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:30` |
| 244 | `fragment` | 0.0222% | 6 | 100.0% | 0.0799% | 0.0008% | 0.0101% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:51` |
| 245 | `population` | 0.0207% | 7 | 100.0% | 0.0932% | 0.0173% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:56` |
| 248 | `areas` | 0.0202% | 9 | 100.0% | 0.1199% | 0.0310% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:36` |
| 262 | `described` | 0.0197% | 6 | 100.0% | 0.0799% | 0.0126% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/InjectedTaxonomy.java:82` |
| 263 | `contributions` | 0.0194% | 4 | 100.0% | 0.0533% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:57` |
| 264 | `percentage` | 0.0193% | 4 | 100.0% | 0.0533% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:118` |
| 266 | `changes` | 0.0188% | 7 | 100.0% | 0.0932% | 0.0196% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:17` |
| 267 | `places` | 0.0185% | 5 | 100.0% | 0.0666% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:45` |
| 271 | `links` | 0.0182% | 4 | 100.0% | 0.0533% | 0.0040% | 0.0004% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:116` |
| 274 | `stands` | 0.0181% | 4 | 100.0% | 0.0533% | 0.0041% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:32` |
| 276 | `coverage` | 0.0180% | 4 | 100.0% | 0.0533% | 0.0042% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:50` |
| 277 | `reach` | 0.0179% | 5 | 100.0% | 0.0666% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 4 | `by` | 0.5516% | 203 | 100.0% | 2.7034% | 0.5613% | 0.1008% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:32` |
| 55 | `from` | 0.1056% | 87 | 100.0% | 1.1586% | 0.4771% | 0.3415% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:36` |
| 108 | `below` | 0.0623% | 15 | 100.0% | 0.1998% | 0.0194% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:16` |
| 178 | `wiki` | 0.0369% | 6 | 100.0% | 0.0799% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 206 | `beside` | 0.0291% | 5 | 100.0% | 0.0666% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:25` |
| 314 | `per` | 0.0133% | 10 | 100.0% | 0.1332% | 0.0519% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:33` |
| 428 | `sql` | 0.0068% | 4 | 100.0% | 0.0533% | 0.0008% | 0.0176% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/SqlFunction.java:8` |
| 486 | `against` | 0.0058% | 9 | 100.0% | 0.1199% | 0.0658% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannon.java:73` |
| 532 | `among` | 0.0045% | 5 | 100.0% | 0.0666% | 0.0318% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:65` |
| 542 | `genuinely` | 0.0043% | 1 | 100.0% | 0.0133% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:59` |
| 579 | `anybody` | 0.0036% | 1 | 100.0% | 0.0133% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:23` |
| 580 | `lex` | 0.0036% | 1 | 100.0% | 0.0133% | 0.0005% | 0.0018% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/WordNetLexicon.java:28` |
| 607 | `before` | 0.0026% | 10 | 100.0% | 0.1332% | 0.0926% | 0.0440% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 665 | `api` | 0.0010% | 1 | 100.0% | 0.0133% | 0.0010% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:30` |
| 673 | `inline` | 0.0008% | 2 | 100.0% | 0.0266% | 0.0005% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:25` |
| 700 | `keyword` | 0.0002% | 1 | 100.0% | 0.0133% | 0.0007% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 702 | `once` | 0.0002% | 3 | 100.0% | 0.0400% | 0.0335% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:147` |
| 709 | `between` | 0.0001% | 8 | 100.0% | 0.1065% | 0.0974% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:44` |
| 720 | `again` | 0.0001% | 3 | 100.0% | 0.0400% | 0.0364% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:87` |
| 740 | `login` | -0.0001% | 1 | 100.0% | 0.0133% | 0.0008% | 0.0158% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `word` | 243 | 1 |
| `of` | 227 | 942 |
| `by` | 203 | 4 |
| `words` | 147 | 2 |
| `topic` | 115 | 3 |
| `from` | 87 | 55 |
| `name` | 86 | 371 |
| `path` | 85 | 15 |
| `class` | 84 | 71 |
| `source` | 77 | 19 |
| `concept` | 74 | 5 |
| `scope` | 70 | 11 |
| `written` | 70 | 7 |
| `concepts` | 66 | 6 |
| `in` | 65 | 924 |
| `share` | 65 | 10 |
| `label` | 64 | 14 |
| `sense` | 64 | 9 |
| `entry` | 62 | 37 |
| `occurrences` | 59 | 8 |

## What it called the things that check it

**14,534 occurrences of 1,601 distinct words**, read against ordinary English and the platform's own API. The 285 that clear the bar hold 52.2% of what was written and 81.2% of the divergence, and 100.0% of their occurrences are names. 447 words in the ranking are ones a reference writes more densely than this repository does, and 102 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0099%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 1,601, over 999 draws yielding 4,330,724 scored words from that reference's own distribution. A word is here where it beats **0.0120%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 1,601, over 999 draws yielding 2,073,253 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `reads` | 0.6847% | 209 | 100.0% | 1.4380% | 0.0018% | 0.0088% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 2 | `word` | 0.5618% | 193 | 100.0% | 1.3279% | 0.0145% | 0.0361% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:12` |
| 3 | `a` | 0.4232% | 674 | 100.0% | 4.6374% | 1.9083% | 0.0295% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 4 | `test` | 0.4227% | 184 | 100.0% | 1.2660% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 5 | `words` | 0.3955% | 128 | 100.0% | 0.8807% | 0.0139% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 6 | `nothing` | 0.3130% | 102 | 100.0% | 0.7018% | 0.0120% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 7 | `reading` | 0.3100% | 98 | 100.0% | 0.6743% | 0.0079% | 0.0031% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:136` |
| 8 | `concept` | 0.2996% | 94 | 100.0% | 0.6468% | 0.0068% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 9 | `refuses` | 0.2906% | 86 | 100.0% | 0.5917% | 0.0011% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 10 | `carries` | 0.2899% | 87 | 100.0% | 0.5986% | 0.0022% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 11 | `topic` | 0.2782% | 85 | 100.0% | 0.5848% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 12 | `states` | 0.2749% | 110 | 100.0% | 0.7568% | 0.0457% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 13 | `written` | 0.2688% | 90 | 100.0% | 0.6192% | 0.0137% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 14 | `every` | 0.2226% | 96 | 100.0% | 0.6605% | 0.0516% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:33` |
| 15 | `keeps` | 0.2066% | 63 | 100.0% | 0.4335% | 0.0026% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:31` |
| 16 | `names` | 0.2060% | 103 | 100.0% | 0.7087% | 0.0081% | 0.0814% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 17 | `no` | 0.2009% | 118 | 100.0% | 0.8119% | 0.1272% | 0.0625% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 18 | `its` | 0.1998% | 145 | 100.0% | 0.9977% | 0.2120% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 20 | `taxonomy` | 0.1793% | 53 | 100.0% | 0.3647% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:57` |
| 21 | `scope` | 0.1763% | 73 | 100.0% | 0.5023% | 0.0029% | 0.0343% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 22 | `repository` | 0.1751% | 56 | 100.0% | 0.3853% | 0.0006% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:13` |
| 23 | `term` | 0.1696% | 62 | 100.0% | 0.4266% | 0.0171% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 24 | `topics` | 0.1677% | 52 | 100.0% | 0.3578% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:59` |
| 25 | `root` | 0.1624% | 90 | 100.0% | 0.6192% | 0.0033% | 0.0876% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:19` |
| 26 | `own` | 0.1395% | 73 | 100.0% | 0.5023% | 0.0636% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:64` |
| 27 | `broader` | 0.1387% | 43 | 100.0% | 0.2959% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 28 | `one` | 0.1376% | 128 | 100.0% | 0.8807% | 0.2446% | 0.0128% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 29 | `counts` | 0.1359% | 43 | 100.0% | 0.2959% | 0.0021% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 30 | `dictionary` | 0.1359% | 43 | 100.0% | 0.2959% | 0.0015% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 31 | `share` | 0.1282% | 50 | 100.0% | 0.3440% | 0.0187% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:66` |
| 33 | `concepts` | 0.1255% | 40 | 100.0% | 0.2752% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 34 | `it` | 0.1231% | 224 | 100.0% | 1.5412% | 0.6815% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 36 | `published` | 0.1153% | 45 | 100.0% | 0.3096% | 0.0169% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:109` |
| 37 | `writes` | 0.1114% | 35 | 100.0% | 0.2408% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:52` |
| 38 | `terms` | 0.1104% | 44 | 100.0% | 0.3027% | 0.0180% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 39 | `chance` | 0.1087% | 39 | 100.0% | 0.2683% | 0.0097% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 40 | `matched` | 0.1070% | 33 | 100.0% | 0.2271% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:49` |
| 41 | `sense` | 0.1067% | 40 | 100.0% | 0.2752% | 0.0125% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRunsTest.java:10` |
| 42 | `publisher` | 0.1021% | 33 | 100.0% | 0.2271% | 0.0015% | 0.0035% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 43 | `subject` | 0.1007% | 45 | 100.0% | 0.3096% | 0.0117% | 0.0268% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:25` |
| 44 | `ontology` | 0.1006% | 30 | 100.0% | 0.2064% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:31` |
| 45 | `source` | 0.0995% | 91 | 100.0% | 0.6261% | 0.0130% | 0.1712% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:10` |
| 46 | `stated` | 0.0983% | 35 | 100.0% | 0.2408% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 47 | `label` | 0.0938% | 61 | 100.0% | 0.4197% | 0.0028% | 0.0770% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:21` |
| 49 | `report` | 0.0894% | 44 | 100.0% | 0.3027% | 0.0336% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:94` |
| 50 | `branch` | 0.0884% | 32 | 100.0% | 0.2202% | 0.0037% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:85` |
| 51 | `does` | 0.0877% | 49 | 100.0% | 0.3371% | 0.0484% | 0.0062% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:41` |
| 52 | `themes` | 0.0871% | 28 | 100.0% | 0.1927% | 0.0028% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:29` |
| 53 | `placement` | 0.0861% | 27 | 100.0% | 0.1858% | 0.0019% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 54 | `vocabulary` | 0.0848% | 26 | 100.0% | 0.1789% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:15` |

<details>
<summary>235 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 55 | `senses` | 0.0847% | 26 | 100.0% | 0.1789% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:26` |
| 57 | `parsed` | 0.0800% | 27 | 100.0% | 0.1858% | 0.0000% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:17` |
| 58 | `noun` | 0.0783% | 24 | 100.0% | 0.1651% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:83` |
| 60 | `leaves` | 0.0773% | 27 | 100.0% | 0.1858% | 0.0056% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 61 | `abstains` | 0.0757% | 22 | 100.0% | 0.1514% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:59` |
| 62 | `says` | 0.0753% | 40 | 100.0% | 0.2752% | 0.0359% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:30` |
| 63 | `phrase` | 0.0712% | 23 | 100.0% | 0.1582% | 0.0025% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:19` |
| 64 | `scopes` | 0.0709% | 22 | 100.0% | 0.1514% | 0.0000% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 65 | `bundled` | 0.0698% | 21 | 100.0% | 0.1445% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:20` |
| 66 | `reports` | 0.0685% | 27 | 100.0% | 0.1858% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 67 | `wrote` | 0.0684% | 30 | 100.0% | 0.2064% | 0.0170% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:36` |
| 68 | `files` | 0.0660% | 31 | 100.0% | 0.2133% | 0.0039% | 0.0211% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:54` |
| 69 | `verb` | 0.0644% | 20 | 100.0% | 0.1376% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 70 | `apart` | 0.0625% | 22 | 100.0% | 0.1514% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 71 | `tsv` | 0.0619% | 18 | 100.0% | 0.1238% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsvTest.java:10` |
| 72 | `pooled` | 0.0617% | 20 | 100.0% | 0.1376% | 0.0000% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:11` |
| 73 | `mass` | 0.0595% | 23 | 100.0% | 0.1582% | 0.0083% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:10` |
| 74 | `draws` | 0.0595% | 19 | 100.0% | 0.1307% | 0.0018% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:43` |
| 75 | `as` | 0.0591% | 202 | 100.0% | 1.3898% | 0.7951% | 0.2838% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:78` |
| 76 | `witnesses` | 0.0590% | 19 | 100.0% | 0.1307% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:37` |
| 77 | `resolves` | 0.0585% | 17 | 100.0% | 0.1170% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:35` |
| 78 | `ranked` | 0.0580% | 19 | 100.0% | 0.1307% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:28` |
| 79 | `occurrences` | 0.0559% | 17 | 100.0% | 0.1170% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:61` |
| 80 | `subjects` | 0.0552% | 19 | 100.0% | 0.1307% | 0.0036% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:68` |
| 81 | `token` | 0.0545% | 33 | 100.0% | 0.2271% | 0.0013% | 0.0374% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 83 | `extraction` | 0.0536% | 17 | 100.0% | 0.1170% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:99` |
| 84 | `divergence` | 0.0525% | 16 | 100.0% | 0.1101% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 85 | `carried` | 0.0521% | 20 | 100.0% | 0.1376% | 0.0070% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:36` |
| 86 | `occurrence` | 0.0520% | 20 | 100.0% | 0.1376% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 87 | `legibility` | 0.0516% | 15 | 100.0% | 0.1032% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:14` |
| 88 | `prose` | 0.0514% | 16 | 100.0% | 0.1101% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 89 | `distribution` | 0.0502% | 19 | 100.0% | 0.1307% | 0.0062% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:15` |
| 90 | `ranking` | 0.0498% | 16 | 100.0% | 0.1101% | 0.0016% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationDiagnostic.java:42` |
| 91 | `vote` | 0.0483% | 19 | 100.0% | 0.1307% | 0.0074% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:22` |
| 92 | `evidence` | 0.0483% | 23 | 100.0% | 0.1582% | 0.0162% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 93 | `arxiv` | 0.0482% | 14 | 100.0% | 0.0963% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/TreeReading.java:94` |
| 94 | `nearest` | 0.0470% | 15 | 100.0% | 0.1032% | 0.0014% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 95 | `placed` | 0.0466% | 19 | 100.0% | 0.1307% | 0.0085% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:52` |
| 96 | `domains` | 0.0464% | 16 | 100.0% | 0.1101% | 0.0013% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:18` |
| 97 | `rendered` | 0.0462% | 17 | 100.0% | 0.1170% | 0.0014% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 98 | `alone` | 0.0452% | 18 | 100.0% | 0.1238% | 0.0073% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:10` |
| 99 | `ranks` | 0.0451% | 15 | 100.0% | 0.1032% | 0.0021% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:15` |
| 100 | `cited` | 0.0445% | 15 | 100.0% | 0.1032% | 0.0024% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:34` |
| 101 | `takes` | 0.0444% | 20 | 100.0% | 0.1376% | 0.0122% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:11` |
| 102 | `named` | 0.0442% | 23 | 100.0% | 0.1582% | 0.0110% | 0.0198% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:42` |
| 103 | `finds` | 0.0428% | 15 | 100.0% | 0.1032% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:24` |
| 104 | `runs` | 0.0421% | 17 | 100.0% | 0.1170% | 0.0073% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 105 | `weighs` | 0.0416% | 13 | 100.0% | 0.0894% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 106 | `run` | 0.0405% | 56 | 100.0% | 0.3853% | 0.0270% | 0.1457% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:51` |
| 108 | `carry` | 0.0395% | 16 | 100.0% | 0.1101% | 0.0069% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 109 | `hierarchy` | 0.0394% | 18 | 100.0% | 0.1238% | 0.0013% | 0.0114% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PolyHierarchyTest.java:12` |
| 110 | `citations` | 0.0392% | 12 | 100.0% | 0.0826% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 111 | `graph` | 0.0390% | 15 | 100.0% | 0.1032% | 0.0016% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:31` |
| 113 | `rung` | 0.0378% | 11 | 100.0% | 0.0757% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:71` |
| 114 | `holds` | 0.0372% | 14 | 100.0% | 0.0963% | 0.0045% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledResourceReachabilityTest.java:63` |
| 115 | `english` | 0.0367% | 19 | 100.0% | 0.1307% | 0.0161% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:23` |
| 116 | `heading` | 0.0366% | 13 | 100.0% | 0.0894% | 0.0030% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:61` |
| 117 | `votes` | 0.0358% | 13 | 100.0% | 0.0894% | 0.0034% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:26` |
| 118 | `renders` | 0.0357% | 11 | 100.0% | 0.0757% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:17` |
| 119 | `under` | 0.0354% | 36 | 100.0% | 0.2477% | 0.0745% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:51` |
| 120 | `contribution` | 0.0353% | 13 | 100.0% | 0.0894% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/JensenShannonTest.java:69` |
| 121 | `stands` | 0.0347% | 13 | 100.0% | 0.0894% | 0.0041% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:84` |
| 122 | `whole` | 0.0345% | 18 | 100.0% | 0.1238% | 0.0156% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 123 | `commonest` | 0.0344% | 10 | 100.0% | 0.0688% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 124 | `theme` | 0.0344% | 13 | 100.0% | 0.0894% | 0.0043% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:32` |
| 125 | `same` | 0.0336% | 34 | 100.0% | 0.2339% | 0.0702% | 0.0286% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 126 | `site` | 0.0326% | 19 | 100.0% | 0.1307% | 0.0203% | 0.0123% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSiteTest.java:9` |
| 127 | `function` | 0.0324% | 20 | 100.0% | 0.1376% | 0.0113% | 0.0233% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 128 | `carrying` | 0.0322% | 12 | 100.0% | 0.0826% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 129 | `publishes` | 0.0320% | 10 | 100.0% | 0.0688% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 130 | `placements` | 0.0316% | 10 | 100.0% | 0.0688% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:59` |
| 131 | `inflection` | 0.0310% | 9 | 100.0% | 0.0619% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:12` |
| 132 | `ordinary` | 0.0299% | 11 | 100.0% | 0.0757% | 0.0032% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 134 | `reaches` | 0.0292% | 10 | 100.0% | 0.0688% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulatorTest.java:97` |
| 135 | `sighting` | 0.0291% | 9 | 100.0% | 0.0619% | 0.0005% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:26` |
| 136 | `rows` | 0.0291% | 20 | 100.0% | 0.1376% | 0.0013% | 0.0273% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:81` |
| 137 | `stating` | 0.0288% | 10 | 100.0% | 0.0688% | 0.0020% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:103` |
| 138 | `drawn` | 0.0288% | 11 | 100.0% | 0.0757% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPageTest.java:40` |
| 139 | `abbreviation` | 0.0287% | 9 | 100.0% | 0.0619% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:53` |
| 140 | `framework` | 0.0287% | 11 | 100.0% | 0.0757% | 0.0038% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:29` |
| 141 | `sets` | 0.0284% | 12 | 100.0% | 0.0826% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 142 | `folder` | 0.0283% | 13 | 100.0% | 0.0894% | 0.0008% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:107` |
| 143 | `rank` | 0.0276% | 10 | 100.0% | 0.0688% | 0.0026% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 144 | `corroborated` | 0.0275% | 8 | 100.0% | 0.0550% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:20` |
| 145 | `provenance` | 0.0275% | 8 | 100.0% | 0.0550% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 146 | `file` | 0.0270% | 86 | 100.0% | 0.5917% | 0.0066% | 0.3309% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:55` |
| 147 | `readings` | 0.0268% | 9 | 100.0% | 0.0619% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:87` |
| 148 | `sha` | 0.0259% | 8 | 100.0% | 0.0550% | 0.0000% | 0.0004% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 149 | `lines` | 0.0254% | 15 | 100.0% | 0.1032% | 0.0101% | 0.0163% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:49` |
| 150 | `tally` | 0.0249% | 8 | 100.0% | 0.0550% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTallyTest.java:16` |
| 151 | `page` | 0.0247% | 18 | 100.0% | 0.1238% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 152 | `inside` | 0.0247% | 13 | 100.0% | 0.0894% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 153 | `archive` | 0.0246% | 11 | 100.0% | 0.0757% | 0.0014% | 0.0066% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:15` |
| 154 | `witness` | 0.0241% | 9 | 100.0% | 0.0619% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeCards.java:106` |
| 155 | `fibo` | 0.0241% | 7 | 100.0% | 0.0482% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConceptsTest.java:12` |
| 156 | `git` | 0.0241% | 7 | 100.0% | 0.0482% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:77` |
| 157 | `unsegmented` | 0.0241% | 7 | 100.0% | 0.0482% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 158 | `refused` | 0.0241% | 10 | 100.0% | 0.0688% | 0.0048% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:100` |
| 159 | `probe` | 0.0240% | 11 | 100.0% | 0.0757% | 0.0015% | 0.0070% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/AbbreviatedTypesProbe.java:28` |
| 160 | `catalogue` | 0.0236% | 8 | 100.0% | 0.0550% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:37` |
| 161 | `siblings` | 0.0235% | 8 | 100.0% | 0.0550% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 163 | `segments` | 0.0226% | 8 | 100.0% | 0.0550% | 0.0018% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:15` |
| 164 | `longest` | 0.0224% | 8 | 100.0% | 0.0550% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReadingTest.java:61` |
| 165 | `places` | 0.0224% | 11 | 100.0% | 0.0757% | 0.0084% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 166 | `silent` | 0.0223% | 8 | 100.0% | 0.0550% | 0.0020% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:20` |
| 168 | `lexicon` | 0.0222% | 7 | 100.0% | 0.0482% | 0.0006% | 0.0000% | `lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/CommonestSenseDomainsTest.java:10` |
| 169 | `gives` | 0.0216% | 11 | 100.0% | 0.0757% | 0.0090% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 170 | `depth` | 0.0214% | 12 | 100.0% | 0.0826% | 0.0035% | 0.0119% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReportTest.java:13` |
| 172 | `exported` | 0.0209% | 9 | 100.0% | 0.0619% | 0.0010% | 0.0048% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:14` |
| 173 | `zero` | 0.0208% | 16 | 100.0% | 0.1101% | 0.0044% | 0.0251% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 174 | `chosen` | 0.0207% | 9 | 100.0% | 0.0619% | 0.0049% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectNullTest.java:27` |
| 175 | `extracted` | 0.0207% | 7 | 100.0% | 0.0482% | 0.0012% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:18` |
| 176 | `legible` | 0.0206% | 6 | 100.0% | 0.0413% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 177 | `rankings` | 0.0206% | 7 | 100.0% | 0.0482% | 0.0012% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:73` |
| 178 | `author` | 0.0205% | 9 | 100.0% | 0.0619% | 0.0051% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:22` |
| 179 | `evaluation` | 0.0205% | 8 | 100.0% | 0.0550% | 0.0030% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:13` |
| 180 | `declares` | 0.0204% | 7 | 100.0% | 0.0482% | 0.0008% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:23` |
| 181 | `revision` | 0.0201% | 7 | 100.0% | 0.0482% | 0.0014% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 182 | `claim` | 0.0200% | 10 | 100.0% | 0.0688% | 0.0079% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 183 | `stays` | 0.0200% | 7 | 100.0% | 0.0482% | 0.0015% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 184 | `shared` | 0.0199% | 16 | 100.0% | 0.1101% | 0.0091% | 0.0264% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportDiagnostic.java:24` |
| 185 | `each` | 0.0199% | 46 | 100.0% | 0.3165% | 0.0830% | 0.1567% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 186 | `line` | 0.0198% | 52 | 100.0% | 0.3578% | 0.0313% | 0.1866% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:53` |
| 187 | `descriptions` | 0.0195% | 7 | 100.0% | 0.0482% | 0.0015% | 0.0018% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLengthTest.java:49` |
| 188 | `tokens` | 0.0195% | 7 | 100.0% | 0.0482% | 0.0008% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:71` |
| 189 | `qualified` | 0.0190% | 12 | 100.0% | 0.0826% | 0.0027% | 0.0145% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:64` |
| 190 | `initials` | 0.0189% | 6 | 100.0% | 0.0413% | 0.0005% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:204` |
| 191 | `pinned` | 0.0187% | 7 | 100.0% | 0.0482% | 0.0007% | 0.0022% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:26` |
| 192 | `declared` | 0.0186% | 18 | 100.0% | 0.1238% | 0.0042% | 0.0356% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:46` |
| 193 | `owl` | 0.0186% | 6 | 100.0% | 0.0413% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OwlClassTest.java:11` |
| 194 | `resource` | 0.0181% | 28 | 100.0% | 0.1927% | 0.0040% | 0.0779% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:17` |
| 195 | `distance` | 0.0181% | 10 | 100.0% | 0.0688% | 0.0069% | 0.0097% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContextTest.java:34` |
| 196 | `orders` | 0.0181% | 8 | 100.0% | 0.0550% | 0.0046% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:48` |
| 197 | `preamble` | 0.0180% | 6 | 100.0% | 0.0413% | 0.0000% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/SelfReadingDiagnostic.java:29` |
| 198 | `morphology` | 0.0180% | 6 | 100.0% | 0.0413% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:8` |
| 199 | `residual` | 0.0178% | 6 | 100.0% | 0.0413% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 200 | `labels` | 0.0172% | 8 | 100.0% | 0.0550% | 0.0015% | 0.0053% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:19` |
| 201 | `member` | 0.0172% | 17 | 100.0% | 0.1170% | 0.0176% | 0.0343% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:37` |
| 202 | `collocations` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PublishedPhrasesTest.java:39` |
| 203 | `denominator` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulatorTest.java:63` |
| 204 | `initialism` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:30` |
| 205 | `lemmas` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:12` |
| 206 | `parses` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:11` |
| 207 | `part_of_speech` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:67` |
| 208 | `segmenter` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:11` |
| 209 | `unreached` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 210 | `wiktionary` | 0.0172% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryDumpTest.java:21` |
| 211 | `manifest` | 0.0171% | 9 | 100.0% | 0.0619% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 212 | `held` | 0.0170% | 15 | 100.0% | 0.1032% | 0.0272% | 0.0044% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:27` |
| 213 | `rolls` | 0.0169% | 6 | 100.0% | 0.0413% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 214 | `fraction` | 0.0167% | 8 | 100.0% | 0.0550% | 0.0015% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileWeightingDiagnostic.java:29` |
| 215 | `asked` | 0.0162% | 12 | 100.0% | 0.0826% | 0.0179% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordMorphologyTest.java:69` |
| 216 | `nested` | 0.0162% | 8 | 100.0% | 0.0550% | 0.0005% | 0.0062% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:48` |
| 217 | `describes` | 0.0162% | 7 | 100.0% | 0.0482% | 0.0038% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:31` |
| 218 | `drops` | 0.0162% | 6 | 100.0% | 0.0413% | 0.0018% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:42` |
| 219 | `statements` | 0.0160% | 7 | 100.0% | 0.0482% | 0.0036% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:47` |
| 220 | `functions` | 0.0159% | 8 | 100.0% | 0.0550% | 0.0064% | 0.0031% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacementTest.java:35` |
| 221 | `intensity` | 0.0157% | 6 | 100.0% | 0.0413% | 0.0021% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:48` |
| 222 | `ignores` | 0.0153% | 5 | 100.0% | 0.0344% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitationsTest.java:84` |
| 223 | `asks` | 0.0153% | 6 | 100.0% | 0.0413% | 0.0023% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWordTest.java:53` |
| 224 | `glued` | 0.0153% | 5 | 100.0% | 0.0344% | 0.0006% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:23` |
| 225 | `nests` | 0.0152% | 5 | 100.0% | 0.0344% | 0.0006% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConceptsTest.java:37` |
| 226 | `squash` | 0.0151% | 5 | 100.0% | 0.0344% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 227 | `sightings` | 0.0150% | 5 | 100.0% | 0.0344% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:32` |
| 228 | `branches` | 0.0150% | 6 | 100.0% | 0.0413% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestryTest.java:18` |
| 229 | `bars` | 0.0149% | 6 | 100.0% | 0.0413% | 0.0025% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:84` |
| 230 | `cites` | 0.0148% | 5 | 100.0% | 0.0344% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:18` |
| 231 | `identifier` | 0.0148% | 19 | 100.0% | 0.1307% | 0.0006% | 0.0471% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 232 | `resources` | 0.0147% | 11 | 100.0% | 0.0757% | 0.0110% | 0.0167% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitationsTest.java:26` |
| 233 | `commits` | 0.0147% | 5 | 100.0% | 0.0344% | 0.0006% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:58` |
| 234 | `shown` | 0.0146% | 9 | 100.0% | 0.0619% | 0.0105% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/InjectedTermMatchProbe.java:57` |
| 235 | `figure` | 0.0146% | 8 | 100.0% | 0.0550% | 0.0076% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:34` |
| 236 | `ones` | 0.0145% | 8 | 100.0% | 0.0550% | 0.0077% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:71` |
| 237 | `rare` | 0.0144% | 7 | 100.0% | 0.0482% | 0.0052% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 238 | `definition` | 0.0144% | 11 | 100.0% | 0.0757% | 0.0049% | 0.0172% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:63` |
| 239 | `copied` | 0.0143% | 5 | 100.0% | 0.0344% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:11` |
| 240 | `sentence` | 0.0143% | 7 | 100.0% | 0.0482% | 0.0034% | 0.0053% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:39` |
| 241 | `sweep` | 0.0143% | 5 | 100.0% | 0.0344% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:64` |
| 242 | `letter` | 0.0141% | 8 | 100.0% | 0.0550% | 0.0081% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:25` |
| 243 | `rest` | 0.0141% | 9 | 100.0% | 0.0619% | 0.0111% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/ThresholdsTest.java:15` |
| 244 | `phrases` | 0.0139% | 5 | 100.0% | 0.0344% | 0.0013% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:115` |
| 245 | `references` | 0.0139% | 8 | 100.0% | 0.0550% | 0.0028% | 0.0084% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:30` |
| 247 | `none` | 0.0138% | 7 | 100.0% | 0.0482% | 0.0047% | 0.0057% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemesTest.java:88` |
| 248 | `header` | 0.0138% | 23 | 100.0% | 0.1582% | 0.0012% | 0.0669% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:26` |
| 249 | `artefact` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledArtefacts.java:61` |
| 250 | `collocated` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWordsDiagnostic.java:38` |
| 251 | `csf` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:12` |
| 252 | `decomposes` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergenceTest.java:30` |
| 253 | `fetched` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:17` |
| 254 | `generalises` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemePageTest.java:84` |
| 255 | `headword` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:59` |
| 256 | `lemma` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:10` |
| 257 | `olia` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConceptsTest.java:12` |
| 258 | `ontologys` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTermsTest.java:24` |
| 259 | `permalink` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:44` |
| 260 | `pull_request` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:18` |
| 261 | `translingual` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 262 | `unplaced` | 0.0138% | 4 | 100.0% | 0.0275% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeGraph.java:19` |
| 263 | `prints` | 0.0137% | 5 | 100.0% | 0.0344% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/PinnedSummaryFindings.java:30` |
| 264 | `reference` | 0.0135% | 28 | 100.0% | 0.1927% | 0.0064% | 0.0906% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignalsTest.java:45` |
| 266 | `publishers` | 0.0135% | 5 | 100.0% | 0.0344% | 0.0015% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:38` |
| 267 | `script` | 0.0135% | 8 | 100.0% | 0.0550% | 0.0029% | 0.0088% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:101` |
| 268 | `only` | 0.0133% | 36 | 100.0% | 0.2477% | 0.1307% | 0.0999% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |
| 269 | `accumulator` | 0.0130% | 5 | 100.0% | 0.0344% | 0.0000% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/BlobOriginVoteTest.java:16` |
| 270 | `cite` | 0.0130% | 5 | 100.0% | 0.0344% | 0.0008% | 0.0018% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtractionTest.java:13` |
| 271 | `links` | 0.0129% | 6 | 100.0% | 0.0413% | 0.0040% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SourceLinks.java:21` |
| 272 | `answered` | 0.0128% | 5 | 100.0% | 0.0344% | 0.0019% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRunsTest.java:43` |
| 273 | `beat` | 0.0125% | 6 | 100.0% | 0.0413% | 0.0043% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/SummaryReportTest.java:40` |
| 274 | `quantity` | 0.0123% | 5 | 100.0% | 0.0344% | 0.0022% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSensesTest.java:55` |
| 275 | `describing` | 0.0123% | 5 | 100.0% | 0.0344% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:104` |
| 276 | `columns` | 0.0123% | 11 | 100.0% | 0.0757% | 0.0017% | 0.0202% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:28` |
| 277 | `acronym` | 0.0121% | 4 | 100.0% | 0.0275% | 0.0005% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:90` |
| 278 | `behaviour` | 0.0121% | 6 | 100.0% | 0.0413% | 0.0047% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:52` |
| 279 | `directory` | 0.0120% | 20 | 100.0% | 0.1376% | 0.0017% | 0.0581% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:50` |
| 280 | `strange` | 0.0120% | 5 | 100.0% | 0.0344% | 0.0024% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PageProse.java:90` |
| 281 | `adjective` | 0.0120% | 4 | 100.0% | 0.0275% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:43` |
| 283 | `licence` | 0.0117% | 5 | 100.0% | 0.0344% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSet.java:33` |
| 285 | `chart` | 0.0116% | 5 | 100.0% | 0.0344% | 0.0026% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughPage.java:66` |
| 286 | `supplied` | 0.0116% | 5 | 100.0% | 0.0344% | 0.0027% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CloneUnderReading.java:18` |
| 287 | `answers` | 0.0116% | 5 | 100.0% | 0.0344% | 0.0027% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTermsTest.java:46` |
| 288 | `folds` | 0.0115% | 4 | 100.0% | 0.0275% | 0.0008% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrenceTest.java:38` |
| 289 | `shares` | 0.0115% | 18 | 100.0% | 0.1238% | 0.0505% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReportTest.java:41` |
| 290 | `standing` | 0.0114% | 6 | 100.0% | 0.0413% | 0.0052% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChangesTest.java:69` |
| 293 | `passes` | 0.0113% | 5 | 100.0% | 0.0344% | 0.0029% | 0.0009% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverageTest.java:44` |
| 295 | `above` | 0.0112% | 11 | 100.0% | 0.0757% | 0.0220% | 0.0048% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/PieceCostTest.java:43` |
| 296 | `fixture` | 0.0112% | 4 | 100.0% | 0.0275% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:26` |
| 298 | `explains` | 0.0111% | 5 | 100.0% | 0.0344% | 0.0031% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/BarDocumentTest.java:75` |
| 301 | `an` | 0.0111% | 89 | 100.0% | 0.6124% | 0.4337% | 0.0018% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:56` |
| 302 | `spells` | 0.0110% | 4 | 100.0% | 0.0275% | 0.0011% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitialsTest.java:20` |
| 303 | `chose` | 0.0109% | 5 | 100.0% | 0.0344% | 0.0032% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:41` |
| 307 | `merged` | 0.0108% | 4 | 100.0% | 0.0275% | 0.0012% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:40` |
| 335 | `moves` | 0.0103% | 5 | 100.0% | 0.0344% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConceptsTest.java:32` |
| 336 | `findings` | 0.0102% | 5 | 100.0% | 0.0344% | 0.0037% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedLegibilityFindings.java:21` |
| 337 | `carriers` | 0.0101% | 4 | 100.0% | 0.0275% | 0.0016% | 0.0004% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentrationTest.java:20` |
| 338 | `defines` | 0.0101% | 4 | 100.0% | 0.0275% | 0.0016% | 0.0000% | `lexicon-extraction/src/test/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConceptsTest.java:28` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 19 | `rather` | 0.1990% | 75 | 100.0% | 0.5160% | 0.0241% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 32 | `than` | 0.1267% | 95 | 100.0% | 0.6536% | 0.1446% | 0.0106% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:68` |
| 35 | `where` | 0.1192% | 78 | 100.0% | 0.5367% | 0.0994% | 0.0075% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:28` |
| 48 | `what` | 0.0908% | 77 | 100.0% | 0.5298% | 0.1344% | 0.0040% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExportSchemaTest.java:85` |
| 56 | `itself` | 0.0812% | 33 | 100.0% | 0.2271% | 0.0145% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 59 | `beside` | 0.0774% | 24 | 100.0% | 0.1651% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:263` |
| 82 | `not` | 0.0541% | 110 | 100.0% | 0.7568% | 0.3534% | 0.1355% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:23` |
| 107 | `twice` | 0.0402% | 15 | 100.0% | 0.1032% | 0.0046% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomiesTest.java:50` |
| 112 | `below` | 0.0390% | 21 | 100.0% | 0.1445% | 0.0194% | 0.0026% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 133 | `beneath` | 0.0292% | 10 | 100.0% | 0.0688% | 0.0018% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationSetTest.java:57` |
| 162 | `without` | 0.0235% | 24 | 100.0% | 0.1651% | 0.0500% | 0.0233% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:22` |
| 167 | `once` | 0.0222% | 19 | 100.0% | 0.1307% | 0.0335% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:48` |
| 171 | `whose` | 0.0213% | 11 | 100.0% | 0.0757% | 0.0093% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/BehavioursTest.java:65` |
| 246 | `never` | 0.0138% | 17 | 100.0% | 0.1170% | 0.0408% | 0.0013% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceTest.java:228` |
| 265 | `cannot` | 0.0135% | 10 | 100.0% | 0.0688% | 0.0150% | 0.0035% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 297 | `else` | 0.0111% | 9 | 100.0% | 0.0619% | 0.0079% | 0.0150% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 305 | `against` | 0.0109% | 21 | 100.0% | 0.1445% | 0.0658% | 0.0013% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:28` |
| 306 | `elsewhere` | 0.0108% | 5 | 100.0% | 0.0344% | 0.0033% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepositoryTest.java:53` |
| 341 | `everything` | 0.0098% | 8 | 100.0% | 0.0550% | 0.0134% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOriginsTest.java:29` |
| 342 | `something` | 0.0098% | 12 | 100.0% | 0.0826% | 0.0288% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/CompoundParsesTest.java:37` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 859 | 1,597 |
| `a` | 674 | 3 |
| `it` | 224 | 34 |
| `reads` | 209 | 1 |
| `as` | 202 | 75 |
| `of` | 194 | 1,600 |
| `word` | 193 | 2 |
| `test` | 184 | 4 |
| `its` | 145 | 18 |
| `and` | 133 | 1,599 |
| `one` | 128 | 28 |
| `words` | 128 | 5 |
| `is` | 120 | 1,574 |
| `no` | 118 | 17 |
| `to` | 117 | 1,595 |
| `that` | 116 | 1,453 |
| `in` | 114 | 1,577 |
| `not` | 110 | 82 |
| `states` | 110 | 12 |
| `names` | 103 | 16 |

## And what it wrote about all of it

**92,116 occurrences of 3,968 distinct words**, read against ordinary English and the platform's own API. The 682 that clear the bar hold 48.9% of what was written and 84.3% of the divergence, and 27.3% of their occurrences are names. 1,538 words in the ranking are ones a reference writes more densely than this repository does, and 196 are ones English supplied rather than the author choosing them; both are shown below rather than removed.

A word is here where it beats **0.0020%** of the maximum divergence against ordinary English — the claim a word of a repository this size reaches by chance in the best of a field of 3,968, over 999 draws yielding 12,729,051 scored words from that reference's own distribution. A word is here where it beats **0.0024%** of the maximum divergence against the platform's own API — the claim a word of a repository this size reaches by chance in the best of a field of 3,968, over 999 draws yielding 3,862,902 scored words from that reference's own distribution.

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 1 | `a` | 0.5657% | 4,771 | 14.5% | 5.1793% | 1.9083% | 0.0295% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 2 | `word` | 0.4940% | 1,093 | 39.9% | 1.1865% | 0.0145% | 0.0361% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 3 | `reading` | 0.3190% | 638 | 23.4% | 0.6926% | 0.0079% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 4 | `words` | 0.3039% | 638 | 43.1% | 0.6926% | 0.0139% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:58` |
| 5 | `one` | 0.2553% | 1,123 | 12.7% | 1.2191% | 0.2446% | 0.0128% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 7 | `it` | 0.2442% | 1,842 | 12.2% | 1.9997% | 0.6815% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 8 | `repository` | 0.2285% | 455 | 19.8% | 0.4939% | 0.0006% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 9 | `nothing` | 0.1985% | 429 | 25.9% | 0.4657% | 0.0120% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 10 | `topic` | 0.1909% | 376 | 53.2% | 0.4082% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:43` |
| 11 | `reads` | 0.1835% | 387 | 56.6% | 0.4201% | 0.0018% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 12 | `written` | 0.1720% | 385 | 41.6% | 0.4180% | 0.0137% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:11` |
| 14 | `own` | 0.1586% | 505 | 15.4% | 0.5482% | 0.0636% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 15 | `every` | 0.1538% | 464 | 24.4% | 0.5037% | 0.0516% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 16 | `taxonomy` | 0.1517% | 285 | 25.6% | 0.3094% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:147` |
| 17 | `concept` | 0.1466% | 308 | 54.5% | 0.3344% | 0.0068% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 18 | `its` | 0.1342% | 745 | 19.9% | 0.8088% | 0.2120% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 19 | `is` | 0.1339% | 2,691 | 5.4% | 2.9213% | 1.3630% | 1.6303% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 20 | `carries` | 0.1249% | 245 | 38.0% | 0.2660% | 0.0022% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 21 | `so` | 0.1233% | 641 | 5.9% | 0.6959% | 0.1704% | 0.0079% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 22 | `dictionary` | 0.1143% | 232 | 26.3% | 0.2519% | 0.0015% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:14` |
| 23 | `subject` | 0.1068% | 298 | 25.2% | 0.3235% | 0.0117% | 0.0268% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 24 | `share` | 0.1068% | 274 | 42.0% | 0.2975% | 0.0187% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 25 | `states` | 0.1046% | 342 | 33.6% | 0.3713% | 0.0457% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 26 | `term` | 0.1014% | 258 | 36.4% | 0.2801% | 0.0171% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:30` |
| 28 | `topics` | 0.1006% | 204 | 51.5% | 0.2215% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:24` |
| 29 | `published` | 0.0997% | 254 | 33.5% | 0.2757% | 0.0169% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 30 | `concepts` | 0.0944% | 195 | 54.4% | 0.2117% | 0.0036% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 31 | `writes` | 0.0902% | 182 | 19.8% | 0.1976% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 32 | `sense` | 0.0893% | 219 | 47.5% | 0.2377% | 0.0125% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 33 | `vocabulary` | 0.0892% | 173 | 28.3% | 0.1878% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 34 | `divergence` | 0.0803% | 153 | 35.9% | 0.1661% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:15` |
| 35 | `scope` | 0.0799% | 260 | 55.0% | 0.2823% | 0.0029% | 0.0343% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 36 | `bundled` | 0.0789% | 150 | 16.0% | 0.1628% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 37 | `no` | 0.0776% | 439 | 28.5% | 0.4766% | 0.1272% | 0.0625% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 39 | `same` | 0.0637% | 298 | 12.8% | 0.3235% | 0.0702% | 0.0286% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 40 | `stated` | 0.0636% | 154 | 50.6% | 0.1672% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:36` |
| 41 | `prose` | 0.0635% | 124 | 30.6% | 0.1346% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:59` |
| 42 | `phrase` | 0.0633% | 131 | 35.1% | 0.1422% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:61` |
| 43 | `names` | 0.0596% | 308 | 42.5% | 0.3344% | 0.0081% | 0.0814% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 44 | `senses` | 0.0586% | 116 | 42.2% | 0.1259% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 45 | `occurrences` | 0.0582% | 112 | 67.9% | 0.1216% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:18` |
| 46 | `chance` | 0.0579% | 147 | 46.3% | 0.1596% | 0.0097% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:44` |
| 47 | `does` | 0.0577% | 240 | 20.8% | 0.2605% | 0.0484% | 0.0062% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 48 | `refuses` | 0.0563% | 111 | 77.5% | 0.1205% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 50 | `mass` | 0.0556% | 138 | 47.8% | 0.1498% | 0.0083% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 51 | `says` | 0.0516% | 199 | 20.6% | 0.2160% | 0.0359% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 52 | `keeps` | 0.0499% | 106 | 59.4% | 0.1151% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 53 | `branch` | 0.0495% | 126 | 33.3% | 0.1368% | 0.0037% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:14` |
| 54 | `matched` | 0.0492% | 101 | 57.4% | 0.1096% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:59` |
| 55 | `ontology` | 0.0487% | 94 | 40.4% | 0.1020% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:51` |

<details>
<summary>632 more words, ranked</summary>

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 56 | `rung` | 0.0461% | 85 | 54.1% | 0.0923% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:52` |
| 57 | `nearest` | 0.0459% | 93 | 37.6% | 0.1010% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 58 | `whole` | 0.0455% | 138 | 15.9% | 0.1498% | 0.0156% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 59 | `placement` | 0.0445% | 93 | 48.4% | 0.1010% | 0.0019% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 60 | `broader` | 0.0442% | 95 | 83.2% | 0.1031% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:75` |
| 61 | `publishes` | 0.0441% | 86 | 12.8% | 0.0934% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 62 | `terms` | 0.0440% | 141 | 54.6% | 0.1531% | 0.0180% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 64 | `net` | 0.0413% | 112 | 13.4% | 0.1216% | 0.0063% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 66 | `files` | 0.0402% | 140 | 52.9% | 0.1520% | 0.0039% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 67 | `publisher` | 0.0396% | 90 | 36.7% | 0.0977% | 0.0015% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:129` |
| 68 | `each` | 0.0396% | 368 | 13.3% | 0.3995% | 0.0830% | 0.1567% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 69 | `subjects` | 0.0394% | 90 | 35.6% | 0.0977% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:7` |
| 71 | `english` | 0.0384% | 124 | 29.8% | 0.1346% | 0.0161% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 72 | `holds` | 0.0383% | 91 | 15.4% | 0.0988% | 0.0045% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 73 | `counts` | 0.0380% | 87 | 57.5% | 0.0944% | 0.0021% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 75 | `repository's` | 0.0380% | 70 | 0.0% | 0.0760% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 76 | `wrote` | 0.0374% | 124 | 27.4% | 0.1346% | 0.0170% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 77 | `evidence` | 0.0374% | 122 | 25.4% | 0.1324% | 0.0162% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 78 | `stands` | 0.0360% | 85 | 20.0% | 0.0923% | 0.0041% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:78` |
| 79 | `cited` | 0.0350% | 77 | 46.8% | 0.0836% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:19` |
| 80 | `noun` | 0.0349% | 71 | 50.7% | 0.0771% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 81 | `domains` | 0.0343% | 78 | 57.7% | 0.0847% | 0.0013% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:38` |
| 82 | `two` | 0.0341% | 328 | 10.1% | 0.3561% | 0.1424% | 0.0031% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 83 | `carried` | 0.0338% | 90 | 35.6% | 0.0977% | 0.0070% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 84 | `ranking` | 0.0337% | 71 | 33.8% | 0.0771% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:93` |
| 85 | `verb` | 0.0336% | 69 | 55.1% | 0.0749% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 86 | `runs` | 0.0329% | 89 | 31.5% | 0.0966% | 0.0073% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 87 | `draws` | 0.0323% | 69 | 39.1% | 0.0749% | 0.0018% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 89 | `answers` | 0.0319% | 72 | 8.3% | 0.0782% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 90 | `report` | 0.0314% | 145 | 38.6% | 0.1574% | 0.0336% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 91 | `pooled` | 0.0313% | 69 | 47.8% | 0.0749% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 92 | `here` | 0.0311% | 169 | 7.7% | 0.1835% | 0.0470% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 93 | `distribution` | 0.0310% | 82 | 32.9% | 0.0890% | 0.0062% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:96` |
| 94 | `labels` | 0.0305% | 78 | 30.8% | 0.0847% | 0.0015% | 0.0053% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 97 | `answer` | 0.0299% | 80 | 1.3% | 0.0868% | 0.0063% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:7` |
| 98 | `tsv` | 0.0299% | 55 | 69.1% | 0.0597% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationTsv.java:11` |
| 100 | `alone` | 0.0295% | 82 | 24.4% | 0.0890% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 101 | `git` | 0.0293% | 54 | 18.5% | 0.0586% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:11` |
| 102 | `0` | 0.0291% | 63 | 0.0% | 0.0684% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 103 | `figure` | 0.0291% | 82 | 13.4% | 0.0890% | 0.0076% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 105 | `sentence` | 0.0285% | 74 | 20.3% | 0.0803% | 0.0034% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 107 | `1` | 0.0282% | 63 | 0.0% | 0.0684% | 0.0000% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 108 | `lemma` | 0.0282% | 52 | 48.1% | 0.0565% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 109 | `apart` | 0.0281% | 72 | 41.7% | 0.0782% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 110 | `carry` | 0.0281% | 78 | 21.8% | 0.0847% | 0.0069% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 111 | `scopes` | 0.0280% | 59 | 59.3% | 0.0640% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:31` |
| 112 | `ordinary` | 0.0275% | 65 | 26.2% | 0.0706% | 0.0032% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 113 | `readings` | 0.0274% | 58 | 36.2% | 0.0630% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 114 | `ar` | 0.0272% | 55 | 0.0% | 0.0597% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 115 | `label` | 0.0266% | 205 | 61.0% | 0.2225% | 0.0028% | 0.0770% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 116 | `carrying` | 0.0266% | 65 | 23.1% | 0.0706% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 117 | `themes` | 0.0265% | 62 | 85.5% | 0.0673% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:107` |
| 118 | `named` | 0.0264% | 105 | 46.7% | 0.1140% | 0.0110% | 0.0198% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:65` |
| 119 | `reports` | 0.0264% | 84 | 33.3% | 0.0912% | 0.0106% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordRanksTest.java:41` |
| 120 | `oli` | 0.0261% | 48 | 0.0% | 0.0521% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 121 | `source` | 0.0260% | 337 | 49.9% | 0.3658% | 0.0130% | 0.1712% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:13` |
| 122 | `placed` | 0.0257% | 77 | 51.9% | 0.0836% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:29` |
| 123 | `e` | 0.0254% | 66 | 4.5% | 0.0716% | 0.0048% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:67` |
| 124 | `claim` | 0.0250% | 74 | 27.0% | 0.0803% | 0.0079% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:42` |
| 125 | `library` | 0.0249% | 87 | 3.4% | 0.0944% | 0.0071% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 126 | `extraction` | 0.0246% | 53 | 50.9% | 0.0575% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 127 | `test` | 0.0243% | 234 | 79.5% | 0.2540% | 0.0135% | 0.1016% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:14` |
| 128 | `comparison` | 0.0240% | 60 | 30.0% | 0.0651% | 0.0037% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 129 | `drawn` | 0.0239% | 60 | 41.7% | 0.0651% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:137` |
| 130 | `commonest` | 0.0239% | 44 | 52.3% | 0.0478% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:68` |
| 131 | `legibility` | 0.0239% | 44 | 84.1% | 0.0478% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:97` |
| 132 | `word's` | 0.0233% | 43 | 0.0% | 0.0467% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 133 | `inside` | 0.0232% | 79 | 16.5% | 0.0858% | 0.0115% | 0.0044% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:25` |
| 134 | `pinned` | 0.0231% | 53 | 22.6% | 0.0575% | 0.0007% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 135 | `kept` | 0.0229% | 69 | 31.9% | 0.0749% | 0.0076% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 136 | `whatever` | 0.0227% | 61 | 8.2% | 0.0662% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 137 | `topical` | 0.0227% | 46 | 2.2% | 0.0499% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:51` |
| 139 | `about` | 0.0221% | 341 | 9.1% | 0.3702% | 0.1871% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 140 | `witnesses` | 0.0220% | 50 | 82.0% | 0.0543% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:31` |
| 142 | `declares` | 0.0217% | 47 | 17.0% | 0.0510% | 0.0008% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:38` |
| 143 | `frequency_list` | 0.0217% | 40 | 7.5% | 0.0434% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 144 | `resource` | 0.0217% | 190 | 26.3% | 0.2063% | 0.0040% | 0.0779% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 145 | `none` | 0.0216% | 61 | 18.0% | 0.0662% | 0.0047% | 0.0057% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:13` |
| 146 | `rank` | 0.0213% | 51 | 41.2% | 0.0554% | 0.0026% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:48` |
| 147 | `abstains` | 0.0212% | 39 | 56.4% | 0.0423% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 148 | `chosen` | 0.0207% | 57 | 33.3% | 0.0619% | 0.0049% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 149 | `part_of_speech` | 0.0206% | 38 | 50.0% | 0.0413% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 151 | `citations` | 0.0204% | 41 | 80.5% | 0.0445% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:11` |
| 152 | `occurrence` | 0.0204% | 62 | 67.7% | 0.0673% | 0.0015% | 0.0070% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:47` |
| 153 | `declared` | 0.0203% | 119 | 29.4% | 0.1292% | 0.0042% | 0.0356% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 154 | `token` | 0.0203% | 122 | 54.9% | 0.1324% | 0.0013% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 155 | `ranked` | 0.0202% | 48 | 70.8% | 0.0521% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:94` |
| 156 | `neither` | 0.0200% | 54 | 7.4% | 0.0586% | 0.0044% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 157 | `resources` | 0.0200% | 83 | 13.3% | 0.0901% | 0.0110% | 0.0167% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 158 | `wiktionary` | 0.0195% | 36 | 38.9% | 0.0391% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 159 | `rule` | 0.0194% | 96 | 7.3% | 0.1042% | 0.0082% | 0.0242% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 160 | `asks` | 0.0193% | 46 | 13.0% | 0.0499% | 0.0023% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 161 | `vote` | 0.0191% | 60 | 45.0% | 0.0651% | 0.0074% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 162 | `resolves` | 0.0190% | 35 | 48.6% | 0.0380% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 163 | `revision` | 0.0189% | 42 | 33.3% | 0.0456% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:3` |
| 164 | `renders` | 0.0187% | 38 | 28.9% | 0.0413% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 165 | `counted` | 0.0187% | 46 | 21.7% | 0.0499% | 0.0015% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 166 | `catalogue` | 0.0186% | 41 | 26.8% | 0.0445% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 167 | `headword` | 0.0185% | 34 | 41.2% | 0.0369% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/HeadwordTopics.java:12` |
| 168 | `segmenter` | 0.0185% | 34 | 23.5% | 0.0369% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 169 | `lexicon` | 0.0182% | 37 | 62.2% | 0.0402% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:15` |
| 170 | `author` | 0.0181% | 52 | 21.2% | 0.0565% | 0.0051% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:18` |
| 171 | `2` | 0.0181% | 40 | 2.5% | 0.0434% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 172 | `parsed` | 0.0181% | 50 | 86.0% | 0.0543% | 0.0000% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 173 | `ranks` | 0.0181% | 43 | 65.1% | 0.0467% | 0.0021% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 174 | `votes` | 0.0180% | 47 | 44.7% | 0.0510% | 0.0034% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 175 | `fibo` | 0.0179% | 33 | 36.4% | 0.0358% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/FinanceTerms.java:11` |
| 177 | `under` | 0.0177% | 171 | 28.1% | 0.1856% | 0.0745% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 179 | `denominator` | 0.0174% | 32 | 15.6% | 0.0347% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 180 | `longest` | 0.0169% | 40 | 55.0% | 0.0434% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportOrigins.java:5` |
| 181 | `grammar` | 0.0169% | 39 | 5.1% | 0.0423% | 0.0017% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:11` |
| 182 | `run` | 0.0169% | 264 | 27.7% | 0.2866% | 0.0270% | 0.1457% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 183 | `only` | 0.0167% | 244 | 15.6% | 0.2649% | 0.1307% | 0.0999% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 184 | `lemmas` | 0.0163% | 30 | 66.7% | 0.0326% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 185 | `xiv` | 0.0163% | 34 | 0.0% | 0.0369% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 186 | `tokens` | 0.0162% | 38 | 52.6% | 0.0413% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:50` |
| 187 | `reaches` | 0.0161% | 38 | 26.3% | 0.0413% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 188 | `extjwnl` | 0.0157% | 29 | 0.0% | 0.0315% | 0.0000% | 0.0000% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/CountedSense.java:3` |
| 189 | `refused` | 0.0157% | 46 | 37.0% | 0.0499% | 0.0048% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 190 | `sits` | 0.0155% | 37 | 2.7% | 0.0402% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 191 | `markdown` | 0.0152% | 28 | 0.0% | 0.0304% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 193 | `domain` | 0.0151% | 79 | 21.5% | 0.0858% | 0.0034% | 0.0211% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:39` |
| 194 | `phrases` | 0.0151% | 34 | 58.8% | 0.0369% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 195 | `chose` | 0.0149% | 40 | 25.0% | 0.0434% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 196 | `form` | 0.0149% | 106 | 33.0% | 0.1151% | 0.0376% | 0.0145% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 197 | `permalink` | 0.0147% | 27 | 22.2% | 0.0293% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:50` |
| 198 | `provenance` | 0.0147% | 27 | 29.6% | 0.0293% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 199 | `synset` | 0.0147% | 27 | 51.9% | 0.0293% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:11` |
| 200 | `leaves` | 0.0146% | 46 | 58.7% | 0.0499% | 0.0056% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 201 | `3` | 0.0143% | 29 | 0.0% | 0.0315% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacementByDescriptionLength.java:55` |
| 202 | `computer_science` | 0.0141% | 26 | 3.8% | 0.0282% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:51` |
| 203 | `corroborated` | 0.0141% | 26 | 76.9% | 0.0282% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 204 | `topic's` | 0.0141% | 26 | 0.0% | 0.0282% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 206 | `corpus` | 0.0140% | 30 | 6.7% | 0.0326% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 207 | `asked` | 0.0139% | 70 | 18.6% | 0.0760% | 0.0179% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 208 | `theme` | 0.0135% | 40 | 47.5% | 0.0434% | 0.0043% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 209 | `piece` | 0.0133% | 47 | 42.6% | 0.0510% | 0.0073% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:56` |
| 210 | `mean` | 0.0131% | 54 | 29.6% | 0.0586% | 0.0107% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:31` |
| 211 | `archive` | 0.0131% | 45 | 42.2% | 0.0489% | 0.0014% | 0.0066% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 212 | `places` | 0.0131% | 49 | 32.7% | 0.0532% | 0.0084% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 213 | `publisher's` | 0.0130% | 24 | 0.0% | 0.0261% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 214 | `bounded` | 0.0130% | 37 | 8.1% | 0.0402% | 0.0009% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 216 | `framework` | 0.0126% | 37 | 29.7% | 0.0402% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 218 | `ast` | 0.0125% | 23 | 0.0% | 0.0250% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 219 | `normalisation` | 0.0125% | 23 | 43.5% | 0.0250% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:50` |
| 220 | `normalised` | 0.0125% | 23 | 21.7% | 0.0250% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:33` |
| 222 | `needs` | 0.0125% | 73 | 5.5% | 0.0792% | 0.0219% | 0.0123% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 223 | `tally` | 0.0124% | 27 | 77.8% | 0.0293% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:113` |
| 224 | `siblings` | 0.0123% | 29 | 62.1% | 0.0315% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedReading.java:22` |
| 225 | `decides` | 0.0121% | 29 | 0.0% | 0.0315% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:7` |
| 226 | `apache` | 0.0121% | 26 | 3.8% | 0.0282% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 227 | `arxiv` | 0.0119% | 22 | 100.0% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PlacedField.java:47` |
| 228 | `codebase` | 0.0119% | 22 | 0.0% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 229 | `keyed` | 0.0119% | 22 | 13.6% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 230 | `ontologies` | 0.0119% | 22 | 36.4% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:11` |
| 231 | `resamples` | 0.0119% | 22 | 72.7% | 0.0239% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 233 | `stating` | 0.0118% | 30 | 33.3% | 0.0326% | 0.0020% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingIndex.java:6` |
| 235 | `statements` | 0.0115% | 35 | 37.1% | 0.0380% | 0.0036% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 236 | `sighting` | 0.0115% | 24 | 91.7% | 0.0261% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:41` |
| 237 | `net's` | 0.0114% | 21 | 0.0% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:23` |
| 238 | `rungs` | 0.0114% | 21 | 76.2% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:36` |
| 239 | `scope's` | 0.0114% | 21 | 0.0% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 240 | `xiv's` | 0.0114% | 21 | 0.0% | 0.0228% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 241 | `summary` | 0.0114% | 57 | 61.4% | 0.0619% | 0.0023% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:106` |
| 242 | `nobody` | 0.0114% | 30 | 13.3% | 0.0326% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 243 | `hub` | 0.0113% | 30 | 0.0% | 0.0326% | 0.0023% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:6` |
| 244 | `owl` | 0.0112% | 24 | 83.3% | 0.0261% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:66` |
| 247 | `initialism` | 0.0109% | 20 | 40.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:45` |
| 248 | `nist` | 0.0109% | 20 | 30.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 249 | `tika` | 0.0109% | 20 | 0.0% | 0.0217% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/WrittenSubtree.java:6` |
| 250 | `ones` | 0.0108% | 42 | 19.0% | 0.0456% | 0.0077% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 251 | `reported` | 0.0107% | 59 | 6.8% | 0.0640% | 0.0166% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:80` |
| 252 | `intensity` | 0.0107% | 28 | 39.3% | 0.0304% | 0.0021% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:50` |
| 253 | `4` | 0.0107% | 24 | 0.0% | 0.0261% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:51` |
| 254 | `abbreviation` | 0.0106% | 23 | 73.9% | 0.0250% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:41` |
| 255 | `letters` | 0.0106% | 36 | 16.7% | 0.0391% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 256 | `caller` | 0.0104% | 52 | 9.6% | 0.0565% | 0.0007% | 0.0132% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 257 | `definition` | 0.0104% | 59 | 28.8% | 0.0640% | 0.0049% | 0.0172% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 258 | `evaluation` | 0.0103% | 30 | 26.7% | 0.0326% | 0.0030% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 259 | `odds` | 0.0103% | 28 | 39.3% | 0.0304% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 260 | `cso` | 0.0103% | 19 | 15.8% | 0.0206% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:56` |
| 261 | `file's` | 0.0103% | 19 | 0.0% | 0.0206% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 262 | `knows` | 0.0102% | 33 | 21.2% | 0.0358% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 263 | `naming` | 0.0102% | 42 | 11.9% | 0.0456% | 0.0014% | 0.0084% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 264 | `javadoc` | 0.0102% | 26 | 26.9% | 0.0282% | 0.0000% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 265 | `labelled` | 0.0101% | 36 | 36.1% | 0.0391% | 0.0011% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:108` |
| 266 | `splitter` | 0.0100% | 21 | 14.3% | 0.0228% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:24` |
| 267 | `answered` | 0.0100% | 26 | 19.2% | 0.0282% | 0.0019% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 268 | `licence` | 0.0099% | 28 | 17.9% | 0.0304% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:9` |
| 269 | `measurement` | 0.0098% | 28 | 0.0% | 0.0304% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 270 | `inflection` | 0.0098% | 18 | 61.1% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:6` |
| 271 | `mark_down` | 0.0098% | 18 | 100.0% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:20` |
| 272 | `parses` | 0.0098% | 18 | 38.9% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:20` |
| 273 | `taxonomies` | 0.0098% | 18 | 44.4% | 0.0195% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:115` |
| 275 | `hundred` | 0.0097% | 30 | 0.0% | 0.0326% | 0.0036% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:6` |
| 276 | `glued` | 0.0097% | 21 | 42.9% | 0.0228% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 277 | `site` | 0.0096% | 62 | 83.9% | 0.0673% | 0.0203% | 0.0123% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:20` |
| 278 | `letter` | 0.0096% | 40 | 35.0% | 0.0434% | 0.0081% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:27` |
| 279 | `stays` | 0.0096% | 24 | 29.2% | 0.0261% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:64` |
| 280 | `sha` | 0.0095% | 20 | 70.0% | 0.0217% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:17` |
| 281 | `belongs` | 0.0094% | 23 | 4.3% | 0.0250% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:34` |
| 282 | `survives` | 0.0093% | 21 | 9.5% | 0.0228% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 283 | `shown` | 0.0093% | 44 | 43.2% | 0.0478% | 0.0105% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 284 | `root` | 0.0093% | 155 | 76.8% | 0.1683% | 0.0033% | 0.0876% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 285 | `measured` | 0.0093% | 30 | 10.0% | 0.0326% | 0.0039% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 286 | `function` | 0.0093% | 66 | 54.5% | 0.0716% | 0.0113% | 0.0233% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:32` |
| 287 | `offered` | 0.0093% | 40 | 42.5% | 0.0434% | 0.0085% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 288 | `rows` | 0.0092% | 72 | 55.6% | 0.0782% | 0.0013% | 0.0273% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 289 | `narrows` | 0.0092% | 17 | 0.0% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 290 | `taxonomy's` | 0.0092% | 17 | 0.0% | 0.0185% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:38` |
| 291 | `morphology` | 0.0091% | 21 | 38.1% | 0.0228% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 292 | `single` | 0.0090% | 67 | 17.9% | 0.0727% | 0.0245% | 0.0185% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 293 | `bits` | 0.0090% | 52 | 65.4% | 0.0565% | 0.0024% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:22` |
| 294 | `sightings` | 0.0089% | 20 | 80.0% | 0.0217% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:26` |
| 295 | `worth` | 0.0089% | 54 | 7.4% | 0.0586% | 0.0168% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:27` |
| 296 | `distinct` | 0.0088% | 30 | 26.7% | 0.0326% | 0.0036% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:16` |
| 297 | `score` | 0.0087% | 33 | 15.2% | 0.0358% | 0.0058% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:55` |
| 298 | `999` | 0.0087% | 16 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingPopulation.java:6` |
| 299 | `collocations` | 0.0087% | 16 | 56.3% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:10` |
| 300 | `corroboration` | 0.0087% | 16 | 25.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ScopeLegibility.java:8` |
| 301 | `platform's` | 0.0087% | 16 | 0.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 302 | `quantile` | 0.0087% | 16 | 25.0% | 0.0174% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:36` |
| 303 | `specificity` | 0.0086% | 20 | 80.0% | 0.0217% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:34` |
| 304 | `reader` | 0.0086% | 133 | 19.5% | 0.1444% | 0.0022% | 0.0730% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 305 | `thing` | 0.0084% | 54 | 1.9% | 0.0586% | 0.0176% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 306 | `finding` | 0.0083% | 32 | 15.6% | 0.0347% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:75` |
| 307 | `nearer` | 0.0083% | 18 | 5.6% | 0.0195% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 308 | `rests` | 0.0082% | 19 | 15.8% | 0.0206% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 309 | `statistic` | 0.0082% | 18 | 5.6% | 0.0195% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 310 | `abstention` | 0.0081% | 15 | 20.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 311 | `normal_form` | 0.0081% | 15 | 46.7% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:40` |
| 312 | `unplaced` | 0.0081% | 15 | 80.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:108` |
| 313 | `unreadable` | 0.0081% | 15 | 40.0% | 0.0163% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 314 | `functions` | 0.0081% | 33 | 45.5% | 0.0358% | 0.0064% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:44` |
| 315 | `page` | 0.0081% | 67 | 31.3% | 0.0727% | 0.0122% | 0.0264% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:19` |
| 316 | `contribution` | 0.0081% | 27 | 81.5% | 0.0293% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:65` |
| 317 | `nouns` | 0.0081% | 20 | 15.0% | 0.0217% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 318 | `commits` | 0.0081% | 19 | 26.3% | 0.0206% | 0.0006% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 319 | `spans` | 0.0079% | 25 | 48.0% | 0.0271% | 0.0009% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 320 | `compares` | 0.0079% | 19 | 5.3% | 0.0206% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 321 | `question` | 0.0078% | 47 | 0.0% | 0.0510% | 0.0144% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 322 | `initials` | 0.0078% | 17 | 52.9% | 0.0185% | 0.0005% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:45` |
| 323 | `cite` | 0.0077% | 21 | 33.3% | 0.0228% | 0.0008% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 324 | `descriptions` | 0.0077% | 21 | 47.6% | 0.0228% | 0.0015% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 325 | `placements` | 0.0077% | 18 | 100.0% | 0.0195% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:22` |
| 326 | `artefact` | 0.0076% | 14 | 35.7% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:23` |
| 327 | `bearers` | 0.0076% | 14 | 100.0% | 0.0152% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataNameExtraction.java:55` |
| 328 | `dictionary's` | 0.0076% | 14 | 0.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 329 | `permutation` | 0.0076% | 14 | 14.3% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 330 | `wikidata` | 0.0076% | 14 | 0.0% | 0.0152% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 331 | `writing` | 0.0076% | 41 | 2.4% | 0.0445% | 0.0114% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:40` |
| 332 | `semantics` | 0.0076% | 18 | 83.3% | 0.0195% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:1` |
| 334 | `beat` | 0.0075% | 27 | 22.2% | 0.0293% | 0.0043% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedThemes.java:60` |
| 335 | `pieces` | 0.0075% | 29 | 27.6% | 0.0315% | 0.0053% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:92` |
| 336 | `somebody` | 0.0075% | 21 | 4.8% | 0.0228% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:11` |
| 337 | `residual` | 0.0074% | 18 | 61.1% | 0.0195% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:25` |
| 338 | `chain` | 0.0073% | 33 | 42.4% | 0.0358% | 0.0047% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 339 | `cites` | 0.0072% | 17 | 41.2% | 0.0185% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:33` |
| 340 | `hierarchy` | 0.0072% | 40 | 55.0% | 0.0434% | 0.0013% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:9` |
| 342 | `distributions` | 0.0071% | 18 | 27.8% | 0.0195% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 343 | `commit` | 0.0071% | 57 | 33.3% | 0.0619% | 0.0018% | 0.0220% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:15` |
| 344 | `lines` | 0.0071% | 48 | 68.8% | 0.0521% | 0.0101% | 0.0163% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 345 | `heading` | 0.0071% | 23 | 78.3% | 0.0250% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:21` |
| 346 | `collocation` | 0.0071% | 13 | 38.5% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:100` |
| 347 | `fetched` | 0.0071% | 13 | 30.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 348 | `field's` | 0.0071% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:8` |
| 349 | `generalises` | 0.0071% | 13 | 30.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 350 | `hypernym` | 0.0071% | 13 | 53.8% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 351 | `reference's` | 0.0071% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 352 | `skos` | 0.0071% | 13 | 46.2% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 353 | `source's` | 0.0071% | 13 | 0.0% | 0.0141% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/NormalisedTerms.java:12` |
| 354 | `folder` | 0.0070% | 34 | 55.9% | 0.0369% | 0.0008% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 355 | `language` | 0.0070% | 53 | 26.4% | 0.0575% | 0.0197% | 0.0176% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:28` |
| 356 | `shared` | 0.0069% | 63 | 54.0% | 0.0684% | 0.0091% | 0.0264% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 357 | `silent` | 0.0069% | 20 | 40.0% | 0.0217% | 0.0020% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 358 | `boundary` | 0.0069% | 21 | 9.5% | 0.0228% | 0.0024% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 359 | `pooling` | 0.0069% | 15 | 6.7% | 0.0163% | 0.0000% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTheme.java:6` |
| 361 | `folded` | 0.0069% | 17 | 35.3% | 0.0185% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 362 | `partition` | 0.0069% | 18 | 16.7% | 0.0195% | 0.0010% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:110` |
| 363 | `contributes` | 0.0069% | 18 | 11.1% | 0.0195% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 364 | `asking` | 0.0068% | 26 | 11.5% | 0.0282% | 0.0046% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 365 | `scheme` | 0.0068% | 42 | 9.5% | 0.0456% | 0.0057% | 0.0132% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 366 | `produces` | 0.0068% | 22 | 4.5% | 0.0239% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 367 | `prints` | 0.0068% | 18 | 27.8% | 0.0195% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 368 | `fails` | 0.0068% | 19 | 10.5% | 0.0206% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 369 | `standing` | 0.0067% | 27 | 22.2% | 0.0293% | 0.0052% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:74` |
| 370 | `figures` | 0.0067% | 28 | 14.3% | 0.0304% | 0.0057% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:39` |
| 371 | `lets` | 0.0067% | 19 | 15.8% | 0.0206% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SetAside.java:3` |
| 372 | `json` | 0.0067% | 20 | 30.0% | 0.0217% | 0.0000% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 373 | `references` | 0.0066% | 33 | 57.6% | 0.0358% | 0.0028% | 0.0084% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/WalkthroughProse.java:61` |
| 374 | `exported` | 0.0066% | 26 | 84.6% | 0.0282% | 0.0010% | 0.0048% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:18` |
| 375 | `adjective` | 0.0066% | 15 | 40.0% | 0.0163% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:58` |
| 376 | `fasterxml` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 377 | `reading's` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 378 | `repositories` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 379 | `resource's` | 0.0065% | 12 | 0.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 380 | `set_aside` | 0.0065% | 12 | 50.0% | 0.0130% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:179` |
| 381 | `translingual` | 0.0065% | 12 | 75.0% | 0.0130% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 382 | `deepest` | 0.0065% | 16 | 50.0% | 0.0174% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/DepthReport.java:84` |
| 383 | `above` | 0.0065% | 55 | 23.6% | 0.0597% | 0.0220% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 384 | `dominant` | 0.0064% | 20 | 60.0% | 0.0217% | 0.0024% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:67` |
| 385 | `pref` | 0.0064% | 17 | 100.0% | 0.0185% | 0.0000% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:76` |
| 387 | `matching` | 0.0062% | 19 | 10.5% | 0.0206% | 0.0020% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 388 | `distance` | 0.0061% | 34 | 29.4% | 0.0369% | 0.0069% | 0.0097% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:55` |
| 389 | `compared` | 0.0060% | 38 | 15.8% | 0.0413% | 0.0121% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 390 | `judged` | 0.0060% | 16 | 12.5% | 0.0174% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 391 | `taken` | 0.0060% | 58 | 3.4% | 0.0630% | 0.0253% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 392 | `classpath` | 0.0060% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OrdinaryEnglish.java:44` |
| 393 | `clears` | 0.0060% | 11 | 27.3% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:10` |
| 394 | `collocated` | 0.0060% | 11 | 100.0% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java:47` |
| 395 | `csf` | 0.0060% | 11 | 72.7% | 0.0119% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:23` |
| 396 | `revision's` | 0.0060% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomyExtraction.java:52` |
| 397 | `wiktextract` | 0.0060% | 11 | 0.0% | 0.0119% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 398 | `rest` | 0.0060% | 36 | 27.8% | 0.0391% | 0.0111% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 399 | `spelled` | 0.0059% | 14 | 14.3% | 0.0152% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:7` |
| 400 | `walk` | 0.0059% | 29 | 27.6% | 0.0315% | 0.0072% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/WrittenWords.java:60` |
| 401 | `branches` | 0.0058% | 19 | 42.1% | 0.0206% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/PooledConcepts.java:11` |
| 402 | `graph` | 0.0058% | 25 | 60.0% | 0.0271% | 0.0016% | 0.0053% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 403 | `makes` | 0.0058% | 49 | 4.1% | 0.0532% | 0.0196% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 404 | `disagree` | 0.0058% | 15 | 6.7% | 0.0163% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 405 | `rendered` | 0.0058% | 24 | 70.8% | 0.0261% | 0.0014% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 406 | `hold` | 0.0057% | 38 | 18.4% | 0.0413% | 0.0128% | 0.0062% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 407 | `documentation` | 0.0057% | 20 | 30.0% | 0.0217% | 0.0018% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:34` |
| 408 | `imports` | 0.0057% | 20 | 50.0% | 0.0217% | 0.0016% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ImportTally.java:36` |
| 409 | `withheld` | 0.0056% | 13 | 61.5% | 0.0141% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:76` |
| 410 | `shannon` | 0.0056% | 14 | 14.3% | 0.0152% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 411 | `jensen` | 0.0056% | 13 | 15.4% | 0.0141% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 412 | `witness` | 0.0056% | 19 | 73.7% | 0.0206% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ThemeTables.java:73` |
| 413 | `weighs` | 0.0056% | 14 | 92.9% | 0.0152% | 0.0009% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedCommentsTest.java:19` |
| 414 | `finds` | 0.0055% | 20 | 75.0% | 0.0217% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedSourceSets.java:7` |
| 415 | `arrives` | 0.0055% | 16 | 6.3% | 0.0174% | 0.0016% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/SightingSite.java:6` |
| 416 | `weights` | 0.0055% | 15 | 73.3% | 0.0163% | 0.0013% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:23` |
| 417 | `printed` | 0.0055% | 20 | 10.0% | 0.0217% | 0.0033% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 418 | `linguistic` | 0.0054% | 15 | 20.0% | 0.0163% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LinguisticTerms.java:18` |
| 419 | `a's` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermReading.java:45` |
| 420 | `bian` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TaxonomyShape.java:7` |
| 421 | `oscal` | 0.0054% | 10 | 30.0% | 0.0109% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/CsfConcepts.java:26` |
| 422 | `read_off` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 423 | `spellings` | 0.0054% | 10 | 10.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 424 | `λ` | 0.0054% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityReading.java:12` |
| 425 | `sentences` | 0.0054% | 16 | 25.0% | 0.0174% | 0.0017% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 427 | `means` | 0.0054% | 55 | 18.2% | 0.0597% | 0.0248% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 428 | `identifiers` | 0.0054% | 23 | 17.4% | 0.0250% | 0.0000% | 0.0048% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 429 | `takes` | 0.0054% | 36 | 55.6% | 0.0391% | 0.0122% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:14` |
| 430 | `copied` | 0.0053% | 14 | 71.4% | 0.0152% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/CopiedComments.java:21` |
| 431 | `export` | 0.0053% | 41 | 41.5% | 0.0445% | 0.0025% | 0.0154% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:1` |
| 432 | `records` | 0.0053% | 28 | 21.4% | 0.0304% | 0.0076% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 433 | `consumer` | 0.0053% | 50 | 2.0% | 0.0543% | 0.0049% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordRanks.java:14` |
| 434 | `sets` | 0.0052% | 25 | 60.0% | 0.0271% | 0.0060% | 0.0022% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:49` |
| 435 | `supplied` | 0.0052% | 18 | 33.3% | 0.0195% | 0.0027% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:23` |
| 436 | `observed` | 0.0052% | 32 | 18.8% | 0.0347% | 0.0050% | 0.0101% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 437 | `lists` | 0.0051% | 18 | 16.7% | 0.0195% | 0.0028% | 0.0009% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidenceTest.java:47` |
| 438 | `bundles` | 0.0051% | 13 | 7.7% | 0.0141% | 0.0006% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:51` |
| 439 | `moves` | 0.0051% | 20 | 25.0% | 0.0217% | 0.0037% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 440 | `seed` | 0.0050% | 38 | 63.2% | 0.0413% | 0.0033% | 0.0141% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:97` |
| 441 | `weight` | 0.0050% | 44 | 47.7% | 0.0478% | 0.0089% | 0.0180% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:14` |
| 442 | `ladder` | 0.0050% | 14 | 28.6% | 0.0152% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedTerms.java:9` |
| 443 | `candidate` | 0.0050% | 27 | 14.8% | 0.0293% | 0.0044% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:80` |
| 444 | `fixture` | 0.0049% | 13 | 30.8% | 0.0141% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/JavaSourceScopes.java:11` |
| 445 | `dropped` | 0.0049% | 22 | 4.5% | 0.0239% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:14` |
| 446 | `pools` | 0.0049% | 14 | 28.6% | 0.0152% | 0.0013% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 447 | `sum` | 0.0049% | 29 | 24.1% | 0.0315% | 0.0025% | 0.0088% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:26` |
| 448 | `14` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:51` |
| 449 | `152` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 450 | `636` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:51` |
| 451 | `classifies` | 0.0049% | 9 | 11.1% | 0.0098% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:13` |
| 452 | `decomposes` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/ShareDivergence.java:8` |
| 453 | `framework's` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 454 | `lombok` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:3` |
| 455 | `pull_request` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:16` |
| 456 | `rdf` | 0.0049% | 9 | 22.2% | 0.0098% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboManifest.java:36` |
| 457 | `seeded` | 0.0049% | 9 | 55.6% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:60` |
| 458 | `vocabularies` | 0.0049% | 9 | 0.0% | 0.0098% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:47` |
| 459 | `alike` | 0.0048% | 15 | 6.7% | 0.0163% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 460 | `verbs` | 0.0048% | 13 | 23.1% | 0.0141% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 461 | `frequency` | 0.0048% | 21 | 23.8% | 0.0228% | 0.0046% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:49` |
| 462 | `far` | 0.0047% | 54 | 13.0% | 0.0586% | 0.0258% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOddsTest.java:36` |
| 463 | `acronym` | 0.0046% | 11 | 45.5% | 0.0119% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 465 | `computed` | 0.0046% | 12 | 0.0% | 0.0130% | 0.0008% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 466 | `puts` | 0.0046% | 16 | 25.0% | 0.0174% | 0.0024% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 467 | `depth` | 0.0045% | 33 | 63.6% | 0.0358% | 0.0035% | 0.0119% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 468 | `declaration` | 0.0045% | 41 | 19.5% | 0.0445% | 0.0020% | 0.0172% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:56` |
| 469 | `discarded` | 0.0045% | 12 | 8.3% | 0.0130% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:14` |
| 470 | `held` | 0.0045% | 55 | 52.7% | 0.0597% | 0.0272% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 471 | `bars` | 0.0045% | 16 | 56.3% | 0.0174% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/QualifiedTopics.java:39` |
| 472 | `clause` | 0.0045% | 24 | 20.8% | 0.0261% | 0.0019% | 0.0066% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviour.java:6` |
| 473 | `dotted` | 0.0045% | 11 | 36.4% | 0.0119% | 0.0006% | 0.0004% | `lexicon/src/main/java/io/github/fiftieshousewife/bi/lexicon/Lexicon.java:59` |
| 474 | `zero` | 0.0045% | 52 | 30.8% | 0.0565% | 0.0044% | 0.0251% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 475 | `markup` | 0.0045% | 13 | 23.1% | 0.0141% | 0.0006% | 0.0013% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavadocProse.java:32` |
| 476 | `counting` | 0.0045% | 19 | 21.1% | 0.0206% | 0.0015% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 477 | `signals` | 0.0044% | 17 | 58.8% | 0.0185% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:113` |
| 478 | `say` | 0.0044% | 65 | 6.2% | 0.0706% | 0.0349% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 479 | `squash` | 0.0044% | 11 | 54.5% | 0.0119% | 0.0007% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:44` |
| 480 | `unread` | 0.0044% | 16 | 50.0% | 0.0174% | 0.0000% | 0.0026% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 481 | `else's` | 0.0043% | 8 | 0.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 482 | `legible` | 0.0043% | 8 | 75.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 483 | `olia` | 0.0043% | 8 | 100.0% | 0.0087% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/OliaConcepts.java:30` |
| 484 | `slf4j` | 0.0043% | 8 | 0.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:12` |
| 485 | `weighting` | 0.0043% | 8 | 25.0% | 0.0087% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicDistribution.java:9` |
| 486 | `weighed` | 0.0043% | 13 | 23.1% | 0.0141% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomies.java:34` |
| 487 | `spells` | 0.0043% | 12 | 33.3% | 0.0130% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/TypeInitials.java:8` |
| 488 | `capitals` | 0.0043% | 11 | 36.4% | 0.0119% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 489 | `partitions` | 0.0042% | 10 | 10.0% | 0.0109% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 490 | `script` | 0.0042% | 27 | 48.1% | 0.0293% | 0.0029% | 0.0088% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:46` |
| 491 | `extracted` | 0.0042% | 12 | 58.3% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 492 | `merged` | 0.0042% | 12 | 91.7% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:26` |
| 493 | `unit` | 0.0042% | 55 | 27.3% | 0.0597% | 0.0122% | 0.0282% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 494 | `sides` | 0.0042% | 21 | 9.5% | 0.0228% | 0.0054% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingChanges.java:27` |
| 495 | `meanings` | 0.0041% | 12 | 16.7% | 0.0130% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 496 | `attribution` | 0.0041% | 11 | 27.3% | 0.0119% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 497 | `publishing` | 0.0041% | 16 | 6.3% | 0.0174% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 498 | `manifest` | 0.0040% | 25 | 56.0% | 0.0271% | 0.0009% | 0.0079% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 499 | `quoted` | 0.0040% | 17 | 23.5% | 0.0185% | 0.0023% | 0.0035% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 500 | `outcome` | 0.0040% | 18 | 11.1% | 0.0195% | 0.0040% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 501 | `meant` | 0.0040% | 22 | 9.1% | 0.0239% | 0.0062% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 502 | `quantity` | 0.0040% | 14 | 71.4% | 0.0152% | 0.0022% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSourceErrorToleranceTest.java:38` |
| 503 | `accumulator` | 0.0039% | 13 | 76.9% | 0.0141% | 0.0000% | 0.0018% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 504 | `coordinate` | 0.0039% | 13 | 30.8% | 0.0141% | 0.0014% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:49` |
| 505 | `fold` | 0.0039% | 15 | 40.0% | 0.0163% | 0.0014% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/MarkdownRendering.java:70` |
| 506 | `identifier` | 0.0039% | 78 | 29.5% | 0.0847% | 0.0006% | 0.0471% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:53` |
| 507 | `removes` | 0.0039% | 11 | 18.2% | 0.0119% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 508 | `coverage` | 0.0039% | 18 | 33.3% | 0.0195% | 0.0042% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 509 | `stops` | 0.0039% | 14 | 7.1% | 0.0152% | 0.0023% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 510 | `follows` | 0.0039% | 19 | 5.3% | 0.0206% | 0.0047% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 511 | `admitted` | 0.0039% | 17 | 52.9% | 0.0185% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 512 | `categories` | 0.0038% | 17 | 11.8% | 0.0185% | 0.0037% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 513 | `step` | 0.0038% | 30 | 16.7% | 0.0326% | 0.0093% | 0.0114% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:10` |
| 514 | `000` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:30` |
| 515 | `12` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:8` |
| 516 | `category's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:5` |
| 517 | `concept's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:70` |
| 518 | `inflections` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 519 | `initialisms` | 0.0038% | 7 | 85.7% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:42` |
| 520 | `language's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:31` |
| 521 | `library's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:29` |
| 522 | `narrowest` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 523 | `omits` | 0.0038% | 7 | 28.6% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:11` |
| 524 | `phrase's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedRuns.java:5` |
| 525 | `refusals` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:37` |
| 526 | `stylesheet` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:23` |
| 527 | `subject's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 528 | `sunburst` | 0.0038% | 7 | 42.9% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomySunburst.java:23` |
| 529 | `svg` | 0.0038% | 7 | 57.1% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/PublishedFormat.java:24` |
| 530 | `tika's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/MatchedFixture.java:17` |
| 531 | `tree's` | 0.0038% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:57` |
| 532 | `unsegmented` | 0.0038% | 7 | 100.0% | 0.0076% | 0.0000% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenterTest.java:52` |
| 533 | `extracts` | 0.0038% | 10 | 30.0% | 0.0109% | 0.0007% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/ReachedSubjectTest.java:17` |
| 534 | `decide` | 0.0038% | 17 | 5.9% | 0.0185% | 0.0038% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 535 | `nowhere` | 0.0038% | 12 | 25.0% | 0.0130% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ChangeReport.java:32` |
| 536 | `happens` | 0.0038% | 18 | 5.6% | 0.0195% | 0.0043% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 537 | `reach` | 0.0038% | 26 | 34.6% | 0.0282% | 0.0090% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/Descendants.java:90` |
| 538 | `reached` | 0.0038% | 24 | 29.2% | 0.0261% | 0.0078% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 539 | `meaning` | 0.0038% | 26 | 23.1% | 0.0282% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 540 | `distinguishing` | 0.0038% | 10 | 50.0% | 0.0109% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:90` |
| 541 | `separates` | 0.0037% | 10 | 20.0% | 0.0109% | 0.0008% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 542 | `registry` | 0.0037% | 29 | 17.2% | 0.0315% | 0.0010% | 0.0110% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:44` |
| 543 | `produced` | 0.0037% | 31 | 6.5% | 0.0337% | 0.0123% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 544 | `reference` | 0.0037% | 128 | 44.5% | 0.1390% | 0.0064% | 0.0906% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:19` |
| 545 | `honest` | 0.0037% | 14 | 0.0% | 0.0152% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:47` |
| 546 | `median` | 0.0037% | 14 | 50.0% | 0.0152% | 0.0025% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ChanceExpectedBest.java:3` |
| 547 | `cc` | 0.0037% | 10 | 0.0% | 0.0109% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:51` |
| 548 | `somewhere` | 0.0037% | 14 | 14.3% | 0.0152% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 549 | `guess` | 0.0036% | 15 | 13.3% | 0.0163% | 0.0030% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/StatedExclusions.java:11` |
| 550 | `5` | 0.0036% | 10 | 0.0% | 0.0109% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/RankedWordTable.java:12` |
| 551 | `punctuation` | 0.0036% | 10 | 20.0% | 0.0109% | 0.0005% | 0.0009% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 552 | `splits` | 0.0036% | 16 | 18.8% | 0.0174% | 0.0007% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 553 | `publish` | 0.0036% | 15 | 33.3% | 0.0163% | 0.0017% | 0.0031% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CitedWord.java:10` |
| 554 | `weakest` | 0.0036% | 9 | 22.2% | 0.0098% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 555 | `committed` | 0.0035% | 20 | 5.0% | 0.0217% | 0.0058% | 0.0044% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:12` |
| 556 | `ambiguous` | 0.0035% | 14 | 14.3% | 0.0152% | 0.0010% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FileTopics.java:10` |
| 557 | `excluded` | 0.0035% | 14 | 50.0% | 0.0152% | 0.0016% | 0.0026% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:102` |
| 558 | `chart` | 0.0035% | 14 | 50.0% | 0.0152% | 0.0026% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:22` |
| 559 | `both` | 0.0035% | 128 | 9.4% | 0.1390% | 0.0917% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 560 | `enough` | 0.0035% | 44 | 15.9% | 0.0478% | 0.0221% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchorTest.java:63` |
| 561 | `first` | 0.0034% | 199 | 32.7% | 0.2160% | 0.1539% | 0.1571% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 562 | `confidence` | 0.0034% | 18 | 33.3% | 0.0195% | 0.0049% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:7` |
| 563 | `sources` | 0.0033% | 23 | 56.5% | 0.0250% | 0.0079% | 0.0040% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedWords.java:23` |
| 564 | `thousand` | 0.0033% | 14 | 7.1% | 0.0152% | 0.0029% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 565 | `archives` | 0.0033% | 11 | 63.6% | 0.0119% | 0.0015% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FieldOfStudy.java:63` |
| 566 | `antonymous` | 0.0033% | 6 | 100.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:98` |
| 567 | `apostrophe` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 568 | `caller's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 569 | `capitalisation` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:76` |
| 570 | `composes` | 0.0033% | 6 | 50.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:22` |
| 571 | `derivational` | 0.0033% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:18` |
| 572 | `dumps` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WiktionaryExtraction.java:44` |
| 573 | `fibo's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/FiboConcepts.java:9` |
| 574 | `furthest` | 0.0033% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:15` |
| 575 | `hypernyms` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedSenses.java:93` |
| 576 | `inventing` | 0.0033% | 6 | 16.7% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:7` |
| 577 | `list's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedTaxonomy.java:23` |
| 578 | `open_class` | 0.0033% | 6 | 33.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/DictionaryWords.java:42` |
| 579 | `permuted` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/FunctionPlacement.java:30` |
| 580 | `project's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 581 | `rarest` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:51` |
| 582 | `reproducible` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFacts.java:6` |
| 583 | `statistic's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:17` |
| 584 | `toolchain` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:21` |
| 585 | `type's` | 0.0033% | 6 | 0.0% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 586 | `unreached` | 0.0033% | 6 | 83.3% | 0.0065% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyBranch.java:48` |
| 587 | `carriers` | 0.0033% | 11 | 54.5% | 0.0119% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CarrierConcentration.java:42` |
| 588 | `defines` | 0.0033% | 11 | 36.4% | 0.0119% | 0.0016% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivTaxonomy.java:11` |
| 589 | `links` | 0.0033% | 16 | 62.5% | 0.0174% | 0.0040% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingWalkthrough.java:9` |
| 590 | `unchanged` | 0.0032% | 10 | 20.0% | 0.0109% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 591 | `rankings` | 0.0032% | 10 | 100.0% | 0.0109% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RepositoryThemes.java:20` |
| 592 | `agree` | 0.0032% | 17 | 11.8% | 0.0185% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/RepositoryReading.java:34` |
| 593 | `distinctive` | 0.0032% | 12 | 66.7% | 0.0130% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:164` |
| 594 | `settle` | 0.0032% | 12 | 16.7% | 0.0130% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/summary/ReadingSummary.java:36` |
| 595 | `behaviour` | 0.0032% | 17 | 64.7% | 0.0185% | 0.0047% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 596 | `defect` | 0.0032% | 9 | 11.1% | 0.0098% | 0.0009% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/name/TokeniserTest.java:81` |
| 598 | `thresholds` | 0.0031% | 9 | 77.8% | 0.0098% | 0.0005% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:12` |
| 600 | `boundaries` | 0.0031% | 13 | 30.8% | 0.0141% | 0.0026% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 601 | `seam` | 0.0031% | 8 | 12.5% | 0.0087% | 0.0006% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 602 | `applies` | 0.0030% | 13 | 0.0% | 0.0141% | 0.0027% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:85` |
| 604 | `covers` | 0.0030% | 15 | 20.0% | 0.0163% | 0.0038% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 605 | `percentage` | 0.0030% | 14 | 28.6% | 0.0152% | 0.0033% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/DivergenceShare.java:5` |
| 606 | `recorded` | 0.0030% | 24 | 20.8% | 0.0261% | 0.0083% | 0.0092% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:16` |
| 607 | `weighted` | 0.0030% | 9 | 22.2% | 0.0098% | 0.0010% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisVote.java:5` |
| 608 | `spelling` | 0.0029% | 10 | 10.0% | 0.0109% | 0.0015% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:21` |
| 609 | `distinguishes` | 0.0029% | 8 | 25.0% | 0.0087% | 0.0007% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceTest.java:28` |
| 611 | `resting` | 0.0029% | 9 | 33.3% | 0.0098% | 0.0011% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:16` |
| 612 | `jvm` | 0.0029% | 18 | 5.6% | 0.0195% | 0.0000% | 0.0057% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/ReportFolder.java:7` |
| 613 | `choosing` | 0.0029% | 12 | 0.0% | 0.0130% | 0.0025% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:3` |
| 614 | `otherwise` | 0.0028% | 18 | 11.1% | 0.0195% | 0.0058% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 615 | `qualified` | 0.0028% | 31 | 67.7% | 0.0337% | 0.0027% | 0.0145% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:68` |
| 616 | `gives` | 0.0028% | 23 | 47.8% | 0.0250% | 0.0090% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 617 | `tagged` | 0.0028% | 10 | 10.0% | 0.0109% | 0.0016% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseDomains.java:42` |
| 618 | `asserted` | 0.0028% | 9 | 0.0% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:42` |
| 619 | `lowercase` | 0.0028% | 7 | 0.0% | 0.0076% | 0.0000% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 620 | `uniform` | 0.0027% | 12 | 16.7% | 0.0130% | 0.0026% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PermutationNull.java:64` |
| 621 | `blob` | 0.0027% | 39 | 46.2% | 0.0423% | 0.0000% | 0.0207% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/BlobOrigin.java:9` |
| 622 | `statement` | 0.0027% | 60 | 30.0% | 0.0651% | 0.0125% | 0.0374% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:10` |
| 623 | `implied` | 0.0027% | 9 | 33.3% | 0.0098% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 624 | `speaks` | 0.0027% | 11 | 0.0% | 0.0119% | 0.0021% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SenseCoverage.java:6` |
| 625 | `mit` | 0.0027% | 8 | 0.0% | 0.0087% | 0.0008% | 0.0000% | `NOTICE.md:17` |
| 626 | `abbreviations` | 0.0027% | 7 | 85.7% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/BundledCitations.java:40` |
| 627 | `29` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 628 | `6` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/ClassFileMethods.java:22` |
| 629 | `972` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `README.md:45` |
| 630 | `accumulates` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 631 | `author's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:137` |
| 632 | `broadest` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedAncestry.java:9` |
| 633 | `caveat` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ScopeDivergence.java:25` |
| 634 | `cc0` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/WikidataInitialismExtraction.java:18` |
| 635 | `corroborating` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 636 | `cso's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:41` |
| 637 | `fetches` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/EvaluationClonesTest.java:31` |
| 638 | `generalisation` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/LemmaRuns.java:8` |
| 639 | `gradle` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/HostTree.java:6` |
| 640 | `jsonl` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/AbbreviationSenses.java:14` |
| 641 | `jwnl` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:47` |
| 642 | `load_bearing` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 643 | `name's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/DeclaredTypeWords.java:13` |
| 644 | `nist's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTree.java:11` |
| 645 | `noun_phrase` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:64` |
| 646 | `obeys` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedSiblings.java:6` |
| 647 | `outranks` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/ContentWords.java:9` |
| 648 | `own_right` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/SenseRuns.java:10` |
| 649 | `qlever` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 650 | `sparql` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:15` |
| 651 | `standard's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:12` |
| 652 | `tallied` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/LegibilityTally.java:16` |
| 653 | `uax` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 654 | `unbundled` | 0.0027% | 5 | 20.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportCommand.java:39` |
| 655 | `unsound` | 0.0027% | 5 | 80.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/JavaSource.java:28` |
| 656 | `vocabulary's` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/OpenSpaceAccumulator.java:9` |
| 657 | `wedges` | 0.0027% | 5 | 60.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyPage.java:17` |
| 658 | `ρ` | 0.0027% | 5 | 0.0% | 0.0054% | 0.0000% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/RankCorrelation.java:7` |
| 659 | `guessed` | 0.0027% | 7 | 0.0% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordSegmenter.java:8` |
| 660 | `endpoint` | 0.0027% | 12 | 66.7% | 0.0130% | 0.0006% | 0.0026% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/QleverWikidata.java:24` |
| 661 | `reason` | 0.0027% | 40 | 7.5% | 0.0434% | 0.0119% | 0.0216% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:11` |
| 662 | `cheapest` | 0.0027% | 8 | 37.5% | 0.0087% | 0.0009% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:66` |
| 663 | `turns` | 0.0027% | 14 | 7.1% | 0.0152% | 0.0037% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 664 | `observation` | 0.0027% | 11 | 27.3% | 0.0119% | 0.0022% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 665 | `preamble` | 0.0027% | 8 | 100.0% | 0.0087% | 0.0000% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroborationReport.java:33` |
| 666 | `lexical` | 0.0027% | 11 | 0.0% | 0.0119% | 0.0006% | 0.0022% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameForm.java:3` |
| 667 | `scores` | 0.0027% | 12 | 16.7% | 0.0130% | 0.0027% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignals.java:9` |
| 668 | `quotations` | 0.0026% | 7 | 71.4% | 0.0076% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicWitnesses.java:44` |
| 670 | `declarations` | 0.0026% | 9 | 44.4% | 0.0098% | 0.0006% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolContext.java:8` |
| 671 | `drops` | 0.0026% | 10 | 60.0% | 0.0109% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/UnreadWords.java:7` |
| 672 | `verdict` | 0.0026% | 9 | 88.9% | 0.0098% | 0.0014% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/DescriptionLengthReport.java:48` |
| 673 | `checkout` | 0.0026% | 7 | 28.6% | 0.0076% | 0.0006% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/PinnedClone.java:14` |
| 674 | `closes` | 0.0026% | 8 | 12.5% | 0.0087% | 0.0009% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/NameOccurrence.java:43` |
| 675 | `joins` | 0.0026% | 9 | 44.4% | 0.0098% | 0.0014% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:26` |
| 676 | `answering` | 0.0026% | 8 | 25.0% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 677 | `segments` | 0.0026% | 10 | 80.0% | 0.0109% | 0.0018% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/SourceAnchor.java:63` |
| 678 | `quoting` | 0.0026% | 8 | 12.5% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/MarkdownSource.java:8` |
| 679 | `sentinel` | 0.0026% | 7 | 28.6% | 0.0076% | 0.0006% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/AxisResolution.java:3` |
| 680 | `settled` | 0.0026% | 12 | 8.3% | 0.0130% | 0.0028% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 681 | `holding` | 0.0025% | 17 | 29.4% | 0.0185% | 0.0057% | 0.0018% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermSpans.java:11` |
| 682 | `sit` | 0.0025% | 14 | 7.1% | 0.0152% | 0.0040% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:14` |
| 683 | `everyday` | 0.0025% | 12 | 16.7% | 0.0130% | 0.0029% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/CorroboratedTerms.java:9` |
| 684 | `pins` | 0.0025% | 8 | 25.0% | 0.0087% | 0.0010% | 0.0000% | `code-semantics-api/src/test/java/io/github/fiftieshousewife/codesemantics/repository/RepositoryFactsTest.java:75` |
| 685 | `nests` | 0.0025% | 7 | 71.4% | 0.0076% | 0.0006% | 0.0000% | `lexicon-extraction/src/main/java/io/github/fiftieshousewife/bi/lexicon/extraction/ArxivConcepts.java:29` |
| 686 | `rare` | 0.0025% | 16 | 43.8% | 0.0174% | 0.0052% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:46` |
| 687 | `denotes` | 0.0025% | 7 | 42.9% | 0.0076% | 0.0007% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/OfferedWords.java:8` |
| 688 | `behind` | 0.0024% | 32 | 18.8% | 0.0347% | 0.0164% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 689 | `branding` | 0.0024% | 8 | 37.5% | 0.0087% | 0.0011% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 690 | `stand` | 0.0024% | 19 | 5.3% | 0.0206% | 0.0073% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WholeWords.java:3` |
| 691 | `winner` | 0.0024% | 15 | 33.3% | 0.0163% | 0.0048% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:109` |
| 693 | `pointed` | 0.0024% | 12 | 0.0% | 0.0130% | 0.0031% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSummary.java:6` |
| 694 | `arithmetic` | 0.0024% | 8 | 12.5% | 0.0087% | 0.0011% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 695 | `adds` | 0.0024% | 12 | 25.0% | 0.0130% | 0.0031% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/repository/PullRequestFacts.java:8` |
| 696 | `restriction` | 0.0023% | 8 | 37.5% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/TermIndex.java:53` |
| 697 | `choice` | 0.0023% | 22 | 22.7% | 0.0239% | 0.0094% | 0.0044% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:27` |
| 698 | `spread` | 0.0023% | 17 | 35.3% | 0.0185% | 0.0061% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Weights.java:21` |
| 700 | `difference` | 0.0023% | 21 | 4.8% | 0.0228% | 0.0088% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:48` |
| 701 | `jackson` | 0.0023% | 12 | 0.0% | 0.0130% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 703 | `describes` | 0.0023% | 13 | 61.5% | 0.0141% | 0.0038% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/SubjectAreas.java:48` |
| 704 | `judgement` | 0.0023% | 8 | 0.0% | 0.0087% | 0.0012% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:61` |
| 705 | `stood` | 0.0023% | 12 | 33.3% | 0.0130% | 0.0032% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedPlacement.java:20` |
| 706 | `divides` | 0.0023% | 7 | 14.3% | 0.0076% | 0.0008% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/ParsedRepository.java:74` |
| 708 | `adjacent` | 0.0023% | 10 | 0.0% | 0.0109% | 0.0022% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/reading/IdentifierWords.java:10` |
| 709 | `forms` | 0.0023% | 22 | 31.8% | 0.0239% | 0.0096% | 0.0004% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/Thresholds.java:24` |
| 710 | `claims` | 0.0022% | 19 | 26.3% | 0.0206% | 0.0076% | 0.0009% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/Vocabulary.java:42` |
| 711 | `synonym` | 0.0022% | 6 | 16.7% | 0.0065% | 0.0005% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/TopicCitations.java:10` |
| 712 | `failing` | 0.0022% | 10 | 10.0% | 0.0109% | 0.0023% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ReadingExport.java:26` |
| 714 | `shorter` | 0.0022% | 10 | 30.0% | 0.0109% | 0.0023% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/WordMorphology.java:32` |
| 715 | `agreeing` | 0.0022% | 7 | 71.4% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:199` |
| 716 | `identifies` | 0.0022% | 8 | 37.5% | 0.0087% | 0.0013% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 768 | `agrees` | 0.0022% | 8 | 37.5% | 0.0087% | 0.0013% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 770 | `argues` | 0.0022% | 10 | 10.0% | 0.0109% | 0.0023% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 771 | `leads` | 0.0022% | 14 | 21.4% | 0.0152% | 0.0046% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/pipeline/AxisEvidenceAccumulator.java:61` |
| 772 | `linguistics` | 0.0022% | 7 | 0.0% | 0.0076% | 0.0009% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/PhraseTopics.java:11` |
| 773 | `rolls` | 0.0021% | 8 | 75.0% | 0.0087% | 0.0014% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/term/TaxonomyTreeTest.java:57` |
| 774 | `spaces` | 0.0021% | 13 | 15.4% | 0.0141% | 0.0041% | 0.0022% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:53` |
| 775 | `yields` | 0.0021% | 9 | 0.0% | 0.0098% | 0.0019% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/behaviour/Behaviours.java:17` |
| 776 | `computation` | 0.0021% | 7 | 14.3% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/theme/PinnedSubjectFindings.java:32` |
| 777 | `stem` | 0.0021% | 10 | 30.0% | 0.0109% | 0.0024% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CompoundParses.java:10` |
| 778 | `place` | 0.0021% | 81 | 28.4% | 0.0879% | 0.0589% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/symbol/SymbolPipelineStage.java:5` |
| 779 | `prominence` | 0.0021% | 7 | 28.6% | 0.0076% | 0.0010% | 0.0000% | `code-semantics-engine/src/test/java/io/github/fiftieshousewife/codesemantics/engine/reading/CitedTokenCatalogueTest.java:15` |
| 780 | `scoring` | 0.0021% | 11 | 27.3% | 0.0119% | 0.0030% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedSignal.java:5` |
</details>

### What the language supplied

| # | Word | Claim | Occurrences | In names | Here | In ordinary English | In the platform's own API | First seen |
|--:|---|--:|--:|--:|--:|--:|--:|---|
| 6 | `what` | 0.2460% | 868 | 9.8% | 0.9423% | 0.1344% | 0.0040% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 13 | `rather` | 0.1681% | 414 | 18.1% | 0.4494% | 0.0241% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 27 | `than` | 0.1014% | 535 | 18.5% | 0.5808% | 0.1446% | 0.0106% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/Citation.java:8` |
| 38 | `where` | 0.0738% | 379 | 20.6% | 0.4114% | 0.0994% | 0.0075% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 49 | `beside` | 0.0560% | 112 | 25.9% | 0.1216% | 0.0014% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/Tokeniser.java:8` |
| 63 | `cannot` | 0.0415% | 128 | 7.8% | 0.1390% | 0.0150% | 0.0035% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptVote.java:8` |
| 65 | `not` | 0.0408% | 640 | 17.7% | 0.6948% | 0.3534% | 0.1355% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 70 | `itself` | 0.0389% | 121 | 27.3% | 0.1314% | 0.0145% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSourceType.java:3` |
| 74 | `against` | 0.0380% | 221 | 13.6% | 0.2399% | 0.0658% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:5` |
| 88 | `how` | 0.0320% | 267 | 6.0% | 0.2899% | 0.1060% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 95 | `because` | 0.0303% | 237 | 8.9% | 0.2573% | 0.0900% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptId.java:5` |
| 96 | `whose` | 0.0302% | 89 | 12.4% | 0.0966% | 0.0093% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 99 | `never` | 0.0297% | 154 | 11.0% | 0.1672% | 0.0408% | 0.0013% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:14` |
| 104 | `whether` | 0.0288% | 125 | 4.0% | 0.1357% | 0.0267% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/CitedTokens.java:3` |
| 106 | `which` | 0.0285% | 470 | 2.1% | 0.5102% | 0.2650% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/EvidenceSource.java:3` |
| 138 | `com` | 0.0225% | 45 | 0.0% | 0.0489% | 0.0006% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportFile.java:8` |
| 141 | `beneath` | 0.0218% | 49 | 20.4% | 0.0532% | 0.0018% | 0.0000% | `code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/export/ExportedReading.java:35` |
| 150 | `exactly` | 0.0206% | 61 | 8.2% | 0.0662% | 0.0065% | 0.0004% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/model/PooledLogOdds.java:36` |
| 176 | `them` | 0.0179% | 240 | 7.1% | 0.2605% | 0.1239% | 0.0000% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/concept/ConceptEvidence.java:6` |
| 178 | `per` | 0.0176% | 137 | 15.3% | 0.1487% | 0.0519% | 0.0114% | `code-semantics-api/src/main/java/io/github/fiftieshousewife/codesemantics/name/PieceCost.java:19` |

### What a count on its own would have said

| Written most | Occurrences | Its place once the references are asked |
|---|--:|--:|
| `the` | 6,279 | 3,951 |
| `a` | 4,771 | 1 |
| `is` | 2,691 | 19 |
| `and` | 2,021 | 3,899 |
| `it` | 1,842 | 7 |
| `of` | 1,823 | 3,965 |
| `one` | 1,123 | 5 |
| `word` | 1,093 | 2 |
| `that` | 972 | 2,504 |
| `in` | 884 | 3,889 |
| `what` | 868 | 6 |
| `to` | 855 | 3,960 |
| `as` | 796 | 1,185 |
| `its` | 745 | 18 |
| `by` | 643 | 426 |
| `so` | 641 | 21 |
| `not` | 640 | 65 |
| `reading` | 638 | 3 |
| `words` | 638 | 4 |
| `for` | 553 | 3,908 |
