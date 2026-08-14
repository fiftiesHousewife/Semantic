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
| `linguistics` | 0.2001 | 80.0% | 2,853 | 105 | 8,454 | 35.5% | `word`&nbsp;1,057 `name`&nbsp;398 `term`&nbsp;224 `parse`&nbsp;83 |
| `computing` | 0.0505 | 83.2% | 3,901 | 19 | 1,400 | 5.9% | `repository`&nbsp;324 `unread`&nbsp;8 `read`&nbsp;554 `parse`&nbsp;83 |

Read over 337 files and 23,781 lines: 459 topics, 1 files no topic could be resolved for, and 35.5% of the repository's lines led by its single strongest topic. ι is a share of topical mass and sums to 1 across every topic; the columns beside it are counts and do not. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

### `code-semantics-api/src/main/java`

**0.1549 bits** from the repository, against a null median of 0.0973 over 999 resamples of the same size — an excess of +0.0576, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.7% | `telecommunication` | 0.0002 | 0.0472 | under | `file`&nbsp;166 `entry`&nbsp;144 `note`&nbsp;7 `record`&nbsp;1 |
| 6.4% | `plants` | 0.0019 | 0.0278 | under | `root`&nbsp;87 `tree`&nbsp;94 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.2% | `physics` | 0.0703 | 0.0219 | **over** | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.7% | `publishing` | 0.0142 | 0.0536 | under | `publish`&nbsp;164 `read`&nbsp;110 `write`&nbsp;339 `directory`&nbsp;42 |
| 5.4% | `electronics` | 0.0009 | 0.0211 | under | `tsv`&nbsp;35 `field`&nbsp;136 `default`&nbsp;21 `node`&nbsp;46 |
| 4.1% | `time_period` | 0.0246 | 0.0036 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;12 |
| 3.2% | `philosophy` | 0.0001 | 0.0104 | under | `describe`&nbsp;35 `lemma`&nbsp;73 `explain`&nbsp;12 `each`&nbsp;17 |
| 2.5% | `lexicography` | 0.0367 | 0.0137 | **over** | `citation`&nbsp;90 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |

### `code-semantics-api/src/test/java`

**0.1968 bits** from the repository, against a null median of 0.1526 over 999 resamples of the same size — an excess of +0.0442, and 53 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `telecommunication` | 0.0017 | 0.0472 | under | `file`&nbsp;166 `entry`&nbsp;144 `note`&nbsp;7 `record`&nbsp;1 |
| 6.4% | `biology` | 0.0384 | 0.0032 | **over** | `morphology`&nbsp;16 `owl`&nbsp;20 `person`&nbsp;19 `glob`&nbsp;5 |
| 6.4% | `plants` | 0.0004 | 0.0278 | under | `root`&nbsp;87 `tree`&nbsp;94 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.3% | `literature` | 0.0002 | 0.0262 | under | `header`&nbsp;63 `text`&nbsp;45 `write`&nbsp;339 `title`&nbsp;12 |
| 4.6% | `electronics` | 0.0005 | 0.0211 | under | `tsv`&nbsp;35 `field`&nbsp;136 `default`&nbsp;21 `node`&nbsp;46 |
| 4.1% | `law` | 0.0971 | 0.0423 | **over** | `file`&nbsp;317 `witness`&nbsp;69 `evidence`&nbsp;117 `cite`&nbsp;110 |
| 3.9% | `politics` | 0.0553 | 0.0171 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;384 `name`&nbsp;448 |
| 3.6% | `publishing` | 0.0172 | 0.0536 | under | `publish`&nbsp;164 `read`&nbsp;110 `write`&nbsp;339 `directory`&nbsp;42 |

### `code-semantics-engine/src/main/java`

**0.0581 bits** from the repository, against a null median of 0.0229 over 999 resamples of the same size — an excess of +0.0352, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.5% | `electronics` | 0.0005 | 0.0211 | under | `tsv`&nbsp;35 `field`&nbsp;136 `default`&nbsp;21 `node`&nbsp;46 |
| 10.2% | `chemistry` | 0.0021 | 0.0197 | under | `syn`&nbsp;15 `extraction`&nbsp;45 `extract`&nbsp;7 `test`&nbsp;154 |
| 9.4% | `psychology` | 0.0004 | 0.0130 | under | `module`&nbsp;69 `confidence`&nbsp;20 `know`&nbsp;55 `test`&nbsp;154 |
| 5.4% | `grammar` | 0.0516 | 0.0258 | **over** | `phrase`&nbsp;137 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 3.6% | `linguistics` | 0.2514 | 0.2001 | **over** | `word`&nbsp;1,057 `name`&nbsp;398 `term`&nbsp;224 `parse`&nbsp;83 |
| 2.7% | `animals` | 0.0015 | 0.0075 | under | `nest`&nbsp;26 `owl`&nbsp;20 `down`&nbsp;5 `head`&nbsp;31 |
| 2.7% | `computer-languages` | 0.0001 | 0.0039 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;20 `java`&nbsp;34 |
| 2.4% | `politics` | 0.0305 | 0.0171 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;384 `name`&nbsp;448 |

### `code-semantics-engine/src/test/java`

**0.0614 bits** from the repository, against a null median of 0.0265 over 999 resamples of the same size — an excess of +0.0348, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.9% | `electronics` | 0.0002 | 0.0211 | under | `tsv`&nbsp;35 `field`&nbsp;136 `default`&nbsp;21 `node`&nbsp;46 |
| 14.7% | `plants` | 0.0783 | 0.0278 | **over** | `root`&nbsp;87 `tree`&nbsp;94 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 7.4% | `chemistry` | 0.0034 | 0.0197 | under | `syn`&nbsp;15 `extraction`&nbsp;45 `extract`&nbsp;7 `test`&nbsp;154 |
| 2.7% | `animals` | 0.0014 | 0.0075 | under | `nest`&nbsp;26 `owl`&nbsp;20 `down`&nbsp;5 `head`&nbsp;31 |
| 2.7% | `computer-languages` | 0.0001 | 0.0039 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;20 `java`&nbsp;34 |
| 2.7% | `christianity` | 0.0004 | 0.0048 | under | `kind`&nbsp;47 `use`&nbsp;63 `publish`&nbsp;164 `publisher`&nbsp;42 |
| 2.6% | `astrology` | 0.0154 | 0.0060 | **over** | `placement`&nbsp;40 `figure`&nbsp;47 `term`&nbsp;231 `configuration`&nbsp;3 |
| 2.3% | `psychology` | 0.0049 | 0.0130 | under | `module`&nbsp;69 `confidence`&nbsp;20 `know`&nbsp;55 `test`&nbsp;154 |

### `lexicon-extraction/src/main/java`

**0.1847 bits** from the repository, against a null median of 0.0627 over 999 resamples of the same size — an excess of +0.1220, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.2% | `linguistics` | 0.0968 | 0.2001 | under | `word`&nbsp;1,057 `name`&nbsp;398 `term`&nbsp;224 `parse`&nbsp;83 |
| 7.0% | `plants` | 0.0003 | 0.0278 | under | `root`&nbsp;87 `tree`&nbsp;94 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.8% | `literature` | 0.0875 | 0.0262 | **over** | `header`&nbsp;63 `text`&nbsp;45 `write`&nbsp;339 `title`&nbsp;12 |
| 5.9% | `animals` | 0.0454 | 0.0075 | **over** | `nest`&nbsp;26 `owl`&nbsp;20 `down`&nbsp;5 `head`&nbsp;31 |
| 5.4% | `grammar` | 0.0012 | 0.0258 | under | `phrase`&nbsp;137 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 4.8% | `computer-languages` | 0.0313 | 0.0039 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;20 `java`&nbsp;34 |
| 4.5% | `physics` | 0.0011 | 0.0219 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.0% | `electronics` | 0.0615 | 0.0211 | **over** | `tsv`&nbsp;35 `field`&nbsp;136 `default`&nbsp;21 `node`&nbsp;46 |

### `lexicon-extraction/src/test/java`

**0.2241 bits** from the repository, against a null median of 0.0812 over 999 resamples of the same size — an excess of +0.1429, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.4% | `chemistry` | 0.1450 | 0.0197 | **over** | `syn`&nbsp;15 `extraction`&nbsp;45 `extract`&nbsp;7 `test`&nbsp;154 |
| 17.1% | `electronics` | 0.1472 | 0.0211 | **over** | `tsv`&nbsp;35 `field`&nbsp;136 `default`&nbsp;21 `node`&nbsp;46 |
| 8.2% | `linguistics` | 0.0823 | 0.2001 | under | `word`&nbsp;1,057 `name`&nbsp;398 `term`&nbsp;224 `parse`&nbsp;83 |
| 4.4% | `person` | 0.0004 | 0.0218 | under | `reader`&nbsp;95 `host`&nbsp;27 `child`&nbsp;16 `bearer`&nbsp;18 |
| 4.0% | `law` | 0.0083 | 0.0423 | under | `file`&nbsp;317 `witness`&nbsp;69 `evidence`&nbsp;117 `cite`&nbsp;110 |
| 3.3% | `physics` | 0.0017 | 0.0219 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 2.8% | `lexicography` | 0.0002 | 0.0137 | under | `citation`&nbsp;90 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 2.2% | `politics` | 0.0021 | 0.0171 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;384 `name`&nbsp;448 |

### `lexicon/src/main/java`

**0.1616 bits** from the repository, against a null median of 0.1133 over 999 resamples of the same size — an excess of +0.0483, and 6 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.6% | `plants` | 0.0000 | 0.0278 | under | `root`&nbsp;87 `tree`&nbsp;94 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.8% | `person` | 0.0742 | 0.0218 | **over** | `reader`&nbsp;95 `host`&nbsp;27 `child`&nbsp;16 `bearer`&nbsp;18 |
| 6.7% | `mathematics` | 0.1294 | 0.0560 | **over** | `from`&nbsp;102 `function`&nbsp;61 `lemma`&nbsp;73 `distribution`&nbsp;57 |
| 5.6% | `physics` | 0.0007 | 0.0219 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.0% | `networking` | 0.0326 | 0.0070 | **over** | `resource`&nbsp;192 `request`&nbsp;19 `preamble`&nbsp;5 `endpoint`&nbsp;12 |
| 3.6% | `publishing` | 0.0199 | 0.0536 | under | `publish`&nbsp;164 `read`&nbsp;110 `write`&nbsp;339 `directory`&nbsp;42 |
| 3.5% | `philosophy` | 0.0367 | 0.0104 | **over** | `describe`&nbsp;35 `lemma`&nbsp;73 `explain`&nbsp;12 `each`&nbsp;17 |
| 3.2% | `politics` | 0.0018 | 0.0171 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;384 `name`&nbsp;448 |

### `lexicon/src/test/java`

**0.1552 bits** from the repository, against a null median of 0.1217 over 999 resamples of the same size — an excess of +0.0335, and 50 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `plants` | 0.0002 | 0.0278 | under | `root`&nbsp;87 `tree`&nbsp;94 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 8.2% | `linguistics` | 0.3371 | 0.2001 | **over** | `word`&nbsp;1,057 `name`&nbsp;398 `term`&nbsp;224 `parse`&nbsp;83 |
| 6.7% | `electronics` | 0.0000 | 0.0211 | under | `tsv`&nbsp;35 `field`&nbsp;136 `default`&nbsp;21 `node`&nbsp;46 |
| 5.6% | `physics` | 0.0009 | 0.0219 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.2% | `lexicography` | 0.0504 | 0.0137 | **over** | `citation`&nbsp;90 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 3.6% | `politics` | 0.0014 | 0.0171 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;384 `name`&nbsp;448 |
| 2.5% | `baseball` | 0.0219 | 0.0055 | **over** | `field`&nbsp;136 `outer`&nbsp;6 `line`&nbsp;169 `look`&nbsp;28 |
| 2.3% | `algebra` | 0.0151 | 0.0025 | **over** | `content`&nbsp;28 `unknown`&nbsp;26 `index`&nbsp;50 `field`&nbsp;136 |

### `documentation`

**0.2316 bits** from the repository, against a null median of 0.4171 over 999 resamples of the same size — an excess of -0.1856, and 998 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 4.2 s, recorded rather than estimated.
