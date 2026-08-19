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
| `linguistics` | 0.0493 | 65.5% | 4,664 | 183 | 14,915 | 34.3% | `word` 30.4% (1,634) `name` 15.6% (804) `term` 15.3% (397) `parse` 5.0% (168) |
| `computing` | 0.0149 | 72.2% | 7,225 | 37 | 2,119 | 4.9% | `repository` 6.0% (488) `read` 5.2% (1,010) `folder` 4.6% (40) `byte` 3.8% (48) |

Read over 610 files and 43,505 lines: 469 topics, 15 files no topic could be resolved for, and 34.3% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 23.9% of it; the other 76.1% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**17.2%** of the maximum divergence from the repository, against a null median of 9.9% over 999 resamples of the same size — an excess of +7.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `telecommunication` | 0.0002 | 0.0507 | under | `file` 61.1% (288) `entry` 26.4% (223) `copy` 2.6% (39) `note` 2.1% (11) |
| 9.1% | `publishing` | 0.0148 | 0.0741 | under | `publish` 23.1% (376) `read` 15.2% (209) `write` 11.1% (777) `directory` 9.5% (102) |
| 6.2% | `plants` | 0.0018 | 0.0296 | under | `root` 54.3% (180) `tree` 38.7% (219) `seed` 4.6% (49) `leaf` 1.8% (38) |
| 5.2% | `time_period` | 0.0315 | 0.0038 | **over** | `span` 52.0% (26) `none` 20.4% (11) `stage` 6.5% (23) `long` 4.5% (24) |
| 4.7% | `physics` | 0.0578 | 0.0176 | **over** | `mass` 45.3% (138) `weight` 27.9% (68) `length` 8.3% (84) `radius` 3.4% (2) |
| 3.5% | `lexicography` | 0.0323 | 0.0074 | **over** | `citation` 86.1% (105) `sense` 11.0% (320) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.5% | `politics` | 0.0402 | 0.0116 | **over** | `vote` 50.9% (56) `normalisation` 21.0% (23) `reading` 6.8% (727) `name` 4.8% (899) |
| 3.2% | `electronics` | 0.0007 | 0.0146 | under | `tsv` 82.3% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (109) |

### `code-semantics-api/src/test/java`

**22.0%** of the maximum divergence from the repository, against a null median of 15.5% over 999 resamples of the same size — an excess of +6.5 points, and 26 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `telecommunication` | 0.0014 | 0.0507 | under | `file` 61.1% (288) `entry` 26.4% (223) `copy` 2.6% (39) `note` 2.1% (11) |
| 7.1% | `publishing` | 0.0147 | 0.0741 | under | `publish` 23.1% (376) `read` 15.2% (209) `write` 11.1% (777) `directory` 9.5% (102) |
| 6.1% | `politics` | 0.0611 | 0.0116 | **over** | `vote` 50.9% (56) `normalisation` 21.0% (23) `reading` 6.8% (727) `name` 4.8% (899) |
| 5.6% | `biology` | 0.0370 | 0.0030 | **over** | `morphology` 25.4% (21) `owl` 20.5% (24) `person` 8.0% (24) `glob` 6.9% (4) |
| 5.6% | `plants` | 0.0009 | 0.0296 | under | `root` 54.3% (180) `tree` 38.7% (219) `seed` 4.6% (49) `leaf` 1.8% (38) |
| 5.1% | `law` | 0.1071 | 0.0405 | **over** | `file` 11.0% (558) `witness` 8.6% (70) `summary` 7.9% (57) `claim` 6.8% (119) |
| 3.9% | `linguistics` | 0.3002 | 0.1922 | **over** | `word` 30.4% (1,634) `name` 15.6% (804) `term` 15.3% (397) `parse` 5.0% (168) |
| 3.8% | `literature` | 0.0017 | 0.0238 | under | `header` 36.7% (94) `write` 17.1% (776) `text` 13.0% (111) `prose` 9.1% (147) |

### `code-semantics-engine/src/main/java`

**3.5%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `electronics` | 0.0013 | 0.0146 | under | `tsv` 82.3% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (109) |
| 12.3% | `chemistry` | 0.0018 | 0.0151 | under | `extraction` 50.5% (68) `fraction` 12.4% (15) `extract` 8.5% (7) `render` 5.2% (15) |
| 3.9% | `literature` | 0.0122 | 0.0238 | under | `header` 36.7% (94) `write` 17.1% (776) `text` 13.0% (111) `prose` 9.1% (147) |
| 3.7% | `calculus` | 0.0127 | 0.0049 | **over** | `divergence` 100.0% (154) |
| 3.7% | `animals` | 0.0003 | 0.0040 | under | `nest` 55.5% (29) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (14) |
| 2.9% | `linguistics` | 0.2269 | 0.1922 | **over** | `word` 30.4% (1,634) `name` 15.6% (804) `term` 15.3% (397) `parse` 5.0% (168) |
| 2.4% | `psychology` | 0.0037 | 0.0090 | under | `module` 85.5% (87) `confidence` 4.1% (18) `know` 3.0% (73) `matter` 1.7% (33) |
| 2.3% | `grammar` | 0.0398 | 0.0274 | **over** | `phrase` 21.4% (165) `occurrence` 15.9% (184) `verb` 15.2% (86) `part_of_speech` 12.2% (37) |

### `code-semantics-engine/src/test/java`

**3.7%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.0% | `electronics` | 0.0003 | 0.0146 | under | `tsv` 82.3% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (109) |
| 13.3% | `plants` | 0.0652 | 0.0296 | **over** | `root` 54.3% (180) `tree` 38.7% (219) `seed` 4.6% (49) `leaf` 1.8% (38) |
| 5.3% | `psychology` | 0.0017 | 0.0090 | under | `module` 85.5% (87) `confidence` 4.1% (18) `know` 3.0% (73) `matter` 1.7% (33) |
| 4.5% | `chemistry` | 0.0055 | 0.0151 | under | `extraction` 50.5% (68) `fraction` 12.4% (15) `extract` 8.5% (7) `render` 5.2% (15) |
| 2.7% | `quality` | 0.0098 | 0.0037 | **over** | `ordinary` 26.4% (49) `tolerance` 11.4% (6) `best` 10.3% (10) `dark` 6.5% (1) |
| 2.6% | `mathematics` | 0.0319 | 0.0463 | under | `from` 27.0% (168) `function` 9.6% (98) `count` 7.8% (80) `distribution` 6.4% (102) |
| 2.5% | `computer-languages` | 0.0001 | 0.0025 | under | `json` 55.9% (5) `xml` 14.1% (6) `sparql` 12.1% (1) `owl` 10.2% (24) |
| 2.2% | `administration` | 0.0127 | 0.0062 | **over** | `branch` 70.7% (145) `title` 9.4% (12) `foreign` 5.5% (9) `english` 4.1% (80) |

### `lexicon-extraction/src/main/java`

**15.4%** of the maximum divergence from the repository, against a null median of 4.4% over 999 resamples of the same size — an excess of +11.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `linguistics` | 0.0687 | 0.1922 | under | `word` 30.4% (1,634) `name` 15.6% (804) `term` 15.3% (397) `parse` 5.0% (168) |
| 7.5% | `literature` | 0.0801 | 0.0238 | **over** | `header` 36.7% (94) `write` 17.1% (776) `text` 13.0% (111) `prose` 9.1% (147) |
| 7.5% | `plants` | 0.0013 | 0.0296 | under | `root` 54.3% (180) `tree` 38.7% (219) `seed` 4.6% (49) `leaf` 1.8% (38) |
| 4.2% | `grammar` | 0.0047 | 0.0274 | under | `phrase` 21.4% (165) `occurrence` 15.9% (184) `verb` 15.2% (86) `part_of_speech` 12.2% (37) |
| 3.9% | `money` | 0.0001 | 0.0124 | under | `share` 63.9% (346) `score` 17.5% (64) `say` 7.3% (300) `coverage` 3.8% (18) |
| 3.8% | `animals` | 0.0243 | 0.0040 | **over** | `nest` 55.5% (29) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (14) |
| 3.3% | `psychology` | 0.0323 | 0.0090 | **over** | `module` 85.5% (87) `confidence` 4.1% (18) `know` 3.0% (73) `matter` 1.7% (33) |
| 2.6% | `christianity` | 0.0201 | 0.0044 | **over** | `kind` 54.3% (65) `publish` 15.8% (376) `use` 12.6% (94) `schema` 4.6% (35) |

### `lexicon-extraction/src/test/java`

**17.2%** of the maximum divergence from the repository, against a null median of 5.3% over 999 resamples of the same size — an excess of +11.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.8% | `chemistry` | 0.1298 | 0.0151 | **over** | `extraction` 50.5% (68) `fraction` 12.4% (15) `extract` 8.5% (7) `render` 5.2% (15) |
| 9.4% | `electronics` | 0.0753 | 0.0146 | **over** | `tsv` 82.3% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (109) |
| 8.9% | `linguistics` | 0.0853 | 0.1922 | under | `word` 30.4% (1,634) `name` 15.6% (804) `term` 15.3% (397) `parse` 5.0% (168) |
| 3.7% | `person` | 0.0017 | 0.0195 | under | `reader` 18.1% (139) `child` 15.5% (23) `host` 10.8% (28) `parent` 7.8% (69) |
| 3.2% | `grammar` | 0.0059 | 0.0274 | under | `phrase` 21.4% (165) `occurrence` 15.9% (184) `verb` 15.2% (86) `part_of_speech` 12.2% (37) |
| 2.5% | `computing` | 0.1082 | 0.0632 | **over** | `repository` 6.0% (488) `read` 5.2% (1,010) `folder` 4.6% (40) `byte` 3.8% (48) |
| 2.4% | `physics` | 0.0029 | 0.0176 | under | `mass` 45.3% (138) `weight` 27.9% (68) `length` 8.3% (84) `radius` 3.4% (2) |
| 2.2% | `plants` | 0.0099 | 0.0296 | under | `root` 54.3% (180) `tree` 38.7% (219) `seed` 4.6% (49) `leaf` 1.8% (38) |

### `lexicon/src/main/java`

**17.9%** of the maximum divergence from the repository, against a null median of 9.0% over 999 resamples of the same size — an excess of +8.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.9% | `networking` | 0.0587 | 0.0061 | **over** | `resource` 75.5% (284) `preamble` 7.3% (8) `request` 5.2% (10) `node` 4.5% (82) |
| 8.1% | `plants` | 0.0000 | 0.0296 | under | `root` 54.3% (180) `tree` 38.7% (219) `seed` 4.6% (49) `leaf` 1.8% (38) |
| 7.8% | `publishing` | 0.0170 | 0.0741 | under | `publish` 23.1% (376) `read` 15.2% (209) `write` 11.1% (777) `directory` 9.5% (102) |
| 4.6% | `linguistics` | 0.2971 | 0.1922 | **over** | `word` 30.4% (1,634) `name` 15.6% (804) `term` 15.3% (397) `parse` 5.0% (168) |
| 4.5% | `grammar` | 0.0743 | 0.0274 | **over** | `phrase` 21.4% (165) `occurrence` 15.9% (184) `verb` 15.2% (86) `part_of_speech` 12.2% (37) |
| 4.3% | `mathematics` | 0.1015 | 0.0463 | **over** | `from` 27.0% (168) `function` 9.6% (98) `count` 7.8% (80) `distribution` 6.4% (102) |
| 3.8% | `physics` | 0.0008 | 0.0176 | under | `mass` 45.3% (138) `weight` 27.9% (68) `length` 8.3% (84) `radius` 3.4% (2) |
| 3.5% | `philosophy` | 0.0335 | 0.0077 | **over** | `describe` 33.0% (44) `lemma` 25.7% (79) `each` 9.3% (58) `explain` 9.2% (14) |

### `lexicon/src/test/java`

**11.6%** of the maximum divergence from the repository, against a null median of 8.9% over 999 resamples of the same size — an excess of +2.8 points, and 22 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.0% | `plants` | 0.0007 | 0.0296 | under | `root` 54.3% (180) `tree` 38.7% (219) `seed` 4.6% (49) `leaf` 1.8% (38) |
| 6.0% | `electronics` | 0.0001 | 0.0146 | under | `tsv` 82.3% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (109) |
| 4.4% | `lexicography` | 0.0297 | 0.0074 | **over** | `citation` 86.1% (105) `sense` 11.0% (320) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.7% | `linguistics` | 0.2664 | 0.1922 | **over** | `word` 30.4% (1,634) `name` 15.6% (804) `term` 15.3% (397) `parse` 5.0% (168) |
| 3.6% | `chemistry` | 0.0019 | 0.0151 | under | `extraction` 50.5% (68) `fraction` 12.4% (15) `extract` 8.5% (7) `render` 5.2% (15) |
| 3.2% | `psychology` | 0.0003 | 0.0090 | under | `module` 85.5% (87) `confidence` 4.1% (18) `know` 3.0% (73) `matter` 1.7% (33) |
| 3.1% | `astrology` | 0.0000 | 0.0074 | under | `placement` 96.2% (116) `figure` 1.3% (110) `descendant` 1.2% (8) `term` 0.7% (399) |
| 3.1% | `telecommunication` | 0.0877 | 0.0507 | **over** | `file` 61.1% (288) `entry` 26.4% (223) `copy` 2.6% (39) `note` 2.1% (11) |

### `documentation`

**22.9%** of the maximum divergence from the repository, against a null median of 34.9% over 999 resamples of the same size — an excess of -12.0 points, and 983 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `code-semantics-engine/src/test/resources`

**62.0%** of the maximum divergence from the repository, against a null median of 19.5% over 999 resamples of the same size — an excess of +42.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.6% | `electronics` | 0.2348 | 0.0146 | **over** | `tsv` 82.3% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (109) |
| 6.0% | `publishing` | 0.0000 | 0.0741 | under | `publish` 23.1% (376) `read` 15.2% (209) `write` 11.1% (777) `directory` 9.5% (102) |
| 4.1% | `telecommunication` | 0.0000 | 0.0507 | under | `file` 61.1% (288) `entry` 26.4% (223) `copy` 2.6% (39) `note` 2.1% (11) |
| 3.7% | `mathematics` | 0.0000 | 0.0463 | under | `from` 27.0% (168) `function` 9.6% (98) `count` 7.8% (80) `distribution` 6.4% (102) |
| 3.3% | `nautical` | 0.0674 | 0.0072 | **over** | `below` 18.9% (39) `report` 9.6% (299) `row` 9.1% (206) `render` 7.4% (92) |
| 2.6% | `telecommunications` | 0.0391 | 0.0013 | **over** | `read` 62.1% (1,008) `endpoint` 13.0% (13) `cell` 3.9% (13) `prefix` 3.8% (32) |
| 2.5% | `linguistics` | 0.0839 | 0.1922 | under | `word` 30.4% (1,634) `name` 15.6% (804) `term` 15.3% (397) `parse` 5.0% (168) |
| 2.5% | `law` | 0.0020 | 0.0405 | under | `file` 11.0% (558) `witness` 8.6% (70) `summary` 7.9% (57) `claim` 6.8% (119) |

Read, compared and resampled in 9.3 s, recorded rather than estimated.
