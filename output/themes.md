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
| `linguistics` | 0.1992 | 80.0% | 2,861 | 105 | 8,454 | 35.3% | `word`&nbsp;1,057 `name`&nbsp;402 `term`&nbsp;224 `parse`&nbsp;83 |
| `computing` | 0.0509 | 83.3% | 3,934 | 19 | 1,400 | 5.9% | `repository`&nbsp;325 `unread`&nbsp;8 `read`&nbsp;555 `parse`&nbsp;83 |

Read over 339 files and 23,920 lines: 459 topics, 1 files no topic could be resolved for, and 35.3% of the repository's lines led by its single strongest topic. ι is a share of topical mass and sums to 1 across every topic; the columns beside it are counts and do not. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

### `code-semantics-api/src/main/java`

**0.1543 bits** from the repository, against a null median of 0.0962 over 999 resamples of the same size — an excess of +0.0581, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.7% | `telecommunication` | 0.0002 | 0.0469 | under | `file`&nbsp;166 `entry`&nbsp;144 `note`&nbsp;7 `record`&nbsp;1 |
| 6.3% | `plants` | 0.0019 | 0.0277 | under | `root`&nbsp;87 `tree`&nbsp;95 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.3% | `physics` | 0.0703 | 0.0218 | **over** | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.7% | `publishing` | 0.0142 | 0.0534 | under | `publish`&nbsp;165 `read`&nbsp;110 `directory`&nbsp;46 `write`&nbsp;339 |
| 5.4% | `electronics` | 0.0009 | 0.0209 | under | `tsv`&nbsp;35 `field`&nbsp;137 `default`&nbsp;21 `node`&nbsp;46 |
| 4.1% | `time_period` | 0.0246 | 0.0036 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;12 |
| 3.2% | `philosophy` | 0.0001 | 0.0104 | under | `describe`&nbsp;35 `lemma`&nbsp;73 `explain`&nbsp;12 `each`&nbsp;18 |
| 2.6% | `lexicography` | 0.0367 | 0.0136 | **over** | `citation`&nbsp;90 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |

### `code-semantics-api/src/test/java`

**0.1964 bits** from the repository, against a null median of 0.1537 over 999 resamples of the same size — an excess of +0.0427, and 57 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `telecommunication` | 0.0017 | 0.0469 | under | `file`&nbsp;166 `entry`&nbsp;144 `note`&nbsp;7 `record`&nbsp;1 |
| 6.4% | `biology` | 0.0384 | 0.0032 | **over** | `morphology`&nbsp;16 `owl`&nbsp;20 `person`&nbsp;19 `glob`&nbsp;5 |
| 6.4% | `plants` | 0.0004 | 0.0277 | under | `root`&nbsp;87 `tree`&nbsp;95 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.2% | `literature` | 0.0002 | 0.0261 | under | `header`&nbsp;63 `text`&nbsp;45 `write`&nbsp;339 `title`&nbsp;12 |
| 4.6% | `electronics` | 0.0005 | 0.0209 | under | `tsv`&nbsp;35 `field`&nbsp;137 `default`&nbsp;21 `node`&nbsp;46 |
| 4.0% | `law` | 0.0971 | 0.0427 | **over** | `file`&nbsp;317 `witness`&nbsp;69 `evidence`&nbsp;118 `cite`&nbsp;110 |
| 3.9% | `politics` | 0.0553 | 0.0170 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;388 `name`&nbsp;453 |
| 3.6% | `publishing` | 0.0172 | 0.0534 | under | `publish`&nbsp;165 `read`&nbsp;110 `directory`&nbsp;46 `write`&nbsp;339 |

### `code-semantics-engine/src/main/java`

**0.0582 bits** from the repository, against a null median of 0.0227 over 999 resamples of the same size — an excess of +0.0355, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.3% | `electronics` | 0.0005 | 0.0209 | under | `tsv`&nbsp;35 `field`&nbsp;137 `default`&nbsp;21 `node`&nbsp;46 |
| 10.1% | `chemistry` | 0.0021 | 0.0195 | under | `syn`&nbsp;15 `extraction`&nbsp;45 `extract`&nbsp;7 `test`&nbsp;157 |
| 9.3% | `psychology` | 0.0004 | 0.0130 | under | `module`&nbsp;69 `confidence`&nbsp;20 `know`&nbsp;55 `test`&nbsp;157 |
| 5.5% | `grammar` | 0.0516 | 0.0257 | **over** | `phrase`&nbsp;137 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 3.7% | `linguistics` | 0.2514 | 0.1992 | **over** | `word`&nbsp;1,057 `name`&nbsp;402 `term`&nbsp;224 `parse`&nbsp;83 |
| 2.7% | `animals` | 0.0015 | 0.0075 | under | `nest`&nbsp;26 `owl`&nbsp;20 `down`&nbsp;5 `head`&nbsp;31 |
| 2.7% | `computer-languages` | 0.0001 | 0.0039 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;20 `java`&nbsp;34 |
| 2.4% | `politics` | 0.0305 | 0.0170 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;388 `name`&nbsp;453 |

### `code-semantics-engine/src/test/java`

**0.0608 bits** from the repository, against a null median of 0.0260 over 999 resamples of the same size — an excess of +0.0348, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.0% | `electronics` | 0.0002 | 0.0209 | under | `tsv`&nbsp;35 `field`&nbsp;137 `default`&nbsp;21 `node`&nbsp;46 |
| 14.2% | `plants` | 0.0766 | 0.0277 | **over** | `root`&nbsp;87 `tree`&nbsp;95 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 7.5% | `chemistry` | 0.0034 | 0.0195 | under | `syn`&nbsp;15 `extraction`&nbsp;45 `extract`&nbsp;7 `test`&nbsp;157 |
| 2.8% | `animals` | 0.0013 | 0.0075 | under | `nest`&nbsp;26 `owl`&nbsp;20 `down`&nbsp;5 `head`&nbsp;31 |
| 2.7% | `computer-languages` | 0.0001 | 0.0039 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;20 `java`&nbsp;34 |
| 2.7% | `christianity` | 0.0004 | 0.0048 | under | `kind`&nbsp;47 `use`&nbsp;63 `publish`&nbsp;165 `publisher`&nbsp;42 |
| 2.5% | `astrology` | 0.0151 | 0.0059 | **over** | `placement`&nbsp;40 `figure`&nbsp;48 `term`&nbsp;231 `configuration`&nbsp;3 |
| 2.3% | `psychology` | 0.0048 | 0.0130 | under | `module`&nbsp;69 `confidence`&nbsp;20 `know`&nbsp;55 `test`&nbsp;157 |

### `lexicon-extraction/src/main/java`

**0.1846 bits** from the repository, against a null median of 0.0621 over 999 resamples of the same size — an excess of +0.1225, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.1% | `linguistics` | 0.0968 | 0.1992 | under | `word`&nbsp;1,057 `name`&nbsp;402 `term`&nbsp;224 `parse`&nbsp;83 |
| 6.9% | `plants` | 0.0003 | 0.0277 | under | `root`&nbsp;87 `tree`&nbsp;95 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.9% | `literature` | 0.0875 | 0.0261 | **over** | `header`&nbsp;63 `text`&nbsp;45 `write`&nbsp;339 `title`&nbsp;12 |
| 5.9% | `animals` | 0.0454 | 0.0075 | **over** | `nest`&nbsp;26 `owl`&nbsp;20 `down`&nbsp;5 `head`&nbsp;31 |
| 5.3% | `grammar` | 0.0012 | 0.0257 | under | `phrase`&nbsp;137 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 4.8% | `computer-languages` | 0.0313 | 0.0039 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;20 `java`&nbsp;34 |
| 4.5% | `physics` | 0.0011 | 0.0218 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.1% | `electronics` | 0.0615 | 0.0209 | **over** | `tsv`&nbsp;35 `field`&nbsp;137 `default`&nbsp;21 `node`&nbsp;46 |

### `lexicon-extraction/src/test/java`

**0.2249 bits** from the repository, against a null median of 0.0814 over 999 resamples of the same size — an excess of +0.1435, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.3% | `chemistry` | 0.1450 | 0.0195 | **over** | `syn`&nbsp;15 `extraction`&nbsp;45 `extract`&nbsp;7 `test`&nbsp;157 |
| 17.1% | `electronics` | 0.1472 | 0.0209 | **over** | `tsv`&nbsp;35 `field`&nbsp;137 `default`&nbsp;21 `node`&nbsp;46 |
| 8.0% | `linguistics` | 0.0823 | 0.1992 | under | `word`&nbsp;1,057 `name`&nbsp;402 `term`&nbsp;224 `parse`&nbsp;83 |
| 4.7% | `person` | 0.0004 | 0.0234 | under | `reader`&nbsp;96 `host`&nbsp;27 `child`&nbsp;16 `bearer`&nbsp;18 |
| 4.1% | `law` | 0.0083 | 0.0427 | under | `file`&nbsp;317 `witness`&nbsp;69 `evidence`&nbsp;118 `cite`&nbsp;110 |
| 3.3% | `physics` | 0.0017 | 0.0218 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 2.7% | `lexicography` | 0.0002 | 0.0136 | under | `citation`&nbsp;90 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 2.1% | `politics` | 0.0021 | 0.0170 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;388 `name`&nbsp;453 |

### `lexicon/src/main/java`

**0.1602 bits** from the repository, against a null median of 0.1136 over 999 resamples of the same size — an excess of +0.0466, and 9 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.6% | `plants` | 0.0000 | 0.0277 | under | `root`&nbsp;87 `tree`&nbsp;95 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.8% | `mathematics` | 0.1294 | 0.0557 | **over** | `from`&nbsp;103 `function`&nbsp;61 `lemma`&nbsp;73 `distribution`&nbsp;57 |
| 6.3% | `person` | 0.0742 | 0.0234 | **over** | `reader`&nbsp;96 `host`&nbsp;27 `child`&nbsp;16 `bearer`&nbsp;18 |
| 5.7% | `physics` | 0.0007 | 0.0218 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.0% | `networking` | 0.0326 | 0.0071 | **over** | `resource`&nbsp;194 `request`&nbsp;19 `preamble`&nbsp;5 `endpoint`&nbsp;12 |
| 3.6% | `publishing` | 0.0199 | 0.0534 | under | `publish`&nbsp;165 `read`&nbsp;110 `directory`&nbsp;46 `write`&nbsp;339 |
| 3.5% | `philosophy` | 0.0367 | 0.0104 | **over** | `describe`&nbsp;35 `lemma`&nbsp;73 `explain`&nbsp;12 `each`&nbsp;18 |
| 3.2% | `politics` | 0.0018 | 0.0170 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;388 `name`&nbsp;453 |

### `lexicon/src/test/java`

**0.1558 bits** from the repository, against a null median of 0.1218 over 999 resamples of the same size — an excess of +0.0340, and 49 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `plants` | 0.0002 | 0.0277 | under | `root`&nbsp;87 `tree`&nbsp;95 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 8.3% | `linguistics` | 0.3371 | 0.1992 | **over** | `word`&nbsp;1,057 `name`&nbsp;402 `term`&nbsp;224 `parse`&nbsp;83 |
| 6.7% | `electronics` | 0.0000 | 0.0209 | under | `tsv`&nbsp;35 `field`&nbsp;137 `default`&nbsp;21 `node`&nbsp;46 |
| 5.5% | `physics` | 0.0009 | 0.0218 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.2% | `lexicography` | 0.0504 | 0.0136 | **over** | `citation`&nbsp;90 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 3.6% | `politics` | 0.0014 | 0.0170 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;388 `name`&nbsp;453 |
| 2.5% | `baseball` | 0.0219 | 0.0054 | **over** | `field`&nbsp;137 `outer`&nbsp;6 `line`&nbsp;171 `look`&nbsp;29 |
| 2.3% | `algebra` | 0.0151 | 0.0024 | **over** | `content`&nbsp;28 `unknown`&nbsp;26 `index`&nbsp;50 `field`&nbsp;137 |

### `documentation`

**0.2313 bits** from the repository, against a null median of 0.4161 over 999 resamples of the same size — an excess of -0.1847, and 996 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 4.3 s, recorded rather than estimated.
