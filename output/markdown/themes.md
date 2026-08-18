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
| `linguistics` | 0.0516 | 65.2% | 4,381 | 174 | 14,096 | 35.4% | `word` 30.5% (1,566) `name` 15.5% (740) `term` 15.5% (390) `parse` 4.8% (158) |
| `computing` | 0.0143 | 71.0% | 6,610 | 33 | 1,813 | 4.5% | `repository` 6.7% (467) `folder` 5.3% (37) `read` 4.8% (922) `dictionary` 3.9% (235) |

Read over 549 files and 39,875 lines: 467 topics, 4 files no topic could be resolved for, and 35.4% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 23.7% of it; the other 76.3% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.1%** of the maximum divergence from the repository, against a null median of 9.5% over 999 resamples of the same size — an excess of +6.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.1% | `telecommunication` | 0.0002 | 0.0436 | under | `file` 62.2% (237) `entry` 31.2% (212) `copy` 3.2% (37) `note` 1.5% (6) |
| 8.7% | `publishing` | 0.0148 | 0.0697 | under | `publish` 25.1% (354) `read` 14.6% (181) `write` 11.8% (726) `vocabulary` 8.9% (177) |
| 6.9% | `plants` | 0.0018 | 0.0303 | under | `root` 52.7% (161) `tree` 39.5% (202) `seed` 5.0% (49) `leaf` 1.9% (33) |
| 5.2% | `time_period` | 0.0315 | 0.0043 | **over** | `span` 52.2% (26) `none` 20.3% (9) `stage` 6.5% (23) `long` 4.5% (23) |
| 4.7% | `physics` | 0.0578 | 0.0186 | **over** | `mass` 46.2% (136) `weight` 29.1% (67) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.5% | `lexicography` | 0.0323 | 0.0081 | **over** | `citation` 86.9% (98) `sense` 10.1% (317) `lemma` 1.3% (79) `gloss` 1.1% (1) |
| 3.3% | `politics` | 0.0402 | 0.0128 | **over** | `vote` 52.1% (56) `normalisation` 21.5% (23) `reading` 6.9% (699) `name` 4.7% (831) |
| 2.4% | `astrology` | 0.0000 | 0.0078 | under | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |

### `code-semantics-api/src/test/java`

**20.7%** of the maximum divergence from the repository, against a null median of 15.1% over 999 resamples of the same size — an excess of +5.6 points, and 22 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.5% | `telecommunication` | 0.0017 | 0.0436 | under | `file` 62.2% (237) `entry` 31.2% (212) `copy` 3.2% (37) `note` 1.5% (6) |
| 6.7% | `plants` | 0.0004 | 0.0303 | under | `root` 52.7% (161) `tree` 39.5% (202) `seed` 5.0% (49) `leaf` 1.9% (33) |
| 6.6% | `publishing` | 0.0154 | 0.0697 | under | `publish` 25.1% (354) `read` 14.6% (181) `write` 11.8% (726) `vocabulary` 8.9% (177) |
| 6.4% | `biology` | 0.0383 | 0.0027 | **over** | `morphology` 25.6% (21) `owl` 20.9% (24) `person` 8.4% (24) `glob` 7.2% (4) |
| 6.2% | `politics` | 0.0622 | 0.0128 | **over** | `vote` 52.1% (56) `normalisation` 21.5% (23) `reading` 6.9% (699) `name` 4.7% (831) |
| 4.0% | `literature` | 0.0016 | 0.0237 | under | `header` 37.7% (87) `write` 17.1% (725) `text` 12.0% (89) `prose` 7.9% (120) |
| 3.4% | `law` | 0.0927 | 0.0421 | **over** | `file` 10.3% (489) `witness` 9.1% (70) `summary` 8.3% (57) `claim` 7.2% (119) |
| 3.3% | `linguistics` | 0.2994 | 0.2019 | **over** | `word` 30.5% (1,566) `name` 15.5% (740) `term` 15.5% (390) `parse` 4.8% (158) |

### `code-semantics-engine/src/main/java`

**3.4%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.3% | `chemistry` | 0.0018 | 0.0173 | under | `extraction` 39.5% (59) `fraction` 13.3% (14) `test` 9.3% (263) `extract` 9.2% (7) |
| 6.9% | `electronics` | 0.0013 | 0.0090 | under | `tsv` 79.2% (27) `field` 9.4% (204) `headroom` 5.3% (2) `bar` 2.1% (106) |
| 6.5% | `psychology` | 0.0015 | 0.0091 | under | `module` 80.7% (68) `confidence` 4.7% (18) `test` 4.1% (263) `know` 3.6% (75) |
| 4.3% | `animals` | 0.0004 | 0.0044 | under | `nest` 55.9% (28) `owl` 25.5% (24) `tail` 8.3% (26) `head` 6.3% (13) |
| 3.8% | `literature` | 0.0124 | 0.0237 | under | `header` 37.7% (87) `write` 17.1% (725) `text` 12.0% (89) `prose` 7.9% (120) |
| 3.8% | `calculus` | 0.0135 | 0.0054 | **over** | `divergence` 100.0% (154) |
| 2.4% | `grammar` | 0.0418 | 0.0293 | **over** | `phrase` 21.2% (158) `verb` 15.6% (86) `occurrence` 15.5% (178) `part_of_speech` 12.4% (37) |
| 2.3% | `linguistics` | 0.2322 | 0.2019 | **over** | `word` 30.5% (1,566) `name` 15.5% (740) `term` 15.5% (390) `parse` 4.8% (158) |

### `code-semantics-engine/src/test/java`

**3.5%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.9% | `plants` | 0.0672 | 0.0303 | **over** | `root` 52.7% (161) `tree` 39.5% (202) `seed` 5.0% (49) `leaf` 1.9% (33) |
| 10.4% | `electronics` | 0.0004 | 0.0090 | under | `tsv` 79.2% (27) `field` 9.4% (204) `headroom` 5.3% (2) `bar` 2.1% (106) |
| 4.4% | `psychology` | 0.0024 | 0.0091 | under | `module` 80.7% (68) `confidence` 4.7% (18) `test` 4.1% (263) `know` 3.6% (75) |
| 4.2% | `chemistry` | 0.0075 | 0.0173 | under | `extraction` 39.5% (59) `fraction` 13.3% (14) `test` 9.3% (263) `extract` 9.2% (7) |
| 3.3% | `mathematics` | 0.0320 | 0.0477 | under | `from` 28.6% (161) `function` 10.0% (98) `count` 7.2% (72) `distribution` 6.7% (100) |
| 2.8% | `computer-languages` | 0.0001 | 0.0023 | under | `json` 50.5% (4) `sparql` 16.1% (1) `owl` 13.3% (24) `xml` 12.5% (6) |
| 2.7% | `astrology` | 0.0155 | 0.0078 | **over** | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |
| 2.3% | `quality` | 0.0084 | 0.0034 | **over** | `ordinary` 27.1% (48) `tolerance` 12.2% (6) `dark` 7.6% (1) `general` 4.9% (9) |

### `lexicon-extraction/src/main/java`

**16.6%** of the maximum divergence from the repository, against a null median of 4.9% over 999 resamples of the same size — an excess of +11.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.2% | `linguistics` | 0.0786 | 0.2019 | under | `word` 30.5% (1,566) `name` 15.5% (740) `term` 15.5% (390) `parse` 4.8% (158) |
| 7.1% | `literature` | 0.0805 | 0.0237 | **over** | `header` 37.7% (87) `write` 17.1% (725) `text` 12.0% (89) `prose` 7.9% (120) |
| 6.9% | `plants` | 0.0016 | 0.0303 | under | `root` 52.7% (161) `tree` 39.5% (202) `seed` 5.0% (49) `leaf` 1.9% (33) |
| 4.4% | `animals` | 0.0292 | 0.0044 | **over** | `nest` 55.9% (28) `owl` 25.5% (24) `tail` 8.3% (26) `head` 6.3% (13) |
| 4.4% | `electronics` | 0.0391 | 0.0090 | **over** | `tsv` 79.2% (27) `field` 9.4% (204) `headroom` 5.3% (2) `bar` 2.1% (106) |
| 4.0% | `physics` | 0.0011 | 0.0186 | under | `mass` 46.2% (136) `weight` 29.1% (67) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.9% | `psychology` | 0.0368 | 0.0091 | **over** | `module` 80.7% (68) `confidence` 4.7% (18) `test` 4.1% (263) `know` 3.6% (75) |
| 3.8% | `grammar` | 0.0056 | 0.0293 | under | `phrase` 21.2% (158) `verb` 15.6% (86) `occurrence` 15.5% (178) `part_of_speech` 12.4% (37) |

### `lexicon-extraction/src/test/java`

**19.5%** of the maximum divergence from the repository, against a null median of 6.0% over 999 resamples of the same size — an excess of +13.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 24.2% | `chemistry` | 0.1584 | 0.0173 | **over** | `extraction` 39.5% (59) `fraction` 13.3% (14) `test` 9.3% (263) `extract` 9.2% (7) |
| 8.0% | `linguistics` | 0.0910 | 0.2019 | under | `word` 30.5% (1,566) `name` 15.5% (740) `term` 15.5% (390) `parse` 4.8% (158) |
| 6.3% | `electronics` | 0.0525 | 0.0090 | **over** | `tsv` 79.2% (27) `field` 9.4% (204) `headroom` 5.3% (2) `bar` 2.1% (106) |
| 3.6% | `physics` | 0.0009 | 0.0186 | under | `mass` 46.2% (136) `weight` 29.1% (67) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.1% | `person` | 0.0023 | 0.0205 | under | `reader` 18.3% (130) `child` 15.7% (23) `host` 10.9% (28) `parent` 7.9% (66) |
| 2.6% | `grammar` | 0.0073 | 0.0293 | under | `phrase` 21.2% (158) `verb` 15.6% (86) `occurrence` 15.5% (178) `part_of_speech` 12.4% (37) |
| 2.4% | `law` | 0.0152 | 0.0421 | under | `file` 10.3% (489) `witness` 9.1% (70) `summary` 8.3% (57) `claim` 7.2% (119) |
| 2.2% | `psychology` | 0.0301 | 0.0091 | **over** | `module` 80.7% (68) `confidence` 4.7% (18) `test` 4.1% (263) `know` 3.6% (75) |

### `lexicon/src/main/java`

**18.3%** of the maximum divergence from the repository, against a null median of 9.2% over 999 resamples of the same size — an excess of +9.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `networking` | 0.0520 | 0.0059 | **over** | `resource` 72.5% (264) `preamble` 8.3% (8) `request` 5.9% (10) `node` 5.1% (80) |
| 8.2% | `plants` | 0.0000 | 0.0303 | under | `root` 52.7% (161) `tree` 39.5% (202) `seed` 5.0% (49) `leaf` 1.9% (33) |
| 6.6% | `publishing` | 0.0174 | 0.0697 | under | `publish` 25.1% (354) `read` 14.6% (181) `write` 11.8% (726) `vocabulary` 8.9% (177) |
| 4.8% | `grammar` | 0.0800 | 0.0293 | **over** | `phrase` 21.2% (158) `verb` 15.6% (86) `occurrence` 15.5% (178) `part_of_speech` 12.4% (37) |
| 4.4% | `linguistics` | 0.3082 | 0.2019 | **over** | `word` 30.5% (1,566) `name` 15.5% (740) `term` 15.5% (390) `parse` 4.8% (158) |
| 4.3% | `chemistry` | 0.0002 | 0.0173 | under | `extraction` 39.5% (59) `fraction` 13.3% (14) `test` 9.3% (263) `extract` 9.2% (7) |
| 4.2% | `mathematics` | 0.1042 | 0.0477 | **over** | `from` 28.6% (161) `function` 10.0% (98) `count` 7.2% (72) `distribution` 6.7% (100) |
| 4.1% | `physics` | 0.0007 | 0.0186 | under | `mass` 46.2% (136) `weight` 29.1% (67) `length` 6.5% (71) `radius` 3.5% (2) |

### `lexicon/src/test/java`

**11.7%** of the maximum divergence from the repository, against a null median of 9.3% over 999 resamples of the same size — an excess of +2.3 points, and 58 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.5% | `plants` | 0.0001 | 0.0303 | under | `root` 52.7% (161) `tree` 39.5% (202) `seed` 5.0% (49) `leaf` 1.9% (33) |
| 4.9% | `lexicography` | 0.0327 | 0.0081 | **over** | `citation` 86.9% (98) `sense` 10.1% (317) `lemma` 1.3% (79) `gloss` 1.1% (1) |
| 4.2% | `chemistry` | 0.0021 | 0.0173 | under | `extraction` 39.5% (59) `fraction` 13.3% (14) `test` 9.3% (263) `extract` 9.2% (7) |
| 3.9% | `telecommunication` | 0.0832 | 0.0436 | **over** | `file` 62.2% (237) `entry` 31.2% (212) `copy` 3.2% (37) `note` 1.5% (6) |
| 3.8% | `electronics` | 0.0000 | 0.0090 | under | `tsv` 79.2% (27) `field` 9.4% (204) `headroom` 5.3% (2) `bar` 2.1% (106) |
| 3.3% | `astrology` | 0.0000 | 0.0078 | under | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |
| 3.2% | `linguistics` | 0.2723 | 0.2019 | **over** | `word` 30.5% (1,566) `name` 15.5% (740) `term` 15.5% (390) `parse` 4.8% (158) |
| 2.6% | `politics` | 0.0021 | 0.0128 | under | `vote` 52.1% (56) `normalisation` 21.5% (23) `reading` 6.9% (699) `name` 4.7% (831) |

### `documentation`

**23.1%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of -10.9 points, and 975 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.5 s, recorded rather than estimated.
