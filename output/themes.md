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
| `linguistics` | 0.0589 | 82.6% | 3,486 | 129 | 10,237 | 36.4% | `word`&nbsp;1,127 `term`&nbsp;307 `name`&nbsp;485 `lexicon`&nbsp;155 |
| `computing` | 0.0123 | 82.8% | 4,926 | 20 | 1,352 | 4.8% | `repository`&nbsp;378 `parse`&nbsp;130 `read`&nbsp;636 `unread`&nbsp;9 |
| `grammar` | 0.0093 | 89.3% | 1,933 | 18 | 1,447 | 5.1% | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `verb`&nbsp;62 `occurrence`&nbsp;119 |

Read over 383 files and 28,101 lines: 460 topics, 1 files no topic could be resolved for, and 36.4% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.2% of it; the other 75.8% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1450 bits** from the repository, against a null median of 0.0896 over 999 resamples of the same size — an excess of +0.0554, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.3% | `telecommunication` | 0.0002 | 0.0400 | under | `file`&nbsp;190 `entry`&nbsp;162 `note`&nbsp;7 `record`&nbsp;3 |
| 7.9% | `plants` | 0.0018 | 0.0312 | under | `root`&nbsp;128 `tree`&nbsp;142 `seed`&nbsp;16 `leaf`&nbsp;17 |
| 7.0% | `publishing` | 0.0121 | 0.0533 | under | `publish`&nbsp;221 `read`&nbsp;140 `write`&nbsp;442 `directory`&nbsp;49 |
| 6.4% | `physics` | 0.0659 | 0.0201 | **over** | `mass`&nbsp;128 `weight`&nbsp;51 `radius`&nbsp;4 `length`&nbsp;37 |
| 4.6% | `electronics` | 0.0007 | 0.0170 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 3.5% | `time_period` | 0.0207 | 0.0032 | **over** | `span`&nbsp;15 `none`&nbsp;3 `even`&nbsp;4 `longest`&nbsp;16 |
| 3.1% | `lexicography` | 0.0351 | 0.0117 | **over** | `citation`&nbsp;93 `sense`&nbsp;306 `lexicon`&nbsp;155 `gloss`&nbsp;2 |
| 2.8% | `philosophy` | 0.0001 | 0.0087 | under | `lemma`&nbsp;70 `describe`&nbsp;34 `explain`&nbsp;11 `that`&nbsp;85 |

### `code-semantics-api/src/test/java`

**0.1909 bits** from the repository, against a null median of 0.1412 over 999 resamples of the same size — an excess of +0.0497, and 24 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `telecommunication` | 0.0016 | 0.0400 | under | `file`&nbsp;190 `entry`&nbsp;162 `note`&nbsp;7 `record`&nbsp;3 |
| 7.5% | `plants` | 0.0004 | 0.0312 | under | `root`&nbsp;128 `tree`&nbsp;142 `seed`&nbsp;16 `leaf`&nbsp;17 |
| 6.5% | `linguistics` | 0.3770 | 0.2331 | **over** | `word`&nbsp;1,127 `term`&nbsp;307 `name`&nbsp;485 `lexicon`&nbsp;155 |
| 5.7% | `literature` | 0.0002 | 0.0232 | under | `header`&nbsp;68 `text`&nbsp;50 `write`&nbsp;442 `title`&nbsp;13 |
| 5.1% | `biology` | 0.0300 | 0.0026 | **over** | `morphology`&nbsp;15 `owl`&nbsp;21 `person`&nbsp;20 `glob`&nbsp;5 |
| 4.5% | `politics` | 0.0535 | 0.0144 | **over** | `vote`&nbsp;54 `normalisation`&nbsp;12 `reading`&nbsp;540 `name`&nbsp;548 |
| 4.2% | `publishing` | 0.0155 | 0.0533 | under | `publish`&nbsp;221 `read`&nbsp;140 `write`&nbsp;442 `directory`&nbsp;49 |
| 3.8% | `electronics` | 0.0004 | 0.0170 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |

### `code-semantics-engine/src/main/java`

**0.0539 bits** from the repository, against a null median of 0.0198 over 999 resamples of the same size — an excess of +0.0341, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.5% | `chemistry` | 0.0018 | 0.0265 | under | `extraction`&nbsp;127 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;182 |
| 13.0% | `electronics` | 0.0005 | 0.0170 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 8.3% | `psychology` | 0.0004 | 0.0109 | under | `module`&nbsp;71 `confidence`&nbsp;20 `know`&nbsp;61 `test`&nbsp;182 |
| 5.1% | `grammar` | 0.0603 | 0.0337 | **over** | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `verb`&nbsp;62 `occurrence`&nbsp;119 |
| 3.5% | `animals` | 0.0003 | 0.0051 | under | `nest`&nbsp;27 `owl`&nbsp;21 `head`&nbsp;15 `posterior`&nbsp;6 |
| 2.4% | `politics` | 0.0263 | 0.0144 | **over** | `vote`&nbsp;54 `normalisation`&nbsp;12 `reading`&nbsp;540 `name`&nbsp;548 |
| 2.3% | `computer_science` | 0.0010 | 0.0054 | under | `parse`&nbsp;130 `parser`&nbsp;27 `byte`&nbsp;11 `lookup`&nbsp;12 |
| 2.2% | `computer-languages` | 0.0001 | 0.0030 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;40 |

### `code-semantics-engine/src/test/java`

**0.0544 bits** from the repository, against a null median of 0.0194 over 999 resamples of the same size — an excess of +0.0350, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.7% | `plants` | 0.0800 | 0.0312 | **over** | `root`&nbsp;128 `tree`&nbsp;142 `seed`&nbsp;16 `leaf`&nbsp;17 |
| 14.3% | `chemistry` | 0.0030 | 0.0265 | under | `extraction`&nbsp;127 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;182 |
| 13.9% | `electronics` | 0.0003 | 0.0170 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 3.2% | `animals` | 0.0004 | 0.0051 | under | `nest`&nbsp;27 `owl`&nbsp;21 `head`&nbsp;15 `posterior`&nbsp;6 |
| 2.7% | `publishing` | 0.0763 | 0.0533 | **over** | `publish`&nbsp;221 `read`&nbsp;140 `write`&nbsp;442 `directory`&nbsp;49 |
| 2.6% | `computer_science` | 0.0141 | 0.0054 | **over** | `parse`&nbsp;130 `parser`&nbsp;27 `byte`&nbsp;11 `lookup`&nbsp;12 |
| 2.5% | `mathematics` | 0.0284 | 0.0450 | under | `from`&nbsp;121 `function`&nbsp;57 `distribution`&nbsp;62 `lemma`&nbsp;70 |
| 2.5% | `psychology` | 0.0036 | 0.0109 | under | `module`&nbsp;71 `confidence`&nbsp;20 `know`&nbsp;61 `test`&nbsp;182 |

### `lexicon-extraction/src/main/java`

**0.1621 bits** from the repository, against a null median of 0.0522 over 999 resamples of the same size — an excess of +0.1099, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.5% | `grammar` | 0.0011 | 0.0337 | under | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `verb`&nbsp;62 `occurrence`&nbsp;119 |
| 7.1% | `plants` | 0.0017 | 0.0312 | under | `root`&nbsp;128 `tree`&nbsp;142 `seed`&nbsp;16 `leaf`&nbsp;17 |
| 6.7% | `linguistics` | 0.1291 | 0.2331 | under | `word`&nbsp;1,127 `term`&nbsp;307 `name`&nbsp;485 `lexicon`&nbsp;155 |
| 6.7% | `literature` | 0.0763 | 0.0232 | **over** | `header`&nbsp;68 `text`&nbsp;50 `write`&nbsp;442 `title`&nbsp;13 |
| 5.1% | `animals` | 0.0332 | 0.0051 | **over** | `nest`&nbsp;27 `owl`&nbsp;21 `head`&nbsp;15 `posterior`&nbsp;6 |
| 4.6% | `physics` | 0.0011 | 0.0201 | under | `mass`&nbsp;128 `weight`&nbsp;51 `radius`&nbsp;4 `length`&nbsp;37 |
| 4.6% | `electronics` | 0.0544 | 0.0170 | **over** | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 4.1% | `computer-languages` | 0.0239 | 0.0030 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;40 |

### `lexicon-extraction/src/test/java`

**0.2025 bits** from the repository, against a null median of 0.0658 over 999 resamples of the same size — an excess of +0.1368, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 26.9% | `chemistry` | 0.2005 | 0.0265 | **over** | `extraction`&nbsp;127 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;182 |
| 13.4% | `electronics` | 0.1090 | 0.0170 | **over** | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 3.6% | `physics` | 0.0013 | 0.0201 | under | `mass`&nbsp;128 `weight`&nbsp;51 `radius`&nbsp;4 `length`&nbsp;37 |
| 3.4% | `grammar` | 0.0070 | 0.0337 | under | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `verb`&nbsp;62 `occurrence`&nbsp;119 |
| 3.1% | `person` | 0.0024 | 0.0213 | under | `reader`&nbsp;111 `child`&nbsp;20 `host`&nbsp;28 `bearer`&nbsp;18 |
| 2.7% | `linguistics` | 0.1563 | 0.2331 | under | `word`&nbsp;1,127 `term`&nbsp;307 `name`&nbsp;485 `lexicon`&nbsp;155 |
| 2.7% | `law` | 0.0120 | 0.0391 | under | `file`&nbsp;382 `witness`&nbsp;67 `summary`&nbsp;42 `cite`&nbsp;107 |
| 2.2% | `economy` | 0.0001 | 0.0094 | under | `mark_down`&nbsp;14 `found`&nbsp;23 `property`&nbsp;36 `total`&nbsp;10 |

### `lexicon/src/main/java`

**0.1640 bits** from the repository, against a null median of 0.0995 over 999 resamples of the same size — an excess of +0.0645, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.5% | `plants` | 0.0000 | 0.0312 | under | `root`&nbsp;128 `tree`&nbsp;142 `seed`&nbsp;16 `leaf`&nbsp;17 |
| 5.4% | `publishing` | 0.0138 | 0.0533 | under | `publish`&nbsp;221 `read`&nbsp;140 `write`&nbsp;442 `directory`&nbsp;49 |
| 5.3% | `person` | 0.0661 | 0.0213 | **over** | `reader`&nbsp;111 `child`&nbsp;20 `host`&nbsp;28 `bearer`&nbsp;18 |
| 5.2% | `physics` | 0.0005 | 0.0201 | under | `mass`&nbsp;128 `weight`&nbsp;51 `radius`&nbsp;4 `length`&nbsp;37 |
| 5.2% | `mathematics` | 0.1035 | 0.0450 | **over** | `from`&nbsp;121 `function`&nbsp;57 `distribution`&nbsp;62 `lemma`&nbsp;70 |
| 4.2% | `networking` | 0.0308 | 0.0057 | **over** | `resource`&nbsp;243 `preamble`&nbsp;6 `request`&nbsp;11 `node`&nbsp;64 |
| 3.2% | `grammar` | 0.0724 | 0.0337 | **over** | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `verb`&nbsp;62 `occurrence`&nbsp;119 |
| 3.1% | `linguistics` | 0.3211 | 0.2331 | **over** | `word`&nbsp;1,127 `term`&nbsp;307 `name`&nbsp;485 `lexicon`&nbsp;155 |

### `lexicon/src/test/java`

**0.1645 bits** from the repository, against a null median of 0.1076 over 999 resamples of the same size — an excess of +0.0569, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.4% | `linguistics` | 0.4822 | 0.2331 | **over** | `word`&nbsp;1,127 `term`&nbsp;307 `name`&nbsp;485 `lexicon`&nbsp;155 |
| 9.1% | `plants` | 0.0001 | 0.0312 | under | `root`&nbsp;128 `tree`&nbsp;142 `seed`&nbsp;16 `leaf`&nbsp;17 |
| 5.8% | `lexicography` | 0.0511 | 0.0117 | **over** | `citation`&nbsp;93 `sense`&nbsp;306 `lexicon`&nbsp;155 `gloss`&nbsp;2 |
| 5.1% | `electronics` | 0.0000 | 0.0170 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 4.9% | `physics` | 0.0007 | 0.0201 | under | `mass`&nbsp;128 `weight`&nbsp;51 `radius`&nbsp;4 `length`&nbsp;37 |
| 2.9% | `politics` | 0.0011 | 0.0144 | under | `vote`&nbsp;54 `normalisation`&nbsp;12 `reading`&nbsp;540 `name`&nbsp;548 |
| 2.2% | `computing` | 0.0255 | 0.0532 | under | `repository`&nbsp;378 `parse`&nbsp;130 `read`&nbsp;636 `unread`&nbsp;9 |
| 2.0% | `military` | 0.0024 | 0.0141 | under | `repository`&nbsp;378 `column`&nbsp;43 `base`&nbsp;41 `refuse`&nbsp;113 |

### `documentation`

**0.2547 bits** from the repository, against a null median of 0.3258 over 999 resamples of the same size — an excess of -0.0711, and 907 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 6.6 s, recorded rather than estimated.
