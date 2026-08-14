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
| `linguistics` | 0.2026 | 79.9% | 2,748 | 99 | 7,834 | 34.3% | `word`&nbsp;1,054 `term`&nbsp;217 `name`&nbsp;365 `parse`&nbsp;80 |
| `computing` | 0.0450 | 82.9% | 3,685 | 16 | 1,081 | 4.7% | `repository`&nbsp;303 `unread`&nbsp;7 `read`&nbsp;526 `parse`&nbsp;80 |

Read over 326 files and 22,826 lines: 455 topics, 2 files no topic could be resolved for, and 34.3% of the repository's lines led by its single strongest topic. ι is a share of topical mass and sums to 1 across every topic; the columns beside it are counts and do not. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

### `code-semantics-api/src/main/java`

**0.1537 bits** from the repository, against a null median of 0.0978 over 999 resamples of the same size — an excess of +0.0559, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.4% | `telecommunication` | 0.0002 | 0.0460 | under | `file`&nbsp;162 `entry`&nbsp;135 `record`&nbsp;1 `fetch`&nbsp;8 |
| 6.0% | `physics` | 0.0703 | 0.0226 | **over** | `mass`&nbsp;115 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 6.0% | `publishing` | 0.0142 | 0.0547 | under | `publish`&nbsp;156 `read`&nbsp;106 `write`&nbsp;308 `directory`&nbsp;38 |
| 5.7% | `electronics` | 0.0009 | 0.0218 | under | `tsv`&nbsp;35 `field`&nbsp;131 `default`&nbsp;21 `node`&nbsp;46 |
| 5.3% | `plants` | 0.0019 | 0.0241 | under | `root`&nbsp;81 `tree`&nbsp;78 `seed`&nbsp;17 `leaf`&nbsp;10 |
| 4.1% | `time_period` | 0.0246 | 0.0037 | **over** | `span`&nbsp;11 `none`&nbsp;5 `even`&nbsp;4 `longest`&nbsp;12 |
| 3.1% | `philosophy` | 0.0001 | 0.0102 | under | `lemma`&nbsp;73 `describe`&nbsp;33 `explain`&nbsp;12 `each`&nbsp;15 |
| 2.8% | `person` | 0.0481 | 0.0200 | **over** | `reader`&nbsp;88 `child`&nbsp;16 `bearer`&nbsp;18 `host`&nbsp;17 |

### `code-semantics-api/src/test/java`

**0.1943 bits** from the repository, against a null median of 0.1548 over 999 resamples of the same size — an excess of +0.0395, and 71 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.6% | `telecommunication` | 0.0017 | 0.0460 | under | `file`&nbsp;162 `entry`&nbsp;135 `record`&nbsp;1 `fetch`&nbsp;8 |
| 6.6% | `literature` | 0.0002 | 0.0271 | under | `header`&nbsp;62 `text`&nbsp;44 `write`&nbsp;308 `title`&nbsp;12 |
| 6.3% | `biology` | 0.0384 | 0.0035 | **over** | `morphology`&nbsp;16 `owl`&nbsp;17 `person`&nbsp;19 `glob`&nbsp;5 |
| 5.5% | `plants` | 0.0004 | 0.0241 | under | `root`&nbsp;81 `tree`&nbsp;78 `seed`&nbsp;17 `leaf`&nbsp;10 |
| 4.9% | `electronics` | 0.0005 | 0.0218 | under | `tsv`&nbsp;35 `field`&nbsp;131 `default`&nbsp;21 `node`&nbsp;46 |
| 4.1% | `law` | 0.0971 | 0.0423 | **over** | `file`&nbsp;307 `witness`&nbsp;68 `evidence`&nbsp;116 `cite`&nbsp;106 |
| 3.8% | `publishing` | 0.0172 | 0.0547 | under | `publish`&nbsp;156 `read`&nbsp;106 `write`&nbsp;308 `directory`&nbsp;38 |
| 3.8% | `politics` | 0.0553 | 0.0177 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;364 `name`&nbsp;412 |

### `code-semantics-engine/src/main/java`

**0.0583 bits** from the repository, against a null median of 0.0224 over 999 resamples of the same size — an excess of +0.0358, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.0% | `electronics` | 0.0005 | 0.0218 | under | `tsv`&nbsp;35 `field`&nbsp;131 `default`&nbsp;21 `node`&nbsp;46 |
| 10.7% | `chemistry` | 0.0021 | 0.0203 | under | `syn`&nbsp;15 `extraction`&nbsp;42 `extract`&nbsp;7 `test`&nbsp;143 |
| 10.3% | `psychology` | 0.0004 | 0.0142 | under | `module`&nbsp;65 `confidence`&nbsp;20 `know`&nbsp;52 `test`&nbsp;143 |
| 5.1% | `grammar` | 0.0516 | 0.0265 | **over** | `phrase`&nbsp;136 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 3.3% | `linguistics` | 0.2514 | 0.2026 | **over** | `word`&nbsp;1,054 `term`&nbsp;217 `name`&nbsp;365 `parse`&nbsp;80 |
| 3.2% | `animals` | 0.0015 | 0.0083 | under | `nest`&nbsp;24 `owl`&nbsp;17 `down`&nbsp;5 `head`&nbsp;31 |
| 2.8% | `computer-languages` | 0.0001 | 0.0041 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;17 `java`&nbsp;33 |
| 2.5% | `literature` | 0.0142 | 0.0271 | under | `header`&nbsp;62 `text`&nbsp;44 `write`&nbsp;308 `title`&nbsp;12 |

### `code-semantics-engine/src/test/java`

**0.0639 bits** from the repository, against a null median of 0.0303 over 999 resamples of the same size — an excess of +0.0335, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.0% | `electronics` | 0.0002 | 0.0218 | under | `tsv`&nbsp;35 `field`&nbsp;131 `default`&nbsp;21 `node`&nbsp;46 |
| 12.4% | `plants` | 0.0682 | 0.0241 | **over** | `root`&nbsp;81 `tree`&nbsp;78 `seed`&nbsp;17 `leaf`&nbsp;10 |
| 7.1% | `chemistry` | 0.0038 | 0.0203 | under | `syn`&nbsp;15 `extraction`&nbsp;42 `extract`&nbsp;7 `test`&nbsp;143 |
| 2.9% | `christianity` | 0.0003 | 0.0053 | under | `kind`&nbsp;47 `use`&nbsp;63 `publish`&nbsp;156 `publisher`&nbsp;39 |
| 2.8% | `publishing` | 0.0806 | 0.0547 | **over** | `publish`&nbsp;156 `read`&nbsp;106 `write`&nbsp;308 `directory`&nbsp;38 |
| 2.8% | `astrology` | 0.0160 | 0.0059 | **over** | `placement`&nbsp;34 `figure`&nbsp;44 `term`&nbsp;224 `configuration`&nbsp;3 |
| 2.7% | `computer-languages` | 0.0001 | 0.0041 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;17 `java`&nbsp;33 |
| 2.6% | `animals` | 0.0018 | 0.0083 | under | `nest`&nbsp;24 `owl`&nbsp;17 `down`&nbsp;5 `head`&nbsp;31 |

### `lexicon-extraction/src/main/java`

**0.1836 bits** from the repository, against a null median of 0.0644 over 999 resamples of the same size — an excess of +0.1192, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.3% | `linguistics` | 0.0980 | 0.2026 | under | `word`&nbsp;1,054 `term`&nbsp;217 `name`&nbsp;365 `parse`&nbsp;80 |
| 6.9% | `literature` | 0.0897 | 0.0271 | **over** | `header`&nbsp;62 `text`&nbsp;44 `write`&nbsp;308 `title`&nbsp;12 |
| 6.0% | `plants` | 0.0003 | 0.0241 | under | `root`&nbsp;81 `tree`&nbsp;78 `seed`&nbsp;17 `leaf`&nbsp;10 |
| 5.9% | `animals` | 0.0473 | 0.0083 | **over** | `nest`&nbsp;24 `owl`&nbsp;17 `down`&nbsp;5 `head`&nbsp;31 |
| 5.3% | `grammar` | 0.0016 | 0.0265 | under | `phrase`&nbsp;136 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 4.9% | `computer-languages` | 0.0324 | 0.0041 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;17 `java`&nbsp;33 |
| 4.7% | `physics` | 0.0011 | 0.0226 | under | `mass`&nbsp;115 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.1% | `electronics` | 0.0631 | 0.0218 | **over** | `tsv`&nbsp;35 `field`&nbsp;131 `default`&nbsp;21 `node`&nbsp;46 |

### `lexicon-extraction/src/test/java`

**0.2316 bits** from the repository, against a null median of 0.0832 over 999 resamples of the same size — an excess of +0.1484, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.4% | `chemistry` | 0.1500 | 0.0203 | **over** | `syn`&nbsp;15 `extraction`&nbsp;42 `extract`&nbsp;7 `test`&nbsp;143 |
| 17.1% | `electronics` | 0.1522 | 0.0218 | **over** | `tsv`&nbsp;35 `field`&nbsp;131 `default`&nbsp;21 `node`&nbsp;46 |
| 8.6% | `linguistics` | 0.0795 | 0.2026 | under | `word`&nbsp;1,054 `term`&nbsp;217 `name`&nbsp;365 `parse`&nbsp;80 |
| 3.9% | `law` | 0.0083 | 0.0423 | under | `file`&nbsp;307 `witness`&nbsp;68 `evidence`&nbsp;116 `cite`&nbsp;106 |
| 3.8% | `person` | 0.0004 | 0.0200 | under | `reader`&nbsp;88 `child`&nbsp;16 `bearer`&nbsp;18 `host`&nbsp;17 |
| 3.4% | `physics` | 0.0016 | 0.0226 | under | `mass`&nbsp;115 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 2.8% | `lexicography` | 0.0002 | 0.0141 | under | `citation`&nbsp;89 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 2.3% | `town_planning` | 0.0240 | 0.0044 | **over** | `archive`&nbsp;31 `live`&nbsp;15 `local`&nbsp;4 `common`&nbsp;6 |

### `lexicon/src/main/java`

**0.1629 bits** from the repository, against a null median of 0.1120 over 999 resamples of the same size — an excess of +0.0509, and 12 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.4% | `plants` | 0.0000 | 0.0241 | under | `root`&nbsp;81 `tree`&nbsp;78 `seed`&nbsp;17 `leaf`&nbsp;10 |
| 7.3% | `person` | 0.0739 | 0.0200 | **over** | `reader`&nbsp;88 `child`&nbsp;16 `bearer`&nbsp;18 `host`&nbsp;17 |
| 6.1% | `mathematics` | 0.1294 | 0.0583 | **over** | `from`&nbsp;98 `function`&nbsp;61 `lemma`&nbsp;73 `distribution`&nbsp;56 |
| 5.8% | `physics` | 0.0007 | 0.0226 | under | `mass`&nbsp;115 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.9% | `networking` | 0.0327 | 0.0072 | **over** | `resource`&nbsp;181 `request`&nbsp;19 `preamble`&nbsp;5 `endpoint`&nbsp;12 |
| 3.5% | `philosophy` | 0.0367 | 0.0102 | **over** | `lemma`&nbsp;73 `describe`&nbsp;33 `explain`&nbsp;12 `each`&nbsp;15 |
| 3.5% | `publishing` | 0.0209 | 0.0547 | under | `publish`&nbsp;156 `read`&nbsp;106 `write`&nbsp;308 `directory`&nbsp;38 |
| 3.3% | `politics` | 0.0019 | 0.0177 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;364 `name`&nbsp;412 |

### `lexicon/src/test/java`

**0.1667 bits** from the repository, against a null median of 0.1222 over 999 resamples of the same size — an excess of +0.0445, and 23 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.1% | `linguistics` | 0.3645 | 0.2026 | **over** | `word`&nbsp;1,054 `term`&nbsp;217 `name`&nbsp;365 `parse`&nbsp;80 |
| 6.7% | `plants` | 0.0002 | 0.0241 | under | `root`&nbsp;81 `tree`&nbsp;78 `seed`&nbsp;17 `leaf`&nbsp;10 |
| 6.5% | `electronics` | 0.0000 | 0.0218 | under | `tsv`&nbsp;35 `field`&nbsp;131 `default`&nbsp;21 `node`&nbsp;46 |
| 5.4% | `physics` | 0.0009 | 0.0226 | under | `mass`&nbsp;115 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.7% | `lexicography` | 0.0504 | 0.0141 | **over** | `citation`&nbsp;89 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 4.3% | `geography` | 0.0022 | 0.0226 | under | `state`&nbsp;229 `stream`&nbsp;17 `line`&nbsp;167 `draw`&nbsp;73 |
| 3.5% | `politics` | 0.0014 | 0.0177 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;364 `name`&nbsp;412 |
| 2.3% | `psychology` | 0.0019 | 0.0142 | under | `module`&nbsp;65 `confidence`&nbsp;20 `know`&nbsp;52 `test`&nbsp;143 |

### `documentation`

**0.2338 bits** from the repository, against a null median of 0.4139 over 999 resamples of the same size — an excess of -0.1801, and 994 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 4.2 s, recorded rather than estimated.
