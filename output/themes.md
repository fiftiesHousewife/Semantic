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
| `linguistics` | 0.2001 | 80.1% | 2,948 | 107 | 8,534 | 34.1% | `word`&nbsp;1,060 `term`&nbsp;249 `name`&nbsp;428 `parse`&nbsp;97 |
| `computing` | 0.0531 | 83.4% | 4,142 | 21 | 1,525 | 6.1% | `repository`&nbsp;336 `unread`&nbsp;8 `parse`&nbsp;97 `read`&nbsp;571 |

Read over 353 files and 25,027 lines: 464 topics, 1 files no topic could be resolved for, and 34.1% of the repository's lines led by its single strongest topic. ι is a share of topical mass and sums to 1 across every topic; the columns beside it are counts and do not. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

### `code-semantics-api/src/main/java`

**0.1550 bits** from the repository, against a null median of 0.0974 over 999 resamples of the same size — an excess of +0.0576, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.2% | `telecommunication` | 0.0002 | 0.0455 | under | `file`&nbsp;168 `entry`&nbsp;144 `note`&nbsp;9 `record`&nbsp;3 |
| 6.8% | `plants` | 0.0019 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;106 `seed`&nbsp;20 `leaf`&nbsp;12 |
| 6.6% | `physics` | 0.0703 | 0.0210 | **over** | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.6% | `publishing` | 0.0142 | 0.0532 | under | `publish`&nbsp;177 `read`&nbsp;115 `directory`&nbsp;48 `write`&nbsp;352 |
| 5.3% | `electronics` | 0.0009 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;142 `default`&nbsp;24 `node`&nbsp;48 |
| 4.2% | `time_period` | 0.0246 | 0.0034 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;12 |
| 3.1% | `philosophy` | 0.0001 | 0.0103 | under | `describe`&nbsp;35 `lemma`&nbsp;73 `explain`&nbsp;12 `each`&nbsp;21 |
| 2.7% | `lexicography` | 0.0367 | 0.0131 | **over** | `citation`&nbsp;93 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |

### `code-semantics-api/src/test/java`

**0.1969 bits** from the repository, against a null median of 0.1531 over 999 resamples of the same size — an excess of +0.0438, and 55 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.3% | `telecommunication` | 0.0017 | 0.0455 | under | `file`&nbsp;168 `entry`&nbsp;144 `note`&nbsp;9 `record`&nbsp;3 |
| 6.8% | `plants` | 0.0004 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;106 `seed`&nbsp;20 `leaf`&nbsp;12 |
| 6.4% | `biology` | 0.0384 | 0.0032 | **over** | `morphology`&nbsp;16 `owl`&nbsp;31 `person`&nbsp;20 `glob`&nbsp;5 |
| 6.3% | `literature` | 0.0002 | 0.0266 | under | `header`&nbsp;70 `text`&nbsp;44 `write`&nbsp;352 `title`&nbsp;12 |
| 4.6% | `electronics` | 0.0005 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;142 `default`&nbsp;24 `node`&nbsp;48 |
| 4.1% | `politics` | 0.0553 | 0.0164 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;396 `name`&nbsp;484 |
| 4.0% | `law` | 0.0971 | 0.0425 | **over** | `file`&nbsp;331 `witness`&nbsp;69 `cite`&nbsp;112 `evidence`&nbsp;118 |
| 3.5% | `publishing` | 0.0172 | 0.0532 | under | `publish`&nbsp;177 `read`&nbsp;115 `directory`&nbsp;48 `write`&nbsp;352 |

### `code-semantics-engine/src/main/java`

**0.0611 bits** from the repository, against a null median of 0.0234 over 999 resamples of the same size — an excess of +0.0377, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.5% | `electronics` | 0.0005 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;142 `default`&nbsp;24 `node`&nbsp;48 |
| 10.7% | `chemistry` | 0.0021 | 0.0210 | under | `syn`&nbsp;15 `extraction`&nbsp;49 `extract`&nbsp;7 `test`&nbsp;165 |
| 8.7% | `psychology` | 0.0004 | 0.0127 | under | `module`&nbsp;74 `confidence`&nbsp;20 `know`&nbsp;57 `test`&nbsp;165 |
| 5.7% | `grammar` | 0.0516 | 0.0247 | **over** | `phrase`&nbsp;139 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 3.5% | `linguistics` | 0.2514 | 0.2001 | **over** | `word`&nbsp;1,060 `term`&nbsp;249 `name`&nbsp;428 `parse`&nbsp;97 |
| 2.5% | `politics` | 0.0305 | 0.0164 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;396 `name`&nbsp;484 |
| 2.5% | `computer-languages` | 0.0001 | 0.0038 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;36 |
| 2.4% | `animals` | 0.0015 | 0.0073 | under | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;31 |

### `code-semantics-engine/src/test/java`

**0.0619 bits** from the repository, against a null median of 0.0256 over 999 resamples of the same size — an excess of +0.0363, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.5% | `plants` | 0.0854 | 0.0295 | **over** | `root`&nbsp;97 `tree`&nbsp;106 `seed`&nbsp;20 `leaf`&nbsp;12 |
| 15.6% | `electronics` | 0.0002 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;142 `default`&nbsp;24 `node`&nbsp;48 |
| 8.4% | `chemistry` | 0.0033 | 0.0210 | under | `syn`&nbsp;15 `extraction`&nbsp;49 `extract`&nbsp;7 `test`&nbsp;165 |
| 2.7% | `animals` | 0.0013 | 0.0073 | under | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;31 |
| 2.6% | `computer-languages` | 0.0001 | 0.0038 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;36 |
| 2.5% | `christianity` | 0.0004 | 0.0046 | under | `kind`&nbsp;48 `use`&nbsp;65 `publish`&nbsp;177 `publisher`&nbsp;57 |
| 2.4% | `astrology` | 0.0147 | 0.0057 | **over** | `placement`&nbsp;40 `figure`&nbsp;49 `term`&nbsp;257 `configuration`&nbsp;3 |
| 2.2% | `psychology` | 0.0047 | 0.0127 | under | `module`&nbsp;74 `confidence`&nbsp;20 `know`&nbsp;57 `test`&nbsp;165 |

### `lexicon-extraction/src/main/java`

**0.1687 bits** from the repository, against a null median of 0.0566 over 999 resamples of the same size — an excess of +0.1120, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.9% | `linguistics` | 0.0914 | 0.2001 | under | `word`&nbsp;1,060 `term`&nbsp;249 `name`&nbsp;428 `parse`&nbsp;97 |
| 6.8% | `literature` | 0.0847 | 0.0266 | **over** | `header`&nbsp;70 `text`&nbsp;44 `write`&nbsp;352 `title`&nbsp;12 |
| 6.3% | `plants` | 0.0018 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;106 `seed`&nbsp;20 `leaf`&nbsp;12 |
| 5.6% | `animals` | 0.0413 | 0.0073 | **over** | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;31 |
| 5.4% | `grammar` | 0.0014 | 0.0247 | under | `phrase`&nbsp;139 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 4.5% | `computer-languages` | 0.0283 | 0.0038 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;36 |
| 4.5% | `physics` | 0.0013 | 0.0210 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.0% | `electronics` | 0.0587 | 0.0208 | **over** | `tsv`&nbsp;38 `field`&nbsp;142 `default`&nbsp;24 `node`&nbsp;48 |

### `lexicon-extraction/src/test/java`

**0.1982 bits** from the repository, against a null median of 0.0709 over 999 resamples of the same size — an excess of +0.1273, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.2% | `chemistry` | 0.1461 | 0.0210 | **over** | `syn`&nbsp;15 `extraction`&nbsp;49 `extract`&nbsp;7 `test`&nbsp;165 |
| 15.6% | `electronics` | 0.1281 | 0.0208 | **over** | `tsv`&nbsp;38 `field`&nbsp;142 `default`&nbsp;24 `node`&nbsp;48 |
| 6.2% | `linguistics` | 0.1002 | 0.2001 | under | `word`&nbsp;1,060 `term`&nbsp;249 `name`&nbsp;428 `parse`&nbsp;97 |
| 3.6% | `physics` | 0.0015 | 0.0210 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.4% | `person` | 0.0028 | 0.0232 | under | `reader`&nbsp;97 `child`&nbsp;19 `host`&nbsp;27 `bearer`&nbsp;18 |
| 3.0% | `lexicography` | 0.0002 | 0.0131 | under | `citation`&nbsp;93 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 2.6% | `law` | 0.0146 | 0.0425 | under | `file`&nbsp;331 `witness`&nbsp;69 `cite`&nbsp;112 `evidence`&nbsp;118 |
| 2.2% | `politics` | 0.0023 | 0.0164 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;396 `name`&nbsp;484 |

### `lexicon/src/main/java`

**0.1604 bits** from the repository, against a null median of 0.1079 over 999 resamples of the same size — an excess of +0.0525, and 5 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `plants` | 0.0000 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;106 `seed`&nbsp;20 `leaf`&nbsp;12 |
| 6.1% | `mathematics` | 0.1239 | 0.0552 | **over** | `from`&nbsp;106 `function`&nbsp;61 `lemma`&nbsp;73 `distribution`&nbsp;57 |
| 5.7% | `person` | 0.0707 | 0.0232 | **over** | `reader`&nbsp;97 `child`&nbsp;19 `host`&nbsp;27 `bearer`&nbsp;18 |
| 5.4% | `physics` | 0.0006 | 0.0210 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.3% | `networking` | 0.0338 | 0.0071 | **over** | `resource`&nbsp;196 `request`&nbsp;19 `preamble`&nbsp;5 `endpoint`&nbsp;12 |
| 3.8% | `linguistics` | 0.2910 | 0.2001 | **over** | `word`&nbsp;1,060 `term`&nbsp;249 `name`&nbsp;428 `parse`&nbsp;97 |
| 3.6% | `publishing` | 0.0196 | 0.0532 | under | `publish`&nbsp;177 `read`&nbsp;115 `directory`&nbsp;48 `write`&nbsp;352 |
| 3.2% | `philosophy` | 0.0350 | 0.0103 | **over** | `describe`&nbsp;35 `lemma`&nbsp;73 `explain`&nbsp;12 `each`&nbsp;21 |

### `lexicon/src/test/java`

**0.1522 bits** from the repository, against a null median of 0.1158 over 999 resamples of the same size — an excess of +0.0364, and 30 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `plants` | 0.0002 | 0.0295 | under | `root`&nbsp;97 `tree`&nbsp;106 `seed`&nbsp;20 `leaf`&nbsp;12 |
| 9.0% | `linguistics` | 0.3427 | 0.2001 | **over** | `word`&nbsp;1,060 `term`&nbsp;249 `name`&nbsp;428 `parse`&nbsp;97 |
| 6.8% | `electronics` | 0.0000 | 0.0208 | under | `tsv`&nbsp;38 `field`&nbsp;142 `default`&nbsp;24 `node`&nbsp;48 |
| 5.3% | `physics` | 0.0010 | 0.0210 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.0% | `lexicography` | 0.0477 | 0.0131 | **over** | `citation`&nbsp;93 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 3.6% | `politics` | 0.0014 | 0.0164 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;396 `name`&nbsp;484 |
| 2.3% | `baseball` | 0.0208 | 0.0053 | **over** | `field`&nbsp;142 `outer`&nbsp;6 `line`&nbsp;174 `look`&nbsp;30 |
| 2.1% | `military` | 0.0031 | 0.0154 | under | `repository`&nbsp;336 `base`&nbsp;46 `column`&nbsp;42 `refuse`&nbsp;96 |

### `documentation`

**0.2304 bits** from the repository, against a null median of 0.4131 over 999 resamples of the same size — an excess of -0.1827, and 995 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 4.5 s, recorded rather than estimated.
