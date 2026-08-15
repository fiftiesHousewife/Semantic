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
| `linguistics` | 0.0611 | 82.7% | 3,421 | 128 | 9,857 | 37.6% | `word`&nbsp;1,086 `term`&nbsp;297 `name`&nbsp;466 `lexicon`&nbsp;160 |
| `computing` | 0.0121 | 83.6% | 4,601 | 20 | 1,469 | 5.6% | `repository`&nbsp;362 `parse`&nbsp;125 `read`&nbsp;603 `unread`&nbsp;9 |

Read over 363 files and 26,212 lines: 466 topics, 1 files no topic could be resolved for, and 37.6% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 23.9% of it; the other 76.1% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1461 bits** from the repository, against a null median of 0.0880 over 999 resamples of the same size — an excess of +0.0581, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.9% | `telecommunication` | 0.0002 | 0.0509 | under | `file`&nbsp;181 `entry`&nbsp;147 `note`&nbsp;9 `record`&nbsp;3 |
| 8.0% | `publishing` | 0.0117 | 0.0570 | under | `publish`&nbsp;185 `read`&nbsp;123 `directory`&nbsp;51 `write`&nbsp;365 |
| 7.9% | `plants` | 0.0014 | 0.0298 | under | `root`&nbsp;104 `tree`&nbsp;119 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 6.0% | `electronics` | 0.0007 | 0.0213 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;25 `node`&nbsp;53 |
| 5.4% | `physics` | 0.0558 | 0.0170 | **over** | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.8% | `time_period` | 0.0206 | 0.0028 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;12 |
| 2.7% | `philosophy` | 0.0000 | 0.0081 | under | `describe`&nbsp;35 `lemma`&nbsp;70 `explain`&nbsp;12 `each`&nbsp;24 |
| 2.3% | `lexicography` | 0.0337 | 0.0133 | **over** | `citation`&nbsp;94 `sense`&nbsp;305 `lexicon`&nbsp;160 `gloss`&nbsp;2 |

### `code-semantics-api/src/test/java`

**0.1953 bits** from the repository, against a null median of 0.1381 over 999 resamples of the same size — an excess of +0.0571, and 19 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.6% | `telecommunication` | 0.0009 | 0.0509 | under | `file`&nbsp;181 `entry`&nbsp;147 `note`&nbsp;9 `record`&nbsp;3 |
| 7.2% | `plants` | 0.0002 | 0.0298 | under | `root`&nbsp;104 `tree`&nbsp;119 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 6.5% | `linguistics` | 0.4072 | 0.2553 | **over** | `word`&nbsp;1,086 `term`&nbsp;297 `name`&nbsp;466 `lexicon`&nbsp;160 |
| 6.1% | `biology` | 0.0354 | 0.0028 | **over** | `morphology`&nbsp;16 `owl`&nbsp;31 `person`&nbsp;20 `glob`&nbsp;5 |
| 6.0% | `literature` | 0.0003 | 0.0253 | under | `header`&nbsp;68 `text`&nbsp;47 `write`&nbsp;365 `title`&nbsp;13 |
| 5.0% | `electronics` | 0.0002 | 0.0213 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;25 `node`&nbsp;53 |
| 5.0% | `chemistry` | 0.0041 | 0.0343 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;171 |
| 4.6% | `politics` | 0.0560 | 0.0151 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;481 `name`&nbsp;526 |

### `code-semantics-engine/src/main/java`

**0.0681 bits** from the repository, against a null median of 0.0200 over 999 resamples of the same size — an excess of +0.0481, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.5% | `chemistry` | 0.0012 | 0.0343 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;171 |
| 14.2% | `electronics` | 0.0003 | 0.0213 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;25 `node`&nbsp;53 |
| 8.0% | `psychology` | 0.0003 | 0.0127 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;57 `test`&nbsp;171 |
| 7.0% | `grammar` | 0.0558 | 0.0238 | **over** | `phrase`&nbsp;146 `verb`&nbsp;66 `occurrence`&nbsp;115 `clause`&nbsp;24 |
| 3.5% | `politics` | 0.0328 | 0.0151 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;481 `name`&nbsp;526 |
| 2.5% | `telecommunication` | 0.0750 | 0.0509 | **over** | `file`&nbsp;181 `entry`&nbsp;147 `note`&nbsp;9 `record`&nbsp;3 |
| 2.4% | `computer-languages` | 0.0002 | 0.0041 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 1.8% | `physics` | 0.0296 | 0.0170 | **over** | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |

### `code-semantics-engine/src/test/java`

**0.0680 bits** from the repository, against a null median of 0.0209 over 999 resamples of the same size — an excess of +0.0471, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.2% | `chemistry` | 0.0017 | 0.0343 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;171 |
| 18.8% | `plants` | 0.0946 | 0.0298 | **over** | `root`&nbsp;104 `tree`&nbsp;119 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 14.4% | `electronics` | 0.0002 | 0.0213 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;25 `node`&nbsp;53 |
| 2.5% | `psychology` | 0.0041 | 0.0127 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;57 `test`&nbsp;171 |
| 2.5% | `computer-languages` | 0.0001 | 0.0041 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 1.9% | `animals` | 0.0011 | 0.0058 | under | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |
| 1.7% | `physiology` | 0.0000 | 0.0024 | under | `dump`&nbsp;20 `map`&nbsp;27 `parity`&nbsp;4 `system`&nbsp;7 |
| 1.7% | `christianity` | 0.0004 | 0.0036 | under | `kind`&nbsp;48 `use`&nbsp;68 `publish`&nbsp;185 `publisher`&nbsp;63 |

### `lexicon-extraction/src/main/java`

**0.1411 bits** from the repository, against a null median of 0.0503 over 999 resamples of the same size — an excess of +0.0908, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.7% | `linguistics` | 0.1401 | 0.2553 | under | `word`&nbsp;1,086 `term`&nbsp;297 `name`&nbsp;466 `lexicon`&nbsp;160 |
| 8.1% | `plants` | 0.0014 | 0.0298 | under | `root`&nbsp;104 `tree`&nbsp;119 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 7.5% | `literature` | 0.0791 | 0.0253 | **over** | `header`&nbsp;68 `text`&nbsp;47 `write`&nbsp;365 `title`&nbsp;13 |
| 6.6% | `grammar` | 0.0011 | 0.0238 | under | `phrase`&nbsp;146 `verb`&nbsp;66 `occurrence`&nbsp;115 `clause`&nbsp;24 |
| 5.0% | `computer-languages` | 0.0278 | 0.0041 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 4.9% | `electronics` | 0.0598 | 0.0213 | **over** | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;25 `node`&nbsp;53 |
| 4.3% | `physics` | 0.0011 | 0.0170 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.0% | `animals` | 0.0277 | 0.0058 | **over** | `nest`&nbsp;27 `owl`&nbsp;31 `down`&nbsp;5 `head`&nbsp;32 |

### `lexicon-extraction/src/test/java`

**0.2065 bits** from the repository, against a null median of 0.0628 over 999 resamples of the same size — an excess of +0.1437, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 29.0% | `chemistry` | 0.2334 | 0.0343 | **over** | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;171 |
| 12.7% | `electronics` | 0.1166 | 0.0213 | **over** | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;25 `node`&nbsp;53 |
| 6.0% | `linguistics` | 0.1397 | 0.2553 | under | `word`&nbsp;1,086 `term`&nbsp;297 `name`&nbsp;466 `lexicon`&nbsp;160 |
| 3.7% | `person` | 0.0020 | 0.0235 | under | `reader`&nbsp;104 `child`&nbsp;18 `host`&nbsp;27 `bearer`&nbsp;18 |
| 3.2% | `law` | 0.0095 | 0.0377 | under | `file`&nbsp;365 `witness`&nbsp;70 `summary`&nbsp;43 `within`&nbsp;8 |
| 3.0% | `plants` | 0.0061 | 0.0298 | under | `root`&nbsp;104 `tree`&nbsp;119 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 2.9% | `physics` | 0.0012 | 0.0170 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 2.3% | `politics` | 0.0014 | 0.0151 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;481 `name`&nbsp;526 |

### `lexicon/src/main/java`

**0.1477 bits** from the repository, against a null median of 0.0973 over 999 resamples of the same size — an excess of +0.0503, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.1% | `plants` | 0.0000 | 0.0298 | under | `root`&nbsp;104 `tree`&nbsp;119 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 5.7% | `person` | 0.0688 | 0.0235 | **over** | `reader`&nbsp;104 `child`&nbsp;18 `host`&nbsp;27 `bearer`&nbsp;18 |
| 5.1% | `publishing` | 0.0184 | 0.0570 | under | `publish`&nbsp;185 `read`&nbsp;123 `directory`&nbsp;51 `write`&nbsp;365 |
| 5.0% | `linguistics` | 0.3678 | 0.2553 | **over** | `word`&nbsp;1,086 `term`&nbsp;297 `name`&nbsp;466 `lexicon`&nbsp;160 |
| 4.7% | `networking` | 0.0312 | 0.0058 | **over** | `resource`&nbsp;201 `request`&nbsp;19 `preamble`&nbsp;5 `share`&nbsp;225 |
| 4.7% | `physics` | 0.0006 | 0.0170 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.3% | `mathematics` | 0.0959 | 0.0462 | **over** | `from`&nbsp;107 `function`&nbsp;60 `lemma`&nbsp;70 `distribution`&nbsp;60 |
| 4.1% | `law` | 0.0101 | 0.0377 | under | `file`&nbsp;365 `witness`&nbsp;70 `summary`&nbsp;43 `within`&nbsp;8 |

### `lexicon/src/test/java`

**0.1512 bits** from the repository, against a null median of 0.1050 over 999 resamples of the same size — an excess of +0.0462, and 12 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `linguistics` | 0.4815 | 0.2553 | **over** | `word`&nbsp;1,086 `term`&nbsp;297 `name`&nbsp;466 `lexicon`&nbsp;160 |
| 9.7% | `plants` | 0.0001 | 0.0298 | under | `root`&nbsp;104 `tree`&nbsp;119 `seed`&nbsp;20 `leaf`&nbsp;13 |
| 7.9% | `lexicography` | 0.0609 | 0.0133 | **over** | `citation`&nbsp;94 `sense`&nbsp;305 `lexicon`&nbsp;160 `gloss`&nbsp;2 |
| 7.0% | `electronics` | 0.0000 | 0.0213 | under | `tsv`&nbsp;38 `field`&nbsp;155 `default`&nbsp;25 `node`&nbsp;53 |
| 4.4% | `physics` | 0.0007 | 0.0170 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.0% | `politics` | 0.0016 | 0.0151 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;481 `name`&nbsp;526 |
| 2.9% | `psychology` | 0.0009 | 0.0127 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;57 `test`&nbsp;171 |
| 2.1% | `military` | 0.0029 | 0.0151 | under | `repository`&nbsp;362 `column`&nbsp;43 `base`&nbsp;46 `refuse`&nbsp;101 |

### `documentation`

**0.2724 bits** from the repository, against a null median of 0.3199 over 999 resamples of the same size — an excess of -0.0475, and 811 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 5.4 s, recorded rather than estimated.
