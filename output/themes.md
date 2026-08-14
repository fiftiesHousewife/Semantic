# Themes — CodeSemantics

What this repository's names are about, read through the two bundled resources that assign a word
to a subject: WordNet Domains, which labels each of a word's senses, and Wiktionary's topic
vocabulary, which labels the headword. Each word occurrence commits one unit of mass per resource,
divided among the readings that resource names, so an ambiguous word does not shout.

A label another label of the same word already implies is not one of those readings. The topic
vocabulary publishes a closure over its own hierarchy — a word labelled `computing` arrives
carrying `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences`
besides — and the hierarchy that derived them, published by the same extractor, is what folds
them back into the label they came from. Nothing is excluded and no list is written: where the
hierarchy is silent, every label the word carries stands.

**Read the ranking below as the weak reading it is.** A topic's intensity over one scope counts
every occurrence of every word, and the commonest words in Java source are also the most
ambiguous ones — `string`, `set`, `map`, `assert`, `of`. Their senses spray mass across subjects
that have nothing to do with this codebase, which is why the witnesses are printed beside every
row: a topic carried by one word is one word's opinion, and the table says so.

The reading worth acting on is the comparison underneath it. A topic written at much the same
density everywhere contributes almost nothing to a divergence, so the ambiguity that dominates a
count cancels in a comparison — and each scope's divergence is judged against the field of
divergences a scope of its own size draws by chance, so a small scope cannot look interesting
merely by being small.

## What the whole repository reads as

Only the topics that **earned a place**: a topic reaches this table where it makes some part of this repository unlike the rest of it — a scope that departed further than the furthest of a field of chance draws — and where more than one word carries it. A topic held at the same density everywhere distinguishes nothing, and a topic one word holds a majority of is that word's opinion. Both bars follow from the reading; neither is a list.

| Topic | ι | From names | References | Leads | Lines led | Share of lines | Carried by |
|---|--:|--:|--:|--:|--:|--:|---|
| `linguistics` | 0.1996 | 79.5% | 3,021 | 107 | 8,653 | 34.4% | `word`&nbsp;1,082 `term`&nbsp;251 `name`&nbsp;437 `parse`&nbsp;102 |
| `computing` | 0.0536 | 81.9% | 4,246 | 22 | 1,564 | 6.2% | `repository`&nbsp;350 `unread`&nbsp;8 `parse`&nbsp;102 `read`&nbsp;576 |

Read over 354 files and 25,185 lines: 465 topics, 1 files no topic could be resolved for, and 34.4% of the repository's lines led by its single strongest topic. ι is a share of topical mass and sums to 1 across every topic; the columns beside it are counts and do not. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

### `code-semantics-api/src/main/java`

**0.1550 bits** from the repository, against a null median of 0.0967 over 999 resamples of the same size — an excess of +0.0584, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.1% | `telecommunication` | 0.0002 | 0.0454 | under | `file`&nbsp;168 `entry`&nbsp;146 `note`&nbsp;9 `record`&nbsp;3 |
| 6.8% | `plants` | 0.0019 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;112 `seed`&nbsp;21 `leaf`&nbsp;12 |
| 6.6% | `physics` | 0.0703 | 0.0209 | **over** | `mass`&nbsp;117 `weight`&nbsp;50 `radius`&nbsp;4 `length`&nbsp;38 |
| 5.7% | `publishing` | 0.0142 | 0.0535 | under | `publish`&nbsp;184 `read`&nbsp;115 `directory`&nbsp;50 `write`&nbsp;355 |
| 5.3% | `electronics` | 0.0009 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;145 `default`&nbsp;24 `node`&nbsp;48 |
| 4.2% | `time_period` | 0.0246 | 0.0034 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;12 |
| 3.1% | `philosophy` | 0.0001 | 0.0103 | under | `describe`&nbsp;35 `lemma`&nbsp;75 `explain`&nbsp;12 `each`&nbsp;21 |
| 2.7% | `lexicography` | 0.0367 | 0.0130 | **over** | `citation`&nbsp;94 `sense`&nbsp;313 `gloss`&nbsp;2 `lemma`&nbsp;75 |

### `code-semantics-api/src/test/java`

**0.1971 bits** from the repository, against a null median of 0.1530 over 999 resamples of the same size — an excess of +0.0441, and 55 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.3% | `telecommunication` | 0.0017 | 0.0454 | under | `file`&nbsp;168 `entry`&nbsp;146 `note`&nbsp;9 `record`&nbsp;3 |
| 6.8% | `plants` | 0.0004 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;112 `seed`&nbsp;21 `leaf`&nbsp;12 |
| 6.4% | `biology` | 0.0384 | 0.0032 | **over** | `morphology`&nbsp;16 `owl`&nbsp;31 `person`&nbsp;20 `glob`&nbsp;5 |
| 6.3% | `literature` | 0.0002 | 0.0265 | under | `header`&nbsp;71 `text`&nbsp;45 `write`&nbsp;355 `title`&nbsp;12 |
| 4.6% | `electronics` | 0.0005 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;145 `default`&nbsp;24 `node`&nbsp;48 |
| 4.1% | `politics` | 0.0553 | 0.0164 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;14 `reading`&nbsp;402 `name`&nbsp;493 |
| 4.0% | `law` | 0.0971 | 0.0425 | **over** | `file`&nbsp;340 `witness`&nbsp;69 `evidence`&nbsp;120 `cite`&nbsp;114 |
| 3.6% | `publishing` | 0.0172 | 0.0535 | under | `publish`&nbsp;184 `read`&nbsp;115 `directory`&nbsp;50 `write`&nbsp;355 |

### `code-semantics-engine/src/main/java`

**0.0612 bits** from the repository, against a null median of 0.0234 over 999 resamples of the same size — an excess of +0.0378, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.4% | `electronics` | 0.0005 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;145 `default`&nbsp;24 `node`&nbsp;48 |
| 10.6% | `chemistry` | 0.0021 | 0.0209 | under | `syn`&nbsp;15 `extraction`&nbsp;50 `extract`&nbsp;7 `test`&nbsp;166 |
| 8.7% | `psychology` | 0.0004 | 0.0127 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;58 `test`&nbsp;166 |
| 5.7% | `grammar` | 0.0516 | 0.0246 | **over** | `phrase`&nbsp;142 `verb`&nbsp;71 `occurrence`&nbsp;114 `clause`&nbsp;24 |
| 3.5% | `linguistics` | 0.2514 | 0.1996 | **over** | `word`&nbsp;1,082 `term`&nbsp;251 `name`&nbsp;437 `parse`&nbsp;102 |
| 2.5% | `politics` | 0.0305 | 0.0164 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;14 `reading`&nbsp;402 `name`&nbsp;493 |
| 2.5% | `computer-languages` | 0.0001 | 0.0038 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;44 |
| 2.4% | `animals` | 0.0015 | 0.0072 | under | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |

### `code-semantics-engine/src/test/java`

**0.0617 bits** from the repository, against a null median of 0.0258 over 999 resamples of the same size — an excess of +0.0359, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.6% | `plants` | 0.0854 | 0.0295 | **over** | `root`&nbsp;97 `tree`&nbsp;112 `seed`&nbsp;21 `leaf`&nbsp;12 |
| 15.6% | `electronics` | 0.0002 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;145 `default`&nbsp;24 `node`&nbsp;48 |
| 8.4% | `chemistry` | 0.0033 | 0.0209 | under | `syn`&nbsp;15 `extraction`&nbsp;50 `extract`&nbsp;7 `test`&nbsp;166 |
| 2.7% | `animals` | 0.0013 | 0.0072 | under | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |
| 2.6% | `computer-languages` | 0.0001 | 0.0038 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;44 |
| 2.5% | `christianity` | 0.0004 | 0.0046 | under | `kind`&nbsp;48 `use`&nbsp;68 `publish`&nbsp;184 `publisher`&nbsp;58 |
| 2.4% | `astrology` | 0.0147 | 0.0057 | **over** | `placement`&nbsp;40 `figure`&nbsp;52 `term`&nbsp;259 `configuration`&nbsp;3 |
| 2.2% | `psychology` | 0.0047 | 0.0127 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;58 `test`&nbsp;166 |

### `lexicon-extraction/src/main/java`

**0.1686 bits** from the repository, against a null median of 0.0561 over 999 resamples of the same size — an excess of +0.1124, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.8% | `linguistics` | 0.0914 | 0.1996 | under | `word`&nbsp;1,082 `term`&nbsp;251 `name`&nbsp;437 `parse`&nbsp;102 |
| 6.9% | `literature` | 0.0847 | 0.0265 | **over** | `header`&nbsp;71 `text`&nbsp;45 `write`&nbsp;355 `title`&nbsp;12 |
| 6.3% | `plants` | 0.0018 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;112 `seed`&nbsp;21 `leaf`&nbsp;12 |
| 5.7% | `animals` | 0.0413 | 0.0072 | **over** | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |
| 5.4% | `grammar` | 0.0014 | 0.0246 | under | `phrase`&nbsp;142 `verb`&nbsp;71 `occurrence`&nbsp;114 `clause`&nbsp;24 |
| 4.5% | `computer-languages` | 0.0283 | 0.0038 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;44 |
| 4.5% | `physics` | 0.0013 | 0.0209 | under | `mass`&nbsp;117 `weight`&nbsp;50 `radius`&nbsp;4 `length`&nbsp;38 |
| 4.0% | `electronics` | 0.0587 | 0.0208 | **over** | `tsv`&nbsp;38 `field`&nbsp;145 `default`&nbsp;24 `node`&nbsp;48 |

### `lexicon-extraction/src/test/java`

**0.1979 bits** from the repository, against a null median of 0.0710 over 999 resamples of the same size — an excess of +0.1270, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.2% | `chemistry` | 0.1461 | 0.0209 | **over** | `syn`&nbsp;15 `extraction`&nbsp;50 `extract`&nbsp;7 `test`&nbsp;166 |
| 15.7% | `electronics` | 0.1281 | 0.0208 | **over** | `tsv`&nbsp;38 `field`&nbsp;145 `default`&nbsp;24 `node`&nbsp;48 |
| 6.1% | `linguistics` | 0.1002 | 0.1996 | under | `word`&nbsp;1,082 `term`&nbsp;251 `name`&nbsp;437 `parse`&nbsp;102 |
| 3.6% | `physics` | 0.0015 | 0.0209 | under | `mass`&nbsp;117 `weight`&nbsp;50 `radius`&nbsp;4 `length`&nbsp;38 |
| 3.3% | `person` | 0.0028 | 0.0231 | under | `reader`&nbsp;97 `child`&nbsp;19 `host`&nbsp;27 `bearer`&nbsp;18 |
| 3.0% | `lexicography` | 0.0002 | 0.0130 | under | `citation`&nbsp;94 `sense`&nbsp;313 `gloss`&nbsp;2 `lemma`&nbsp;75 |
| 2.6% | `law` | 0.0146 | 0.0425 | under | `file`&nbsp;340 `witness`&nbsp;69 `evidence`&nbsp;120 `cite`&nbsp;114 |
| 2.2% | `politics` | 0.0023 | 0.0164 | under | `vote`&nbsp;53 `normalisation`&nbsp;14 `reading`&nbsp;402 `name`&nbsp;493 |

### `lexicon/src/main/java`

**0.1607 bits** from the repository, against a null median of 0.1084 over 999 resamples of the same size — an excess of +0.0523, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `plants` | 0.0000 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;112 `seed`&nbsp;21 `leaf`&nbsp;12 |
| 6.1% | `mathematics` | 0.1239 | 0.0550 | **over** | `from`&nbsp;106 `function`&nbsp;62 `lemma`&nbsp;75 `distribution`&nbsp;61 |
| 5.7% | `person` | 0.0707 | 0.0231 | **over** | `reader`&nbsp;97 `child`&nbsp;19 `host`&nbsp;27 `bearer`&nbsp;18 |
| 5.4% | `physics` | 0.0006 | 0.0209 | under | `mass`&nbsp;117 `weight`&nbsp;50 `radius`&nbsp;4 `length`&nbsp;38 |
| 4.3% | `networking` | 0.0338 | 0.0071 | **over** | `resource`&nbsp;201 `request`&nbsp;19 `preamble`&nbsp;5 `endpoint`&nbsp;12 |
| 3.8% | `linguistics` | 0.2910 | 0.1996 | **over** | `word`&nbsp;1,082 `term`&nbsp;251 `name`&nbsp;437 `parse`&nbsp;102 |
| 3.7% | `publishing` | 0.0196 | 0.0535 | under | `publish`&nbsp;184 `read`&nbsp;115 `directory`&nbsp;50 `write`&nbsp;355 |
| 3.2% | `philosophy` | 0.0350 | 0.0103 | **over** | `describe`&nbsp;35 `lemma`&nbsp;75 `explain`&nbsp;12 `each`&nbsp;21 |

### `lexicon/src/test/java`

**0.1523 bits** from the repository, against a null median of 0.1168 over 999 resamples of the same size — an excess of +0.0355, and 32 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.1% | `plants` | 0.0002 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;112 `seed`&nbsp;21 `leaf`&nbsp;12 |
| 9.1% | `linguistics` | 0.3427 | 0.1996 | **over** | `word`&nbsp;1,082 `term`&nbsp;251 `name`&nbsp;437 `parse`&nbsp;102 |
| 6.8% | `electronics` | 0.0000 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;145 `default`&nbsp;24 `node`&nbsp;48 |
| 5.3% | `physics` | 0.0010 | 0.0209 | under | `mass`&nbsp;117 `weight`&nbsp;50 `radius`&nbsp;4 `length`&nbsp;38 |
| 5.0% | `lexicography` | 0.0477 | 0.0130 | **over** | `citation`&nbsp;94 `sense`&nbsp;313 `gloss`&nbsp;2 `lemma`&nbsp;75 |
| 3.5% | `politics` | 0.0014 | 0.0164 | under | `vote`&nbsp;53 `normalisation`&nbsp;14 `reading`&nbsp;402 `name`&nbsp;493 |
| 2.3% | `baseball` | 0.0208 | 0.0053 | **over** | `field`&nbsp;145 `outer`&nbsp;6 `line`&nbsp;177 `look`&nbsp;31 |
| 2.1% | `military` | 0.0031 | 0.0154 | under | `repository`&nbsp;350 `base`&nbsp;46 `column`&nbsp;42 `refuse`&nbsp;99 |

### `documentation`

**0.2403 bits** from the repository, against a null median of 0.3507 over 999 resamples of the same size — an excess of -0.1104, and 972 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 4.6 s, recorded rather than estimated.
