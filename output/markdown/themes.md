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
| `linguistics` | 0.0522 | 65.7% | 4,437 | 176 | 14,270 | 35.1% | `word` 30.4% (1,580) `term` 15.7% (390) `name` 15.5% (757) `parse` 4.7% (161) |
| `computing` | 0.0149 | 71.7% | 6,746 | 34 | 1,884 | 4.6% | `repository` 6.5% (470) `read` 5.2% (944) `folder` 5.0% (37) `parse` 3.8% (161) |

Read over 558 files and 40,619 lines: 468 topics, 4 files no topic could be resolved for, and 35.1% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.2% of it; the other 75.8% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.3%** of the maximum divergence from the repository, against a null median of 9.6% over 999 resamples of the same size — an excess of +6.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.2% | `telecommunication` | 0.0002 | 0.0448 | under | `file` 62.9% (252) `entry` 30.4% (221) `copy` 3.1% (38) `note` 1.4% (6) |
| 8.9% | `publishing` | 0.0148 | 0.0711 | under | `publish` 24.4% (355) `read` 14.9% (188) `write` 11.3% (729) `vocabulary` 9.1% (180) |
| 6.9% | `plants` | 0.0018 | 0.0309 | under | `root` 53.5% (172) `tree` 39.1% (209) `seed` 4.8% (49) `leaf` 1.8% (36) |
| 5.3% | `time_period` | 0.0315 | 0.0041 | **over** | `span` 52.1% (26) `none` 20.3% (9) `stage` 6.5% (23) `long` 4.5% (23) |
| 4.7% | `physics` | 0.0578 | 0.0185 | **over** | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.4% | `lexicography` | 0.0323 | 0.0081 | **over** | `citation` 86.2% (98) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.4% | `politics` | 0.0402 | 0.0125 | **over** | `vote` 51.8% (56) `normalisation` 21.4% (23) `reading` 6.9% (701) `name` 4.7% (848) |
| 2.6% | `electronics` | 0.0007 | 0.0118 | under | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |

### `code-semantics-api/src/test/java`

**21.1%** of the maximum divergence from the repository, against a null median of 15.5% over 999 resamples of the same size — an excess of +5.7 points, and 22 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.8% | `telecommunication` | 0.0014 | 0.0448 | under | `file` 62.9% (252) `entry` 30.4% (221) `copy` 3.1% (38) `note` 1.4% (6) |
| 6.9% | `publishing` | 0.0147 | 0.0711 | under | `publish` 24.4% (355) `read` 14.9% (188) `write` 11.3% (729) `vocabulary` 9.1% (180) |
| 6.1% | `plants` | 0.0009 | 0.0309 | under | `root` 53.5% (172) `tree` 39.1% (209) `seed` 4.8% (49) `leaf` 1.8% (36) |
| 6.1% | `biology` | 0.0370 | 0.0026 | **over** | `morphology` 26.2% (21) `owl` 21.2% (24) `person` 8.3% (24) `glob` 7.1% (4) |
| 6.0% | `politics` | 0.0611 | 0.0125 | **over** | `vote` 51.8% (56) `normalisation` 21.4% (23) `reading` 6.9% (701) `name` 4.7% (848) |
| 5.0% | `law` | 0.1071 | 0.0420 | **over** | `file` 10.7% (508) `witness` 9.0% (70) `summary` 8.2% (57) `claim` 7.0% (119) |
| 3.9% | `literature` | 0.0017 | 0.0236 | under | `header` 36.0% (87) `write` 16.4% (728) `text` 13.7% (106) `prose` 8.8% (130) |
| 3.3% | `linguistics` | 0.3002 | 0.2013 | **over** | `word` 30.4% (1,580) `term` 15.7% (390) `name` 15.5% (757) `parse` 4.7% (161) |

### `code-semantics-engine/src/main/java`

**3.2%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +1.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.9% | `chemistry` | 0.0018 | 0.0156 | under | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |
| 10.8% | `electronics` | 0.0013 | 0.0118 | under | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |
| 4.5% | `animals` | 0.0004 | 0.0044 | under | `nest` 55.5% (28) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 3.9% | `literature` | 0.0125 | 0.0236 | under | `header` 36.0% (87) `write` 16.4% (728) `text` 13.7% (106) `prose` 8.8% (130) |
| 3.9% | `calculus` | 0.0132 | 0.0053 | **over** | `divergence` 100.0% (154) |
| 3.1% | `psychology` | 0.0034 | 0.0092 | under | `module` 85.5% (85) `confidence` 4.2% (18) `know` 3.2% (73) `matter` 1.5% (28) |
| 2.3% | `information-science` | 0.0010 | 0.0043 | under | `synset` 70.2% (26) `document` 24.2% (78) `ontology` 4.9% (125) `align` 0.4% (1) |
| 2.2% | `grammar` | 0.0410 | 0.0292 | **over** | `phrase` 21.5% (160) `occurrence` 15.6% (180) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |

### `code-semantics-engine/src/test/java`

**3.6%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.6% | `electronics` | 0.0004 | 0.0118 | under | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |
| 13.1% | `plants` | 0.0663 | 0.0309 | **over** | `root` 53.5% (172) `tree` 39.1% (209) `seed` 4.8% (49) `leaf` 1.8% (36) |
| 5.4% | `psychology` | 0.0018 | 0.0092 | under | `module` 85.5% (85) `confidence` 4.2% (18) `know` 3.2% (73) `matter` 1.5% (28) |
| 4.6% | `chemistry` | 0.0058 | 0.0156 | under | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |
| 3.4% | `mathematics` | 0.0308 | 0.0470 | under | `from` 28.3% (161) `function` 10.2% (98) `count` 7.1% (72) `distribution` 6.8% (100) |
| 2.8% | `quality` | 0.0103 | 0.0040 | **over** | `ordinary` 27.9% (48) `tolerance` 12.1% (6) `dark` 6.9% (1) `best` 5.7% (8) |
| 2.6% | `computer-languages` | 0.0001 | 0.0025 | under | `json` 46.2% (4) `xml` 17.2% (6) `sparql` 14.7% (1) `owl` 12.4% (24) |
| 2.4% | `astrology` | 0.0151 | 0.0077 | **over** | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |

### `lexicon-extraction/src/main/java`

**16.3%** of the maximum divergence from the repository, against a null median of 5.0% over 999 resamples of the same size — an excess of +11.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.1% | `linguistics` | 0.0794 | 0.2013 | under | `word` 30.4% (1,580) `term` 15.7% (390) `name` 15.5% (757) `parse` 4.7% (161) |
| 7.3% | `literature` | 0.0806 | 0.0236 | **over** | `header` 36.0% (87) `write` 16.4% (728) `text` 13.7% (106) `prose` 8.8% (130) |
| 7.2% | `plants` | 0.0016 | 0.0309 | under | `root` 53.5% (172) `tree` 39.1% (209) `seed` 4.8% (49) `leaf` 1.8% (36) |
| 4.6% | `animals` | 0.0292 | 0.0044 | **over** | `nest` 55.5% (28) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 4.3% | `psychology` | 0.0387 | 0.0092 | **over** | `module` 85.5% (85) `confidence` 4.2% (18) `know` 3.2% (73) `matter` 1.5% (28) |
| 4.1% | `physics` | 0.0011 | 0.0185 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.9% | `grammar` | 0.0056 | 0.0292 | under | `phrase` 21.5% (160) `occurrence` 15.6% (180) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 3.6% | `money` | 0.0001 | 0.0122 | under | `share` 71.8% (343) `score` 8.6% (53) `say` 7.8% (286) `coverage` 4.3% (18) |

### `lexicon-extraction/src/test/java`

**20.1%** of the maximum divergence from the repository, against a null median of 6.2% over 999 resamples of the same size — an excess of +13.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.1% | `chemistry` | 0.1473 | 0.0156 | **over** | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |
| 12.1% | `electronics` | 0.0894 | 0.0118 | **over** | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |
| 6.4% | `linguistics` | 0.0990 | 0.2013 | under | `word` 30.4% (1,580) `term` 15.7% (390) `name` 15.5% (757) `parse` 4.7% (161) |
| 3.3% | `physics` | 0.0011 | 0.0185 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.2% | `person` | 0.0020 | 0.0205 | under | `reader` 18.1% (133) `child` 15.5% (23) `host` 10.8% (28) `parent` 7.9% (69) |
| 3.1% | `law` | 0.0121 | 0.0420 | under | `file` 10.7% (508) `witness` 9.0% (70) `summary` 8.2% (57) `claim` 7.0% (119) |
| 2.8% | `grammar` | 0.0065 | 0.0292 | under | `phrase` 21.5% (160) `occurrence` 15.6% (180) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 2.2% | `computing` | 0.1087 | 0.0634 | **over** | `repository` 6.5% (470) `read` 5.2% (944) `folder` 5.0% (37) `parse` 3.8% (161) |

### `lexicon/src/main/java`

**18.4%** of the maximum divergence from the repository, against a null median of 9.4% over 999 resamples of the same size — an excess of +9.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `networking` | 0.0520 | 0.0058 | **over** | `resource` 72.6% (268) `preamble` 8.2% (8) `request` 5.9% (10) `node` 5.0% (80) |
| 8.3% | `plants` | 0.0000 | 0.0309 | under | `root` 53.5% (172) `tree` 39.1% (209) `seed` 4.8% (49) `leaf` 1.8% (36) |
| 6.8% | `publishing` | 0.0174 | 0.0711 | under | `publish` 24.4% (355) `read` 14.9% (188) `write` 11.3% (729) `vocabulary` 9.1% (180) |
| 4.8% | `grammar` | 0.0800 | 0.0292 | **over** | `phrase` 21.5% (160) `occurrence` 15.6% (180) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 4.4% | `linguistics` | 0.3082 | 0.2013 | **over** | `word` 30.4% (1,580) `term` 15.7% (390) `name` 15.5% (757) `parse` 4.7% (161) |
| 4.3% | `mathematics` | 0.1042 | 0.0470 | **over** | `from` 28.3% (161) `function` 10.2% (98) `count` 7.1% (72) `distribution` 6.8% (100) |
| 4.1% | `physics` | 0.0007 | 0.0185 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.8% | `chemistry` | 0.0002 | 0.0156 | under | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |

### `lexicon/src/test/java`

**12.3%** of the maximum divergence from the repository, against a null median of 9.3% over 999 resamples of the same size — an excess of +2.9 points, and 28 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.2% | `plants` | 0.0001 | 0.0309 | under | `root` 53.5% (172) `tree` 39.1% (209) `seed` 4.8% (49) `leaf` 1.8% (36) |
| 5.9% | `chemistry` | 0.0002 | 0.0156 | under | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |
| 4.8% | `lexicography` | 0.0331 | 0.0081 | **over** | `citation` 86.2% (98) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 4.7% | `electronics` | 0.0000 | 0.0118 | under | `tsv` 81.6% (27) `field` 8.2% (204) `headroom` 4.4% (2) `bar` 1.8% (106) |
| 4.2% | `linguistics` | 0.2844 | 0.2013 | **over** | `word` 30.4% (1,580) `term` 15.7% (390) `name` 15.5% (757) `parse` 4.7% (161) |
| 3.1% | `psychology` | 0.0003 | 0.0092 | under | `module` 85.5% (85) `confidence` 4.2% (18) `know` 3.2% (73) `matter` 1.5% (28) |
| 3.1% | `telecommunication` | 0.0807 | 0.0448 | **over** | `file` 62.9% (252) `entry` 30.4% (221) `copy` 3.1% (38) `note` 1.4% (6) |
| 3.1% | `astrology` | 0.0000 | 0.0077 | under | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |

### `documentation`

**23.1%** of the maximum divergence from the repository, against a null median of 34.7% over 999 resamples of the same size — an excess of -11.6 points, and 983 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 8.6 s, recorded rather than estimated.
