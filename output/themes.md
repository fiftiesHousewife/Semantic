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
| `linguistics` | 0.0605 | 82.5% | 3,498 | 123 | 9,652 | 36.0% | `word`&nbsp;1,128 `term`&nbsp;305 `name`&nbsp;467 `lexicon`&nbsp;160 |
| `computing` | 0.0123 | 83.8% | 4,720 | 21 | 1,554 | 5.8% | `repository`&nbsp;368 `parse`&nbsp;129 `read`&nbsp;615 `unread`&nbsp;9 |
| `grammar` | 0.0096 | 89.3% | 1,880 | 18 | 1,447 | 5.4% | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;118 |

Read over 368 files and 26,808 lines: 463 topics, 1 files no topic could be resolved for, and 36.0% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.5% of it; the other 75.5% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1453 bits** from the repository, against a null median of 0.0883 over 999 resamples of the same size — an excess of +0.0571, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.4% | `telecommunication` | 0.0002 | 0.0490 | under | `file`&nbsp;179 `entry`&nbsp;161 `note`&nbsp;9 `record`&nbsp;3 |
| 9.1% | `publishing` | 0.0108 | 0.0591 | under | `publish`&nbsp;221 `read`&nbsp;135 `write`&nbsp;404 `directory`&nbsp;49 |
| 7.7% | `plants` | 0.0013 | 0.0288 | under | `root`&nbsp;105 `tree`&nbsp;120 `seed`&nbsp;20 `leaf`&nbsp;14 |
| 5.8% | `electronics` | 0.0007 | 0.0206 | under | `tsv`&nbsp;38 `field`&nbsp;154 `default`&nbsp;25 `node`&nbsp;53 |
| 5.1% | `physics` | 0.0530 | 0.0162 | **over** | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.6% | `time_period` | 0.0196 | 0.0027 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;16 |
| 2.6% | `philosophy` | 0.0000 | 0.0079 | under | `lemma`&nbsp;72 `describe`&nbsp;35 `explain`&nbsp;12 `each`&nbsp;25 |
| 2.1% | `lexicography` | 0.0320 | 0.0128 | **over** | `citation`&nbsp;96 `sense`&nbsp;306 `lexicon`&nbsp;160 `gloss`&nbsp;2 |

### `code-semantics-api/src/test/java`

**0.1932 bits** from the repository, against a null median of 0.1398 over 999 resamples of the same size — an excess of +0.0534, and 21 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.3% | `telecommunication` | 0.0009 | 0.0490 | under | `file`&nbsp;179 `entry`&nbsp;161 `note`&nbsp;9 `record`&nbsp;3 |
| 7.1% | `plants` | 0.0002 | 0.0288 | under | `root`&nbsp;105 `tree`&nbsp;120 `seed`&nbsp;20 `leaf`&nbsp;14 |
| 6.5% | `linguistics` | 0.3966 | 0.2472 | **over** | `word`&nbsp;1,128 `term`&nbsp;305 `name`&nbsp;467 `lexicon`&nbsp;160 |
| 6.0% | `biology` | 0.0342 | 0.0027 | **over** | `morphology`&nbsp;16 `owl`&nbsp;31 `person`&nbsp;20 `glob`&nbsp;5 |
| 5.9% | `literature` | 0.0003 | 0.0245 | under | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;404 `title`&nbsp;13 |
| 4.9% | `electronics` | 0.0002 | 0.0206 | under | `tsv`&nbsp;38 `field`&nbsp;154 `default`&nbsp;25 `node`&nbsp;53 |
| 4.8% | `chemistry` | 0.0042 | 0.0331 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;176 |
| 4.7% | `publishing` | 0.0167 | 0.0591 | under | `publish`&nbsp;221 `read`&nbsp;135 `write`&nbsp;404 `directory`&nbsp;49 |

### `code-semantics-engine/src/main/java`

**0.0660 bits** from the repository, against a null median of 0.0197 over 999 resamples of the same size — an excess of +0.0464, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.4% | `chemistry` | 0.0012 | 0.0331 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;176 |
| 13.9% | `electronics` | 0.0004 | 0.0206 | under | `tsv`&nbsp;38 `field`&nbsp;154 `default`&nbsp;25 `node`&nbsp;53 |
| 7.9% | `psychology` | 0.0003 | 0.0123 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;59 `test`&nbsp;176 |
| 5.5% | `grammar` | 0.0725 | 0.0393 | **over** | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;118 |
| 3.4% | `politics` | 0.0315 | 0.0147 | **over** | `vote`&nbsp;55 `normalisation`&nbsp;13 `reading`&nbsp;496 `name`&nbsp;527 |
| 2.8% | `animals` | 0.0003 | 0.0051 | under | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 2.5% | `telecommunication` | 0.0727 | 0.0490 | **over** | `file`&nbsp;179 `entry`&nbsp;161 `note`&nbsp;9 `record`&nbsp;3 |
| 2.4% | `computer-languages` | 0.0002 | 0.0040 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |

### `code-semantics-engine/src/test/java`

**0.0679 bits** from the repository, against a null median of 0.0208 over 999 resamples of the same size — an excess of +0.0471, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.7% | `chemistry` | 0.0016 | 0.0331 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;176 |
| 17.5% | `plants` | 0.0899 | 0.0288 | **over** | `root`&nbsp;105 `tree`&nbsp;120 `seed`&nbsp;20 `leaf`&nbsp;14 |
| 14.0% | `electronics` | 0.0002 | 0.0206 | under | `tsv`&nbsp;38 `field`&nbsp;154 `default`&nbsp;25 `node`&nbsp;53 |
| 2.8% | `publishing` | 0.0866 | 0.0591 | **over** | `publish`&nbsp;221 `read`&nbsp;135 `write`&nbsp;404 `directory`&nbsp;49 |
| 2.5% | `animals` | 0.0004 | 0.0051 | under | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 2.4% | `psychology` | 0.0039 | 0.0123 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;59 `test`&nbsp;176 |
| 2.4% | `computer-languages` | 0.0001 | 0.0040 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 2.2% | `computer_science` | 0.0131 | 0.0047 | **over** | `parse`&nbsp;129 `parser`&nbsp;26 `byte`&nbsp;11 `lookup`&nbsp;12 |

### `lexicon-extraction/src/main/java`

**0.1489 bits** from the repository, against a null median of 0.0506 over 999 resamples of the same size — an excess of +0.0983, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.1% | `grammar` | 0.0011 | 0.0393 | under | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;118 |
| 7.6% | `linguistics` | 0.1384 | 0.2472 | under | `word`&nbsp;1,128 `term`&nbsp;305 `name`&nbsp;467 `lexicon`&nbsp;160 |
| 7.4% | `plants` | 0.0014 | 0.0288 | under | `root`&nbsp;105 `tree`&nbsp;120 `seed`&nbsp;20 `leaf`&nbsp;14 |
| 7.4% | `literature` | 0.0792 | 0.0245 | **over** | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;404 `title`&nbsp;13 |
| 4.9% | `computer-languages` | 0.0278 | 0.0040 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;40 |
| 4.9% | `electronics` | 0.0599 | 0.0206 | **over** | `tsv`&nbsp;38 `field`&nbsp;154 `default`&nbsp;25 `node`&nbsp;53 |
| 4.2% | `animals` | 0.0277 | 0.0051 | **over** | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 3.8% | `physics` | 0.0011 | 0.0162 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |

### `lexicon-extraction/src/test/java`

**0.2114 bits** from the repository, against a null median of 0.0652 over 999 resamples of the same size — an excess of +0.1462, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 28.7% | `chemistry` | 0.2320 | 0.0331 | **over** | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;176 |
| 12.6% | `electronics` | 0.1160 | 0.0206 | **over** | `tsv`&nbsp;38 `field`&nbsp;154 `default`&nbsp;25 `node`&nbsp;53 |
| 4.8% | `grammar` | 0.0056 | 0.0393 | under | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;118 |
| 4.8% | `linguistics` | 0.1435 | 0.2472 | under | `word`&nbsp;1,128 `term`&nbsp;305 `name`&nbsp;467 `lexicon`&nbsp;160 |
| 3.5% | `person` | 0.0020 | 0.0229 | under | `reader`&nbsp;105 `child`&nbsp;18 `host`&nbsp;27 `bearer`&nbsp;18 |
| 2.9% | `law` | 0.0094 | 0.0365 | under | `file`&nbsp;360 `witness`&nbsp;70 `summary`&nbsp;44 `within`&nbsp;8 |
| 2.7% | `plants` | 0.0061 | 0.0288 | under | `root`&nbsp;105 `tree`&nbsp;120 `seed`&nbsp;20 `leaf`&nbsp;14 |
| 2.6% | `physics` | 0.0012 | 0.0162 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |

### `lexicon/src/main/java`

**0.1491 bits** from the repository, against a null median of 0.0986 over 999 resamples of the same size — an excess of +0.0505, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `plants` | 0.0000 | 0.0288 | under | `root`&nbsp;105 `tree`&nbsp;120 `seed`&nbsp;20 `leaf`&nbsp;14 |
| 6.2% | `publishing` | 0.0165 | 0.0591 | under | `publish`&nbsp;221 `read`&nbsp;135 `write`&nbsp;404 `directory`&nbsp;49 |
| 5.0% | `person` | 0.0646 | 0.0229 | **over** | `reader`&nbsp;105 `child`&nbsp;18 `host`&nbsp;27 `bearer`&nbsp;18 |
| 4.5% | `physics` | 0.0005 | 0.0162 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.4% | `networking` | 0.0291 | 0.0052 | **over** | `resource`&nbsp;237 `request`&nbsp;11 `preamble`&nbsp;5 `share`&nbsp;226 |
| 4.4% | `grammar` | 0.0862 | 0.0393 | **over** | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;118 |
| 3.5% | `linguistics` | 0.3395 | 0.2472 | **over** | `word`&nbsp;1,128 `term`&nbsp;305 `name`&nbsp;467 `lexicon`&nbsp;160 |
| 3.3% | `law` | 0.0114 | 0.0365 | under | `file`&nbsp;360 `witness`&nbsp;70 `summary`&nbsp;44 `within`&nbsp;8 |

### `lexicon/src/test/java`

**0.1479 bits** from the repository, against a null median of 0.1057 over 999 resamples of the same size — an excess of +0.0422, and 22 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.4% | `linguistics` | 0.4716 | 0.2472 | **over** | `word`&nbsp;1,128 `term`&nbsp;305 `name`&nbsp;467 `lexicon`&nbsp;160 |
| 9.6% | `plants` | 0.0001 | 0.0288 | under | `root`&nbsp;105 `tree`&nbsp;120 `seed`&nbsp;20 `leaf`&nbsp;14 |
| 8.2% | `lexicography` | 0.0605 | 0.0128 | **over** | `citation`&nbsp;96 `sense`&nbsp;306 `lexicon`&nbsp;160 `gloss`&nbsp;2 |
| 6.9% | `electronics` | 0.0000 | 0.0206 | under | `tsv`&nbsp;38 `field`&nbsp;154 `default`&nbsp;25 `node`&nbsp;53 |
| 4.3% | `physics` | 0.0007 | 0.0162 | under | `mass`&nbsp;130 `weight`&nbsp;49 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.0% | `politics` | 0.0016 | 0.0147 | under | `vote`&nbsp;55 `normalisation`&nbsp;13 `reading`&nbsp;496 `name`&nbsp;527 |
| 2.9% | `psychology` | 0.0009 | 0.0123 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;59 `test`&nbsp;176 |
| 2.1% | `military` | 0.0029 | 0.0145 | under | `repository`&nbsp;368 `column`&nbsp;43 `base`&nbsp;42 `refuse`&nbsp;107 |

### `documentation`

**0.2722 bits** from the repository, against a null median of 0.3231 over 999 resamples of the same size — an excess of -0.0508, and 810 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 6.2 s, recorded rather than estimated.
