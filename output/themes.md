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
| `linguistics` | 0.0599 | 82.4% | 3,571 | 127 | 9,983 | 36.4% | `word`&nbsp;1,132 `term`&nbsp;307 `name`&nbsp;478 `lexicon`&nbsp;160 |
| `computing` | 0.0122 | 83.9% | 4,834 | 20 | 1,416 | 5.2% | `repository`&nbsp;379 `parse`&nbsp;128 `read`&nbsp;627 `unread`&nbsp;9 |
| `grammar` | 0.0095 | 89.3% | 1,920 | 18 | 1,447 | 5.3% | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |

Read over 375 files and 27,447 lines: 463 topics, 1 files no topic could be resolved for, and 36.4% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.3% of it; the other 75.7% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1445 bits** from the repository, against a null median of 0.0903 over 999 resamples of the same size — an excess of +0.0542, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.7% | `telecommunication` | 0.0002 | 0.0409 | under | `file`&nbsp;190 `entry`&nbsp;162 `note`&nbsp;9 `record`&nbsp;3 |
| 7.3% | `plants` | 0.0018 | 0.0290 | under | `root`&nbsp;111 `tree`&nbsp;135 `seed`&nbsp;16 `leaf`&nbsp;16 |
| 6.6% | `publishing` | 0.0122 | 0.0520 | under | `publish`&nbsp;224 `read`&nbsp;139 `write`&nbsp;409 `directory`&nbsp;49 |
| 6.3% | `physics` | 0.0661 | 0.0205 | **over** | `mass`&nbsp;132 `weight`&nbsp;52 `radius`&nbsp;4 `length`&nbsp;37 |
| 4.7% | `electronics` | 0.0007 | 0.0173 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;26 `node`&nbsp;58 |
| 4.2% | `time_period` | 0.0220 | 0.0028 | **over** | `span`&nbsp;11 `none`&nbsp;4 `even`&nbsp;4 `longest`&nbsp;16 |
| 3.0% | `philosophy` | 0.0000 | 0.0088 | under | `lemma`&nbsp;72 `describe`&nbsp;35 `explain`&nbsp;12 `each`&nbsp;27 |
| 2.9% | `lexicography` | 0.0345 | 0.0119 | **over** | `citation`&nbsp;95 `sense`&nbsp;306 `lexicon`&nbsp;160 `gloss`&nbsp;2 |

### `code-semantics-api/src/test/java`

**0.1889 bits** from the repository, against a null median of 0.1415 over 999 resamples of the same size — an excess of +0.0475, and 24 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.6% | `telecommunication` | 0.0016 | 0.0409 | under | `file`&nbsp;190 `entry`&nbsp;162 `note`&nbsp;9 `record`&nbsp;3 |
| 7.0% | `plants` | 0.0004 | 0.0290 | under | `root`&nbsp;111 `tree`&nbsp;135 `seed`&nbsp;16 `leaf`&nbsp;16 |
| 6.2% | `linguistics` | 0.3770 | 0.2366 | **over** | `word`&nbsp;1,132 `term`&nbsp;307 `name`&nbsp;478 `lexicon`&nbsp;160 |
| 5.5% | `literature` | 0.0002 | 0.0222 | under | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;409 `title`&nbsp;13 |
| 5.1% | `biology` | 0.0300 | 0.0026 | **over** | `morphology`&nbsp;16 `owl`&nbsp;31 `person`&nbsp;20 `glob`&nbsp;5 |
| 4.5% | `politics` | 0.0535 | 0.0146 | **over** | `vote`&nbsp;55 `normalisation`&nbsp;13 `reading`&nbsp;535 `name`&nbsp;538 |
| 4.0% | `publishing` | 0.0154 | 0.0520 | under | `publish`&nbsp;224 `read`&nbsp;139 `write`&nbsp;409 `directory`&nbsp;49 |
| 3.9% | `electronics` | 0.0004 | 0.0173 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;26 `node`&nbsp;58 |

### `code-semantics-engine/src/main/java`

**0.0567 bits** from the repository, against a null median of 0.0205 over 999 resamples of the same size — an excess of +0.0361, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `chemistry` | 0.0018 | 0.0271 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;180 |
| 12.7% | `electronics` | 0.0005 | 0.0173 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;26 `node`&nbsp;58 |
| 8.1% | `psychology` | 0.0003 | 0.0110 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;60 `test`&nbsp;180 |
| 5.2% | `grammar` | 0.0624 | 0.0345 | **over** | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |
| 3.4% | `animals` | 0.0003 | 0.0052 | under | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 2.5% | `plants` | 0.0159 | 0.0290 | under | `root`&nbsp;111 `tree`&nbsp;135 `seed`&nbsp;16 `leaf`&nbsp;16 |
| 2.4% | `politics` | 0.0270 | 0.0146 | **over** | `vote`&nbsp;55 `normalisation`&nbsp;13 `reading`&nbsp;535 `name`&nbsp;538 |
| 2.2% | `computer_science` | 0.0010 | 0.0055 | under | `parse`&nbsp;128 `parser`&nbsp;26 `byte`&nbsp;11 `lookup`&nbsp;12 |

### `code-semantics-engine/src/test/java`

**0.0561 bits** from the repository, against a null median of 0.0202 over 999 resamples of the same size — an excess of +0.0359, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.7% | `plants` | 0.0794 | 0.0290 | **over** | `root`&nbsp;111 `tree`&nbsp;135 `seed`&nbsp;16 `leaf`&nbsp;16 |
| 14.4% | `chemistry` | 0.0029 | 0.0271 | under | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;180 |
| 13.8% | `electronics` | 0.0003 | 0.0173 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;26 `node`&nbsp;58 |
| 3.1% | `animals` | 0.0004 | 0.0052 | under | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 2.7% | `computer_science` | 0.0146 | 0.0055 | **over** | `parse`&nbsp;128 `parser`&nbsp;26 `byte`&nbsp;11 `lookup`&nbsp;12 |
| 2.4% | `publishing` | 0.0737 | 0.0520 | **over** | `publish`&nbsp;224 `read`&nbsp;139 `write`&nbsp;409 `directory`&nbsp;49 |
| 2.4% | `psychology` | 0.0038 | 0.0110 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;60 `test`&nbsp;180 |
| 2.3% | `mathematics` | 0.0296 | 0.0461 | under | `from`&nbsp;121 `function`&nbsp;59 `distribution`&nbsp;64 `lemma`&nbsp;72 |

### `lexicon-extraction/src/main/java`

**0.1614 bits** from the repository, against a null median of 0.0525 over 999 resamples of the same size — an excess of +0.1088, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.6% | `grammar` | 0.0013 | 0.0345 | under | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |
| 7.1% | `linguistics` | 0.1298 | 0.2366 | under | `word`&nbsp;1,132 `term`&nbsp;307 `name`&nbsp;478 `lexicon`&nbsp;160 |
| 7.0% | `literature` | 0.0763 | 0.0222 | **over** | `header`&nbsp;68 `text`&nbsp;46 `write`&nbsp;409 `title`&nbsp;13 |
| 6.6% | `plants` | 0.0017 | 0.0290 | under | `root`&nbsp;111 `tree`&nbsp;135 `seed`&nbsp;16 `leaf`&nbsp;16 |
| 5.1% | `animals` | 0.0332 | 0.0052 | **over** | `nest`&nbsp;27 `owl`&nbsp;31 `head`&nbsp;17 `posterior`&nbsp;7 |
| 4.7% | `physics` | 0.0011 | 0.0205 | under | `mass`&nbsp;132 `weight`&nbsp;52 `radius`&nbsp;4 `length`&nbsp;37 |
| 4.5% | `electronics` | 0.0544 | 0.0173 | **over** | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;26 `node`&nbsp;58 |
| 4.1% | `computer-languages` | 0.0240 | 0.0031 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;31 `java`&nbsp;42 |

### `lexicon-extraction/src/test/java`

**0.2015 bits** from the repository, against a null median of 0.0661 over 999 resamples of the same size — an excess of +0.1353, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 26.7% | `chemistry` | 0.2005 | 0.0271 | **over** | `extraction`&nbsp;128 `syn`&nbsp;15 `extract`&nbsp;7 `test`&nbsp;180 |
| 13.3% | `electronics` | 0.1090 | 0.0173 | **over** | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;26 `node`&nbsp;58 |
| 3.7% | `physics` | 0.0013 | 0.0205 | under | `mass`&nbsp;132 `weight`&nbsp;52 `radius`&nbsp;4 `length`&nbsp;37 |
| 3.5% | `grammar` | 0.0070 | 0.0345 | under | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |
| 3.1% | `person` | 0.0024 | 0.0214 | under | `reader`&nbsp;111 `child`&nbsp;19 `host`&nbsp;29 `bearer`&nbsp;18 |
| 3.0% | `linguistics` | 0.1563 | 0.2366 | under | `word`&nbsp;1,132 `term`&nbsp;307 `name`&nbsp;478 `lexicon`&nbsp;160 |
| 2.7% | `law` | 0.0120 | 0.0392 | under | `file`&nbsp;381 `witness`&nbsp;70 `summary`&nbsp;44 `cite`&nbsp;117 |
| 2.2% | `economy` | 0.0001 | 0.0093 | under | `mark_down`&nbsp;14 `found`&nbsp;22 `property`&nbsp;36 `total`&nbsp;10 |

### `lexicon/src/main/java`

**0.1622 bits** from the repository, against a null median of 0.1001 over 999 resamples of the same size — an excess of +0.0621, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.9% | `plants` | 0.0000 | 0.0290 | under | `root`&nbsp;111 `tree`&nbsp;135 `seed`&nbsp;16 `leaf`&nbsp;16 |
| 5.4% | `physics` | 0.0005 | 0.0205 | under | `mass`&nbsp;132 `weight`&nbsp;52 `radius`&nbsp;4 `length`&nbsp;37 |
| 5.4% | `publishing` | 0.0134 | 0.0520 | under | `publish`&nbsp;224 `read`&nbsp;139 `write`&nbsp;409 `directory`&nbsp;49 |
| 5.3% | `person` | 0.0661 | 0.0214 | **over** | `reader`&nbsp;111 `child`&nbsp;19 `host`&nbsp;29 `bearer`&nbsp;18 |
| 5.1% | `mathematics` | 0.1041 | 0.0461 | **over** | `from`&nbsp;121 `function`&nbsp;59 `distribution`&nbsp;64 `lemma`&nbsp;72 |
| 4.5% | `networking` | 0.0307 | 0.0052 | **over** | `resource`&nbsp;243 `request`&nbsp;11 `preamble`&nbsp;5 `node`&nbsp;58 |
| 3.1% | `grammar` | 0.0730 | 0.0345 | **over** | `phrase`&nbsp;158 `part_of_speech`&nbsp;42 `verb`&nbsp;66 `occurrence`&nbsp;119 |
| 2.9% | `linguistics` | 0.3211 | 0.2366 | **over** | `word`&nbsp;1,132 `term`&nbsp;307 `name`&nbsp;478 `lexicon`&nbsp;160 |

### `lexicon/src/test/java`

**0.1623 bits** from the repository, against a null median of 0.1081 over 999 resamples of the same size — an excess of +0.0543, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.0% | `linguistics` | 0.4822 | 0.2366 | **over** | `word`&nbsp;1,132 `term`&nbsp;307 `name`&nbsp;478 `lexicon`&nbsp;160 |
| 8.6% | `plants` | 0.0001 | 0.0290 | under | `root`&nbsp;111 `tree`&nbsp;135 `seed`&nbsp;16 `leaf`&nbsp;16 |
| 5.8% | `lexicography` | 0.0511 | 0.0119 | **over** | `citation`&nbsp;95 `sense`&nbsp;306 `lexicon`&nbsp;160 `gloss`&nbsp;2 |
| 5.3% | `electronics` | 0.0000 | 0.0173 | under | `tsv`&nbsp;38 `field`&nbsp;159 `default`&nbsp;26 `node`&nbsp;58 |
| 5.1% | `physics` | 0.0007 | 0.0205 | under | `mass`&nbsp;132 `weight`&nbsp;52 `radius`&nbsp;4 `length`&nbsp;37 |
| 3.0% | `politics` | 0.0011 | 0.0146 | under | `vote`&nbsp;55 `normalisation`&nbsp;13 `reading`&nbsp;535 `name`&nbsp;538 |
| 2.2% | `computing` | 0.0255 | 0.0529 | under | `repository`&nbsp;379 `parse`&nbsp;128 `read`&nbsp;627 `unread`&nbsp;9 |
| 2.1% | `psychology` | 0.0011 | 0.0110 | under | `module`&nbsp;76 `confidence`&nbsp;20 `know`&nbsp;60 `test`&nbsp;180 |

### `documentation`

**0.2554 bits** from the repository, against a null median of 0.3237 over 999 resamples of the same size — an excess of -0.0683, and 908 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 7.4 s, recorded rather than estimated.
