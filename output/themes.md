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
| `linguistics` | 0.0602 | 82.5% | 3,507 | 123 | 9,652 | 35.8% | `word`&nbsp;1,130 `term`&nbsp;307 `name`&nbsp;470 `lexicon`&nbsp;160 |
| `computing` | 0.0123 | 83.8% | 4,746 | 21 | 1,554 | 5.8% | `repository`&nbsp;375 `parse`&nbsp;129 `read`&nbsp;615 `unread`&nbsp;9 |
| `grammar` | 0.0096 | 89.3% | 1,887 | 18 | 1,447 | 5.4% | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |

Read over 370 files and 26,970 lines: 463 topics, 1 files no topic could be resolved for, and 35.8% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.4% of it; the other 75.6% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1455 bits** from the repository, against a null median of 0.0882 over 999 resamples of the same size — an excess of +0.0573, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.3% | `telecommunication` | 0.0002 | 0.0489 | under | `file`&nbsp;179 `entry`&nbsp;161 `note`&nbsp;9 `record`&nbsp;3 |
| 9.1% | `publishing` | 0.0108 | 0.0591 | under | `publish`&nbsp;222 `read`&nbsp;135 `write`&nbsp;409 `directory`&nbsp;49 |
| 8.1% | `plants` | 0.0013 | 0.0300 | under | `root`&nbsp;109 `tree`&nbsp;121 `seed`&nbsp;20 `leaf`&nbsp;15 |
| 5.8% | `electronics` | 0.0007 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;25 `node`&nbsp;58 |
| 5.1% | `physics` | 0.0530 | 0.0162 | **over** | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.6% | `time_period` | 0.0196 | 0.0027 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;16 |
| 2.6% | `philosophy` | 0.0000 | 0.0079 | under | `lemma`&nbsp;72 `describe`&nbsp;35 `explain`&nbsp;12 `each`&nbsp;25 |
| 2.1% | `lexicography` | 0.0320 | 0.0128 | **over** | `citation`&nbsp;96 `sense`&nbsp;306 `lexicon`&nbsp;160 `gloss`&nbsp;2 |

### `code-semantics-api/src/test/java`

**0.1932 bits** from the repository, against a null median of 0.1378 over 999 resamples of the same size — an excess of +0.0554, and 37 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.2% | `telecommunication` | 0.0009 | 0.0489 | under | `file`&nbsp;179 `entry`&nbsp;161 `note`&nbsp;9 `record`&nbsp;3 |
| 7.3% | `plants` | 0.0002 | 0.0300 | under | `root`&nbsp;109 `tree`&nbsp;121 `seed`&nbsp;20 `leaf`&nbsp;15 |
| 6.6% | `linguistics` | 0.3966 | 0.2465 | **over** | `word`&nbsp;1,130 `term`&nbsp;307 `name`&nbsp;470 `lexicon`&nbsp;160 |
| 6.0% | `biology` | 0.0342 | 0.0027 | **over** | `morphology`&nbsp;16 `owl`&nbsp;31 `person`&nbsp;20 `glob`&nbsp;5 |
| 5.8% | `literature` | 0.0003 | 0.0244 | under | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;409 `title`&nbsp;13 |
| 4.9% | `electronics` | 0.0002 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;25 `node`&nbsp;58 |
| 4.7% | `chemistry` | 0.0042 | 0.0330 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;177 |
| 4.7% | `publishing` | 0.0167 | 0.0591 | under | `publish`&nbsp;222 `read`&nbsp;135 `write`&nbsp;409 `directory`&nbsp;49 |

### `code-semantics-engine/src/main/java`

**0.0661 bits** from the repository, against a null median of 0.0197 over 999 resamples of the same size — an excess of +0.0464, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.3% | `chemistry` | 0.0012 | 0.0330 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;177 |
| 13.8% | `electronics` | 0.0004 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;25 `node`&nbsp;58 |
| 7.9% | `psychology` | 0.0003 | 0.0123 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;60 `test`&nbsp;177 |
| 5.5% | `grammar` | 0.0725 | 0.0392 | **over** | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |
| 3.4% | `politics` | 0.0315 | 0.0147 | **over** | `vote`&nbsp;55 `normalisation`&nbsp;13 `reading`&nbsp;497 `name`&nbsp;531 |
| 2.8% | `animals` | 0.0003 | 0.0051 | under | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 2.6% | `telecommunication` | 0.0727 | 0.0489 | **over** | `file`&nbsp;179 `entry`&nbsp;161 `note`&nbsp;9 `record`&nbsp;3 |
| 2.4% | `computer-languages` | 0.0002 | 0.0040 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |

### `code-semantics-engine/src/test/java`

**0.0676 bits** from the repository, against a null median of 0.0204 over 999 resamples of the same size — an excess of +0.0473, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.7% | `chemistry` | 0.0016 | 0.0330 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;177 |
| 18.3% | `plants` | 0.0935 | 0.0300 | **over** | `root`&nbsp;109 `tree`&nbsp;121 `seed`&nbsp;20 `leaf`&nbsp;15 |
| 13.9% | `electronics` | 0.0002 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;25 `node`&nbsp;58 |
| 2.7% | `publishing` | 0.0862 | 0.0591 | **over** | `publish`&nbsp;222 `read`&nbsp;135 `write`&nbsp;409 `directory`&nbsp;49 |
| 2.5% | `animals` | 0.0004 | 0.0051 | under | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 2.4% | `psychology` | 0.0039 | 0.0123 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;60 `test`&nbsp;177 |
| 2.4% | `computer-languages` | 0.0001 | 0.0040 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 2.1% | `computer_science` | 0.0129 | 0.0047 | **over** | `parse`&nbsp;129 `parser`&nbsp;26 `byte`&nbsp;11 `lookup`&nbsp;12 |

### `lexicon-extraction/src/main/java`

**0.1494 bits** from the repository, against a null median of 0.0509 over 999 resamples of the same size — an excess of +0.0985, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.0% | `grammar` | 0.0011 | 0.0392 | under | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |
| 7.7% | `plants` | 0.0014 | 0.0300 | under | `root`&nbsp;109 `tree`&nbsp;121 `seed`&nbsp;20 `leaf`&nbsp;15 |
| 7.4% | `linguistics` | 0.1384 | 0.2465 | under | `word`&nbsp;1,130 `term`&nbsp;307 `name`&nbsp;470 `lexicon`&nbsp;160 |
| 7.4% | `literature` | 0.0792 | 0.0244 | **over** | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;409 `title`&nbsp;13 |
| 4.9% | `computer-languages` | 0.0278 | 0.0040 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 4.9% | `electronics` | 0.0599 | 0.0205 | **over** | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;25 `node`&nbsp;58 |
| 4.2% | `animals` | 0.0277 | 0.0051 | **over** | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 3.8% | `physics` | 0.0011 | 0.0162 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |

### `lexicon-extraction/src/test/java`

**0.2121 bits** from the repository, against a null median of 0.0635 over 999 resamples of the same size — an excess of +0.1486, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 28.6% | `chemistry` | 0.2320 | 0.0330 | **over** | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;177 |
| 12.5% | `electronics` | 0.1160 | 0.0205 | **over** | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;25 `node`&nbsp;58 |
| 4.8% | `grammar` | 0.0056 | 0.0392 | under | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |
| 4.7% | `linguistics` | 0.1435 | 0.2465 | under | `word`&nbsp;1,130 `term`&nbsp;307 `name`&nbsp;470 `lexicon`&nbsp;160 |
| 3.5% | `person` | 0.0020 | 0.0231 | under | `reader`&nbsp;110 `child`&nbsp;19 `host`&nbsp;27 `bearer`&nbsp;18 |
| 2.9% | `plants` | 0.0061 | 0.0300 | under | `root`&nbsp;109 `tree`&nbsp;121 `seed`&nbsp;20 `leaf`&nbsp;15 |
| 2.9% | `law` | 0.0094 | 0.0363 | under | `file`&nbsp;361 `witness`&nbsp;70 `summary`&nbsp;44 `within`&nbsp;8 |
| 2.6% | `physics` | 0.0012 | 0.0162 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |

### `lexicon/src/main/java`

**0.1499 bits** from the repository, against a null median of 0.0984 over 999 resamples of the same size — an excess of +0.0515, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.0% | `plants` | 0.0000 | 0.0300 | under | `root`&nbsp;109 `tree`&nbsp;121 `seed`&nbsp;20 `leaf`&nbsp;15 |
| 6.1% | `publishing` | 0.0165 | 0.0591 | under | `publish`&nbsp;222 `read`&nbsp;135 `write`&nbsp;409 `directory`&nbsp;49 |
| 4.9% | `person` | 0.0646 | 0.0231 | **over** | `reader`&nbsp;110 `child`&nbsp;19 `host`&nbsp;27 `bearer`&nbsp;18 |
| 4.4% | `physics` | 0.0005 | 0.0162 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.4% | `networking` | 0.0291 | 0.0052 | **over** | `resource`&nbsp;238 `request`&nbsp;11 `preamble`&nbsp;5 `node`&nbsp;58 |
| 4.4% | `grammar` | 0.0862 | 0.0392 | **over** | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |
| 3.6% | `linguistics` | 0.3395 | 0.2465 | **over** | `word`&nbsp;1,130 `term`&nbsp;307 `name`&nbsp;470 `lexicon`&nbsp;160 |
| 3.3% | `law` | 0.0114 | 0.0363 | under | `file`&nbsp;361 `witness`&nbsp;70 `summary`&nbsp;44 `within`&nbsp;8 |

### `lexicon/src/test/java`

**0.1489 bits** from the repository, against a null median of 0.1059 over 999 resamples of the same size — an excess of +0.0430, and 21 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.4% | `linguistics` | 0.4716 | 0.2465 | **over** | `word`&nbsp;1,130 `term`&nbsp;307 `name`&nbsp;470 `lexicon`&nbsp;160 |
| 9.9% | `plants` | 0.0001 | 0.0300 | under | `root`&nbsp;109 `tree`&nbsp;121 `seed`&nbsp;20 `leaf`&nbsp;15 |
| 8.2% | `lexicography` | 0.0605 | 0.0128 | **over** | `citation`&nbsp;96 `sense`&nbsp;306 `lexicon`&nbsp;160 `gloss`&nbsp;2 |
| 6.9% | `electronics` | 0.0000 | 0.0205 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;25 `node`&nbsp;58 |
| 4.3% | `physics` | 0.0007 | 0.0162 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.0% | `politics` | 0.0016 | 0.0147 | under | `vote`&nbsp;55 `normalisation`&nbsp;13 `reading`&nbsp;497 `name`&nbsp;531 |
| 2.8% | `psychology` | 0.0009 | 0.0123 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;60 `test`&nbsp;177 |
| 2.1% | `military` | 0.0029 | 0.0145 | under | `repository`&nbsp;375 `column`&nbsp;43 `base`&nbsp;42 `refuse`&nbsp;107 |

### `documentation`

**0.2726 bits** from the repository, against a null median of 0.3190 over 999 resamples of the same size — an excess of -0.0464, and 798 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 7.1 s, recorded rather than estimated.
