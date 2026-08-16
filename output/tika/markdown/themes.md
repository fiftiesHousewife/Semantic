# Themes — tika

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
| `computing` | 0.1113 | 80.5% | 71,386 | 1,226 | 260,157 | 68.4% | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| `law` | 0.0295 | 36.5% | 38,935 | 224 | 15,123 | 4.0% | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| `linguistics` | 0.0234 | 75.8% | 30,288 | 170 | 26,177 | 6.9% | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |

Read over 2,156 files and 380,237 lines: 552 topics, 0 files no topic could be resolved for, and 68.4% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 31.3% of it; the other 68.7% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `tika-annotation-processor/src/main/java`

**0.2750 bits** from the repository, against a null median of 0.2357 over 999 resamples of the same size — an excess of +0.0393, and 240 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-annotation-processor/src/test/java`

**0.5560 bits** from the repository, against a null median of 0.3628 over 999 resamples of the same size — an excess of +0.1932, and 134 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/main/java`

**0.1499 bits** from the repository, against a null median of 0.1833 over 999 resamples of the same size — an excess of -0.0334, and 840 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/test/java`

**0.2286 bits** from the repository, against a null median of 0.2070 over 999 resamples of the same size — an excess of +0.0216, and 303 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/main/java`

**0.3320 bits** from the repository, against a null median of 0.3660 over 999 resamples of the same size — an excess of -0.0340, and 652 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/test/java`

**0.3985 bits** from the repository, against a null median of 0.3656 over 999 resamples of the same size — an excess of +0.0329, and 407 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-core/src/main/java`

**0.0378 bits** from the repository, against a null median of 0.0076 over 999 resamples of the same size — an excess of +0.0302, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.2% | `computer-languages` | 0.0030 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 8.9% | `industry` | 0.0029 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 6.9% | `hydraulics` | 0.0000 | 0.0056 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 6.3% | `geography` | 0.0348 | 0.0166 | **over** | `apache` 6,823 `stream` 1,670 `state` 273 `java` 222 |
| 5.5% | `law` | 0.1476 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 5.0% | `linguistics` | 0.1082 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.8% | `computer-graphics` | 0.0153 | 0.0053 | **over** | `renderer` 54 `instance` 572 `mpeg` 48 `jpeg` 49 |
| 4.5% | `computing` | 0.2673 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |

### `tika-core/src/test/java`

**0.0612 bits** from the repository, against a null median of 0.0262 over 999 resamples of the same size — an excess of +0.0350, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.1% | `industry` | 0.0513 | 0.0154 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 11.7% | `electrotechnology` | 0.0464 | 0.0130 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 5.1% | `literature` | 0.0042 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 4.6% | `hydraulics` | 0.0000 | 0.0056 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 3.4% | `programming` | 0.0698 | 0.0441 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.3% | `grammar` | 0.0012 | 0.0081 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |
| 3.1% | `metrology` | 0.0004 | 0.0054 | under | `array` 804 `entropy` 90 `rate` 140 `measurement` 13 |
| 2.7% | `computing` | 0.2680 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |

### `tika-detectors/tika-detector-magika/src/main/java`

**0.2934 bits** from the repository, against a null median of 0.3647 over 999 resamples of the same size — an excess of -0.0714, and 809 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-magika/src/test/java`

**0.2842 bits** from the repository, against a null median of 0.2798 over 999 resamples of the same size — an excess of +0.0044, and 470 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/main/java`

**0.3418 bits** from the repository, against a null median of 0.3657 over 999 resamples of the same size — an excess of -0.0239, and 605 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/test/java`

**0.2752 bits** from the repository, against a null median of 0.2789 over 999 resamples of the same size — an excess of -0.0037, and 521 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-grpc/src/test/java`

**0.2330 bits** from the repository, against a null median of 0.2026 over 999 resamples of the same size — an excess of +0.0303, and 249 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-server/src/test/java`

**0.4540 bits** from the repository, against a null median of 0.2792 over 999 resamples of the same size — an excess of +0.1748, and 37 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/main/java`

**0.1451 bits** from the repository, against a null median of 0.1314 over 999 resamples of the same size — an excess of +0.0137, and 275 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/test/java`

**0.2465 bits** from the repository, against a null median of 0.2814 over 999 resamples of the same size — an excess of -0.0348, and 723 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java`

**0.1562 bits** from the repository, against a null median of 0.1299 over 999 resamples of the same size — an excess of +0.0263, and 181 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/java`

**0.4427 bits** from the repository, against a null median of 0.3594 over 999 resamples of the same size — an excess of +0.0833, and 279 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/main/java`

**0.1391 bits** from the repository, against a null median of 0.1031 over 999 resamples of the same size — an excess of +0.0359, and 53 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java`

**0.1381 bits** from the repository, against a null median of 0.0876 over 999 resamples of the same size — an excess of +0.0505, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-universal/src/main/java`

**0.2531 bits** from the repository, against a null median of 0.2761 over 999 resamples of the same size — an excess of -0.0230, and 667 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/main/java`

**0.1439 bits** from the repository, against a null median of 0.0576 over 999 resamples of the same size — an excess of +0.0863, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.5% | `publishing` | 0.0777 | 0.0136 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 8.5% | `computing` | 0.1891 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 6.3% | `arithmetic` | 0.0264 | 0.0020 | **over** | `extract` 1,065 `integer` 148 `position` 250 `subtract` 15 |
| 4.5% | `theatre` | 0.0225 | 0.0027 | **over** | `mime` 595 `script` 825 `jackson` 72 `extra` 17 |
| 4.4% | `geology` | 0.0171 | 0.0009 | **over** | `col` 69 `delta` 36 `julian` 5 `sheet` 149 |
| 3.7% | `electrotechnology` | 0.0005 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.5% | `transport` | 0.0164 | 0.0016 | **over** | `container` 470 `train` 201 `driver` 18 `direction` 35 |
| 3.4% | `databases` | 0.0176 | 0.0022 | **over** | `entity` 298 `jdbc` 42 `select` 69 `sql` 38 |

### `tika-eval/tika-eval-app/src/test/java`

**0.1726 bits** from the repository, against a null median of 0.1233 over 999 resamples of the same size — an excess of +0.0493, and 37 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-core/src/main/java`

**0.1626 bits** from the repository, against a null median of 0.0525 over 999 resamples of the same size — an excess of +0.1101, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.4% | `mathematics` | 0.1398 | 0.0217 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 5.2% | `computer-languages` | 0.0001 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.8% | `video-games` | 0.0299 | 0.0042 | **over** | `stats` 50 `meta` 187 `item` 318 `row` 314 |
| 4.7% | `telecommunication` | 0.0011 | 0.0205 | under | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 3.2% | `electronics` | 0.0003 | 0.0120 | under | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 3.2% | `tennis` | 0.0348 | 0.0102 | **over** | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 3.2% | `computing` | 0.2315 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 3.0% | `law` | 0.1704 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |

### `tika-eval/tika-eval-core/src/test/java`

**0.1543 bits** from the repository, against a null median of 0.1516 over 999 resamples of the same size — an excess of +0.0027, and 447 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-example/src/main/java`

**0.1215 bits** from the repository, against a null median of 0.0504 over 999 resamples of the same size — an excess of +0.0710, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.2% | `telecommunication` | 0.1138 | 0.0205 | **over** | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 7.3% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.5% | `industry` | 0.0010 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.1% | `electrotechnology` | 0.0395 | 0.0130 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.8% | `mathematics` | 0.0061 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 2.5% | `buildings` | 0.0003 | 0.0077 | under | `log` 484 `window` 349 `tear_down` 48 `machine` 38 |
| 2.4% | `programming` | 0.0751 | 0.0441 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.2% | `hydraulics` | 0.0000 | 0.0056 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |

### `tika-example/src/test/java`

**0.2276 bits** from the repository, against a null median of 0.1218 over 999 resamples of the same size — an excess of +0.1058, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `computing` | 0.1517 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 8.0% | `law` | 0.2406 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 7.9% | `chemistry` | 0.0672 | 0.0092 | **over** | `buffer` 420 `builder` 189 `type` 3,463 `max` 1,148 |
| 7.6% | `telecommunication` | 0.0905 | 0.0205 | **over** | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 5.7% | `programming` | 0.0049 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 5.3% | `buildings` | 0.0489 | 0.0077 | **over** | `log` 484 `window` 349 `tear_down` 48 `machine` 38 |
| 4.4% | `industry` | 0.0593 | 0.0154 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.3% | `video-games` | 0.0293 | 0.0042 | **over** | `stats` 50 `meta` 187 `item` 318 `row` 314 |

### `tika-grpc/src/main/java`

**0.2413 bits** from the repository, against a null median of 0.2324 over 999 resamples of the same size — an excess of +0.0089, and 424 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/test/java`

**0.3179 bits** from the repository, against a null median of 0.2026 over 999 resamples of the same size — an excess of +0.1153, and 24 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-handlers/tika-handler-boilerpipe/src/main/java`

**0.3831 bits** from the repository, against a null median of 0.3695 over 999 resamples of the same size — an excess of +0.0136, and 447 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-es-integration-tests/src/test/java`

**0.2677 bits** from the repository, against a null median of 0.2834 over 999 resamples of the same size — an excess of -0.0157, and 615 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/java`

**0.3772 bits** from the repository, against a null median of 0.3605 over 999 resamples of the same size — an excess of +0.0167, and 427 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/java`

**0.2590 bits** from the repository, against a null median of 0.2778 over 999 resamples of the same size — an excess of -0.0187, and 646 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/java`

**0.3780 bits** from the repository, against a null median of 0.2827 over 999 resamples of the same size — an excess of +0.0953, and 148 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/java`

**0.4431 bits** from the repository, against a null median of 0.1814 over 999 resamples of the same size — an excess of +0.2617, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.9% | `hydraulics` | 0.2266 | 0.0056 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 17.7% | `christianity` | 0.1756 | 0.0029 | **over** | `use` 4,071 `see` 4,839 `kind` 2,190 `element` 1,056 |
| 15.0% | `computing` | 0.0651 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 8.2% | `law` | 0.3097 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 4.6% | `programming` | 0.0004 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.3% | `mathematics` | 0.0001 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 2.0% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 1.9% | `literature` | 0.0000 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |

### `tika-integration-tests/tika-resource-loading-tests/src/test/java`

**0.2308 bits** from the repository, against a null median of 0.2779 over 999 resamples of the same size — an excess of -0.0471, and 795 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-woodstox-tests/src/test/java`

**0.4837 bits** from the repository, against a null median of 0.3625 over 999 resamples of the same size — an excess of +0.1211, and 229 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/main/java`

**0.5137 bits** from the repository, against a null median of 0.2780 over 999 resamples of the same size — an excess of +0.2357, and 8 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/test/java`

**0.4244 bits** from the repository, against a null median of 0.3656 over 999 resamples of the same size — an excess of +0.0589, and 321 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup-core/src/main/java`

**0.3296 bits** from the repository, against a null median of 0.1402 over 999 resamples of the same size — an excess of +0.1894, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.9% | `mathematics` | 0.1668 | 0.0217 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 8.1% | `computing` | 0.1386 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 8.0% | `law` | 0.0178 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 5.3% | `linguistics` | 0.1887 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.9% | `arithmetic` | 0.0419 | 0.0020 | **over** | `extract` 1,065 `integer` 148 `position` 250 `subtract` 15 |
| 4.8% | `rail-transport` | 0.0398 | 0.0015 | **over** | `pre` 37 `exc` 16 `helper` 126 `uni` 56 |
| 4.8% | `art` | 0.0391 | 0.0015 | **over** | `flag` 263 `artist` 29 `write` 844 `key` 1,630 |
| 4.7% | `programming` | 0.0030 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |

### `tika-langdetect/tika-langdetect-charsoup/src/main/java`

**0.2397 bits** from the repository, against a null median of 0.2325 over 999 resamples of the same size — an excess of +0.0072, and 446 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/test/java`

**0.1901 bits** from the repository, against a null median of 0.0532 over 999 resamples of the same size — an excess of +0.1369, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.4% | `computing` | 0.1095 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 7.9% | `telecommunications` | 0.0377 | 0.0015 | **over** | `ext` 104 `csd` 3 `read` 1,016 `prefix` 605 |
| 4.7% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.6% | `linguistics` | 0.1510 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.2% | `law` | 0.0506 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 2.8% | `mathematics` | 0.0545 | 0.0217 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 2.2% | `programming` | 0.0179 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.1% | `computer_science` | 0.0051 | 0.0219 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |

### `tika-langdetect/tika-langdetect-lingo24/src/main/java`

**0.3223 bits** from the repository, against a null median of 0.3656 over 999 resamples of the same size — an excess of -0.0433, and 689 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-lingo24/src/test/java`

**0.6242 bits** from the repository, against a null median of 0.3660 over 999 resamples of the same size — an excess of +0.2582, and 59 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/main/java`

**0.5149 bits** from the repository, against a null median of 0.3583 over 999 resamples of the same size — an excess of +0.1567, and 154 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/test/java`

**0.6274 bits** from the repository, against a null median of 0.3594 over 999 resamples of the same size — an excess of +0.2681, and 46 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/main/java`

**0.2579 bits** from the repository, against a null median of 0.2351 over 999 resamples of the same size — an excess of +0.0228, and 334 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/test/java`

**0.5762 bits** from the repository, against a null median of 0.3603 over 999 resamples of the same size — an excess of +0.2159, and 87 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/main/java`

**0.2864 bits** from the repository, against a null median of 0.2829 over 999 resamples of the same size — an excess of +0.0034, and 471 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/test/java`

**0.5988 bits** from the repository, against a null median of 0.3594 over 999 resamples of the same size — an excess of +0.2395, and 69 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-test-commons/src/main/java`

**0.4644 bits** from the repository, against a null median of 0.3588 over 999 resamples of the same size — an excess of +0.1057, and 257 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/main/java`

**0.2866 bits** from the repository, against a null median of 0.2359 over 999 resamples of the same size — an excess of +0.0507, and 197 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/test/java`

**0.2883 bits** from the repository, against a null median of 0.1379 over 999 resamples of the same size — an excess of +0.1504, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.3% | `networking` | 0.0857 | 0.0082 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 8.3% | `number` | 0.0606 | 0.0025 | **over** | `value` 1,848 `nothing` 125 `digit` 83 `first` 89 |
| 7.3% | `computing` | 0.1547 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 5.9% | `linguistics` | 0.0142 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.5% | `law` | 0.2167 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 3.5% | `computer_science` | 0.0002 | 0.0219 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 3.4% | `publishing` | 0.0555 | 0.0136 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 3.1% | `basketball` | 0.0192 | 0.0002 | **over** | `key` 1,630 `three` 63 `four` 59 `drain` 34 |

### `tika-ml/tika-ml-chardetect/src/main/java`

**0.2293 bits** from the repository, against a null median of 0.1629 over 999 resamples of the same size — an excess of +0.0664, and 38 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-chardetect/src/test/java`

**0.5402 bits** from the repository, against a null median of 0.3606 over 999 resamples of the same size — an excess of +0.1796, and 145 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/main/java`

**0.4300 bits** from the repository, against a null median of 0.2403 over 999 resamples of the same size — an excess of +0.1898, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/test/java`

**0.5523 bits** from the repository, against a null median of 0.3673 over 999 resamples of the same size — an excess of +0.1850, and 122 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/main/java`

**0.1966 bits** from the repository, against a null median of 0.1502 over 999 resamples of the same size — an excess of +0.0464, and 76 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/test/java`

**0.2089 bits** from the repository, against a null median of 0.2035 over 999 resamples of the same size — an excess of +0.0054, and 442 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/main/java`

**0.1994 bits** from the repository, against a null median of 0.1644 over 999 resamples of the same size — an excess of +0.0350, and 150 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/test/java`

**0.2073 bits** from the repository, against a null median of 0.1396 over 999 resamples of the same size — an excess of +0.0678, and 22 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/main/java`

**0.3729 bits** from the repository, against a null median of 0.3695 over 999 resamples of the same size — an excess of +0.0034, and 485 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/test/java`

**0.3751 bits** from the repository, against a null median of 0.2834 over 999 resamples of the same size — an excess of +0.0917, and 131 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/main/java`

**0.2478 bits** from the repository, against a null median of 0.2782 over 999 resamples of the same size — an excess of -0.0304, and 713 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/java`

**0.3250 bits** from the repository, against a null median of 0.2818 over 999 resamples of the same size — an excess of +0.0433, and 277 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/main/java`

**0.1536 bits** from the repository, against a null median of 0.1304 over 999 resamples of the same size — an excess of +0.0233, and 188 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/java`

**0.2063 bits** from the repository, against a null median of 0.1546 over 999 resamples of the same size — an excess of +0.0517, and 65 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/java`

**0.4793 bits** from the repository, against a null median of 0.3697 over 999 resamples of the same size — an excess of +0.1097, and 268 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/main/java`

**0.2039 bits** from the repository, against a null median of 0.1650 over 999 resamples of the same size — an excess of +0.0389, and 139 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/java`

**0.2826 bits** from the repository, against a null median of 0.3659 over 999 resamples of the same size — an excess of -0.0832, and 851 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/java`

**0.2087 bits** from the repository, against a null median of 0.2341 over 999 resamples of the same size — an excess of -0.0254, and 720 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-inference/src/main/java`

**0.1638 bits** from the repository, against a null median of 0.0942 over 999 resamples of the same size — an excess of +0.0696, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.2% | `linguistics` | 0.0129 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 9.9% | `travel-industry` | 0.0348 | 0.0003 | **over** | `locator` 61 `osi` 3 `pseudo` 8 `fit` 29 |
| 6.2% | `publishing` | 0.0563 | 0.0136 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 5.1% | `tennis` | 0.0445 | 0.0102 | **over** | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 4.7% | `buildings` | 0.0372 | 0.0077 | **over** | `log` 484 `window` 349 `tear_down` 48 `machine` 38 |
| 4.5% | `industry` | 0.0001 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.0% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.4% | `programming` | 0.0146 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |

### `tika-parsers/tika-parsers-ml/tika-inference/src/test/java`

**0.2552 bits** from the repository, against a null median of 0.1641 over 999 resamples of the same size — an excess of +0.0911, and 15 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java`

**0.1156 bits** from the repository, against a null median of 0.0688 over 999 resamples of the same size — an excess of +0.0468, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.0% | `linguistics` | 0.1532 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 7.0% | `law` | 0.0502 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 6.1% | `astronomy` | 0.0202 | 0.0014 | **over** | `latitude` 24 `longitude` 23 `egress` 27 `alt` 70 |
| 5.6% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 4.6% | `politics` | 0.0167 | 0.0015 | **over** | `pas` 173 `country` 47 `zip` 625 `jackson` 72 |
| 4.5% | `industry` | 0.0012 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.9% | `electronics` | 0.0007 | 0.0120 | under | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 3.1% | `science-fiction` | 0.0101 | 0.0007 | **over** | `entity` 298 `tesseract` 170 `inner` 49 `cred` 17 |

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/java`

**0.1779 bits** from the repository, against a null median of 0.1655 over 999 resamples of the same size — an excess of +0.0124, and 334 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/main/java`

**0.2773 bits** from the repository, against a null median of 0.2782 over 999 resamples of the same size — an excess of -0.0009, and 506 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/java`

**0.2185 bits** from the repository, against a null median of 0.2057 over 999 resamples of the same size — an excess of +0.0129, and 381 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/main/java`

**0.2388 bits** from the repository, against a null median of 0.2741 over 999 resamples of the same size — an excess of -0.0353, and 742 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/java`

**0.6628 bits** from the repository, against a null median of 0.3702 over 999 resamples of the same size — an excess of +0.2927, and 28 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/main/java`

**0.1838 bits** from the repository, against a null median of 0.1652 over 999 resamples of the same size — an excess of +0.0186, and 282 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/test/java`

**0.2995 bits** from the repository, against a null median of 0.1814 over 999 resamples of the same size — an excess of +0.1181, and 14 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java`

**0.0946 bits** from the repository, against a null median of 0.0287 over 999 resamples of the same size — an excess of +0.0659, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.0% | `computing` | 0.4851 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 7.9% | `mathematics` | 0.0016 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 6.6% | `electrotechnology` | 0.0435 | 0.0130 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 4.5% | `industry` | 0.0406 | 0.0154 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.7% | `linguistics` | 0.0432 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 3.5% | `tennis` | 0.0009 | 0.0102 | under | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 2.9% | `hydraulics` | 0.0000 | 0.0056 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 2.6% | `grammar` | 0.0008 | 0.0081 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/main/java`

**0.1426 bits** from the repository, against a null median of 0.1153 over 999 resamples of the same size — an excess of +0.0273, and 123 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/java`

**0.1938 bits** from the repository, against a null median of 0.1674 over 999 resamples of the same size — an excess of +0.0264, and 206 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/main/java`

**0.1317 bits** from the repository, against a null median of 0.0547 over 999 resamples of the same size — an excess of +0.0770, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.8% | `music` | 0.0516 | 0.0055 | **over** | `ti` 1,145 `version` 2,955 `label` 356 `album` 30 |
| 8.1% | `tennis` | 0.0509 | 0.0102 | **over** | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 6.8% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 5.6% | `computer-graphics` | 0.0315 | 0.0053 | **over** | `renderer` 54 `instance` 572 `mpeg` 48 `jpeg` 49 |
| 4.9% | `art` | 0.0193 | 0.0015 | **over** | `flag` 263 `artist` 29 `write` 844 `key` 1,630 |
| 4.8% | `programming` | 0.0927 | 0.0441 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.6% | `law` | 0.0619 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 3.0% | `industry` | 0.0022 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/java`

**0.1583 bits** from the repository, against a null median of 0.0944 over 999 resamples of the same size — an excess of +0.0639, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.5% | `linguistics` | 0.0170 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 7.6% | `computing` | 0.4833 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 6.4% | `industry` | 0.0598 | 0.0154 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.4% | `telecommunication` | 0.0016 | 0.0205 | under | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 4.2% | `medicine` | 0.0005 | 0.0160 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 4.0% | `computer-languages` | 0.0013 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.5% | `person` | 0.0010 | 0.0154 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 3.0% | `art` | 0.0152 | 0.0015 | **over** | `flag` 263 `artist` 29 `write` 844 `key` 1,630 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/main/java`

**0.1629 bits** from the repository, against a null median of 0.1412 over 999 resamples of the same size — an excess of +0.0217, and 223 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/java`

**0.2711 bits** from the repository, against a null median of 0.2040 over 999 resamples of the same size — an excess of +0.0671, and 91 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/main/java`

**0.1375 bits** from the repository, against a null median of 0.1529 over 999 resamples of the same size — an excess of -0.0153, and 723 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/java`

**0.2642 bits** from the repository, against a null median of 0.1632 over 999 resamples of the same size — an excess of +0.1009, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/main/java`

**0.2079 bits** from the repository, against a null median of 0.2022 over 999 resamples of the same size — an excess of +0.0057, and 441 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/java`

**0.2618 bits** from the repository, against a null median of 0.1830 over 999 resamples of the same size — an excess of +0.0788, and 41 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/main/java`

**0.2583 bits** from the repository, against a null median of 0.2313 over 999 resamples of the same size — an excess of +0.0270, and 318 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/test/java`

**0.5961 bits** from the repository, against a null median of 0.3649 over 999 resamples of the same size — an excess of +0.2312, and 72 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-digest-commons/src/main/java`

**0.4602 bits** from the repository, against a null median of 0.2009 over 999 resamples of the same size — an excess of +0.2594, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.8% | `mathematics` | 0.2516 | 0.0217 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 15.5% | `publishing` | 0.2021 | 0.0136 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 9.8% | `engineering` | 0.1009 | 0.0017 | **over** | `datum` 1,929 `encoder` 16 `generator` 42 `mill` 359 |
| 6.2% | `computing` | 0.1330 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 4.1% | `linguistics` | 0.0121 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 3.2% | `computer_science` | 0.0865 | 0.0219 | **over** | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 2.9% | `buildings` | 0.0519 | 0.0077 | **over** | `log` 484 `window` 349 `tear_down` 48 `machine` 38 |
| 2.4% | `law` | 0.0422 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/main/java`

**0.2231 bits** from the repository, against a null median of 0.2769 over 999 resamples of the same size — an excess of -0.0537, and 851 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/java`

**0.2907 bits** from the repository, against a null median of 0.3605 over 999 resamples of the same size — an excess of -0.0699, and 800 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java`

**0.2492 bits** from the repository, against a null median of 0.1649 over 999 resamples of the same size — an excess of +0.0843, and 26 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/java`

**0.1769 bits** from the repository, against a null median of 0.2784 over 999 resamples of the same size — an excess of -0.1015, and 982 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/main/java`

**0.1207 bits** from the repository, against a null median of 0.0892 over 999 resamples of the same size — an excess of +0.0315, and 46 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/java`

**0.2353 bits** from the repository, against a null median of 0.1105 over 999 resamples of the same size — an excess of +0.1248, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.5% | `computing` | 0.6815 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 14.8% | `linguistics` | 0.0011 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 3.8% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.8% | `programming` | 0.0093 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.5% | `mathematics` | 0.0010 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 2.8% | `law` | 0.0551 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 2.8% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.5% | `person` | 0.0008 | 0.0154 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-jdbc-commons/src/main/java`

**0.2606 bits** from the repository, against a null median of 0.2775 over 999 resamples of the same size — an excess of -0.0169, and 609 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java`

**0.2378 bits** from the repository, against a null median of 0.2801 over 999 resamples of the same size — an excess of -0.0423, and 786 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/test/java`

**0.2598 bits** from the repository, against a null median of 0.2747 over 999 resamples of the same size — an excess of -0.0149, and 607 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/main/java`

**0.1690 bits** from the repository, against a null median of 0.2338 over 999 resamples of the same size — an excess of -0.0648, and 957 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/java`

**0.2780 bits** from the repository, against a null median of 0.2772 over 999 resamples of the same size — an excess of +0.0007, and 497 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java`

**0.0617 bits** from the repository, against a null median of 0.0083 over 999 resamples of the same size — an excess of +0.0533, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.6% | `computer-languages` | 0.0004 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 10.0% | `electrotechnology` | 0.0001 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 6.2% | `computer_science` | 0.0489 | 0.0219 | **over** | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 5.7% | `electronics` | 0.0014 | 0.0120 | under | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 4.6% | `industry` | 0.0036 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.5% | `hydraulics` | 0.0000 | 0.0056 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 4.4% | `metrology` | 0.0184 | 0.0054 | **over** | `array` 804 `entropy` 90 `rate` 140 `measurement` 13 |
| 3.6% | `mathematics` | 0.0411 | 0.0217 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/java`

**0.1248 bits** from the repository, against a null median of 0.0383 over 999 resamples of the same size — an excess of +0.0865, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.7% | `industry` | 0.0794 | 0.0154 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 8.6% | `aviation` | 0.0364 | 0.0040 | **over** | `rtf` 105 `max` 1,148 `threshold` 186 `fis` 5 |
| 5.7% | `linguistics` | 0.0313 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 5.5% | `literature` | 0.0532 | 0.0174 | **over** | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 4.0% | `medicine` | 0.0016 | 0.0160 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 3.7% | `person` | 0.0016 | 0.0154 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 3.6% | `law` | 0.0633 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 3.3% | `computing` | 0.4118 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/main/java`

**0.0883 bits** from the repository, against a null median of 0.0472 over 999 resamples of the same size — an excess of +0.0411, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.6% | `law` | 0.0420 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 6.5% | `computer-languages` | 0.0016 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 6.5% | `linguistics` | 0.1345 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 5.1% | `arithmetic` | 0.0160 | 0.0020 | **over** | `extract` 1,065 `integer` 148 `position` 250 `subtract` 15 |
| 5.0% | `programming` | 0.0835 | 0.0441 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 4.1% | `electrotechnology` | 0.0017 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.8% | `medicine` | 0.0381 | 0.0160 | **over** | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 3.2% | `metrology` | 0.0189 | 0.0054 | **over** | `array` 804 `entropy` 90 `rate` 140 `measurement` 13 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/java`

**0.2103 bits** from the repository, against a null median of 0.1090 over 999 resamples of the same size — an excess of +0.1012, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.9% | `computer-languages` | 0.1479 | 0.0180 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 8.6% | `linguistics` | 0.0131 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 8.4% | `industry` | 0.0809 | 0.0154 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.5% | `telecommunication` | 0.0002 | 0.0205 | under | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 4.3% | `algebra` | 0.0423 | 0.0083 | **over** | `content` 2,501 `unknown` 275 `normalizer` 16 `index` 910 |
| 3.7% | `gastronomy` | 0.0234 | 0.0020 | **over** | `swallow` 191 `hash` 185 `fork` 174 `consume` 75 |
| 3.1% | `mathematics` | 0.0023 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 3.1% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/main/java`

**0.1863 bits** from the repository, against a null median of 0.2767 over 999 resamples of the same size — an excess of -0.0904, and 983 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/java`

**0.2898 bits** from the repository, against a null median of 0.3680 over 999 resamples of the same size — an excess of -0.0782, and 815 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/main/java`

**0.1830 bits** from the repository, against a null median of 0.1812 over 999 resamples of the same size — an excess of +0.0017, and 482 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/java`

**0.2963 bits** from the repository, against a null median of 0.2857 over 999 resamples of the same size — an excess of +0.0105, and 431 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/main/java`

**0.1366 bits** from the repository, against a null median of 0.0673 over 999 resamples of the same size — an excess of +0.0693, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.6% | `publishing` | 0.0862 | 0.0136 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 8.5% | `computer-graphics` | 0.0421 | 0.0053 | **over** | `renderer` 54 `instance` 572 `mpeg` 48 `jpeg` 49 |
| 6.5% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.8% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 4.4% | `motor-racing` | 0.0137 | 0.0003 | **over** | `dpi` 23 `observer` 22 `intermediate` 84 `place` 122 |
| 4.3% | `telecommunication` | 0.0025 | 0.0205 | under | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 4.0% | `furniture` | 0.0142 | 0.0006 | **over** | `counter` 74 `drawer` 12 `phone` 29 `settle` 1 |
| 2.5% | `information-science` | 0.0106 | 0.0009 | **over** | `document` 1,456 `align` 54 `controlled_vocabulary` 14 `keyword` 7 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java`

**0.2131 bits** from the repository, against a null median of 0.1534 over 999 resamples of the same size — an excess of +0.0598, and 46 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/main/java`

**0.1649 bits** from the repository, against a null median of 0.1224 over 999 resamples of the same size — an excess of +0.0425, and 50 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/java`

**0.1458 bits** from the repository, against a null median of 0.0952 over 999 resamples of the same size — an excess of +0.0507, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/main/java`

**0.1502 bits** from the repository, against a null median of 0.1146 over 999 resamples of the same size — an excess of +0.0356, and 67 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/java`

**0.2081 bits** from the repository, against a null median of 0.1499 over 999 resamples of the same size — an excess of +0.0582, and 55 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/main/java`

**0.2315 bits** from the repository, against a null median of 0.2326 over 999 resamples of the same size — an excess of -0.0011, and 507 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/java`

**0.3134 bits** from the repository, against a null median of 0.2369 over 999 resamples of the same size — an excess of +0.0765, and 114 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java`

**0.2139 bits** from the repository, against a null median of 0.0952 over 999 resamples of the same size — an excess of +0.1187, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.9% | `medicine` | 0.1390 | 0.0160 | **over** | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 10.7% | `law` | 0.0218 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 5.3% | `programming` | 0.1131 | 0.0441 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 4.5% | `computing` | 0.4638 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 3.7% | `linguistics` | 0.1462 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 3.4% | `person` | 0.0001 | 0.0154 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 3.2% | `industry` | 0.0003 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.0% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/java`

**0.2420 bits** from the repository, against a null median of 0.1500 over 999 resamples of the same size — an excess of +0.0920, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/main/java`

**0.2089 bits** from the repository, against a null median of 0.1844 over 999 resamples of the same size — an excess of +0.0245, and 255 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/java`

**0.3662 bits** from the repository, against a null median of 0.2362 over 999 resamples of the same size — an excess of +0.1300, and 40 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java`

**0.1702 bits** from the repository, against a null median of 0.0907 over 999 resamples of the same size — an excess of +0.0796, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.9% | `linguistics` | 0.2298 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 7.4% | `furniture` | 0.0289 | 0.0006 | **over** | `counter` 74 `drawer` 12 `phone` 29 `settle` 1 |
| 5.3% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 5.1% | `literature` | 0.0000 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 4.3% | `computer_science` | 0.0017 | 0.0219 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 4.3% | `telecommunication` | 0.0601 | 0.0205 | **over** | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 3.6% | `industry` | 0.0006 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.6% | `person` | 0.0006 | 0.0154 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/java`

**0.3247 bits** from the repository, against a null median of 0.2771 over 999 resamples of the same size — an excess of +0.0476, and 260 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/main/java`

**0.1645 bits** from the repository, against a null median of 0.1806 over 999 resamples of the same size — an excess of -0.0161, and 699 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/test/java`

**0.2478 bits** from the repository, against a null median of 0.2050 over 999 resamples of the same size — an excess of +0.0428, and 174 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-httpclient-commons/src/main/java`

**0.3738 bits** from the repository, against a null median of 0.2358 over 999 resamples of the same size — an excess of +0.1380, and 31 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-api/src/main/java`

**0.2049 bits** from the repository, against a null median of 0.0734 over 999 resamples of the same size — an excess of +0.1314, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.7% | `law` | 0.2875 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 11.6% | `biology` | 0.0613 | 0.0028 | **over** | `emit` 883 `bos` 67 `reporter` 105 `model` 711 |
| 5.3% | `electronics` | 0.0553 | 0.0120 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 4.4% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.2% | `literature` | 0.0000 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 3.2% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.1% | `publishing` | 0.0002 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 3.0% | `computing` | 0.2233 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |

### `tika-pipes/tika-pipes-config-store-ignite/src/main/java`

**0.2800 bits** from the repository, against a null median of 0.1822 over 999 resamples of the same size — an excess of +0.0978, and 18 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-config-store-ignite/src/test/java`

**0.4507 bits** from the repository, against a null median of 0.3625 over 999 resamples of the same size — an excess of +0.0882, and 290 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-core/src/main/java`

**0.0843 bits** from the repository, against a null median of 0.0298 over 999 resamples of the same size — an excess of +0.0545, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.8% | `electronics` | 0.0502 | 0.0120 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 8.9% | `biology` | 0.0253 | 0.0028 | **over** | `emit` 883 `bos` 67 `reporter` 105 `model` 711 |
| 8.2% | `hydraulics` | 0.0307 | 0.0056 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 6.2% | `linguistics` | 0.0367 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 5.2% | `publishing` | 0.0012 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 4.4% | `industry` | 0.0025 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.4% | `medicine` | 0.0039 | 0.0160 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 3.0% | `electrotechnology` | 0.0029 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |

### `tika-pipes/tika-pipes-core/src/test/java`

**0.1353 bits** from the repository, against a null median of 0.0955 over 999 resamples of the same size — an excess of +0.0398, and 21 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/main/java`

**0.1926 bits** from the repository, against a null median of 0.2036 over 999 resamples of the same size — an excess of -0.0111, and 608 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/test/java`

**0.3545 bits** from the repository, against a null median of 0.3656 over 999 resamples of the same size — an excess of -0.0111, and 545 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-integration-tests/src/test/java`

**0.1285 bits** from the repository, against a null median of 0.0713 over 999 resamples of the same size — an excess of +0.0572, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.2% | `hydraulics` | 0.0787 | 0.0056 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 7.0% | `computing` | 0.4590 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 6.1% | `literature` | 0.0002 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 4.5% | `publishing` | 0.0004 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 2.8% | `computer_science` | 0.0058 | 0.0219 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 2.6% | `grammar` | 0.0002 | 0.0081 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |
| 2.5% | `person` | 0.0032 | 0.0154 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 2.2% | `geography` | 0.0042 | 0.0166 | under | `apache` 6,823 `stream` 1,670 `state` 273 `java` 222 |

### `tika-pipes/tika-pipes-iterator-commons/src/main/java`

**0.4239 bits** from the repository, against a null median of 0.2822 over 999 resamples of the same size — an excess of +0.1416, and 69 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java`

**0.1668 bits** from the repository, against a null median of 0.1650 over 999 resamples of the same size — an excess of +0.0018, and 473 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/java`

**0.3728 bits** from the repository, against a null median of 0.3651 over 999 resamples of the same size — an excess of +0.0077, and 461 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/main/java`

**0.2075 bits** from the repository, against a null median of 0.1229 over 999 resamples of the same size — an excess of +0.0846, and 4 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.3% | `time_period` | 0.0761 | 0.0095 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 8.7% | `electronics` | 0.0741 | 0.0120 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 6.6% | `military` | 0.0542 | 0.0081 | **over** | `column` 259 `predict` 119 `password` 187 `base` 806 |
| 5.0% | `hydraulics` | 0.0393 | 0.0056 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 4.2% | `graphical-user-interface` | 0.0214 | 0.0007 | **over** | `container` 470 `label` 356 `widget` 11 `chooser` 2 |
| 3.6% | `transport` | 0.0217 | 0.0016 | **over** | `container` 470 `train` 201 `driver` 18 `direction` 35 |
| 3.1% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.1% | `industry` | 0.0004 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/java`

**0.2858 bits** from the repository, against a null median of 0.2044 over 999 resamples of the same size — an excess of +0.0814, and 63 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/main/java`

**0.2361 bits** from the repository, against a null median of 0.2041 over 999 resamples of the same size — an excess of +0.0320, and 248 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/java`

**0.2139 bits** from the repository, against a null median of 0.2822 over 999 resamples of the same size — an excess of -0.0683, and 901 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/main/java`

**0.1773 bits** from the repository, against a null median of 0.1215 over 999 resamples of the same size — an excess of +0.0558, and 23 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/java`

**0.3776 bits** from the repository, against a null median of 0.2839 over 999 resamples of the same size — an excess of +0.0937, and 146 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/main/java`

**0.1743 bits** from the repository, against a null median of 0.0952 over 999 resamples of the same size — an excess of +0.0792, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.3% | `time_period` | 0.0593 | 0.0095 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 7.7% | `electronics` | 0.0620 | 0.0120 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 6.0% | `computer-languages` | 0.0659 | 0.0180 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 5.9% | `computer_science` | 0.0002 | 0.0219 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 3.7% | `hydraulics` | 0.0297 | 0.0056 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 3.7% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.2% | `publishing` | 0.0004 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 3.1% | `sociology` | 0.0186 | 0.0021 | **over** | `status` 293 `priority` 33 `class` 1,453 `common` 248 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/java`

**0.2187 bits** from the repository, against a null median of 0.1523 over 999 resamples of the same size — an excess of +0.0663, and 37 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/main/java`

**0.2247 bits** from the repository, against a null median of 0.1231 over 999 resamples of the same size — an excess of +0.1016, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.4% | `electronics` | 0.0874 | 0.0120 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 9.7% | `time_period` | 0.0775 | 0.0095 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 8.8% | `mechanics` | 0.0500 | 0.0021 | **over** | `bucket` 379 `override` 147 `throttle` 23 `restart` 103 |
| 5.0% | `hydraulics` | 0.0418 | 0.0056 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 3.8% | `computer-hardware` | 0.0184 | 0.0002 | **over** | `storage` 140 `cpu` 31 `ram` 99 `device` 11 |
| 2.9% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.9% | `publishing` | 0.0001 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 2.6% | `person` | 0.0466 | 0.0154 | **over** | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/java`

**0.2278 bits** from the repository, against a null median of 0.2049 over 999 resamples of the same size — an excess of +0.0229, and 291 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/main/java`

**0.2107 bits** from the repository, against a null median of 0.2040 over 999 resamples of the same size — an excess of +0.0067, and 447 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/java`

**0.3482 bits** from the repository, against a null median of 0.3612 over 999 resamples of the same size — an excess of -0.0129, and 552 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/main/java`

**0.2852 bits** from the repository, against a null median of 0.1302 over 999 resamples of the same size — an excess of +0.1549, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.2% | `exchange` | 0.1150 | 0.0007 | **over** | `issuer` 17 `stock` 22 `option` 129 `warranty` 2,148 |
| 14.5% | `cryptography` | 0.1011 | 0.0034 | **over** | `encrypt` 97 `password` 186 `private_key` 25 `md5` 21 |
| 8.8% | `networking` | 0.0817 | 0.0082 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 5.7% | `programming` | 0.0025 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 4.5% | `literature` | 0.0713 | 0.0174 | **over** | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 2.4% | `industry` | 0.0003 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 2.3% | `publishing` | 0.0001 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 2.3% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/java`

**0.2795 bits** from the repository, against a null median of 0.2067 over 999 resamples of the same size — an excess of +0.0728, and 64 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/main/java`

**0.1862 bits** from the repository, against a null median of 0.1210 over 999 resamples of the same size — an excess of +0.0652, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/java`

**0.2307 bits** from the repository, against a null median of 0.2038 over 999 resamples of the same size — an excess of +0.0269, and 263 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/main/java`

**0.2904 bits** from the repository, against a null median of 0.2038 over 999 resamples of the same size — an excess of +0.0866, and 50 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/java`

**0.2955 bits** from the repository, against a null median of 0.2781 over 999 resamples of the same size — an excess of +0.0174, and 405 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/main/java`

**0.1843 bits** from the repository, against a null median of 0.1535 over 999 resamples of the same size — an excess of +0.0308, and 174 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/java`

**0.3078 bits** from the repository, against a null median of 0.2788 over 999 resamples of the same size — an excess of +0.0290, and 336 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/main/java`

**0.2749 bits** from the repository, against a null median of 0.1402 over 999 resamples of the same size — an excess of +0.1347, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 25.1% | `law` | 0.4155 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 4.9% | `mechanics` | 0.0366 | 0.0021 | **over** | `bucket` 379 `override` 147 `throttle` 23 `restart` 103 |
| 3.9% | `mathematics` | 0.0000 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 3.7% | `programming` | 0.0078 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.5% | `town_planning` | 0.0218 | 0.0004 | **over** | `store` 443 `current` 74 `archive` 76 `tenant` 18 |
| 3.2% | `literature` | 0.0000 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 2.8% | `computing` | 0.2130 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 2.5% | `publishing` | 0.0000 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/java`

**0.2674 bits** from the repository, against a null median of 0.2790 over 999 resamples of the same size — an excess of -0.0116, and 555 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/main/java`

**0.2092 bits** from the repository, against a null median of 0.1034 over 999 resamples of the same size — an excess of +0.1058, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `computer-languages` | 0.1187 | 0.0180 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 9.7% | `person` | 0.0881 | 0.0154 | **over** | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 5.7% | `sociology` | 0.0332 | 0.0021 | **over** | `status` 293 `priority` 33 `class` 1,453 `common` 248 |
| 5.2% | `plants` | 0.0406 | 0.0056 | **over** | `root` 458 `log` 484 `stub` 81 `complete` 142 |
| 3.1% | `networking` | 0.0353 | 0.0082 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 3.1% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.0% | `publishing` | 0.0002 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 2.8% | `time_period` | 0.0357 | 0.0095 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/java`

**0.3823 bits** from the repository, against a null median of 0.2798 over 999 resamples of the same size — an excess of +0.1025, and 118 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/main/java`

**0.1780 bits** from the repository, against a null median of 0.1221 over 999 resamples of the same size — an excess of +0.0559, and 31 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/java`

**0.2561 bits** from the repository, against a null median of 0.2329 over 999 resamples of the same size — an excess of +0.0232, and 338 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/main/java`

**0.2386 bits** from the repository, against a null median of 0.1415 over 999 resamples of the same size — an excess of +0.0972, and 5 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.6% | `electronics` | 0.1206 | 0.0120 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `tsv` 13 |
| 13.0% | `person` | 0.1150 | 0.0154 | **over** | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 6.7% | `computing` | 0.1727 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 4.8% | `hydraulics` | 0.0422 | 0.0056 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 4.0% | `time_period` | 0.0464 | 0.0095 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 3.8% | `telecommunication` | 0.0004 | 0.0205 | under | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 3.6% | `literature` | 0.0000 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 2.7% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/java`

**0.2314 bits** from the repository, against a null median of 0.2344 over 999 resamples of the same size — an excess of -0.0029, and 529 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-reporter-commons/src/main/java`

**0.5286 bits** from the repository, against a null median of 0.3613 over 999 resamples of the same size — an excess of +0.1674, and 175 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-plugins-core/src/main/java`

**0.2670 bits** from the repository, against a null median of 0.1515 over 999 resamples of the same size — an excess of +0.1155, and 4 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 36.4% | `time_period` | 0.2431 | 0.0095 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 5.7% | `plants` | 0.0511 | 0.0056 | **over** | `root` 458 `log` 484 `stub` 81 `complete` 142 |
| 4.3% | `computer-languages` | 0.0689 | 0.0180 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.8% | `computer_science` | 0.0002 | 0.0219 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 3.2% | `literature` | 0.0000 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 2.7% | `software` | 0.0247 | 0.0028 | **over** | `shift_jis` 59 `pdf` 153 `excel` 98 `factory_class` 20 |
| 2.4% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.4% | `mathematics` | 0.0025 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |

### `tika-plugins-core/src/test/java`

**0.2777 bits** from the repository, against a null median of 0.2328 over 999 resamples of the same size — an excess of +0.0449, and 216 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/main/java`

**0.1200 bits** from the repository, against a null median of 0.0535 over 999 resamples of the same size — an excess of +0.0665, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.0% | `graph-theory` | 0.0519 | 0.0016 | **over** | `component` 599 `node` 598 `size` 784 `path` 1,674 |
| 4.8% | `industry` | 0.0008 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.3% | `psychology` | 0.0183 | 0.0023 | **over** | `confidence` 226 `module` 100 `self` 50 `test` 5,626 |
| 4.2% | `computer-languages` | 0.0475 | 0.0180 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.9% | `electrotechnology` | 0.0384 | 0.0130 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.4% | `medicine` | 0.0023 | 0.0160 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 2.8% | `time_period` | 0.0007 | 0.0095 | under | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 2.7% | `linguistics` | 0.1190 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |

### `tika-serialization/src/test/java`

**0.1091 bits** from the repository, against a null median of 0.0524 over 999 resamples of the same size — an excess of +0.0567, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.5% | `computer-languages` | 0.0874 | 0.0180 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 6.2% | `computing` | 0.4392 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 5.7% | `publishing` | 0.0002 | 0.0136 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 3.6% | `time_period` | 0.0003 | 0.0095 | under | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 2.5% | `hydraulics` | 0.0000 | 0.0056 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 2.5% | `networking` | 0.0007 | 0.0082 | under | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 2.3% | `grammar` | 0.0008 | 0.0081 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |
| 2.3% | `algebra` | 0.0009 | 0.0083 | under | `content` 2,501 `unknown` 275 `normalizer` 16 `index` 910 |

### `tika-server/tika-server-core/src/main/java`

**0.1339 bits** from the repository, against a null median of 0.0453 over 999 resamples of the same size — an excess of +0.0886, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.0% | `networking` | 0.0732 | 0.0082 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 7.8% | `literature` | 0.0645 | 0.0174 | **over** | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 7.5% | `commerce` | 0.0336 | 0.0036 | **over** | `server` 670 `packet` 73 `quote` 66 `package` 206 |
| 5.0% | `law` | 0.1821 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 4.3% | `computer-languages` | 0.0016 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.5% | `programming` | 0.0167 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.4% | `industry` | 0.0016 | 0.0154 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.1% | `mathematics` | 0.0048 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |

### `tika-server/tika-server-core/src/test/java`

**0.1170 bits** from the repository, against a null median of 0.0631 over 999 resamples of the same size — an excess of +0.0539, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.4% | `networking` | 0.0621 | 0.0082 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 7.9% | `linguistics` | 0.0266 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 5.5% | `anatomy` | 0.0254 | 0.0038 | **over** | `body` 409 `socket` 144 `iter` 11 `colon` 23 |
| 5.5% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 5.3% | `law` | 0.1790 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 4.9% | `programming` | 0.0144 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.6% | `commerce` | 0.0191 | 0.0036 | **over** | `server` 670 `packet` 73 `quote` 66 `package` 206 |
| 2.8% | `grammar` | 0.0003 | 0.0081 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |

### `tika-server/tika-server-standard/src/main/java`

**0.2817 bits** from the repository, against a null median of 0.2735 over 999 resamples of the same size — an excess of +0.0082, and 450 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-standard/src/test/java`

**0.1852 bits** from the repository, against a null median of 0.0909 over 999 resamples of the same size — an excess of +0.0943, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `person` | 0.1036 | 0.0154 | **over** | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 10.5% | `networking` | 0.0685 | 0.0082 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 7.4% | `programming` | 0.0044 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 6.9% | `computer-languages` | 0.0728 | 0.0180 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 5.1% | `mathematics` | 0.0005 | 0.0217 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 4.2% | `linguistics` | 0.0299 | 0.0770 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 2.8% | `law` | 0.0602 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 2.3% | `computing` | 0.4128 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |

### `tika-translate/src/main/java`

**0.1536 bits** from the repository, against a null median of 0.1148 over 999 resamples of the same size — an excess of +0.0388, and 62 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-translate/src/test/java`

**0.3106 bits** from the repository, against a null median of 0.1301 over 999 resamples of the same size — an excess of +0.1804, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.1% | `botany` | 0.0957 | 0.0012 | **over** | `translator` 126 `test` 5,626 `key` 1,630 `offset` 444 |
| 13.9% | `software` | 0.1020 | 0.0028 | **over** | `shift_jis` 59 `pdf` 153 `excel` 98 `factory_class` 20 |
| 12.4% | `linguistics` | 0.2626 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 6.7% | `programming` | 0.0003 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.2% | `computer_science` | 0.0003 | 0.0219 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 3.1% | `computing` | 0.2021 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 2.9% | `computer-languages` | 0.0000 | 0.0180 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 2.5% | `medicine` | 0.0000 | 0.0160 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |

### `tika-xmp/src/main/java`

**0.1962 bits** from the repository, against a null median of 0.1232 over 999 resamples of the same size — an excess of +0.0730, and 5 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.5% | `programming` | 0.0013 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 7.3% | `medicine` | 0.0730 | 0.0160 | **over** | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 6.4% | `linguistics` | 0.1681 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.6% | `applied_science` | 0.0196 | 0.0002 | **over** | `process` 139 `processing` 7 |
| 4.0% | `computing` | 0.4489 | 0.3199 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 3.9% | `economy` | 0.0333 | 0.0059 | **over** | `property` 1,106 `total` 216 `manager` 306 `mark_down` 31 |
| 3.4% | `law` | 0.0546 | 0.1091 | under | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 3.3% | `electrotechnology` | 0.0000 | 0.0130 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |

### `tika-xmp/src/test/java`

**0.3132 bits** from the repository, against a null median of 0.2736 over 999 resamples of the same size — an excess of +0.0396, and 305 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `documentation`

**0.2534 bits** from the repository, against a null median of 0.1414 over 999 resamples of the same size — an excess of +0.1120, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.9% | `computing` | 0.1064 | 0.3199 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 15.0% | `law` | 0.3167 | 0.1091 | **over** | `file` 10,172 `license` 10,825 `client` 720 `compliance` 2,148 |
| 14.0% | `geography` | 0.1288 | 0.0166 | **over** | `apache` 6,823 `stream` 1,670 `state` 273 `java` 222 |
| 7.9% | `linguistics` | 0.1986 | 0.0770 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 3.3% | `programming` | 0.0100 | 0.0441 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.7% | `physics` | 0.0266 | 0.0038 | **over** | `length` 1,226 `weight` 122 `free_space` 26 `sql` 38 |
| 2.1% | `literature` | 0.0017 | 0.0174 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 2.1% | `computer_science` | 0.0036 | 0.0219 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |

Read, compared and resampled in 66.5 s, recorded rather than estimated.
