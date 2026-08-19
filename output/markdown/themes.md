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
| `linguistics` | 0.0507 | 65.7% | 4,498 | 178 | 14,381 | 34.8% | `word` 30.3% (1,584) `term` 15.8% (392) `name` 15.6% (774) `parse` 4.7% (163) |
| `computing` | 0.0150 | 72.2% | 6,873 | 35 | 1,938 | 4.7% | `repository` 6.3% (473) `read` 5.3% (965) `folder` 4.8% (37) `parse` 3.7% (163) |

Read over 581 files and 41,332 lines: 469 topics, 14 files no topic could be resolved for, and 34.8% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.2% of it; the other 75.8% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.9%** of the maximum divergence from the repository, against a null median of 9.8% over 999 resamples of the same size — an excess of +7.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `telecommunication` | 0.0002 | 0.0500 | under | `file` 62.6% (281) `entry` 27.4% (222) `copy` 2.8% (39) `registry` 2.1% (56) |
| 8.6% | `publishing` | 0.0148 | 0.0712 | under | `publish` 23.5% (360) `read` 15.0% (194) `write` 11.0% (739) `vocabulary` 8.8% (182) |
| 6.7% | `plants` | 0.0018 | 0.0309 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 5.2% | `time_period` | 0.0315 | 0.0040 | **over** | `span` 52.1% (26) `none` 20.3% (9) `stage` 6.5% (23) `long` 4.5% (23) |
| 4.8% | `physics` | 0.0578 | 0.0178 | **over** | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.4% | `electronics` | 0.0007 | 0.0151 | under | `tsv` 82.7% (31) `field` 7.7% (208) `headroom` 4.1% (2) `bar` 1.7% (107) |
| 3.4% | `lexicography` | 0.0323 | 0.0078 | **over** | `citation` 86.2% (102) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.4% | `politics` | 0.0402 | 0.0121 | **over** | `vote` 51.3% (56) `normalisation` 21.2% (23) `reading` 6.8% (705) `name` 4.6% (865) |

### `code-semantics-api/src/test/java`

**21.6%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +6.0 points, and 21 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `telecommunication` | 0.0014 | 0.0500 | under | `file` 62.6% (281) `entry` 27.4% (222) `copy` 2.8% (39) `registry` 2.1% (56) |
| 6.7% | `publishing` | 0.0147 | 0.0712 | under | `publish` 23.5% (360) `read` 15.0% (194) `write` 11.0% (739) `vocabulary` 8.8% (182) |
| 6.0% | `politics` | 0.0611 | 0.0121 | **over** | `vote` 51.3% (56) `normalisation` 21.2% (23) `reading` 6.8% (705) `name` 4.6% (865) |
| 5.9% | `plants` | 0.0009 | 0.0309 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 5.7% | `biology` | 0.0370 | 0.0030 | **over** | `morphology` 26.1% (21) `owl` 21.1% (24) `person` 8.3% (24) `glob` 7.1% (4) |
| 5.1% | `law` | 0.1071 | 0.0412 | **over** | `file` 11.3% (545) `witness` 8.9% (70) `summary` 8.1% (57) `claim` 6.9% (119) |
| 3.8% | `literature` | 0.0017 | 0.0236 | under | `header` 36.8% (90) `write` 16.4% (738) `text` 13.6% (107) `prose` 8.6% (131) |
| 3.7% | `linguistics` | 0.3002 | 0.1962 | **over** | `word` 30.3% (1,584) `term` 15.8% (392) `name` 15.6% (774) `parse` 4.7% (163) |

### `code-semantics-engine/src/main/java`

**3.5%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.1% | `electronics` | 0.0013 | 0.0151 | under | `tsv` 82.7% (31) `field` 7.7% (208) `headroom` 4.1% (2) `bar` 1.7% (107) |
| 12.8% | `chemistry` | 0.0018 | 0.0156 | under | `extraction` 49.4% (61) `fraction` 12.7% (14) `extract` 8.8% (7) `render` 5.0% (14) |
| 4.0% | `animals` | 0.0004 | 0.0042 | under | `nest` 55.5% (28) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 3.8% | `literature` | 0.0122 | 0.0236 | under | `header` 36.8% (90) `write` 16.4% (738) `text` 13.6% (107) `prose` 8.6% (131) |
| 3.7% | `calculus` | 0.0130 | 0.0051 | **over** | `divergence` 100.0% (154) |
| 2.7% | `psychology` | 0.0038 | 0.0095 | under | `module` 85.8% (87) `confidence` 4.1% (18) `know` 3.1% (73) `matter` 1.5% (28) |
| 2.2% | `grammar` | 0.0405 | 0.0284 | **over** | `phrase` 21.5% (160) `occurrence` 15.8% (182) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 2.1% | `linguistics` | 0.2257 | 0.1962 | **over** | `word` 30.3% (1,584) `term` 15.8% (392) `name` 15.6% (774) `parse` 4.7% (163) |

### `code-semantics-engine/src/test/java`

**3.8%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.2% | `electronics` | 0.0003 | 0.0151 | under | `tsv` 82.7% (31) `field` 7.7% (208) `headroom` 4.1% (2) `bar` 1.7% (107) |
| 13.0% | `plants` | 0.0671 | 0.0309 | **over** | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 5.5% | `psychology` | 0.0018 | 0.0095 | under | `module` 85.8% (87) `confidence` 4.1% (18) `know` 3.1% (73) `matter` 1.5% (28) |
| 4.5% | `chemistry` | 0.0058 | 0.0156 | under | `extraction` 49.4% (61) `fraction` 12.7% (14) `extract` 8.8% (7) `render` 5.0% (14) |
| 2.9% | `mathematics` | 0.0303 | 0.0454 | under | `from` 28.3% (162) `function` 10.2% (98) `count` 7.3% (74) `distribution` 6.8% (100) |
| 2.8% | `quality` | 0.0101 | 0.0039 | **over** | `ordinary` 27.9% (48) `tolerance` 12.1% (6) `dark` 6.9% (1) `best` 5.7% (8) |
| 2.4% | `astrology` | 0.0148 | 0.0074 | **over** | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (394) |
| 2.4% | `computer-languages` | 0.0001 | 0.0024 | under | `json` 46.2% (4) `xml` 17.2% (6) `sparql` 14.7% (1) `owl` 12.4% (24) |

### `lexicon-extraction/src/main/java`

**16.0%** of the maximum divergence from the repository, against a null median of 4.9% over 999 resamples of the same size — an excess of +11.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.3% | `linguistics` | 0.0763 | 0.1962 | under | `word` 30.3% (1,584) `term` 15.8% (392) `name` 15.6% (774) `parse` 4.7% (163) |
| 8.1% | `literature` | 0.0842 | 0.0236 | **over** | `header` 36.8% (90) `write` 16.4% (738) `text` 13.6% (107) `prose` 8.6% (131) |
| 7.4% | `plants` | 0.0015 | 0.0309 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 4.4% | `animals` | 0.0277 | 0.0042 | **over** | `nest` 55.5% (28) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 4.0% | `physics` | 0.0011 | 0.0178 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.9% | `grammar` | 0.0053 | 0.0284 | under | `phrase` 21.5% (160) `occurrence` 15.8% (182) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 3.8% | `psychology` | 0.0367 | 0.0095 | **over** | `module` 85.8% (87) `confidence` 4.1% (18) `know` 3.1% (73) `matter` 1.5% (28) |
| 3.5% | `money` | 0.0001 | 0.0117 | under | `share` 71.8% (343) `score` 8.6% (53) `say` 7.8% (288) `coverage` 4.3% (18) |

### `lexicon-extraction/src/test/java`

**19.0%** of the maximum divergence from the repository, against a null median of 6.0% over 999 resamples of the same size — an excess of +13.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 23.0% | `chemistry` | 0.1459 | 0.0156 | **over** | `extraction` 49.4% (61) `fraction` 12.7% (14) `extract` 8.8% (7) `render` 5.0% (14) |
| 10.3% | `electronics` | 0.0855 | 0.0151 | **over** | `tsv` 82.7% (31) `field` 7.7% (208) `headroom` 4.1% (2) `bar` 1.7% (107) |
| 6.8% | `linguistics` | 0.0949 | 0.1962 | under | `word` 30.3% (1,584) `term` 15.8% (392) `name` 15.6% (774) `parse` 4.7% (163) |
| 3.4% | `physics` | 0.0011 | 0.0178 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.1% | `person` | 0.0019 | 0.0193 | under | `reader` 17.2% (135) `child` 15.7% (23) `host` 10.9% (28) `parent` 7.9% (69) |
| 2.9% | `grammar` | 0.0062 | 0.0284 | under | `phrase` 21.5% (160) `occurrence` 15.8% (182) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 2.3% | `law` | 0.0154 | 0.0412 | under | `file` 11.3% (545) `witness` 8.9% (70) `summary` 8.1% (57) `claim` 6.9% (119) |
| 2.0% | `computing` | 0.1057 | 0.0632 | **over** | `repository` 6.3% (473) `read` 5.3% (965) `folder` 4.8% (37) `parse` 3.7% (163) |

### `lexicon/src/main/java`

**18.1%** of the maximum divergence from the repository, against a null median of 9.3% over 999 resamples of the same size — an excess of +8.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `networking` | 0.0563 | 0.0062 | **over** | `resource` 75.0% (283) `preamble` 7.5% (8) `request` 5.3% (10) `node` 4.6% (80) |
| 8.4% | `plants` | 0.0000 | 0.0309 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 6.8% | `publishing` | 0.0178 | 0.0712 | under | `publish` 23.5% (360) `read` 15.0% (194) `write` 11.0% (739) `vocabulary` 8.8% (182) |
| 5.0% | `linguistics` | 0.3080 | 0.1962 | **over** | `word` 30.3% (1,584) `term` 15.8% (392) `name` 15.6% (774) `parse` 4.7% (163) |
| 4.6% | `grammar` | 0.0771 | 0.0284 | **over** | `phrase` 21.5% (160) `occurrence` 15.8% (182) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 4.4% | `mathematics` | 0.1015 | 0.0454 | **over** | `from` 28.3% (162) `function` 10.2% (98) `count` 7.3% (74) `distribution` 6.8% (100) |
| 4.0% | `physics` | 0.0007 | 0.0178 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.1% | `chemistry` | 0.0010 | 0.0156 | under | `extraction` 49.4% (61) `fraction` 12.7% (14) `extract` 8.8% (7) `render` 5.0% (14) |

### `lexicon/src/test/java`

**12.2%** of the maximum divergence from the repository, against a null median of 9.4% over 999 resamples of the same size — an excess of +2.8 points, and 29 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.2% | `plants` | 0.0001 | 0.0309 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 6.1% | `electronics` | 0.0000 | 0.0151 | under | `tsv` 82.7% (31) `field` 7.7% (208) `headroom` 4.1% (2) `bar` 1.7% (107) |
| 4.6% | `lexicography` | 0.0319 | 0.0078 | **over** | `citation` 86.2% (102) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.8% | `linguistics` | 0.2739 | 0.1962 | **over** | `word` 30.3% (1,584) `term` 15.8% (392) `name` 15.6% (774) `parse` 4.7% (163) |
| 3.7% | `telecommunication` | 0.0919 | 0.0500 | **over** | `file` 62.6% (281) `entry` 27.4% (222) `copy` 2.8% (39) `registry` 2.1% (56) |
| 3.6% | `chemistry` | 0.0019 | 0.0156 | under | `extraction` 49.4% (61) `fraction` 12.7% (14) `extract` 8.8% (7) `render` 5.0% (14) |
| 3.2% | `psychology` | 0.0003 | 0.0095 | under | `module` 85.8% (87) `confidence` 4.1% (18) `know` 3.1% (73) `matter` 1.5% (28) |
| 3.0% | `astrology` | 0.0000 | 0.0074 | under | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (394) |

### `documentation`

**23.3%** of the maximum divergence from the repository, against a null median of 34.6% over 999 resamples of the same size — an excess of -11.3 points, and 979 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `code-semantics-engine/src/test/resources`

**61.7%** of the maximum divergence from the repository, against a null median of 19.3% over 999 resamples of the same size — an excess of +42.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.6% | `electronics` | 0.2348 | 0.0151 | **over** | `tsv` 82.7% (31) `field` 7.7% (208) `headroom` 4.1% (2) `bar` 1.7% (107) |
| 5.8% | `publishing` | 0.0000 | 0.0712 | under | `publish` 23.5% (360) `read` 15.0% (194) `write` 11.0% (739) `vocabulary` 8.8% (182) |
| 4.1% | `telecommunication` | 0.0000 | 0.0500 | under | `file` 62.6% (281) `entry` 27.4% (222) `copy` 2.8% (39) `registry` 2.1% (56) |
| 3.7% | `mathematics` | 0.0000 | 0.0454 | under | `from` 28.3% (162) `function` 10.2% (98) `count` 7.3% (74) `distribution` 6.8% (100) |
| 3.3% | `nautical` | 0.0674 | 0.0072 | **over** | `below` 19.3% (38) `report` 9.3% (287) `row` 8.9% (195) `render` 7.5% (89) |
| 2.7% | `linguistics` | 0.0839 | 0.1962 | under | `word` 30.3% (1,584) `term` 15.8% (392) `name` 15.6% (774) `parse` 4.7% (163) |
| 2.6% | `telecommunications` | 0.0391 | 0.0013 | **over** | `read` 61.4% (963) `endpoint` 13.3% (13) `cell` 4.0% (13) `prefix` 3.9% (32) |
| 2.5% | `law` | 0.0020 | 0.0412 | under | `file` 11.3% (545) `witness` 8.9% (70) `summary` 8.1% (57) `claim` 6.9% (119) |

Read, compared and resampled in 8.5 s, recorded rather than estimated.
