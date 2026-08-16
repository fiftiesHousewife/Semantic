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
| `linguistics` | 0.0505 | 80.0% | 3,348 | 121 | 9,709 | 32.6% | `word`&nbsp;1,256 `name`&nbsp;535 `term`&nbsp;263 `parse`&nbsp;116 |
| `computing` | 0.0122 | 81.5% | 4,979 | 22 | 1,471 | 4.9% | `repository`&nbsp;407 `parse`&nbsp;116 `read`&nbsp;672 `unread`&nbsp;9 |
| `grammar` | 0.0092 | 89.0% | 1,931 | 18 | 1,447 | 4.9% | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `occurrence`&nbsp;133 `verb`&nbsp;65 |

Read over 406 files and 29,737 lines: 461 topics, 1 files no topic could be resolved for, and 32.6% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.0% of it; the other 76.0% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**0.1577 bits** from the repository, against a null median of 0.0971 over 999 resamples of the same size — an excess of +0.0606, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.3% | `telecommunication` | 0.0002 | 0.0402 | under | `file`&nbsp;195 `entry`&nbsp;168 `note`&nbsp;7 `record`&nbsp;3 |
| 8.8% | `publishing` | 0.0125 | 0.0648 | under | `publish`&nbsp;241 `read`&nbsp;145 `write`&nbsp;509 `vocabulary`&nbsp;133 |
| 7.4% | `plants` | 0.0018 | 0.0317 | under | `root`&nbsp;132 `tree`&nbsp;144 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 6.6% | `physics` | 0.0693 | 0.0199 | **over** | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;37 |
| 4.5% | `electronics` | 0.0008 | 0.0182 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 3.4% | `time_period` | 0.0215 | 0.0033 | **over** | `span`&nbsp;15 `none`&nbsp;3 `even`&nbsp;4 `longest`&nbsp;16 |
| 3.2% | `lexicography` | 0.0361 | 0.0111 | **over** | `citation`&nbsp;93 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;72 |
| 2.8% | `philosophy` | 0.0001 | 0.0096 | under | `lemma`&nbsp;72 `describe`&nbsp;34 `each`&nbsp;34 `explain`&nbsp;11 |

### `code-semantics-api/src/test/java`

**0.1990 bits** from the repository, against a null median of 0.1518 over 999 resamples of the same size — an excess of +0.0471, and 39 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.0% | `telecommunication` | 0.0017 | 0.0402 | under | `file`&nbsp;195 `entry`&nbsp;168 `note`&nbsp;7 `record`&nbsp;3 |
| 7.3% | `plants` | 0.0004 | 0.0317 | under | `root`&nbsp;132 `tree`&nbsp;144 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 6.6% | `biology` | 0.0384 | 0.0028 | **over** | `morphology`&nbsp;15 `owl`&nbsp;21 `person`&nbsp;20 `glob`&nbsp;5 |
| 6.1% | `literature` | 0.0002 | 0.0256 | under | `header`&nbsp;71 `write`&nbsp;509 `text`&nbsp;52 `prose`&nbsp;92 |
| 5.4% | `publishing` | 0.0170 | 0.0648 | under | `publish`&nbsp;241 `read`&nbsp;145 `write`&nbsp;509 `vocabulary`&nbsp;133 |
| 4.5% | `politics` | 0.0553 | 0.0149 | **over** | `vote`&nbsp;54 `normalisation`&nbsp;12 `reading`&nbsp;517 `name`&nbsp;613 |
| 4.0% | `law` | 0.0978 | 0.0426 | **over** | `file`&nbsp;394 `witness`&nbsp;67 `summary`&nbsp;34 `evidence`&nbsp;117 |
| 3.9% | `electronics` | 0.0005 | 0.0182 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |

### `code-semantics-engine/src/main/java`

**0.0493 bits** from the repository, against a null median of 0.0191 over 999 resamples of the same size — an excess of +0.0302, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.5% | `electronics` | 0.0005 | 0.0182 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 11.1% | `chemistry` | 0.0020 | 0.0183 | under | `syn`&nbsp;15 `extraction`&nbsp;48 `fraction`&nbsp;8 `extract`&nbsp;7 |
| 6.4% | `psychology` | 0.0015 | 0.0114 | under | `module`&nbsp;73 `confidence`&nbsp;20 `know`&nbsp;63 `test`&nbsp;192 |
| 3.9% | `grammar` | 0.0549 | 0.0333 | **over** | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `occurrence`&nbsp;133 `verb`&nbsp;65 |
| 3.6% | `animals` | 0.0006 | 0.0059 | under | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;15 `posterior`&nbsp;6 |
| 2.7% | `computer-languages` | 0.0001 | 0.0033 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;50 |
| 2.7% | `linguistics` | 0.2391 | 0.1990 | **over** | `word`&nbsp;1,256 `name`&nbsp;535 `term`&nbsp;263 `parse`&nbsp;116 |
| 2.6% | `computer_science` | 0.0009 | 0.0054 | under | `parse`&nbsp;116 `parser`&nbsp;27 `byte`&nbsp;11 `lookup`&nbsp;12 |

### `code-semantics-engine/src/test/java`

**0.0511 bits** from the repository, against a null median of 0.0195 over 999 resamples of the same size — an excess of +0.0316, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.9% | `electronics` | 0.0003 | 0.0182 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 14.6% | `plants` | 0.0787 | 0.0317 | **over** | `root`&nbsp;132 `tree`&nbsp;144 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 5.6% | `chemistry` | 0.0051 | 0.0183 | under | `syn`&nbsp;15 `extraction`&nbsp;48 `fraction`&nbsp;8 `extract`&nbsp;7 |
| 4.3% | `publishing` | 0.0961 | 0.0648 | **over** | `publish`&nbsp;241 `read`&nbsp;145 `write`&nbsp;509 `vocabulary`&nbsp;133 |
| 4.1% | `animals` | 0.0004 | 0.0059 | under | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;15 `posterior`&nbsp;6 |
| 3.8% | `mathematics` | 0.0290 | 0.0495 | under | `from`&nbsp;127 `function`&nbsp;59 `distribution`&nbsp;74 `lemma`&nbsp;72 |
| 3.0% | `psychology` | 0.0036 | 0.0114 | under | `module`&nbsp;73 `confidence`&nbsp;20 `know`&nbsp;63 `test`&nbsp;192 |
| 2.6% | `computer_science` | 0.0135 | 0.0054 | **over** | `parse`&nbsp;116 `parser`&nbsp;27 `byte`&nbsp;11 `lookup`&nbsp;12 |

### `lexicon-extraction/src/main/java`

**0.1789 bits** from the repository, against a null median of 0.0576 over 999 resamples of the same size — an excess of +0.1213, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `linguistics` | 0.0909 | 0.1990 | under | `word`&nbsp;1,256 `name`&nbsp;535 `term`&nbsp;263 `parse`&nbsp;116 |
| 7.5% | `grammar` | 0.0012 | 0.0333 | under | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `occurrence`&nbsp;133 `verb`&nbsp;65 |
| 6.7% | `literature` | 0.0847 | 0.0256 | **over** | `header`&nbsp;71 `write`&nbsp;509 `text`&nbsp;52 `prose`&nbsp;92 |
| 6.5% | `plants` | 0.0019 | 0.0317 | under | `root`&nbsp;132 `tree`&nbsp;144 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 6.0% | `animals` | 0.0413 | 0.0059 | **over** | `nest`&nbsp;28 `owl`&nbsp;21 `head`&nbsp;15 `posterior`&nbsp;6 |
| 4.5% | `computer-languages` | 0.0283 | 0.0033 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;21 `java`&nbsp;50 |
| 4.5% | `electronics` | 0.0587 | 0.0182 | **over** | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 4.0% | `physics` | 0.0012 | 0.0199 | under | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;37 |

### `lexicon-extraction/src/test/java`

**0.2066 bits** from the repository, against a null median of 0.0719 over 999 resamples of the same size — an excess of +0.1347, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.7% | `chemistry` | 0.1461 | 0.0183 | **over** | `syn`&nbsp;15 `extraction`&nbsp;48 `fraction`&nbsp;8 `extract`&nbsp;7 |
| 16.2% | `electronics` | 0.1281 | 0.0182 | **over** | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 5.6% | `linguistics` | 0.1017 | 0.1990 | under | `word`&nbsp;1,256 `name`&nbsp;535 `term`&nbsp;263 `parse`&nbsp;116 |
| 3.3% | `physics` | 0.0015 | 0.0199 | under | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;37 |
| 2.9% | `person` | 0.0028 | 0.0218 | under | `reader`&nbsp;118 `child`&nbsp;20 `host`&nbsp;28 `bearer`&nbsp;18 |
| 2.7% | `grammar` | 0.0086 | 0.0333 | under | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `occurrence`&nbsp;133 `verb`&nbsp;65 |
| 2.5% | `law` | 0.0146 | 0.0426 | under | `file`&nbsp;394 `witness`&nbsp;67 `summary`&nbsp;34 `evidence`&nbsp;117 |
| 2.4% | `lexicography` | 0.0002 | 0.0111 | under | `citation`&nbsp;93 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;72 |

### `lexicon/src/main/java`

**0.1751 bits** from the repository, against a null median of 0.1083 over 999 resamples of the same size — an excess of +0.0668, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.0% | `plants` | 0.0000 | 0.0317 | under | `root`&nbsp;132 `tree`&nbsp;144 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 7.1% | `publishing` | 0.0146 | 0.0648 | under | `publish`&nbsp;241 `read`&nbsp;145 `write`&nbsp;509 `vocabulary`&nbsp;133 |
| 5.6% | `person` | 0.0706 | 0.0218 | **over** | `reader`&nbsp;118 `child`&nbsp;20 `host`&nbsp;28 `bearer`&nbsp;18 |
| 5.4% | `mathematics` | 0.1141 | 0.0495 | **over** | `from`&nbsp;127 `function`&nbsp;59 `distribution`&nbsp;74 `lemma`&nbsp;72 |
| 4.8% | `physics` | 0.0005 | 0.0199 | under | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;37 |
| 4.2% | `networking` | 0.0328 | 0.0060 | **over** | `resource`&nbsp;248 `preamble`&nbsp;7 `request`&nbsp;11 `node`&nbsp;64 |
| 3.7% | `grammar` | 0.0772 | 0.0333 | **over** | `phrase`&nbsp;148 `part_of_speech`&nbsp;39 `occurrence`&nbsp;133 `verb`&nbsp;65 |
| 2.6% | `money` | 0.0002 | 0.0103 | under | `share`&nbsp;235 `score`&nbsp;23 `say`&nbsp;257 `coverage`&nbsp;18 |

### `lexicon/src/test/java`

**0.1517 bits** from the repository, against a null median of 0.1167 over 999 resamples of the same size — an excess of +0.0349, and 39 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.9% | `plants` | 0.0002 | 0.0317 | under | `root`&nbsp;132 `tree`&nbsp;144 `seed`&nbsp;16 `leaf`&nbsp;18 |
| 8.3% | `linguistics` | 0.3346 | 0.1990 | **over** | `word`&nbsp;1,256 `name`&nbsp;535 `term`&nbsp;263 `parse`&nbsp;116 |
| 5.9% | `electronics` | 0.0000 | 0.0182 | under | `tsv`&nbsp;38 `field`&nbsp;163 `default`&nbsp;26 `node`&nbsp;64 |
| 5.9% | `lexicography` | 0.0480 | 0.0111 | **over** | `citation`&nbsp;93 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;72 |
| 5.0% | `physics` | 0.0010 | 0.0199 | under | `mass`&nbsp;130 `weight`&nbsp;54 `radius`&nbsp;4 `length`&nbsp;37 |
| 3.2% | `politics` | 0.0013 | 0.0149 | under | `vote`&nbsp;54 `normalisation`&nbsp;12 `reading`&nbsp;517 `name`&nbsp;613 |
| 2.7% | `baseball` | 0.0210 | 0.0047 | **over** | `field`&nbsp;163 `outer`&nbsp;6 `line`&nbsp;175 `look`&nbsp;39 |
| 1.9% | `military` | 0.0031 | 0.0145 | under | `repository`&nbsp;407 `base`&nbsp;46 `column`&nbsp;46 `refuse`&nbsp;120 |

### `documentation`

**0.2457 bits** from the repository, against a null median of 0.3456 over 999 resamples of the same size — an excess of -0.0999, and 969 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 6.8 s, recorded rather than estimated.
