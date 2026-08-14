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
| `linguistics` | 0.2011 | 79.9% | 2,793 | 101 | 7,972 | 34.4% | `word`&nbsp;1,054 `term`&nbsp;223 `name`&nbsp;376 `parse`&nbsp;83 |
| `computing` | 0.0464 | 83.3% | 3,764 | 17 | 1,292 | 5.6% | `repository`&nbsp;323 `unread`&nbsp;7 `read`&nbsp;538 `parse`&nbsp;83 |

Read over 332 files and 23,187 lines: 457 topics, 2 files no topic could be resolved for, and 34.4% of the repository's lines led by its single strongest topic. ι is a share of topical mass and sums to 1 across every topic; the columns beside it are counts and do not. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

### `code-semantics-api/src/main/java`

**0.1548 bits** from the repository, against a null median of 0.0966 over 999 resamples of the same size — an excess of +0.0582, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.1% | `telecommunication` | 0.0002 | 0.0452 | under | `file`&nbsp;164 `entry`&nbsp;135 `record`&nbsp;1 `fetch`&nbsp;8 |
| 6.5% | `plants` | 0.0019 | 0.0282 | under | `root`&nbsp;87 `tree`&nbsp;92 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.1% | `physics` | 0.0703 | 0.0222 | **over** | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 5.7% | `publishing` | 0.0142 | 0.0537 | under | `publish`&nbsp;157 `read`&nbsp;110 `write`&nbsp;322 `directory`&nbsp;39 |
| 5.5% | `electronics` | 0.0009 | 0.0214 | under | `tsv`&nbsp;35 `field`&nbsp;135 `default`&nbsp;21 `node`&nbsp;46 |
| 4.1% | `time_period` | 0.0246 | 0.0036 | **over** | `span`&nbsp;11 `none`&nbsp;5 `even`&nbsp;4 `longest`&nbsp;12 |
| 3.2% | `philosophy` | 0.0001 | 0.0105 | under | `describe`&nbsp;34 `lemma`&nbsp;73 `explain`&nbsp;12 `each`&nbsp;15 |
| 2.5% | `lexicography` | 0.0367 | 0.0139 | **over** | `citation`&nbsp;89 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |

### `code-semantics-api/src/test/java`

**0.1957 bits** from the repository, against a null median of 0.1517 over 999 resamples of the same size — an excess of +0.0440, and 52 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.3% | `telecommunication` | 0.0017 | 0.0452 | under | `file`&nbsp;164 `entry`&nbsp;135 `record`&nbsp;1 `fetch`&nbsp;8 |
| 6.5% | `plants` | 0.0004 | 0.0282 | under | `root`&nbsp;87 `tree`&nbsp;92 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.4% | `literature` | 0.0002 | 0.0266 | under | `header`&nbsp;62 `text`&nbsp;44 `write`&nbsp;322 `title`&nbsp;12 |
| 6.3% | `biology` | 0.0384 | 0.0035 | **over** | `morphology`&nbsp;16 `owl`&nbsp;17 `person`&nbsp;19 `glob`&nbsp;5 |
| 4.7% | `electronics` | 0.0005 | 0.0214 | under | `tsv`&nbsp;35 `field`&nbsp;135 `default`&nbsp;21 `node`&nbsp;46 |
| 4.1% | `law` | 0.0971 | 0.0423 | **over** | `file`&nbsp;310 `witness`&nbsp;69 `evidence`&nbsp;116 `cite`&nbsp;106 |
| 3.8% | `politics` | 0.0553 | 0.0174 | **over** | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;381 `name`&nbsp;423 |
| 3.6% | `publishing` | 0.0172 | 0.0537 | under | `publish`&nbsp;157 `read`&nbsp;110 `write`&nbsp;322 `directory`&nbsp;39 |

### `code-semantics-engine/src/main/java`

**0.0587 bits** from the repository, against a null median of 0.0224 over 999 resamples of the same size — an excess of +0.0363, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.6% | `electronics` | 0.0005 | 0.0214 | under | `tsv`&nbsp;35 `field`&nbsp;135 `default`&nbsp;21 `node`&nbsp;46 |
| 10.4% | `chemistry` | 0.0021 | 0.0200 | under | `syn`&nbsp;15 `extraction`&nbsp;42 `extract`&nbsp;7 `test`&nbsp;144 |
| 9.9% | `psychology` | 0.0004 | 0.0138 | under | `module`&nbsp;65 `confidence`&nbsp;20 `know`&nbsp;53 `test`&nbsp;144 |
| 5.2% | `grammar` | 0.0516 | 0.0262 | **over** | `phrase`&nbsp;137 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 3.4% | `linguistics` | 0.2514 | 0.2011 | **over** | `word`&nbsp;1,054 `term`&nbsp;223 `name`&nbsp;376 `parse`&nbsp;83 |
| 3.0% | `animals` | 0.0015 | 0.0081 | under | `nest`&nbsp;24 `owl`&nbsp;17 `down`&nbsp;5 `head`&nbsp;31 |
| 2.8% | `computer-languages` | 0.0001 | 0.0040 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;17 `java`&nbsp;34 |
| 2.4% | `literature` | 0.0142 | 0.0266 | under | `header`&nbsp;62 `text`&nbsp;44 `write`&nbsp;322 `title`&nbsp;12 |

### `code-semantics-engine/src/test/java`

**0.0641 bits** from the repository, against a null median of 0.0277 over 999 resamples of the same size — an excess of +0.0365, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.4% | `electronics` | 0.0002 | 0.0214 | under | `tsv`&nbsp;35 `field`&nbsp;135 `default`&nbsp;21 `node`&nbsp;46 |
| 14.9% | `plants` | 0.0810 | 0.0282 | **over** | `root`&nbsp;87 `tree`&nbsp;92 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 7.1% | `chemistry` | 0.0035 | 0.0200 | under | `syn`&nbsp;15 `extraction`&nbsp;42 `extract`&nbsp;7 `test`&nbsp;144 |
| 2.9% | `animals` | 0.0014 | 0.0081 | under | `nest`&nbsp;24 `owl`&nbsp;17 `down`&nbsp;5 `head`&nbsp;31 |
| 2.9% | `christianity` | 0.0003 | 0.0052 | under | `kind`&nbsp;47 `use`&nbsp;63 `publish`&nbsp;157 `publisher`&nbsp;39 |
| 2.7% | `computer-languages` | 0.0001 | 0.0040 | under | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;17 `java`&nbsp;34 |
| 2.6% | `astrology` | 0.0160 | 0.0060 | **over** | `placement`&nbsp;40 `figure`&nbsp;47 `term`&nbsp;230 `configuration`&nbsp;3 |
| 2.4% | `psychology` | 0.0050 | 0.0138 | under | `module`&nbsp;65 `confidence`&nbsp;20 `know`&nbsp;53 `test`&nbsp;144 |

### `lexicon-extraction/src/main/java`

**0.1866 bits** from the repository, against a null median of 0.0640 over 999 resamples of the same size — an excess of +0.1226, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.0% | `linguistics` | 0.0980 | 0.2011 | under | `word`&nbsp;1,054 `term`&nbsp;223 `name`&nbsp;376 `parse`&nbsp;83 |
| 7.0% | `literature` | 0.0897 | 0.0266 | **over** | `header`&nbsp;62 `text`&nbsp;44 `write`&nbsp;322 `title`&nbsp;12 |
| 7.0% | `plants` | 0.0003 | 0.0282 | under | `root`&nbsp;87 `tree`&nbsp;92 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 5.9% | `animals` | 0.0473 | 0.0081 | **over** | `nest`&nbsp;24 `owl`&nbsp;17 `down`&nbsp;5 `head`&nbsp;31 |
| 5.1% | `grammar` | 0.0016 | 0.0262 | under | `phrase`&nbsp;137 `verb`&nbsp;71 `occurrence`&nbsp;113 `clause`&nbsp;24 |
| 4.9% | `computer-languages` | 0.0324 | 0.0040 | **over** | `json`&nbsp;5 `sparql`&nbsp;1 `owl`&nbsp;17 `java`&nbsp;34 |
| 4.5% | `physics` | 0.0011 | 0.0222 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.2% | `electronics` | 0.0631 | 0.0214 | **over** | `tsv`&nbsp;35 `field`&nbsp;135 `default`&nbsp;21 `node`&nbsp;46 |

### `lexicon-extraction/src/test/java`

**0.2323 bits** from the repository, against a null median of 0.0822 over 999 resamples of the same size — an excess of +0.1501, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.5% | `chemistry` | 0.1500 | 0.0200 | **over** | `syn`&nbsp;15 `extraction`&nbsp;42 `extract`&nbsp;7 `test`&nbsp;144 |
| 17.2% | `electronics` | 0.1522 | 0.0214 | **over** | `tsv`&nbsp;35 `field`&nbsp;135 `default`&nbsp;21 `node`&nbsp;46 |
| 8.5% | `linguistics` | 0.0795 | 0.2011 | under | `word`&nbsp;1,054 `term`&nbsp;223 `name`&nbsp;376 `parse`&nbsp;83 |
| 4.3% | `person` | 0.0004 | 0.0222 | under | `reader`&nbsp;91 `host`&nbsp;27 `child`&nbsp;16 `bearer`&nbsp;18 |
| 3.9% | `law` | 0.0083 | 0.0423 | under | `file`&nbsp;310 `witness`&nbsp;69 `evidence`&nbsp;116 `cite`&nbsp;106 |
| 3.3% | `physics` | 0.0016 | 0.0222 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 2.7% | `lexicography` | 0.0002 | 0.0139 | under | `citation`&nbsp;89 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 2.1% | `town_planning` | 0.0240 | 0.0051 | **over** | `archive`&nbsp;33 `live`&nbsp;15 `local`&nbsp;4 `common`&nbsp;6 |

### `lexicon/src/main/java`

**0.1636 bits** from the repository, against a null median of 0.1122 over 999 resamples of the same size — an excess of +0.0514, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.6% | `plants` | 0.0000 | 0.0282 | under | `root`&nbsp;87 `tree`&nbsp;92 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.5% | `person` | 0.0739 | 0.0222 | **over** | `reader`&nbsp;91 `host`&nbsp;27 `child`&nbsp;16 `bearer`&nbsp;18 |
| 6.3% | `mathematics` | 0.1294 | 0.0573 | **over** | `from`&nbsp;99 `function`&nbsp;61 `lemma`&nbsp;73 `distribution`&nbsp;57 |
| 5.7% | `physics` | 0.0007 | 0.0222 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 3.9% | `networking` | 0.0327 | 0.0071 | **over** | `resource`&nbsp;181 `request`&nbsp;19 `preamble`&nbsp;5 `endpoint`&nbsp;12 |
| 3.4% | `philosophy` | 0.0367 | 0.0105 | **over** | `describe`&nbsp;34 `lemma`&nbsp;73 `explain`&nbsp;12 `each`&nbsp;15 |
| 3.3% | `publishing` | 0.0209 | 0.0537 | under | `publish`&nbsp;157 `read`&nbsp;110 `write`&nbsp;322 `directory`&nbsp;39 |
| 3.2% | `politics` | 0.0019 | 0.0174 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;381 `name`&nbsp;423 |

### `lexicon/src/test/java`

**0.1694 bits** from the repository, against a null median of 0.1217 over 999 resamples of the same size — an excess of +0.0477, and 15 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.2% | `linguistics` | 0.3645 | 0.2011 | **over** | `word`&nbsp;1,054 `term`&nbsp;223 `name`&nbsp;376 `parse`&nbsp;83 |
| 7.8% | `plants` | 0.0002 | 0.0282 | under | `root`&nbsp;87 `tree`&nbsp;92 `seed`&nbsp;20 `leaf`&nbsp;11 |
| 6.3% | `electronics` | 0.0000 | 0.0214 | under | `tsv`&nbsp;35 `field`&nbsp;135 `default`&nbsp;21 `node`&nbsp;46 |
| 5.2% | `physics` | 0.0009 | 0.0222 | under | `mass`&nbsp;116 `weight`&nbsp;47 `radius`&nbsp;4 `length`&nbsp;36 |
| 4.7% | `lexicography` | 0.0504 | 0.0139 | **over** | `citation`&nbsp;89 `sense`&nbsp;307 `gloss`&nbsp;2 `lemma`&nbsp;73 |
| 4.1% | `geography` | 0.0022 | 0.0222 | under | `state`&nbsp;229 `stream`&nbsp;17 `line`&nbsp;167 `draw`&nbsp;76 |
| 3.4% | `politics` | 0.0014 | 0.0174 | under | `vote`&nbsp;53 `normalisation`&nbsp;13 `reading`&nbsp;381 `name`&nbsp;423 |
| 2.2% | `baseball` | 0.0219 | 0.0055 | **over** | `field`&nbsp;135 `outer`&nbsp;6 `line`&nbsp;167 `first`&nbsp;123 |

### `documentation`

**0.2347 bits** from the repository, against a null median of 0.4226 over 999 resamples of the same size — an excess of -0.1879, and 996 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 4.3 s, recorded rather than estimated.
