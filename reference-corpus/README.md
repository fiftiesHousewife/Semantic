# The reference corpus table

How densely working Java writes each word. A reading compares the words a repository declares against these figures to tell the words its authors chose from the words every Java repository uses. This module holds the bundled table and the class that reads it, and nothing else.

- [`reference-corpus-shares.tsv`](src/main/resources/reference-corpus-shares.tsv) — one row per word, carrying the manifest that drew the repositories it was pooled from.
- [`PooledWordShares`](src/main/java/io/github/fiftieshousewife/codesemantics/reference/PooledWordShares.java) — reads that table and normalises it.
- [`reference-corpus-run-shares.tsv`](src/main/resources/reference-corpus-run-shares.tsv) — the same hundred repositories counted in runs of words rather than in single words.
- [`PooledRunShares`](src/main/java/io/github/fiftieshousewife/codesemantics/reference/PooledRunShares.java) and [`RunRanks`](src/main/java/io/github/fiftieshousewife/codesemantics/reference/RunRanks.java) — read that second table, as shares and as ranks.

The table is drawn and pooled by [the corpus draw](../reference-corpus-extraction/README.md), which reaches the network and reads whole working trees. This module is published to consumers and does neither.

## What a reading does with it

A word frequency table for English lists how often each word appears across a large body of text: `the` at roughly one word in twenty, `notional` at around one in a hundred thousand. It is what separates a distinctive word from a common one. `notional` appearing three times in a document tells you what the document is about; `the` appearing three hundred times tells you nothing, because every document does that.

**Java source has its own frequencies, and they are not English's.** `list`, `get`, `value`, `id` and `impl` are to Java roughly what `the` and `of` are to English — every repository declares them constantly, so declaring them says nothing about any one repository. English frequency tables call several of those words rare, which is exactly backwards for code.

No published frequency table exists for Java identifiers. This is that table.

The library reads a repository and reports which of the words its authors declared carry evidence about what it is for. Each word is compared against how densely other code writes it, across three references, and each answers a different objection.

| Reference | What it holds | What it settles |
|---|---|---|
| ordinary English | word frequencies in general English | `notional` is rare in English and rare in Java, so a repository writing it has said something |
| [the platform's own API](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/PlatformVocabulary.java) | the type names the Java platform declares — `List`, `Map`, `Stream`, `Buffer` | English calls `buffer` rare, which makes it look chosen. The platform declares it, so writing it says only that this is a Java program |
| **this table** | the words a hundred working repositories declare | `get`, `id` and `buf` are rare in English and are **not** platform type names, so neither reference above explains them. Working Java writes them constantly |

The third row is why this table exists. Without it `get` and `id` outrank a repository's real subject vocabulary, because both of the other references agree they are rare.

Worked example. A repository declares 30,000 names in total.

| Word | Declared here | Share here | Share in the corpus | What the reading reports |
|---|--:|--:|--:|---|
| `list` | 120 | 0.0040 | 0.0041 | Nothing. Working Java writes it just as densely, so the count carries no evidence about this repository |
| `trade` | 180 | 0.0060 | 0.0001 | Sixty times as dense as working Java. The authors chose this word, and it names what the repository is for |
| `buffer` | 300 | 0.0100 | 0.0020 | Five times as dense. Reported, below `trade` |

Without the corpus, `list` and `trade` are a count of 120 against a count of 180 and the reading has no way to prefer either. The corpus is what makes `trade` the stronger claim.

The comparison runs the same way for every word the repository declares, and the words are ordered by how far apart the two shares sit.

## What "pooled into one distribution" means

Each drawn repository is read on its own first. Its declared names are counted, and each count is divided by that repository's total, giving the **share** of that repository's vocabulary the word occupies. Pooling then combines those per-repository shares into a single column of figures that sums to one across every word in the table. A column summing to one is a probability distribution, which is what lets it be compared with another repository's distribution.

Two repositories can be combined in two ways, and they answer different questions.

Worked example. Repository A declares 10,000 names, 100 of them `buffer`. Repository B declares 1,000 names, 5 of them `buffer`.

| Weighting | Arithmetic | `buffer` |
|---|---|--:|
| pooled occurrences | (100 + 5) ÷ (10,000 + 1,000) | 0.00955 |
| mean of shares | (100/10,000 + 5/1,000) ÷ 2 | 0.00750 |

Pooled occurrences gives every occurrence equal weight, so A sets ten times as much of the figure as B and the result sits near A's own rate of 0.010. The mean of shares gives every repository equal weight, so A and B count once each and the result sits between their two rates.

**This table is the mean of shares.** The frame draws repositories at random, not bytes, so a repository is the unit that was sampled and a repository is the unit that should weigh one. Under pooled occurrences a single large repository can set a word's figure for the whole corpus.

Both weightings sum to one. Each repository's own shares sum to one, so summing them across a hundred repositories gives a hundred, and dividing by the repository count gives one.

## The second table: runs of words

A **run** is several words a publisher states as one entry — `time zone`, `interest rate swap`, `buffer overflow`. The word table answers whether an author chose a word; this table answers whether a publisher's own term is that publisher's vocabulary or is what every Java repository writes anyway.

The question arises because a term vocabulary matches a repository on terms that are not its own. FpML publishes `TimeZone`, `MimeType`, `ResourceType` and `CountryCode` beside `CapFloor`, `FixedLeg`, `SwapLeg`, `FloatingLeg` and `AccrualPeriod`. A matcher counting all nine reads FpML into a text-extraction toolkit as readily as into a derivatives library. The table separates them.

| Run | Occurrences in the hundred repositories |
|---|--:|
| `time_zone` | 446 |
| `mime_type` | 165 |
| `task_id` | 160 |
| `resource_type` | 51 |
| `pass_through` | 32 |
| `country_code` | 11 |
| `cap_floor`, `fixed_leg`, `swap_leg`, `floating_leg`, `accrual_period` | none |

**Three differences from the word table, each with its reason.**

| | The word table | The run table |
|---|---|---|
| what a row is keyed by | a word the splitter produced | those words joined by `_`, where a publisher states the run |
| which reading merged the words | [`CollocatedWords`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/CollocatedWords.java), over the two topical dictionaries | [`StatedRuns`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/theme/StatedRuns.java), over those two and the seven bundled term vocabularies' multi-word labels |
| what a share is a share of | every unit a reading produces | the runs alone, so a run's rank is a rank among runs |

The middle row is the one that matters, and it differs twice.

**Which publishers were asked.** Two adjacent words are merged into one run only where a publisher states that run, so the index decides what the table can see. Under the dictionaries alone, `cap_floor` is never merged, never counted, and reads as absent from the corpus — which is the answer the table is meant to earn rather than assume. Under an index that also states the vocabularies' own labels, an absence is a measurement.

**And whether the run's edge words had to be in the dictionary.** `CollocatedWords` refuses a run whose first or last word WordNet carries no entry for. It refuses it because merging a run stops the words inside it being counted on their own, and a run no resource labels then votes for no subject, so the reading loses both. A table that counts votes for nothing, so it needs no such rule — and under that rule the table holds no row for `TaskId`, `PassThrough` or `XMLEntityExpansion`, which reads as an absence and is not one. `StatedRuns` drops the edge rule for that reason, and because the other side of the comparison has no edge rule either: a published term is matched against a declared name over the words the splitter produced, so the table those matches are ranked against is counted the same way.

**Nothing in the word arm reads it.** The word table is untouched, its 28,839 rows unchanged, and a word's rank is what it was. The run table is read only where a published term is judged against general Java.

## How to use it

```java
final PooledWordShares corpus = PooledWordShares.fromClasspath();
final double density = corpus.shareOf("buffer");
```

| Method | Answers |
|---|---|
| `fromClasspath()` | the table this library bundles |
| `at(Path)` | a candidate table on disk, so it can be measured before anything decides to bundle it |
| `shareByWord()` | the whole distribution, as shares summing to one |
| `shareOf(String)` | one word's share, and zero for a word the corpus never wrote |
| `occurrencesOf(String)` | how many times the pooled repositories declared it, independent of the weighting |

`PooledRunShares` answers the same four over runs, and `RunRanks.rank(String)` gives a run's row in the table, where `RunRanks.UNKNOWN_RANK` marks a run the corpus never wrote.

The engine wraps it as [`CorpusVocabulary`](../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/vocabulary/CorpusVocabulary.java), which presents it to a reading as one reference beside ordinary English and the Java platform's API index.

## What the tables hold

| Column | Holds |
|---|---|
| `word`, or `run` | the word as the identifier splitter produced it, from a name a repository declared; in the run table, several such words joined by `_` |
| `occurrences` | how many times the pooled repositories declared it, summed over all of them and independent of the weighting |
| `share` | the mean of shares, in exponent notation |
| `error` | the standard error of that share under the table's own weighting |

A row reading `buffer<TAB>1234<TAB>2.000e-03` states 1,234 occurrences across the pooled repositories and a share of 0.002: two words in every thousand a drawn repository declares.

**The shares are written rounded, so `PooledWordShares` normalises them on reading.** A divergence is taken between distributions, and a column summing to 0.9998 is not one.

The file's header carries the drawing manifest whole — the frame, the seed, the publication test, and one comment row per pinned repository. A restatement goes stale against the file it describes; a copy cannot. [`VocabularyProvenanceTest`](../lexicon/src/test/java/io/github/fiftieshousewife/bi/lexicon/VocabularyProvenanceTest.java) covers this module's resources and fails the build for a bundled file carrying no provenance header.

## Definitions

**Share** — the fraction of a repository's declared names that one word occupies. `buffer` at 100 occurrences among 10,000 names has a share of 0.010.

**Distribution** — a column of shares summing to one across every word. Two distributions can be compared by a divergence; two columns of raw counts cannot.

**Denominator** — what a word's density here is compared against to say whether the author chose it. A word this repository writes at the rate a hundred working repositories write it carries no evidence about this repository.

**Seed** — the number that fixes which repositories the sample contains. The draw picks repositories by generating a sequence of positions in the frame with a [Mersenne Twister](https://dl.acm.org/doi/10.1145/272991.272995) pseudo-random generator, and that generator produces the same sequence every time from the same starting number. Seeded at 20260821, its first value below the frame's 4,154,178 repositories is 4,140,166, and it produces the same value on any machine that runs it. So the sample is unrelated to subject matter, and anybody can check that these repositories are the ones the seed selects. Choosing repositories one at a time, or re-running the draw until it looked right, would leave no such check.

**Run** — several adjacent words some publisher states as one entry, so that a reading counts them once instead of counting each. `time zone` is a [WordNet](https://wordnet.princeton.edu/) entry; `interest rate swap` is a [FIBO](https://spec.edmcouncil.org/fibo/) concept label. Which runs exist is the publishers' answer and never this library's.

**Declared name** — a name a repository's own authors invented: a class, method, field, parameter or local variable. In `public String quoteFor(final LocalDate valuationDate)` the author declared `quoteFor` and `valuationDate`. `public` and `final` are Java's keywords, and `String` and `LocalDate` are names the platform declared and this author quoted. Only declared names are counted, and the parse is what tells them apart.

## Limitations

- **A word absent from the table has a share of zero.** A repository writing it then looks like it chose it. Cutting the tail of this table would promote exactly the words cut, so the table is bundled whole.
- **The table states one draw.** Its own sampling error is measurable by splitting the draw in half and comparing the two tables that result, and the words whose figures move between halves are those whose shares sit near zero.
- **The run table can only count runs some publisher states.** A pair of words no dictionary and no bundled vocabulary carries is never merged, so the table holds no row for it — not because working Java does not write it, but because nothing asked. `WorkingJavaRuns.canBeAsked` is how a reading tells a missing row of that kind from a measured absence, and adding a vocabulary changes what the table can see, so the table is re-pooled with it.
- **Regenerating the table moves every figure a reading publishes.** It is regenerated when the draw changes, and the figures are quoted as a reading of a named commit.

## References

- [GitHub REST API, Search](https://docs.github.com/en/rest/search/search)
- [Lin, Divergence measures based on the Shannon entropy (1991)](https://ieeexplore.ieee.org/document/61115)
- [Matsumoto and Nishimura, Mersenne Twister (1998)](https://dl.acm.org/doi/10.1145/272991.272995)
- [SPDX License List](https://spdx.org/licenses/)
