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
| `linguistics` | 0.0493 | 65.7% | 4,545 | 179 | 14,476 | 34.1% | `word` 30.2% (1,586) `term` 15.7% (394) `name` 15.7% (787) `parse` 4.7% (163) |
| `computing` | 0.0151 | 72.5% | 7,060 | 37 | 2,111 | 5.0% | `repository` 6.0% (475) `read` 5.2% (986) `folder` 4.7% (40) `byte` 3.9% (47) |

Read over 598 files and 42,488 lines: 469 topics, 15 files no topic could be resolved for, and 34.1% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.0% of it; the other 76.0% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**17.1%** of the maximum divergence from the repository, against a null median of 9.9% over 999 resamples of the same size — an excess of +7.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.4% | `telecommunication` | 0.0002 | 0.0508 | under | `file` 61.6% (287) `entry` 26.8% (223) `copy` 2.7% (39) `record` 2.0% (20) |
| 8.9% | `publishing` | 0.0148 | 0.0732 | under | `publish` 22.6% (362) `read` 15.0% (202) `write` 11.0% (747) `directory` 9.7% (102) |
| 6.4% | `plants` | 0.0018 | 0.0300 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 5.2% | `time_period` | 0.0315 | 0.0039 | **over** | `span` 52.1% (26) `none` 20.4% (10) `stage` 6.5% (23) `long` 4.5% (24) |
| 4.7% | `physics` | 0.0578 | 0.0178 | **over** | `mass` 44.9% (136) `weight` 28.3% (68) `length` 8.4% (84) `radius` 3.4% (2) |
| 3.5% | `lexicography` | 0.0323 | 0.0076 | **over** | `citation` 86.2% (104) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.4% | `politics` | 0.0402 | 0.0118 | **over** | `vote` 50.9% (56) `normalisation` 21.1% (23) `reading` 6.8% (713) `name` 4.8% (881) |
| 3.3% | `electronics` | 0.0007 | 0.0149 | under | `tsv` 82.4% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (107) |

### `code-semantics-api/src/test/java`

**21.8%** of the maximum divergence from the repository, against a null median of 15.7% over 999 resamples of the same size — an excess of +6.2 points, and 19 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.8% | `telecommunication` | 0.0014 | 0.0508 | under | `file` 61.6% (287) `entry` 26.8% (223) `copy` 2.7% (39) `record` 2.0% (20) |
| 7.0% | `publishing` | 0.0147 | 0.0732 | under | `publish` 22.6% (362) `read` 15.0% (202) `write` 11.0% (747) `directory` 9.7% (102) |
| 6.0% | `politics` | 0.0611 | 0.0118 | **over** | `vote` 50.9% (56) `normalisation` 21.1% (23) `reading` 6.8% (713) `name` 4.8% (881) |
| 5.7% | `plants` | 0.0009 | 0.0300 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 5.6% | `biology` | 0.0370 | 0.0030 | **over** | `morphology` 25.4% (21) `owl` 20.5% (24) `person` 8.0% (24) `glob` 6.9% (4) |
| 5.0% | `law` | 0.1071 | 0.0413 | **over** | `file` 11.1% (557) `witness` 8.6% (70) `summary` 7.9% (57) `claim` 6.8% (119) |
| 4.0% | `linguistics` | 0.3002 | 0.1917 | **over** | `word` 30.2% (1,586) `term` 15.7% (394) `name` 15.7% (787) `parse` 4.7% (163) |
| 3.8% | `literature` | 0.0017 | 0.0238 | under | `header` 37.6% (94) `write` 16.3% (746) `text` 13.4% (109) `prose` 8.4% (136) |

### `code-semantics-engine/src/main/java`

**3.6%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `electronics` | 0.0013 | 0.0149 | under | `tsv` 82.4% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (107) |
| 12.2% | `chemistry` | 0.0018 | 0.0154 | under | `extraction` 50.5% (66) `fraction` 12.4% (14) `extract` 8.5% (7) `render` 5.2% (15) |
| 3.7% | `literature` | 0.0122 | 0.0238 | under | `header` 37.6% (94) `write` 16.3% (746) `text` 13.4% (109) `prose` 8.4% (136) |
| 3.7% | `calculus` | 0.0130 | 0.0050 | **over** | `divergence` 100.0% (154) |
| 3.7% | `animals` | 0.0004 | 0.0041 | under | `nest` 55.5% (29) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 2.8% | `linguistics` | 0.2257 | 0.1917 | **over** | `word` 30.2% (1,586) `term` 15.7% (394) `name` 15.7% (787) `parse` 4.7% (163) |
| 2.4% | `psychology` | 0.0038 | 0.0092 | under | `module` 85.7% (87) `confidence` 4.1% (18) `know` 3.1% (73) `matter` 1.7% (31) |
| 2.4% | `grammar` | 0.0405 | 0.0278 | **over** | `phrase` 21.4% (160) `occurrence` 15.8% (182) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |

### `code-semantics-engine/src/test/java`

**3.8%** of the maximum divergence from the repository, against a null median of 1.5% over 999 resamples of the same size — an excess of +2.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `electronics` | 0.0003 | 0.0149 | under | `tsv` 82.4% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (107) |
| 13.7% | `plants` | 0.0671 | 0.0300 | **over** | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 5.2% | `psychology` | 0.0018 | 0.0092 | under | `module` 85.7% (87) `confidence` 4.1% (18) `know` 3.1% (73) `matter` 1.7% (31) |
| 4.3% | `chemistry` | 0.0058 | 0.0154 | under | `extraction` 50.5% (66) `fraction` 12.4% (14) `extract` 8.5% (7) `render` 5.2% (15) |
| 2.9% | `mathematics` | 0.0303 | 0.0455 | under | `from` 27.9% (164) `function` 10.0% (98) `count` 8.1% (80) `distribution` 6.6% (101) |
| 2.9% | `quality` | 0.0101 | 0.0038 | **over** | `ordinary` 27.9% (48) `tolerance` 12.0% (6) `dark` 6.9% (1) `best` 5.7% (9) |
| 2.5% | `computer-languages` | 0.0001 | 0.0025 | under | `json` 55.9% (5) `xml` 14.1% (6) `sparql` 12.1% (1) `owl` 10.2% (24) |
| 2.3% | `administration` | 0.0132 | 0.0063 | **over** | `branch` 70.7% (143) `title` 9.4% (12) `foreign` 5.5% (9) `english` 4.1% (80) |

### `lexicon-extraction/src/main/java`

**15.3%** of the maximum divergence from the repository, against a null median of 4.4% over 999 resamples of the same size — an excess of +10.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.2% | `linguistics` | 0.0686 | 0.1917 | under | `word` 30.2% (1,586) `term` 15.7% (394) `name` 15.7% (787) `parse` 4.7% (163) |
| 7.7% | `plants` | 0.0013 | 0.0300 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 7.6% | `literature` | 0.0801 | 0.0238 | **over** | `header` 37.6% (94) `write` 16.3% (746) `text` 13.4% (109) `prose` 8.4% (136) |
| 4.3% | `grammar` | 0.0047 | 0.0278 | under | `phrase` 21.4% (160) `occurrence` 15.8% (182) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 3.8% | `animals` | 0.0243 | 0.0041 | **over** | `nest` 55.5% (29) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 3.5% | `money` | 0.0001 | 0.0114 | under | `share` 71.8% (343) `score` 8.6% (53) `say` 7.9% (294) `coverage` 4.3% (18) |
| 3.2% | `psychology` | 0.0323 | 0.0092 | **over** | `module` 85.7% (87) `confidence` 4.1% (18) `know` 3.1% (73) `matter` 1.7% (31) |
| 2.6% | `physics` | 0.0033 | 0.0178 | under | `mass` 44.9% (136) `weight` 28.3% (68) `length` 8.4% (84) `radius` 3.4% (2) |

### `lexicon-extraction/src/test/java`

**17.1%** of the maximum divergence from the repository, against a null median of 5.4% over 999 resamples of the same size — an excess of +11.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.7% | `chemistry` | 0.1298 | 0.0154 | **over** | `extraction` 50.5% (66) `fraction` 12.4% (14) `extract` 8.5% (7) `render` 5.2% (15) |
| 9.3% | `electronics` | 0.0753 | 0.0149 | **over** | `tsv` 82.4% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (107) |
| 8.8% | `linguistics` | 0.0853 | 0.1917 | under | `word` 30.2% (1,586) `term` 15.7% (394) `name` 15.7% (787) `parse` 4.7% (163) |
| 3.8% | `person` | 0.0017 | 0.0199 | under | `reader` 18.1% (137) `child` 15.5% (23) `host` 10.8% (28) `parent` 7.8% (69) |
| 3.2% | `grammar` | 0.0061 | 0.0278 | under | `phrase` 21.4% (160) `occurrence` 15.8% (182) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 2.5% | `computing` | 0.1085 | 0.0640 | **over** | `repository` 6.0% (475) `read` 5.2% (986) `folder` 4.7% (40) `byte` 3.9% (47) |
| 2.4% | `physics` | 0.0030 | 0.0178 | under | `mass` 44.9% (136) `weight` 28.3% (68) `length` 8.4% (84) `radius` 3.4% (2) |
| 2.2% | `plants` | 0.0099 | 0.0300 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |

### `lexicon/src/main/java`

**18.3%** of the maximum divergence from the repository, against a null median of 9.1% over 999 resamples of the same size — an excess of +9.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `networking` | 0.0587 | 0.0063 | **over** | `resource` 75.5% (284) `preamble` 7.3% (8) `request` 5.2% (10) `node` 4.5% (82) |
| 8.2% | `plants` | 0.0000 | 0.0300 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 7.4% | `publishing` | 0.0172 | 0.0732 | under | `publish` 22.6% (362) `read` 15.0% (202) `write` 11.0% (747) `directory` 9.7% (102) |
| 4.5% | `linguistics` | 0.2971 | 0.1917 | **over** | `word` 30.2% (1,586) `term` 15.7% (394) `name` 15.7% (787) `parse` 4.7% (163) |
| 4.4% | `grammar` | 0.0743 | 0.0278 | **over** | `phrase` 21.4% (160) `occurrence` 15.8% (182) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 4.3% | `mathematics` | 0.1015 | 0.0455 | **over** | `from` 27.9% (164) `function` 10.0% (98) `count` 8.1% (80) `distribution` 6.6% (101) |
| 3.8% | `physics` | 0.0007 | 0.0178 | under | `mass` 44.9% (136) `weight` 28.3% (68) `length` 8.4% (84) `radius` 3.4% (2) |
| 3.4% | `philosophy` | 0.0335 | 0.0078 | **over** | `describe` 33.2% (42) `lemma` 26.0% (79) `each` 9.4% (58) `explain` 9.3% (14) |

### `lexicon/src/test/java`

**11.8%** of the maximum divergence from the repository, against a null median of 9.0% over 999 resamples of the same size — an excess of +2.7 points, and 37 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.0% | `plants` | 0.0007 | 0.0300 | under | `root` 53.9% (178) `tree` 39.0% (216) `seed` 4.6% (49) `leaf` 1.8% (36) |
| 6.1% | `electronics` | 0.0001 | 0.0149 | under | `tsv` 82.4% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (107) |
| 4.7% | `linguistics` | 0.2760 | 0.1917 | **over** | `word` 30.2% (1,586) `term` 15.7% (394) `name` 15.7% (787) `parse` 4.7% (163) |
| 4.6% | `lexicography` | 0.0308 | 0.0076 | **over** | `citation` 86.2% (104) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.7% | `chemistry` | 0.0019 | 0.0154 | under | `extraction` 50.5% (66) `fraction` 12.4% (14) `extract` 8.5% (7) `render` 5.2% (15) |
| 3.3% | `psychology` | 0.0003 | 0.0092 | under | `module` 85.7% (87) `confidence` 4.1% (18) `know` 3.1% (73) `matter` 1.7% (31) |
| 3.2% | `telecommunication` | 0.0886 | 0.0508 | **over** | `file` 61.6% (287) `entry` 26.8% (223) `copy` 2.7% (39) `record` 2.0% (20) |
| 3.2% | `astrology` | 0.0000 | 0.0076 | under | `placement` 96.2% (114) `figure` 1.3% (109) `descendant` 1.2% (8) `term` 0.7% (396) |

### `documentation`

**23.1%** of the maximum divergence from the repository, against a null median of 34.6% over 999 resamples of the same size — an excess of -11.5 points, and 987 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `code-semantics-engine/src/test/resources`

**61.8%** of the maximum divergence from the repository, against a null median of 19.6% over 999 resamples of the same size — an excess of +42.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.6% | `electronics` | 0.2348 | 0.0149 | **over** | `tsv` 82.4% (33) `field` 7.6% (218) `headroom` 4.1% (2) `bar` 1.6% (107) |
| 5.9% | `publishing` | 0.0000 | 0.0732 | under | `publish` 22.6% (362) `read` 15.0% (202) `write` 11.0% (747) `directory` 9.7% (102) |
| 4.1% | `telecommunication` | 0.0000 | 0.0508 | under | `file` 61.6% (287) `entry` 26.8% (223) `copy` 2.7% (39) `record` 2.0% (20) |
| 3.7% | `mathematics` | 0.0000 | 0.0455 | under | `from` 27.9% (164) `function` 10.0% (98) `count` 8.1% (80) `distribution` 6.6% (101) |
| 3.3% | `nautical` | 0.0674 | 0.0073 | **over** | `below` 19.3% (39) `row` 9.2% (206) `report` 9.2% (290) `render` 7.6% (92) |
| 2.6% | `telecommunications` | 0.0391 | 0.0013 | **over** | `read` 61.8% (984) `endpoint` 13.1% (13) `cell` 3.9% (13) `prefix` 3.8% (32) |
| 2.5% | `law` | 0.0020 | 0.0413 | under | `file` 11.1% (557) `witness` 8.6% (70) `summary` 7.9% (57) `claim` 6.8% (119) |
| 2.5% | `linguistics` | 0.0839 | 0.1917 | under | `word` 30.2% (1,586) `term` 15.7% (394) `name` 15.7% (787) `parse` 4.7% (163) |

Read, compared and resampled in 9.1 s, recorded rather than estimated.
