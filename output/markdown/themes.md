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
| `linguistics` | 0.0513 | 65.7% | 4,465 | 177 | 14,323 | 35.0% | `word` 30.4% (1,582) `term` 15.7% (390) `name` 15.5% (770) `parse` 4.7% (161) |
| `computing` | 0.0147 | 71.7% | 6,800 | 34 | 1,886 | 4.6% | `repository` 6.5% (472) `read` 5.3% (953) `folder` 5.0% (37) `parse` 3.8% (161) |

Read over 572 files and 40,877 lines: 469 topics, 13 files no topic could be resolved for, and 35.0% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 24.2% of it; the other 75.8% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `code-semantics-api/src/main/java`

**16.7%** of the maximum divergence from the repository, against a null median of 9.9% over 999 resamples of the same size — an excess of +6.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `telecommunication` | 0.0002 | 0.0463 | under | `file` 64.8% (273) `entry` 28.8% (221) `copy` 2.9% (38) `note` 1.3% (6) |
| 8.6% | `publishing` | 0.0148 | 0.0705 | under | `publish` 23.9% (355) `read` 14.9% (190) `write` 11.1% (729) `vocabulary` 8.9% (180) |
| 6.8% | `plants` | 0.0018 | 0.0309 | under | `root` 53.7% (176) `tree` 39.1% (213) `seed` 4.7% (49) `leaf` 1.8% (36) |
| 5.2% | `time_period` | 0.0315 | 0.0040 | **over** | `span` 52.1% (26) `none` 20.3% (9) `stage` 6.5% (23) `long` 4.5% (23) |
| 4.7% | `physics` | 0.0578 | 0.0181 | **over** | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.5% | `electronics` | 0.0007 | 0.0152 | under | `tsv` 82.6% (30) `field` 7.7% (204) `headroom` 4.2% (2) `bar` 1.7% (107) |
| 3.4% | `lexicography` | 0.0323 | 0.0079 | **over** | `citation` 86.2% (98) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 3.4% | `politics` | 0.0402 | 0.0123 | **over** | `vote` 51.4% (56) `normalisation` 21.2% (23) `reading` 6.8% (702) `name` 4.6% (861) |

### `code-semantics-api/src/test/java`

**21.4%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +5.7 points, and 27 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.0% | `telecommunication` | 0.0014 | 0.0463 | under | `file` 64.8% (273) `entry` 28.8% (221) `copy` 2.9% (38) `note` 1.3% (6) |
| 6.7% | `publishing` | 0.0147 | 0.0705 | under | `publish` 23.9% (355) `read` 14.9% (190) `write` 11.1% (729) `vocabulary` 8.9% (180) |
| 6.0% | `plants` | 0.0009 | 0.0309 | under | `root` 53.7% (176) `tree` 39.1% (213) `seed` 4.7% (49) `leaf` 1.8% (36) |
| 6.0% | `politics` | 0.0611 | 0.0123 | **over** | `vote` 51.4% (56) `normalisation` 21.2% (23) `reading` 6.8% (702) `name` 4.6% (861) |
| 5.7% | `biology` | 0.0370 | 0.0031 | **over** | `morphology` 26.1% (21) `owl` 21.1% (24) `person` 8.3% (24) `glob` 7.1% (4) |
| 5.1% | `law` | 0.1071 | 0.0415 | **over** | `file` 11.2% (533) `witness` 8.9% (70) `summary` 8.1% (57) `claim` 7.0% (119) |
| 3.7% | `literature` | 0.0017 | 0.0230 | under | `header` 36.0% (87) `write` 16.4% (728) `text` 13.7% (106) `prose` 8.8% (131) |
| 3.5% | `linguistics` | 0.3002 | 0.1987 | **over** | `word` 30.4% (1,582) `term` 15.7% (390) `name` 15.5% (770) `parse` 4.7% (161) |

### `code-semantics-engine/src/main/java`

**3.5%** of the maximum divergence from the repository, against a null median of 1.3% over 999 resamples of the same size — an excess of +2.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `electronics` | 0.0013 | 0.0152 | under | `tsv` 82.6% (30) `field` 7.7% (204) `headroom` 4.2% (2) `bar` 1.7% (107) |
| 12.5% | `chemistry` | 0.0018 | 0.0153 | under | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |
| 4.0% | `animals` | 0.0004 | 0.0043 | under | `nest` 55.5% (28) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 3.6% | `calculus` | 0.0131 | 0.0052 | **over** | `divergence` 100.0% (154) |
| 3.4% | `literature` | 0.0123 | 0.0230 | under | `header` 36.0% (87) `write` 16.4% (728) `text` 13.7% (106) `prose` 8.8% (131) |
| 3.3% | `psychology` | 0.0033 | 0.0095 | under | `module` 85.4% (85) `confidence` 4.2% (18) `know` 3.2% (73) `matter` 1.5% (28) |
| 2.1% | `information-science` | 0.0010 | 0.0042 | under | `synset` 70.1% (26) `document` 24.3% (83) `ontology` 4.9% (125) `align` 0.4% (1) |
| 2.1% | `grammar` | 0.0405 | 0.0288 | **over** | `phrase` 21.5% (160) `occurrence` 15.6% (180) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |

### `code-semantics-engine/src/test/java`

**3.8%** of the maximum divergence from the repository, against a null median of 1.4% over 999 resamples of the same size — an excess of +2.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.3% | `electronics` | 0.0003 | 0.0152 | under | `tsv` 82.6% (30) `field` 7.7% (204) `headroom` 4.2% (2) `bar` 1.7% (107) |
| 12.6% | `plants` | 0.0665 | 0.0309 | **over** | `root` 53.7% (176) `tree` 39.1% (213) `seed` 4.7% (49) `leaf` 1.8% (36) |
| 5.4% | `psychology` | 0.0018 | 0.0095 | under | `module` 85.4% (85) `confidence` 4.2% (18) `know` 3.2% (73) `matter` 1.5% (28) |
| 4.2% | `chemistry` | 0.0058 | 0.0153 | under | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |
| 3.0% | `mathematics` | 0.0305 | 0.0459 | under | `from` 28.3% (161) `function` 10.2% (98) `count` 7.1% (72) `distribution` 6.8% (100) |
| 2.7% | `quality` | 0.0102 | 0.0039 | **over** | `ordinary` 27.9% (48) `tolerance` 12.1% (6) `dark` 6.9% (1) `best` 5.7% (8) |
| 2.4% | `computer-languages` | 0.0001 | 0.0025 | under | `json` 46.2% (4) `xml` 17.2% (6) `sparql` 14.7% (1) `owl` 12.4% (24) |
| 2.4% | `astrology` | 0.0149 | 0.0075 | **over** | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |

### `lexicon-extraction/src/main/java`

**16.1%** of the maximum divergence from the repository, against a null median of 5.2% over 999 resamples of the same size — an excess of +10.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.8% | `linguistics` | 0.0794 | 0.1987 | under | `word` 30.4% (1,582) `term` 15.7% (390) `name` 15.5% (770) `parse` 4.7% (161) |
| 7.6% | `literature` | 0.0806 | 0.0230 | **over** | `header` 36.0% (87) `write` 16.4% (728) `text` 13.7% (106) `prose` 8.8% (131) |
| 7.3% | `plants` | 0.0016 | 0.0309 | under | `root` 53.7% (176) `tree` 39.1% (213) `seed` 4.7% (49) `leaf` 1.8% (36) |
| 4.7% | `animals` | 0.0292 | 0.0043 | **over** | `nest` 55.5% (28) `owl` 26.0% (24) `tail` 8.3% (26) `head` 6.2% (13) |
| 4.3% | `psychology` | 0.0387 | 0.0095 | **over** | `module` 85.4% (85) `confidence` 4.2% (18) `know` 3.2% (73) `matter` 1.5% (28) |
| 4.0% | `physics` | 0.0011 | 0.0181 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.8% | `grammar` | 0.0056 | 0.0288 | under | `phrase` 21.5% (160) `occurrence` 15.6% (180) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 3.5% | `money` | 0.0001 | 0.0119 | under | `share` 71.8% (343) `score` 8.6% (53) `say` 7.8% (286) `coverage` 4.3% (18) |

### `lexicon-extraction/src/test/java`

**19.7%** of the maximum divergence from the repository, against a null median of 6.3% over 999 resamples of the same size — an excess of +13.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.7% | `chemistry` | 0.1473 | 0.0153 | **over** | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |
| 10.6% | `electronics` | 0.0894 | 0.0152 | **over** | `tsv` 82.6% (30) `field` 7.7% (204) `headroom` 4.2% (2) `bar` 1.7% (107) |
| 6.2% | `linguistics` | 0.0990 | 0.1987 | under | `word` 30.4% (1,582) `term` 15.7% (390) `name` 15.5% (770) `parse` 4.7% (161) |
| 3.3% | `physics` | 0.0011 | 0.0181 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.1% | `law` | 0.0121 | 0.0415 | under | `file` 11.2% (533) `witness` 8.9% (70) `summary` 8.1% (57) `claim` 7.0% (119) |
| 3.0% | `person` | 0.0020 | 0.0196 | under | `reader` 17.2% (135) `child` 15.7% (23) `host` 10.9% (28) `parent` 7.9% (69) |
| 2.8% | `grammar` | 0.0065 | 0.0288 | under | `phrase` 21.5% (160) `occurrence` 15.6% (180) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 2.3% | `computing` | 0.1087 | 0.0624 | **over** | `repository` 6.5% (472) `read` 5.3% (953) `folder` 5.0% (37) `parse` 3.8% (161) |

### `lexicon/src/main/java`

**18.6%** of the maximum divergence from the repository, against a null median of 9.5% over 999 resamples of the same size — an excess of +9.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.2% | `plants` | 0.0000 | 0.0309 | under | `root` 53.7% (176) `tree` 39.1% (213) `seed` 4.7% (49) `leaf` 1.8% (36) |
| 8.1% | `networking` | 0.0520 | 0.0060 | **over** | `resource` 74.5% (280) `preamble` 7.7% (8) `request` 5.5% (10) `node` 4.7% (80) |
| 6.7% | `publishing` | 0.0174 | 0.0705 | under | `publish` 23.9% (355) `read` 14.9% (190) `write` 11.1% (729) `vocabulary` 8.9% (180) |
| 4.9% | `grammar` | 0.0800 | 0.0288 | **over** | `phrase` 21.5% (160) `occurrence` 15.6% (180) `verb` 15.3% (86) `part_of_speech` 12.3% (37) |
| 4.6% | `linguistics` | 0.3082 | 0.1987 | **over** | `word` 30.4% (1,582) `term` 15.7% (390) `name` 15.5% (770) `parse` 4.7% (161) |
| 4.5% | `mathematics` | 0.1042 | 0.0459 | **over** | `from` 28.3% (161) `function` 10.2% (98) `count` 7.1% (72) `distribution` 6.8% (100) |
| 3.9% | `physics` | 0.0007 | 0.0181 | under | `mass` 46.2% (136) `weight` 29.1% (68) `length` 6.5% (71) `radius` 3.5% (2) |
| 3.7% | `chemistry` | 0.0002 | 0.0153 | under | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |

### `lexicon/src/test/java`

**12.6%** of the maximum divergence from the repository, against a null median of 9.7% over 999 resamples of the same size — an excess of +3.0 points, and 22 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.8% | `plants` | 0.0001 | 0.0309 | under | `root` 53.7% (176) `tree` 39.1% (213) `seed` 4.7% (49) `leaf` 1.8% (36) |
| 5.9% | `electronics` | 0.0000 | 0.0152 | under | `tsv` 82.6% (30) `field` 7.7% (204) `headroom` 4.2% (2) `bar` 1.7% (107) |
| 5.6% | `chemistry` | 0.0002 | 0.0153 | under | `extraction` 49.8% (59) `fraction` 12.9% (14) `extract` 8.9% (7) `render` 5.0% (14) |
| 4.8% | `lexicography` | 0.0331 | 0.0079 | **over** | `citation` 86.2% (98) `sense` 10.9% (317) `lemma` 1.2% (79) `gloss` 1.1% (1) |
| 4.4% | `linguistics` | 0.2844 | 0.1987 | **over** | `word` 30.4% (1,582) `term` 15.7% (390) `name` 15.5% (770) `parse` 4.7% (161) |
| 3.1% | `psychology` | 0.0003 | 0.0095 | under | `module` 85.4% (85) `confidence` 4.2% (18) `know` 3.2% (73) `matter` 1.5% (28) |
| 2.9% | `astrology` | 0.0000 | 0.0075 | under | `placement` 96.1% (109) `figure` 1.4% (108) `descendant` 1.2% (8) `term` 0.8% (392) |
| 2.7% | `telecommunication` | 0.0807 | 0.0463 | **over** | `file` 64.8% (273) `entry` 28.8% (221) `copy` 2.9% (38) `note` 1.3% (6) |

### `documentation`

**23.4%** of the maximum divergence from the repository, against a null median of 35.0% over 999 resamples of the same size — an excess of -11.7 points, and 979 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `code-semantics-engine/src/test/resources`

**61.5%** of the maximum divergence from the repository, against a null median of 19.8% over 999 resamples of the same size — an excess of +41.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.6% | `electronics` | 0.2348 | 0.0152 | **over** | `tsv` 82.6% (30) `field` 7.7% (204) `headroom` 4.2% (2) `bar` 1.7% (107) |
| 5.7% | `publishing` | 0.0000 | 0.0705 | under | `publish` 23.9% (355) `read` 14.9% (190) `write` 11.1% (729) `vocabulary` 8.9% (180) |
| 3.8% | `telecommunication` | 0.0000 | 0.0463 | under | `file` 64.8% (273) `entry` 28.8% (221) `copy` 2.9% (38) `note` 1.3% (6) |
| 3.7% | `mathematics` | 0.0000 | 0.0459 | under | `from` 28.3% (161) `function` 10.2% (98) `count` 7.1% (72) `distribution` 6.8% (100) |
| 3.3% | `nautical` | 0.0674 | 0.0073 | **over** | `below` 19.4% (38) `report` 9.4% (287) `row` 8.6% (189) `render` 7.4% (87) |
| 2.8% | `linguistics` | 0.0839 | 0.1987 | under | `word` 30.4% (1,582) `term` 15.7% (390) `name` 15.5% (770) `parse` 4.7% (161) |
| 2.6% | `telecommunications` | 0.0391 | 0.0013 | **over** | `read` 62.4% (951) `endpoint` 13.7% (13) `cell` 4.1% (13) `prefix` 4.0% (32) |
| 2.6% | `law` | 0.0020 | 0.0415 | under | `file` 11.2% (533) `witness` 8.9% (70) `summary` 8.1% (57) `claim` 7.0% (119) |

Read, compared and resampled in 8.7 s, recorded rather than estimated.
