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
| `linguistics` | 0.1991 | 80.3% | 3,000 | 109 | 8,688 | 33.9% | `word`&nbsp;1,075 `name`&nbsp;446 `term`&nbsp;250 `parse`&nbsp;104 |
| `computing` | 0.0534 | 82.8% | 4,278 | 22 | 1,564 | 6.1% | `repository`&nbsp;351 `parse`&nbsp;104 `unread`&nbsp;9 `read`&nbsp;582 |

Read over 360 files and 25,627 lines: 466 topics, 1 files no topic could be resolved for, and 33.9% of the repository's lines led by its single strongest topic. ι is a share of topical mass and sums to 1 across every topic; the columns beside it are counts and do not. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

### `code-semantics-api/src/main/java`

**0.1555 bits** from the repository, against a null median of 0.0973 over 999 resamples of the same size — an excess of +0.0582, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.9% | `telecommunication` | 0.0002 | 0.0449 | under | `file`&nbsp;173 `entry`&nbsp;147 `note`&nbsp;9 `record`&nbsp;3 |
| 6.6% | `plants` | 0.0019 | 0.0287 | under | `root`&nbsp;101 `tree`&nbsp;113 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.5% | `physics` | 0.0703 | 0.0210 | **over** | `mass`&nbsp;116 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.6% | `publishing` | 0.0142 | 0.0534 | under | `publish`&nbsp;183 `read`&nbsp;118 `directory`&nbsp;51 `write`&nbsp;360 |
| 5.2% | `electronics` | 0.0009 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;150 `default`&nbsp;24 `node`&nbsp;51 |
| 4.3% | `time_period` | 0.0246 | 0.0033 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;12 |
| 3.2% | `philosophy` | 0.0001 | 0.0104 | under | `describe`&nbsp;35 `lemma`&nbsp;70 `explain`&nbsp;12 `each`&nbsp;23 |
| 2.8% | `lexicography` | 0.0367 | 0.0128 | **over** | `citation`&nbsp;93 `sense`&nbsp;305 `gloss`&nbsp;2 `lemma`&nbsp;70 |

### `code-semantics-api/src/test/java`

**0.1965 bits** from the repository, against a null median of 0.1545 over 999 resamples of the same size — an excess of +0.0420, and 56 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `telecommunication` | 0.0017 | 0.0449 | under | `file`&nbsp;173 `entry`&nbsp;147 `note`&nbsp;9 `record`&nbsp;3 |
| 6.6% | `plants` | 0.0004 | 0.0287 | under | `root`&nbsp;101 `tree`&nbsp;113 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.5% | `biology` | 0.0384 | 0.0031 | **over** | `morphology`&nbsp;16 `owl`&nbsp;31 `person`&nbsp;20 `glob`&nbsp;5 |
| 6.2% | `literature` | 0.0002 | 0.0260 | under | `header`&nbsp;68 `text`&nbsp;44 `write`&nbsp;360 `title`&nbsp;13 |
| 4.5% | `electronics` | 0.0005 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;150 `default`&nbsp;24 `node`&nbsp;51 |
| 4.2% | `politics` | 0.0553 | 0.0162 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;408 `name`&nbsp;506 |
| 4.0% | `law` | 0.0971 | 0.0429 | **over** | `file`&nbsp;342 `witness`&nbsp;70 `summary`&nbsp;33 `within`&nbsp;8 |
| 3.6% | `publishing` | 0.0172 | 0.0534 | under | `publish`&nbsp;183 `read`&nbsp;118 `directory`&nbsp;51 `write`&nbsp;360 |

### `code-semantics-engine/src/main/java`

**0.0604 bits** from the repository, against a null median of 0.0231 over 999 resamples of the same size — an excess of +0.0373, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.4% | `electronics` | 0.0005 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;150 `default`&nbsp;24 `node`&nbsp;51 |
| 10.6% | `chemistry` | 0.0020 | 0.0206 | under | `syn`&nbsp;15 `extraction`&nbsp;48 `extract`&nbsp;7 `test`&nbsp;169 |
| 8.6% | `psychology` | 0.0004 | 0.0125 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;56 `test`&nbsp;169 |
| 5.6% | `grammar` | 0.0506 | 0.0245 | **over** | `phrase`&nbsp;136 `verb`&nbsp;66 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 3.2% | `linguistics` | 0.2481 | 0.1991 | **over** | `word`&nbsp;1,075 `name`&nbsp;446 `term`&nbsp;250 `parse`&nbsp;104 |
| 2.5% | `politics` | 0.0300 | 0.0162 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;408 `name`&nbsp;506 |
| 2.5% | `computer-languages` | 0.0001 | 0.0037 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 2.4% | `animals` | 0.0015 | 0.0071 | under | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |

### `code-semantics-engine/src/test/java`

**0.0587 bits** from the repository, against a null median of 0.0249 over 999 resamples of the same size — an excess of +0.0338, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.9% | `plants` | 0.0808 | 0.0287 | **over** | `root`&nbsp;101 `tree`&nbsp;113 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 15.6% | `electronics` | 0.0003 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;150 `default`&nbsp;24 `node`&nbsp;51 |
| 8.6% | `chemistry` | 0.0033 | 0.0206 | under | `syn`&nbsp;15 `extraction`&nbsp;48 `extract`&nbsp;7 `test`&nbsp;169 |
| 2.8% | `animals` | 0.0012 | 0.0071 | under | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |
| 2.7% | `computer-languages` | 0.0001 | 0.0037 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 2.6% | `christianity` | 0.0003 | 0.0045 | under | `kind`&nbsp;47 `use`&nbsp;67 `publish`&nbsp;183 `publisher`&nbsp;61 |
| 2.4% | `psychology` | 0.0045 | 0.0125 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;56 `test`&nbsp;169 |
| 2.3% | `astrology` | 0.0142 | 0.0057 | **over** | `placement`&nbsp;44 `figure`&nbsp;62 `term`&nbsp;258 `configuration`&nbsp;3 |

### `lexicon-extraction/src/main/java`

**0.1689 bits** from the repository, against a null median of 0.0566 over 999 resamples of the same size — an excess of +0.1122, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.7% | `linguistics` | 0.0914 | 0.1991 | under | `word`&nbsp;1,075 `name`&nbsp;446 `term`&nbsp;250 `parse`&nbsp;104 |
| 7.0% | `literature` | 0.0847 | 0.0260 | **over** | `header`&nbsp;68 `text`&nbsp;44 `write`&nbsp;360 `title`&nbsp;13 |
| 6.1% | `plants` | 0.0018 | 0.0287 | under | `root`&nbsp;101 `tree`&nbsp;113 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 5.7% | `animals` | 0.0413 | 0.0071 | **over** | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |
| 5.3% | `grammar` | 0.0014 | 0.0245 | under | `phrase`&nbsp;136 `verb`&nbsp;66 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 4.6% | `computer-languages` | 0.0283 | 0.0037 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 4.5% | `physics` | 0.0013 | 0.0210 | under | `mass`&nbsp;116 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.1% | `electronics` | 0.0587 | 0.0205 | **over** | `tsv`&nbsp;38 `field`&nbsp;150 `default`&nbsp;24 `node`&nbsp;51 |

### `lexicon-extraction/src/test/java`

**0.1982 bits** from the repository, against a null median of 0.0719 over 999 resamples of the same size — an excess of +0.1263, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.4% | `chemistry` | 0.1461 | 0.0206 | **over** | `syn`&nbsp;15 `extraction`&nbsp;48 `extract`&nbsp;7 `test`&nbsp;169 |
| 15.8% | `electronics` | 0.1281 | 0.0205 | **over** | `tsv`&nbsp;38 `field`&nbsp;150 `default`&nbsp;24 `node`&nbsp;51 |
| 6.1% | `linguistics` | 0.1002 | 0.1991 | under | `word`&nbsp;1,075 `name`&nbsp;446 `term`&nbsp;250 `parse`&nbsp;104 |
| 3.7% | `physics` | 0.0015 | 0.0210 | under | `mass`&nbsp;116 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.2% | `person` | 0.0028 | 0.0227 | under | `reader`&nbsp;100 `child`&nbsp;18 `host`&nbsp;27 `bearer`&nbsp;18 |
| 3.0% | `lexicography` | 0.0002 | 0.0128 | under | `citation`&nbsp;93 `sense`&nbsp;305 `gloss`&nbsp;2 `lemma`&nbsp;70 |
| 2.6% | `law` | 0.0146 | 0.0429 | under | `file`&nbsp;342 `witness`&nbsp;70 `summary`&nbsp;33 `within`&nbsp;8 |
| 2.1% | `politics` | 0.0023 | 0.0162 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;408 `name`&nbsp;506 |

### `lexicon/src/main/java`

**0.1621 bits** from the repository, against a null median of 0.1087 over 999 resamples of the same size — an excess of +0.0534, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.8% | `plants` | 0.0000 | 0.0287 | under | `root`&nbsp;101 `tree`&nbsp;113 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.3% | `mathematics` | 0.1239 | 0.0540 | **over** | `from`&nbsp;107 `function`&nbsp;60 `lemma`&nbsp;70 `distribution`&nbsp;54 |
| 5.8% | `person` | 0.0707 | 0.0227 | **over** | `reader`&nbsp;100 `child`&nbsp;18 `host`&nbsp;27 `bearer`&nbsp;18 |
| 5.4% | `physics` | 0.0006 | 0.0210 | under | `mass`&nbsp;116 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.3% | `networking` | 0.0338 | 0.0070 | **over** | `resource`&nbsp;194 `request`&nbsp;19 `preamble`&nbsp;5 `endpoint`&nbsp;12 |
| 3.9% | `linguistics` | 0.2910 | 0.1991 | **over** | `word`&nbsp;1,075 `name`&nbsp;446 `term`&nbsp;250 `parse`&nbsp;104 |
| 3.6% | `publishing` | 0.0196 | 0.0534 | under | `publish`&nbsp;183 `read`&nbsp;118 `directory`&nbsp;51 `write`&nbsp;360 |
| 3.1% | `law` | 0.0150 | 0.0429 | under | `file`&nbsp;342 `witness`&nbsp;70 `summary`&nbsp;33 `within`&nbsp;8 |

### `lexicon/src/test/java`

**0.1518 bits** from the repository, against a null median of 0.1176 over 999 resamples of the same size — an excess of +0.0342, and 39 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.1% | `linguistics` | 0.3427 | 0.1991 | **over** | `word`&nbsp;1,075 `name`&nbsp;446 `term`&nbsp;250 `parse`&nbsp;104 |
| 8.9% | `plants` | 0.0002 | 0.0287 | under | `root`&nbsp;101 `tree`&nbsp;113 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.7% | `electronics` | 0.0000 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;150 `default`&nbsp;24 `node`&nbsp;51 |
| 5.4% | `physics` | 0.0010 | 0.0210 | under | `mass`&nbsp;116 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.1% | `lexicography` | 0.0477 | 0.0128 | **over** | `citation`&nbsp;93 `sense`&nbsp;305 `gloss`&nbsp;2 `lemma`&nbsp;70 |
| 3.5% | `politics` | 0.0014 | 0.0162 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;408 `name`&nbsp;506 |
| 2.4% | `baseball` | 0.0208 | 0.0052 | **over** | `field`&nbsp;150 `outer`&nbsp;6 `line`&nbsp;176 `look`&nbsp;32 |
| 2.1% | `military` | 0.0031 | 0.0154 | under | `repository`&nbsp;351 `column`&nbsp;42 `base`&nbsp;46 `refuse`&nbsp;100 |

### `documentation`

**0.2445 bits** from the repository, against a null median of 0.3484 over 999 resamples of the same size — an excess of -0.1039, and 981 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 5.0 s, recorded rather than estimated.
