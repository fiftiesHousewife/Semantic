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
| `computing` | 0.0985 | 50.9% | 77,249 | 1,366 | 270,125 | 64.7% | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| `linguistics` | 0.0198 | 56.8% | 32,308 | 189 | 28,998 | 6.9% | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| `software` | 0.0077 | 76.7% | 5,526 | 14 | 213 | 0.1% | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |

Read over 4,189 files and 417,750 lines: 558 topics, 1,547 files no topic could be resolved for, and 64.7% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 34.8% of it; the other 65.2% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `tika-annotation-processor/src/main/java`

**41.5%** of the maximum divergence from the repository, against a null median of 43.1% over 999 resamples of the same size — an excess of -1.6 points, and 542 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-annotation-processor/src/test/java`

**70.9%** of the maximum divergence from the repository, against a null median of 57.1% over 999 resamples of the same size — an excess of +13.8 points, and 336 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/main/java`

**21.0%** of the maximum divergence from the repository, against a null median of 35.0% over 999 resamples of the same size — an excess of -14.0 points, and 990 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/test/java`

**24.4%** of the maximum divergence from the repository, against a null median of 38.7% over 999 resamples of the same size — an excess of -14.3 points, and 974 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/main/java`

**47.9%** of the maximum divergence from the repository, against a null median of 56.8% over 999 resamples of the same size — an excess of -8.9 points, and 679 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/test/java`

**45.4%** of the maximum divergence from the repository, against a null median of 57.0% over 999 resamples of the same size — an excess of -11.6 points, and 752 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-core/src/main/java`

**9.6%** of the maximum divergence from the repository, against a null median of 2.7% over 999 resamples of the same size — an excess of +6.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 28.1% | `computer-languages` | 0.0033 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 5.2% | `software` | 0.0038 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 5.2% | `linguistics` | 0.1148 | 0.0652 | **over** | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 4.0% | `hydraulics` | 0.0000 | 0.0080 | under | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 3.3% | `geography` | 0.0286 | 0.0104 | **over** | `stream` 21.6% (1,710) `apache` 8.3% (6,934) `state` 6.9% (282) `java` 3.8% (289) |
| 2.9% | `probability-theory` | 0.0002 | 0.0068 | under | `pdf` 99.9% (245) `outcome` 0.0% (14) `normal` 0.0% (75) `expected_value` 0.0% (1) |
| 2.8% | `commerce` | 0.0003 | 0.0069 | under | `server` 68.8% (929) `packet` 9.4% (73) `package` 5.9% (236) `quote` 5.8% (68) |
| 2.0% | `computer-graphics` | 0.0216 | 0.0090 | **over** | `instance` 26.3% (593) `jpeg` 18.0% (61) `mpeg` 10.2% (48) `renderer` 9.6% (22) |

### `tika-core/src/test/java`

**10.6%** of the maximum divergence from the repository, against a null median of 7.7% over 999 resamples of the same size — an excess of +2.9 points, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.5% | `computer-languages` | 0.0190 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 10.3% | `electrotechnology` | 0.0550 | 0.0117 | **over** | `detector` 99.7% (1,268) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 5.2% | `programming` | 0.0817 | 0.0390 | **over** | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 4.4% | `aviation` | 0.0007 | 0.0124 | under | `rtf` 41.8% (146) `max` 33.1% (1,148) `threshold` 4.8% (202) `fis` 2.5% (5) |
| 3.8% | `hydraulics` | 0.0000 | 0.0080 | under | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 3.2% | `linguistics` | 0.1053 | 0.0652 | **over** | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.7% | `software` | 0.0069 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 2.5% | `metrology` | 0.0001 | 0.0063 | under | `array` 28.9% (830) `entropy` 13.1% (96) `rate` 7.3% (148) `measurement` 5.6% (13) |

### `tika-detectors/tika-detector-magika/src/main/java`

**35.1%** of the maximum divergence from the repository, against a null median of 57.3% over 999 resamples of the same size — an excess of -22.2 points, and 943 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-magika/src/test/java`

**42.9%** of the maximum divergence from the repository, against a null median of 48.9% over 999 resamples of the same size — an excess of -6.0 points, and 662 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/main/java`

**40.7%** of the maximum divergence from the repository, against a null median of 60.0% over 999 resamples of the same size — an excess of -19.3 points, and 850 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/test/java`

**42.8%** of the maximum divergence from the repository, against a null median of 48.0% over 999 resamples of the same size — an excess of -5.2 points, and 641 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-grpc/src/test/java`

**32.8%** of the maximum divergence from the repository, against a null median of 37.9% over 999 resamples of the same size — an excess of -5.1 points, and 743 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-server/src/test/java`

**49.0%** of the maximum divergence from the repository, against a null median of 47.5% over 999 resamples of the same size — an excess of +1.5 points, and 460 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/main/java`

**25.3%** of the maximum divergence from the repository, against a null median of 27.9% over 999 resamples of the same size — an excess of -2.6 points, and 674 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/test/java`

**30.4%** of the maximum divergence from the repository, against a null median of 47.3% over 999 resamples of the same size — an excess of -16.9 points, and 958 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java`

**24.9%** of the maximum divergence from the repository, against a null median of 27.6% over 999 resamples of the same size — an excess of -2.6 points, and 692 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/java`

**50.6%** of the maximum divergence from the repository, against a null median of 57.9% over 999 resamples of the same size — an excess of -7.3 points, and 657 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/main/java`

**21.4%** of the maximum divergence from the repository, against a null median of 23.1% over 999 resamples of the same size — an excess of -1.7 points, and 686 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java`

**20.3%** of the maximum divergence from the repository, against a null median of 20.4% over 999 resamples of the same size — an excess of -0.0 points, and 502 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-universal/src/main/java`

**35.3%** of the maximum divergence from the repository, against a null median of 48.2% over 999 resamples of the same size — an excess of -12.9 points, and 860 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/main/java`

**20.7%** of the maximum divergence from the repository, against a null median of 14.4% over 999 resamples of the same size — an excess of +6.3 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/test/java`

**26.4%** of the maximum divergence from the repository, against a null median of 26.7% over 999 resamples of the same size — an excess of -0.2 points, and 511 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-core/src/main/java`

**26.6%** of the maximum divergence from the repository, against a null median of 13.5% over 999 resamples of the same size — an excess of +13.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 24.8% | `mathematics` | 0.2057 | 0.0185 | **over** | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 12.9% | `computer-languages` | 0.0001 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 6.0% | `video-games` | 0.0523 | 0.0054 | **over** | `stats` 24.7% (45) `meta` 14.6% (185) `item` 11.4% (329) `oom` 4.9% (50) |
| 2.6% | `software` | 0.0020 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 2.6% | `grammar` | 0.0327 | 0.0066 | **over** | `num` 59.6% (471) `clause` 7.8% (33) `modify` 5.3% (129) `number` 5.0% (779) |
| 2.3% | `metrology` | 0.0302 | 0.0063 | **over** | `array` 28.9% (830) `entropy` 13.1% (96) `rate` 7.3% (148) `measurement` 5.6% (13) |
| 2.0% | `electronics` | 0.0003 | 0.0126 | under | `emitter` 55.5% (694) `input` 10.7% (1,082) `ti` 10.7% (1,144) `default` 2.6% (1,980) |
| 2.0% | `telecommunication` | 0.0014 | 0.0163 | under | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |

### `tika-eval/tika-eval-core/src/test/java`

**26.3%** of the maximum divergence from the repository, against a null median of 31.3% over 999 resamples of the same size — an excess of -5.0 points, and 784 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-example/src/main/java`

**22.9%** of the maximum divergence from the repository, against a null median of 13.0% over 999 resamples of the same size — an excess of +9.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.2% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 13.6% | `telecommunication` | 0.1173 | 0.0163 | **over** | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |
| 4.6% | `software` | 0.0001 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 3.6% | `electrotechnology` | 0.0468 | 0.0117 | **over** | `detector` 99.7% (1,268) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 2.7% | `programming` | 0.0842 | 0.0390 | **over** | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.6% | `aviation` | 0.0001 | 0.0124 | under | `rtf` 41.8% (146) `max` 33.1% (1,148) `threshold` 4.8% (202) `fis` 2.5% (5) |
| 1.9% | `computing` | 0.3291 | 0.2456 | **over** | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 1.7% | `buildings` | 0.0003 | 0.0097 | under | `log` 21.7% (538) `window` 20.2% (386) `tear_down` 16.5% (48) `machine` 7.8% (48) |

### `tika-example/src/test/java`

**32.9%** of the maximum divergence from the repository, against a null median of 26.3% over 999 resamples of the same size — an excess of +6.5 points, and 133 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/main/java`

**33.4%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of -8.9 points, and 829 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/test/java`

**41.0%** of the maximum divergence from the repository, against a null median of 38.4% over 999 resamples of the same size — an excess of +2.6 points, and 393 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-handlers/tika-handler-boilerpipe/src/main/java`

**43.2%** of the maximum divergence from the repository, against a null median of 59.3% over 999 resamples of the same size — an excess of -16.0 points, and 815 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-es-integration-tests/src/test/java`

**35.9%** of the maximum divergence from the repository, against a null median of 48.9% over 999 resamples of the same size — an excess of -12.9 points, and 835 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/java`

**44.5%** of the maximum divergence from the repository, against a null median of 55.9% over 999 resamples of the same size — an excess of -11.4 points, and 719 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/java`

**34.2%** of the maximum divergence from the repository, against a null median of 47.5% over 999 resamples of the same size — an excess of -13.3 points, and 897 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/java`

**49.1%** of the maximum divergence from the repository, against a null median of 47.8% over 999 resamples of the same size — an excess of +1.3 points, and 458 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/java`

**66.1%** of the maximum divergence from the repository, against a null median of 35.2% over 999 resamples of the same size — an excess of +30.9 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 37.7% | `hydraulics` | 0.5502 | 0.0080 | **over** | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 14.3% | `christianity` | 0.1985 | 0.0012 | **over** | `use` 62.1% (4,423) `kind` 4.8% (2,192) `secret` 4.8% (77) `element` 3.8% (1,058) |
| 6.7% | `computing` | 0.0590 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 5.3% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 2.7% | `programming` | 0.0006 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 1.5% | `software` | 0.0003 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 1.3% | `mathematics` | 0.0001 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 1.3% | `literature` | 0.0000 | 0.0174 | under | `header` 41.9% (1,105) `writer` 16.1% (291) `text` 12.3% (2,273) `author` 11.0% (183) |

### `tika-integration-tests/tika-resource-loading-tests/src/test/java`

**40.5%** of the maximum divergence from the repository, against a null median of 47.8% over 999 resamples of the same size — an excess of -7.3 points, and 711 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-woodstox-tests/src/test/java`

**41.3%** of the maximum divergence from the repository, against a null median of 56.3% over 999 resamples of the same size — an excess of -15.0 points, and 824 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/main/java`

**67.0%** of the maximum divergence from the repository, against a null median of 48.0% over 999 resamples of the same size — an excess of +19.0 points, and 129 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/test/java`

**46.3%** of the maximum divergence from the repository, against a null median of 58.6% over 999 resamples of the same size — an excess of -12.3 points, and 717 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup-core/src/main/java`

**37.7%** of the maximum divergence from the repository, against a null median of 29.2% over 999 resamples of the same size — an excess of +8.4 points, and 95 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/main/java`

**35.6%** of the maximum divergence from the repository, against a null median of 42.8% over 999 resamples of the same size — an excess of -7.3 points, and 747 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/test/java`

**24.2%** of the maximum divergence from the repository, against a null median of 13.7% over 999 resamples of the same size — an excess of +10.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.4% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 8.4% | `computing` | 0.1069 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 6.7% | `linguistics` | 0.1652 | 0.0652 | **over** | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 6.0% | `telecommunications` | 0.0369 | 0.0016 | **over** | `ext` 83.1% (105) `csd` 3.0% (3) `prefix` 2.1% (660) `cli` 2.1% (99) |
| 4.2% | `geography` | 0.0497 | 0.0104 | **over** | `stream` 21.6% (1,710) `apache` 8.3% (6,934) `state` 6.9% (282) `java` 3.8% (289) |
| 3.3% | `software` | 0.0012 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 3.1% | `telecommunication` | 0.0536 | 0.0163 | **over** | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |
| 2.9% | `mathematics` | 0.0558 | 0.0185 | **over** | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |

### `tika-langdetect/tika-langdetect-lingo24/src/main/java`

**37.3%** of the maximum divergence from the repository, against a null median of 57.1% over 999 resamples of the same size — an excess of -19.8 points, and 887 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-lingo24/src/test/java`

**74.8%** of the maximum divergence from the repository, against a null median of 59.5% over 999 resamples of the same size — an excess of +15.2 points, and 318 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/main/java`

**50.2%** of the maximum divergence from the repository, against a null median of 56.6% over 999 resamples of the same size — an excess of -6.4 points, and 650 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/test/java`

**84.0%** of the maximum divergence from the repository, against a null median of 55.7% over 999 resamples of the same size — an excess of +28.3 points, and 182 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/main/java`

**34.5%** of the maximum divergence from the repository, against a null median of 42.5% over 999 resamples of the same size — an excess of -8.0 points, and 780 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/test/java`

**67.8%** of the maximum divergence from the repository, against a null median of 57.2% over 999 resamples of the same size — an excess of +10.6 points, and 375 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/main/java`

**40.6%** of the maximum divergence from the repository, against a null median of 48.1% over 999 resamples of the same size — an excess of -7.5 points, and 733 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/test/java`

**65.5%** of the maximum divergence from the repository, against a null median of 57.3% over 999 resamples of the same size — an excess of +8.2 points, and 382 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-test-commons/src/main/java`

**53.1%** of the maximum divergence from the repository, against a null median of 55.8% over 999 resamples of the same size — an excess of -2.8 points, and 570 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/main/java`

**26.5%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of -16.2 points, and 965 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/test/java`

**35.0%** of the maximum divergence from the repository, against a null median of 28.9% over 999 resamples of the same size — an excess of +6.0 points, and 166 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-chardetect/src/main/java`

**25.1%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of -7.7 points, and 896 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-chardetect/src/test/java`

**51.9%** of the maximum divergence from the repository, against a null median of 59.2% over 999 resamples of the same size — an excess of -7.4 points, and 629 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/main/java`

**55.2%** of the maximum divergence from the repository, against a null median of 41.7% over 999 resamples of the same size — an excess of +13.5 points, and 137 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/test/java`

**63.5%** of the maximum divergence from the repository, against a null median of 57.4% over 999 resamples of the same size — an excess of +6.1 points, and 424 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/main/java`

**22.6%** of the maximum divergence from the repository, against a null median of 30.8% over 999 resamples of the same size — an excess of -8.2 points, and 924 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/test/java`

**25.2%** of the maximum divergence from the repository, against a null median of 38.1% over 999 resamples of the same size — an excess of -12.9 points, and 957 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/main/java`

**24.4%** of the maximum divergence from the repository, against a null median of 32.3% over 999 resamples of the same size — an excess of -7.9 points, and 907 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/test/java`

**24.4%** of the maximum divergence from the repository, against a null median of 28.8% over 999 resamples of the same size — an excess of -4.4 points, and 799 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/main/java`

**48.3%** of the maximum divergence from the repository, against a null median of 57.6% over 999 resamples of the same size — an excess of -9.3 points, and 673 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/test/java`

**45.5%** of the maximum divergence from the repository, against a null median of 47.5% over 999 resamples of the same size — an excess of -2.0 points, and 552 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/main/java`

**32.0%** of the maximum divergence from the repository, against a null median of 48.4% over 999 resamples of the same size — an excess of -16.4 points, and 924 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/java`

**34.5%** of the maximum divergence from the repository, against a null median of 47.8% over 999 resamples of the same size — an excess of -13.4 points, and 882 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/main/java`

**23.3%** of the maximum divergence from the repository, against a null median of 27.7% over 999 resamples of the same size — an excess of -4.3 points, and 804 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/java`

**35.9%** of the maximum divergence from the repository, against a null median of 30.8% over 999 resamples of the same size — an excess of +5.0 points, and 242 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/java`

**56.6%** of the maximum divergence from the repository, against a null median of 57.5% over 999 resamples of the same size — an excess of -0.9 points, and 523 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/main/java`

**30.7%** of the maximum divergence from the repository, against a null median of 32.4% over 999 resamples of the same size — an excess of -1.7 points, and 588 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/java`

**31.6%** of the maximum divergence from the repository, against a null median of 55.8% over 999 resamples of the same size — an excess of -24.3 points, and 974 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/java`

**30.7%** of the maximum divergence from the repository, against a null median of 42.4% over 999 resamples of the same size — an excess of -11.6 points, and 895 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-inference/src/main/java`

**26.6%** of the maximum divergence from the repository, against a null median of 21.7% over 999 resamples of the same size — an excess of +4.9 points, and 133 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-inference/src/test/java`

**26.6%** of the maximum divergence from the repository, against a null median of 33.3% over 999 resamples of the same size — an excess of -6.7 points, and 822 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java`

**16.4%** of the maximum divergence from the repository, against a null median of 16.8% over 999 resamples of the same size — an excess of -0.4 points, and 565 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/java`

**28.6%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of -4.6 points, and 747 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/main/java`

**34.9%** of the maximum divergence from the repository, against a null median of 47.4% over 999 resamples of the same size — an excess of -12.5 points, and 861 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/java`

**27.8%** of the maximum divergence from the repository, against a null median of 38.7% over 999 resamples of the same size — an excess of -10.9 points, and 919 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/main/java`

**39.1%** of the maximum divergence from the repository, against a null median of 47.1% over 999 resamples of the same size — an excess of -8.0 points, and 752 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/java`

**61.2%** of the maximum divergence from the repository, against a null median of 55.4% over 999 resamples of the same size — an excess of +5.8 points, and 431 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/main/java`

**20.2%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of -12.9 points, and 990 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/test/java`

**28.3%** of the maximum divergence from the repository, against a null median of 35.6% over 999 resamples of the same size — an excess of -7.3 points, and 841 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java`

**16.1%** of the maximum divergence from the repository, against a null median of 8.3% over 999 resamples of the same size — an excess of +7.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.9% | `computing` | 0.5081 | 0.2456 | **over** | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 6.1% | `electrotechnology` | 0.0518 | 0.0117 | **over** | `detector` 99.7% (1,268) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 3.5% | `mathematics` | 0.0019 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 3.4% | `computer-languages` | 0.0312 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 2.9% | `law` | 0.0071 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 2.5% | `algebra` | 0.0246 | 0.0066 | **over** | `content` 75.6% (2,676) `unknown` 8.6% (291) `normalizer` 4.4% (16) `index` 3.7% (943) |
| 2.5% | `hydraulics` | 0.0000 | 0.0080 | under | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 2.3% | `economy` | 0.0001 | 0.0080 | under | `property` 40.6% (1,163) `manager` 13.4% (316) `total` 8.8% (216) `mark_down` 7.5% (33) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/main/java`

**19.1%** of the maximum divergence from the repository, against a null median of 25.4% over 999 resamples of the same size — an excess of -6.3 points, and 930 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/java`

**31.0%** of the maximum divergence from the repository, against a null median of 32.3% over 999 resamples of the same size — an excess of -1.3 points, and 576 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/main/java`

**20.2%** of the maximum divergence from the repository, against a null median of 14.0% over 999 resamples of the same size — an excess of +6.2 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.2% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 12.6% | `music` | 0.0783 | 0.0067 | **over** | `ti` 18.9% (1,144) `album` 7.3% (30) `composer` 4.8% (11) `label` 4.6% (374) |
| 4.9% | `programming` | 0.0997 | 0.0390 | **over** | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.9% | `art` | 0.0290 | 0.0038 | **over** | `flag` 45.0% (325) `artist` 18.3% (29) `write` 8.4% (956) `art` 5.4% (34) |
| 3.2% | `software` | 0.0023 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 2.4% | `computer-graphics` | 0.0321 | 0.0090 | **over** | `instance` 26.3% (593) `jpeg` 18.0% (61) `mpeg` 10.2% (48) `renderer` 9.6% (22) |
| 2.4% | `time_period` | 0.0307 | 0.0084 | **over** | `extension` 46.5% (491) `future` 10.1% (96) `current` 8.3% (291) `year` 6.5% (24) |
| 2.2% | `acoustics` | 0.0102 | 0.0002 | **over** | `audio` 95.3% (166) `sound` 1.7% (3) `bel` 1.4% (1) `static` 0.8% (4) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/java`

**24.6%** of the maximum divergence from the repository, against a null median of 21.5% over 999 resamples of the same size — an excess of +3.1 points, and 210 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/main/java`

**27.0%** of the maximum divergence from the repository, against a null median of 29.0% over 999 resamples of the same size — an excess of -2.0 points, and 632 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/java`

**41.2%** of the maximum divergence from the repository, against a null median of 38.5% over 999 resamples of the same size — an excess of +2.7 points, and 390 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/main/java`

**22.5%** of the maximum divergence from the repository, against a null median of 30.6% over 999 resamples of the same size — an excess of -8.1 points, and 926 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/java`

**35.2%** of the maximum divergence from the repository, against a null median of 33.3% over 999 resamples of the same size — an excess of +1.9 points, and 382 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/main/java`

**28.7%** of the maximum divergence from the repository, against a null median of 38.6% over 999 resamples of the same size — an excess of -9.9 points, and 871 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/java`

**40.1%** of the maximum divergence from the repository, against a null median of 35.5% over 999 resamples of the same size — an excess of +4.7 points, and 288 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/main/java`

**46.8%** of the maximum divergence from the repository, against a null median of 42.8% over 999 resamples of the same size — an excess of +3.9 points, and 356 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/test/java`

**82.6%** of the maximum divergence from the repository, against a null median of 56.4% over 999 resamples of the same size — an excess of +26.2 points, and 190 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-digest-commons/src/main/java`

**53.7%** of the maximum divergence from the repository, against a null median of 37.8% over 999 resamples of the same size — an excess of +15.9 points, and 83 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/main/java`

**32.2%** of the maximum divergence from the repository, against a null median of 48.1% over 999 resamples of the same size — an excess of -15.9 points, and 906 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/java`

**41.2%** of the maximum divergence from the repository, against a null median of 57.3% over 999 resamples of the same size — an excess of -16.1 points, and 815 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java`

**34.3%** of the maximum divergence from the repository, against a null median of 32.7% over 999 resamples of the same size — an excess of +1.6 points, and 411 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/java`

**31.4%** of the maximum divergence from the repository, against a null median of 47.6% over 999 resamples of the same size — an excess of -16.2 points, and 940 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/main/java`

**20.0%** of the maximum divergence from the repository, against a null median of 21.0% over 999 resamples of the same size — an excess of -1.1 points, and 620 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/java`

**34.0%** of the maximum divergence from the repository, against a null median of 24.4% over 999 resamples of the same size — an excess of +9.6 points, and 24 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-jdbc-commons/src/main/java`

**31.7%** of the maximum divergence from the repository, against a null median of 48.8% over 999 resamples of the same size — an excess of -17.1 points, and 940 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java`

**34.3%** of the maximum divergence from the repository, against a null median of 48.9% over 999 resamples of the same size — an excess of -14.5 points, and 887 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/test/java`

**41.0%** of the maximum divergence from the repository, against a null median of 48.8% over 999 resamples of the same size — an excess of -7.8 points, and 726 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/main/java`

**26.3%** of the maximum divergence from the repository, against a null median of 41.5% over 999 resamples of the same size — an excess of -15.2 points, and 963 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/java`

**33.7%** of the maximum divergence from the repository, against a null median of 47.7% over 999 resamples of the same size — an excess of -14.0 points, and 894 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java`

**13.0%** of the maximum divergence from the repository, against a null median of 2.9% over 999 resamples of the same size — an excess of +10.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 25.7% | `computer-languages` | 0.0004 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 5.8% | `software` | 0.0016 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 4.3% | `computer_science` | 0.0572 | 0.0225 | **over** | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 4.1% | `electrotechnology` | 0.0001 | 0.0117 | under | `detector` 99.7% (1,268) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 3.7% | `mathematics` | 0.0475 | 0.0185 | **over** | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 3.1% | `hydraulics` | 0.0000 | 0.0080 | under | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 2.6% | `electronics` | 0.0017 | 0.0126 | under | `emitter` 55.5% (694) `input` 10.7% (1,082) `ti` 10.7% (1,144) `default` 2.6% (1,980) |
| 2.6% | `probability-theory` | 0.0000 | 0.0068 | under | `pdf` 99.9% (245) `outcome` 0.0% (14) `normal` 0.0% (75) `expected_value` 0.0% (1) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/java`

**17.2%** of the maximum divergence from the repository, against a null median of 10.5% over 999 resamples of the same size — an excess of +6.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.3% | `computing` | 0.4160 | 0.2456 | **over** | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 6.2% | `literature` | 0.0656 | 0.0174 | **over** | `header` 41.9% (1,105) `writer` 16.1% (291) `text` 12.3% (2,273) `author` 11.0% (183) |
| 5.9% | `tennis` | 0.0306 | 0.0025 | **over** | `get` 96.3% (1,719) `return` 1.0% (1,518) `server` 1.0% (929) `single` 0.5% (546) |
| 3.8% | `algebra` | 0.0318 | 0.0066 | **over** | `content` 75.6% (2,676) `unknown` 8.6% (291) `normalizer` 4.4% (16) `index` 3.7% (943) |
| 3.6% | `aviation` | 0.0424 | 0.0124 | **over** | `rtf` 41.8% (146) `max` 33.1% (1,148) `threshold` 4.8% (202) `fis` 2.5% (5) |
| 3.6% | `medicine` | 0.0016 | 0.0187 | under | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |
| 2.8% | `software` | 0.0040 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 2.7% | `computer-languages` | 0.0335 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/main/java`

**17.2%** of the maximum divergence from the repository, against a null median of 12.5% over 999 resamples of the same size — an excess of +4.7 points, and 13 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/java`

**22.8%** of the maximum divergence from the repository, against a null median of 24.3% over 999 resamples of the same size — an excess of -1.5 points, and 634 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/main/java`

**25.3%** of the maximum divergence from the repository, against a null median of 48.3% over 999 resamples of the same size — an excess of -23.0 points, and 990 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/java`

**39.6%** of the maximum divergence from the repository, against a null median of 59.2% over 999 resamples of the same size — an excess of -19.6 points, and 858 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/main/java`

**29.7%** of the maximum divergence from the repository, against a null median of 35.7% over 999 resamples of the same size — an excess of -6.0 points, and 772 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/java`

**29.1%** of the maximum divergence from the repository, against a null median of 47.6% over 999 resamples of the same size — an excess of -18.5 points, and 976 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/main/java`

**21.1%** of the maximum divergence from the repository, against a null median of 16.6% over 999 resamples of the same size — an excess of +4.5 points, and 51 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java`

**22.9%** of the maximum divergence from the repository, against a null median of 30.5% over 999 resamples of the same size — an excess of -7.6 points, and 915 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/main/java`

**27.3%** of the maximum divergence from the repository, against a null median of 26.3% over 999 resamples of the same size — an excess of +1.1 points, and 420 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/java`

**27.7%** of the maximum divergence from the repository, against a null median of 21.8% over 999 resamples of the same size — an excess of +5.9 points, and 76 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/main/java`

**23.3%** of the maximum divergence from the repository, against a null median of 24.9% over 999 resamples of the same size — an excess of -1.6 points, and 641 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/java`

**30.9%** of the maximum divergence from the repository, against a null median of 30.8% over 999 resamples of the same size — an excess of +0.1 points, and 495 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/main/java`

**33.2%** of the maximum divergence from the repository, against a null median of 42.0% over 999 resamples of the same size — an excess of -8.8 points, and 837 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/java`

**50.5%** of the maximum divergence from the repository, against a null median of 42.2% over 999 resamples of the same size — an excess of +8.3 points, and 215 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java`

**31.0%** of the maximum divergence from the repository, against a null median of 21.7% over 999 resamples of the same size — an excess of +9.3 points, and 18 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/java`

**34.9%** of the maximum divergence from the repository, against a null median of 30.9% over 999 resamples of the same size — an excess of +4.0 points, and 272 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/main/java`

**26.9%** of the maximum divergence from the repository, against a null median of 35.0% over 999 resamples of the same size — an excess of -8.1 points, and 883 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/java`

**37.5%** of the maximum divergence from the repository, against a null median of 42.9% over 999 resamples of the same size — an excess of -5.4 points, and 684 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java`

**26.9%** of the maximum divergence from the repository, against a null median of 21.0% over 999 resamples of the same size — an excess of +6.0 points, and 56 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/java`

**50.8%** of the maximum divergence from the repository, against a null median of 48.2% over 999 resamples of the same size — an excess of +2.6 points, and 427 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/main/java`

**27.2%** of the maximum divergence from the repository, against a null median of 35.1% over 999 resamples of the same size — an excess of -7.9 points, and 855 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/test/java`

**37.4%** of the maximum divergence from the repository, against a null median of 38.4% over 999 resamples of the same size — an excess of -1.0 points, and 544 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-httpclient-commons/src/main/java`

**47.1%** of the maximum divergence from the repository, against a null median of 42.4% over 999 resamples of the same size — an excess of +4.7 points, and 332 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-api/src/main/java`

**34.1%** of the maximum divergence from the repository, against a null median of 17.6% over 999 resamples of the same size — an excess of +16.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.2% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 8.4% | `biology` | 0.0740 | 0.0033 | **over** | `emit` 60.5% (984) `bos` 5.2% (67) `reporter` 3.8% (156) `model` 3.0% (866) |
| 7.9% | `electronics` | 0.0981 | 0.0126 | **over** | `emitter` 55.5% (694) `input` 10.7% (1,082) `ti` 10.7% (1,144) `default` 2.6% (1,980) |
| 5.8% | `hydraulics` | 0.0689 | 0.0080 | **over** | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 3.9% | `programming` | 0.1123 | 0.0390 | **over** | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.6% | `mathematics` | 0.0726 | 0.0185 | **over** | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 3.5% | `glassblowing` | 0.0263 | 0.0003 | **over** | `found` 96.6% (302) `step` 2.0% (99) `web` 1.1% (74) `way` 0.3% (133) |
| 3.1% | `software` | 0.0001 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |

### `tika-pipes/tika-pipes-config-store-ignite/src/main/java`

**35.5%** of the maximum divergence from the repository, against a null median of 35.1% over 999 resamples of the same size — an excess of +0.4 points, and 479 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-config-store-ignite/src/test/java`

**62.3%** of the maximum divergence from the repository, against a null median of 55.8% over 999 resamples of the same size — an excess of +6.5 points, and 435 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-core/src/main/java`

**16.2%** of the maximum divergence from the repository, against a null median of 8.5% over 999 resamples of the same size — an excess of +7.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.6% | `electronics` | 0.0649 | 0.0126 | **over** | `emitter` 55.5% (694) `input` 10.7% (1,082) `ti` 10.7% (1,144) `default` 2.6% (1,980) |
| 6.7% | `hydraulics` | 0.0466 | 0.0080 | **over** | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 6.4% | `computer-languages` | 0.0205 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 6.2% | `biology` | 0.0330 | 0.0033 | **over** | `emit` 60.5% (984) `bos` 5.2% (67) `reporter` 3.8% (156) `model` 3.0% (866) |
| 3.7% | `telecommunication` | 0.0482 | 0.0163 | **over** | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |
| 3.5% | `software` | 0.0031 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 3.0% | `publishing` | 0.0017 | 0.0161 | under | `table` 31.3% (899) `page` 18.3% (610) `text` 13.3% (2,273) `read` 8.7% (311) |
| 2.1% | `probability-theory` | 0.0000 | 0.0068 | under | `pdf` 99.9% (245) `outcome` 0.0% (14) `normal` 0.0% (75) `expected_value` 0.0% (1) |

### `tika-pipes/tika-pipes-core/src/test/java`

**19.7%** of the maximum divergence from the repository, against a null median of 21.6% over 999 resamples of the same size — an excess of -1.8 points, and 693 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/main/java`

**32.5%** of the maximum divergence from the repository, against a null median of 38.4% over 999 resamples of the same size — an excess of -5.9 points, and 762 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/test/java`

**43.3%** of the maximum divergence from the repository, against a null median of 55.4% over 999 resamples of the same size — an excess of -12.1 points, and 771 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-integration-tests/src/test/java`

**23.7%** of the maximum divergence from the repository, against a null median of 17.1% over 999 resamples of the same size — an excess of +6.6 points, and 29 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-iterator-commons/src/main/java`

**53.7%** of the maximum divergence from the repository, against a null median of 48.6% over 999 resamples of the same size — an excess of +5.1 points, and 348 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java`

**32.5%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of -0.4 points, and 524 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/java`

**55.4%** of the maximum divergence from the repository, against a null median of 56.6% over 999 resamples of the same size — an excess of -1.2 points, and 526 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/main/java`

**32.2%** of the maximum divergence from the repository, against a null median of 26.0% over 999 resamples of the same size — an excess of +6.2 points, and 124 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/java`

**39.7%** of the maximum divergence from the repository, against a null median of 38.8% over 999 resamples of the same size — an excess of +0.9 points, and 463 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/main/java`

**40.1%** of the maximum divergence from the repository, against a null median of 37.9% over 999 resamples of the same size — an excess of +2.2 points, and 405 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/java`

**33.5%** of the maximum divergence from the repository, against a null median of 48.0% over 999 resamples of the same size — an excess of -14.5 points, and 907 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/main/java`

**25.8%** of the maximum divergence from the repository, against a null median of 26.2% over 999 resamples of the same size — an excess of -0.5 points, and 535 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/java`

**38.9%** of the maximum divergence from the repository, against a null median of 48.3% over 999 resamples of the same size — an excess of -9.4 points, and 781 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/main/java`

**25.8%** of the maximum divergence from the repository, against a null median of 21.9% over 999 resamples of the same size — an excess of +3.9 points, and 163 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/java`

**29.6%** of the maximum divergence from the repository, against a null median of 30.6% over 999 resamples of the same size — an excess of -0.9 points, and 553 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/main/java`

**34.2%** of the maximum divergence from the repository, against a null median of 26.0% over 999 resamples of the same size — an excess of +8.2 points, and 82 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/java`

**32.3%** of the maximum divergence from the repository, against a null median of 38.3% over 999 resamples of the same size — an excess of -6.0 points, and 759 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/main/java`

**36.1%** of the maximum divergence from the repository, against a null median of 38.4% over 999 resamples of the same size — an excess of -2.2 points, and 595 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/java`

**53.7%** of the maximum divergence from the repository, against a null median of 56.3% over 999 resamples of the same size — an excess of -2.6 points, and 554 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/main/java`

**40.6%** of the maximum divergence from the repository, against a null median of 27.6% over 999 resamples of the same size — an excess of +13.0 points, and 27 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/java`

**37.4%** of the maximum divergence from the repository, against a null median of 38.6% over 999 resamples of the same size — an excess of -1.2 points, and 548 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/main/java`

**27.7%** of the maximum divergence from the repository, against a null median of 26.5% over 999 resamples of the same size — an excess of +1.2 points, and 401 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/java`

**28.0%** of the maximum divergence from the repository, against a null median of 38.4% over 999 resamples of the same size — an excess of -10.5 points, and 885 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/main/java`

**48.2%** of the maximum divergence from the repository, against a null median of 38.7% over 999 resamples of the same size — an excess of +9.5 points, and 174 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/java`

**37.7%** of the maximum divergence from the repository, against a null median of 48.3% over 999 resamples of the same size — an excess of -10.6 points, and 796 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/main/java`

**30.6%** of the maximum divergence from the repository, against a null median of 30.5% over 999 resamples of the same size — an excess of +0.1 points, and 492 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/java`

**40.0%** of the maximum divergence from the repository, against a null median of 48.7% over 999 resamples of the same size — an excess of -8.7 points, and 747 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/main/java`

**41.9%** of the maximum divergence from the repository, against a null median of 28.7% over 999 resamples of the same size — an excess of +13.2 points, and 35 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/java`

**39.8%** of the maximum divergence from the repository, against a null median of 48.0% over 999 resamples of the same size — an excess of -8.2 points, and 751 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/main/java`

**28.0%** of the maximum divergence from the repository, against a null median of 23.4% over 999 resamples of the same size — an excess of +4.7 points, and 142 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/java`

**44.4%** of the maximum divergence from the repository, against a null median of 47.6% over 999 resamples of the same size — an excess of -3.2 points, and 596 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/main/java`

**29.0%** of the maximum divergence from the repository, against a null median of 26.2% over 999 resamples of the same size — an excess of +2.8 points, and 310 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/java`

**33.9%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of -8.3 points, and 803 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/main/java`

**35.8%** of the maximum divergence from the repository, against a null median of 28.9% over 999 resamples of the same size — an excess of +6.9 points, and 161 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/java`

**31.8%** of the maximum divergence from the repository, against a null median of 42.2% over 999 resamples of the same size — an excess of -10.4 points, and 872 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-reporter-commons/src/main/java`

**56.7%** of the maximum divergence from the repository, against a null median of 57.3% over 999 resamples of the same size — an excess of -0.6 points, and 512 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-plugins-core/src/main/java`

**36.1%** of the maximum divergence from the repository, against a null median of 30.8% over 999 resamples of the same size — an excess of +5.3 points, and 219 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-plugins-core/src/test/java`

**33.2%** of the maximum divergence from the repository, against a null median of 41.6% over 999 resamples of the same size — an excess of -8.4 points, and 840 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/main/java`

**19.8%** of the maximum divergence from the repository, against a null median of 13.9% over 999 resamples of the same size — an excess of +5.9 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/test/java`

**15.8%** of the maximum divergence from the repository, against a null median of 13.5% over 999 resamples of the same size — an excess of +2.2 points, and 140 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-core/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 12.0% over 999 resamples of the same size — an excess of +12.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.1% | `networking` | 0.1162 | 0.0076 | **over** | `http` 33.8% (2,758) `resource` 30.8% (774) `request` 20.0% (862) `mime` 3.4% (621) |
| 11.6% | `computer-languages` | 0.0026 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 9.9% | `commerce` | 0.0752 | 0.0069 | **over** | `server` 68.8% (929) `packet` 9.4% (73) `package` 5.9% (236) `quote` 5.8% (68) |
| 6.2% | `literature` | 0.0778 | 0.0174 | **over** | `header` 41.9% (1,105) `writer` 16.1% (291) `text` 12.3% (2,273) `author` 11.0% (183) |
| 4.1% | `software` | 0.0003 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 3.1% | `sociology` | 0.0247 | 0.0026 | **over** | `status` 50.6% (356) `integration` 12.4% (71) `migration` 6.0% (78) `priority` 5.8% (36) |
| 2.6% | `telecommunication` | 0.0496 | 0.0163 | **over** | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |
| 1.8% | `computer-graphics` | 0.0000 | 0.0090 | under | `instance` 26.3% (593) `jpeg` 18.0% (61) `mpeg` 10.2% (48) `renderer` 9.6% (22) |

### `tika-server/tika-server-core/src/test/java`

**19.9%** of the maximum divergence from the repository, against a null median of 15.8% over 999 resamples of the same size — an excess of +4.1 points, and 50 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-standard/src/main/java`

**36.4%** of the maximum divergence from the repository, against a null median of 47.6% over 999 resamples of the same size — an excess of -11.3 points, and 831 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-standard/src/test/java`

**24.3%** of the maximum divergence from the repository, against a null median of 21.0% over 999 resamples of the same size — an excess of +3.3 points, and 198 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-translate/src/main/java`

**23.6%** of the maximum divergence from the repository, against a null median of 25.3% over 999 resamples of the same size — an excess of -1.7 points, and 643 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-translate/src/test/java`

**43.7%** of the maximum divergence from the repository, against a null median of 27.8% over 999 resamples of the same size — an excess of +15.9 points, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-xmp/src/main/java`

**30.0%** of the maximum divergence from the repository, against a null median of 26.3% over 999 resamples of the same size — an excess of +3.7 points, and 250 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-xmp/src/test/java`

**40.6%** of the maximum divergence from the repository, against a null median of 48.0% over 999 resamples of the same size — an excess of -7.3 points, and 731 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `documentation`

**13.2%** of the maximum divergence from the repository, against a null median of 7.1% over 999 resamples of the same size — an excess of +6.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 24.4% | `computer-languages` | 0.0008 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 13.2% | `law` | 0.1049 | 0.0275 | **over** | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 4.2% | `geography` | 0.0366 | 0.0104 | **over** | `stream` 21.6% (1,710) `apache` 8.3% (6,934) `state` 6.9% (282) `java` 3.8% (289) |
| 3.0% | `electronics` | 0.0351 | 0.0126 | **over** | `emitter` 55.5% (694) `input` 10.7% (1,082) `ti` 10.7% (1,144) `default` 2.6% (1,980) |
| 2.9% | `christianity` | 0.0124 | 0.0012 | **over** | `use` 62.1% (4,423) `kind` 4.8% (2,192) `secret` 4.8% (77) `element` 3.8% (1,058) |
| 2.6% | `probability-theory` | 0.0000 | 0.0068 | under | `pdf` 99.9% (245) `outcome` 0.0% (14) `normal` 0.0% (75) `expected_value` 0.0% (1) |
| 2.2% | `aviation` | 0.0021 | 0.0124 | under | `rtf` 41.8% (146) `max` 33.1% (1,148) `threshold` 4.8% (202) `fis` 2.5% (5) |
| 2.1% | `medicine` | 0.0055 | 0.0187 | under | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |

### `modules`

**30.4%** of the maximum divergence from the repository, against a null median of 12.6% over 999 resamples of the same size — an excess of +17.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.7% | `computer-languages` | 0.0007 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 10.1% | `electrotechnology` | 0.1043 | 0.0117 | **over** | `detector` 99.7% (1,268) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |
| 8.3% | `commerce` | 0.0782 | 0.0069 | **over** | `server` 68.8% (929) `packet` 9.4% (73) `package` 5.9% (236) `quote` 5.8% (68) |
| 6.7% | `hydraulics` | 0.0699 | 0.0080 | **over** | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 4.8% | `psychology` | 0.0403 | 0.0025 | **over** | `confidence` 40.3% (233) `module` 24.2% (172) `self` 7.7% (70) `matter` 6.0% (69) |
| 3.5% | `linguistics` | 0.0173 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 3.4% | `geography` | 0.0505 | 0.0104 | **over** | `stream` 21.6% (1,710) `apache` 8.3% (6,934) `state` 6.9% (282) `java` 3.8% (289) |
| 3.2% | `buildings` | 0.0475 | 0.0097 | **over** | `log` 21.7% (538) `window` 20.2% (386) `tear_down` 16.5% (48) `machine` 7.8% (48) |

### `tika-app/src/test/resources`

**27.5%** of the maximum divergence from the repository, against a null median of 15.4% over 999 resamples of the same size — an excess of +12.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.6% | `computer-languages` | 0.2100 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 4.8% | `law` | 0.0001 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 4.4% | `politics` | 0.0432 | 0.0053 | **over** | `pas` 35.9% (223) `country` 12.1% (47) `zip` 8.0% (728) `alignment` 3.0% (27) |
| 3.9% | `food` | 0.0238 | 0.0004 | **over** | `seed` 46.7% (44) `feed` 14.8% (5) `wait` 9.5% (101) `produce` 8.9% (6) |
| 3.4% | `information-science` | 0.0357 | 0.0050 | **over** | `document` 96.9% (1,808) `align` 1.7% (60) `controlled_vocabulary` 0.4% (14) `keyword` 0.3% (7) |
| 3.2% | `literature` | 0.0000 | 0.0174 | under | `header` 41.9% (1,105) `writer` 16.1% (291) `text` 12.3% (2,273) `author` 11.0% (183) |
| 3.0% | `computing-theory` | 0.0247 | 0.0020 | **over** | `type` 50.1% (3,578) `recursive` 17.2% (81) `fnv` 5.9% (16) `certificate` 4.3% (73) |
| 2.9% | `publishing` | 0.0000 | 0.0161 | under | `table` 31.3% (899) `page` 18.3% (610) `text` 13.3% (2,273) `read` 8.7% (311) |

### `tika-bundles/tika-bundle-standard/src/test/resources`

**73.6%** of the maximum divergence from the repository, against a null median of 38.7% over 999 resamples of the same size — an excess of +34.9 points, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.7% | `economy` | 0.2451 | 0.0080 | **over** | `property` 40.6% (1,163) `manager` 13.4% (316) `total` 8.8% (216) `mark_down` 7.5% (33) |
| 9.4% | `information-science` | 0.1667 | 0.0050 | **over** | `document` 96.9% (1,808) `align` 1.7% (60) `controlled_vocabulary` 0.4% (14) `keyword` 0.3% (7) |
| 7.6% | `computing` | 0.0441 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 4.7% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 4.4% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 4.1% | `politics` | 0.0833 | 0.0053 | **over** | `pas` 35.9% (223) `country` 12.1% (47) `zip` 8.0% (728) `alignment` 3.0% (27) |
| 3.5% | `surgery` | 0.0625 | 0.0021 | **over** | `ppt` 42.1% (58) `tha` 27.8% (1) `probe` 15.8% (376) `style` 10.6% (246) |
| 3.2% | `engineering` | 0.0625 | 0.0032 | **over** | `datum` 43.4% (1,985) `generator` 39.0% (43) `encoder` 6.3% (8) `ppt` 2.8% (58) |

### `tika-core/src/test/resources`

**37.6%** of the maximum divergence from the repository, against a null median of 10.6% over 999 resamples of the same size — an excess of +27.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.8% | `computer-languages` | 0.3521 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 6.0% | `computing` | 0.1005 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 4.6% | `law` | 0.1048 | 0.0275 | **over** | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 4.3% | `geometry` | 0.0453 | 0.0029 | **over** | `truncate` 34.6% (242) `tesseract` 19.1% (207) `rectangle` 6.5% (7) `point` 6.3% (176) |
| 4.0% | `quality` | 0.0575 | 0.0082 | **over** | `external` 9.0% (199) `available` 8.6% (58) `internal` 7.1% (57) `simple` 6.8% (187) |
| 3.5% | `linguistics` | 0.0135 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 3.0% | `programming` | 0.0045 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.5% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |

### `tika-detectors/tika-detector-magika/src/test/resources`

**56.5%** of the maximum divergence from the repository, against a null median of 38.0% over 999 resamples of the same size — an excess of +18.5 points, and 50 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/test/resources`

**55.9%** of the maximum divergence from the repository, against a null median of 35.5% over 999 resamples of the same size — an excess of +20.4 points, and 21 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-grpc/src/test/resources`

**44.4%** of the maximum divergence from the repository, against a null median of 29.4% over 999 resamples of the same size — an excess of +15.0 points, and 20 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/resources`

**47.6%** of the maximum divergence from the repository, against a null median of 38.7% over 999 resamples of the same size — an excess of +8.9 points, and 183 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/test/resources`

**43.1%** of the maximum divergence from the repository, against a null median of 10.4% over 999 resamples of the same size — an excess of +32.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.1% | `computer-languages` | 0.3270 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 7.6% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 5.5% | `law` | 0.1235 | 0.0275 | **over** | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 4.4% | `probability-theory` | 0.0635 | 0.0068 | **over** | `pdf` 99.9% (245) `outcome` 0.0% (14) `normal` 0.0% (75) `expected_value` 0.0% (1) |
| 4.0% | `quality` | 0.0630 | 0.0082 | **over** | `external` 9.0% (199) `available` 8.6% (58) `internal` 7.1% (57) `simple` 6.8% (187) |
| 2.6% | `computing` | 0.1371 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 2.6% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 2.1% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |

### `tika-eval/tika-eval-core/src/test/resources`

**38.9%** of the maximum divergence from the repository, against a null median of 5.9% over 999 resamples of the same size — an excess of +33.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.7% | `computing` | 0.0379 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 8.0% | `computer-languages` | 0.0012 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 2.9% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 2.7% | `sports` | 0.0404 | 0.0057 | **over** | `timeout` 29.3% (365) `min` 16.6% (279) `buf` 14.4% (112) `match` 3.8% (623) |
| 2.4% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 2.3% | `business` | 0.0324 | 0.0041 | **over** | `success` 16.2% (94) `arr` 15.4% (36) `workflow` 12.2% (37) `geo` 11.6% (41) |
| 2.2% | `units-of-measure` | 0.0208 | 0.0007 | **over** | `cor` 42.4% (1) `kor` 25.1% (8) `hin` 14.1% (6) `kab` 11.4% (2) |
| 2.2% | `programming` | 0.0074 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |

### `tika-example/src/test/resources`

**82.2%** of the maximum divergence from the repository, against a null median of 57.0% over 999 resamples of the same size — an excess of +25.2 points, and 180 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/test/resources`

**54.1%** of the maximum divergence from the repository, against a null median of 26.6% over 999 resamples of the same size — an excess of +27.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.0% | `electrochemistry` | 0.1195 | 0.0017 | **over** | `pem` 100.0% (17) `pile` 0.0% (2) |
| 9.2% | `pathology` | 0.1195 | 0.0036 | **over** | `tsd` 36.4% (32) `failure` 19.1% (201) `pem` 10.7% (17) `fld` 9.4% (5) |
| 6.2% | `law` | 0.1505 | 0.0275 | **over** | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 6.0% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 3.7% | `computer-languages` | 0.1876 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 3.6% | `programming` | 0.0000 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.1% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 2.0% | `computing` | 0.1382 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |

### `tika-integration-tests/tika-pipes-es-integration-tests/src/test/resources`

**58.1%** of the maximum divergence from the repository, against a null median of 27.7% over 999 resamples of the same size — an excess of +30.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.2% | `computer-languages` | 0.4342 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 10.6% | `computing` | 0.0374 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 7.3% | `drawing` | 0.0890 | 0.0006 | **over** | `map` 54.5% (16) `mapping` 39.3% (108) `copy` 4.4% (10) `design` 1.2% (4) |
| 5.6% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 5.4% | `computing-theory` | 0.0741 | 0.0020 | **over** | `type` 50.1% (3,578) `recursive` 17.2% (81) `fnv` 5.9% (16) `certificate` 4.3% (73) |
| 2.2% | `person` | 0.0585 | 0.0108 | **over** | `reader` 39.5% (381) `child` 11.3% (346) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 2.0% | `physics` | 0.0387 | 0.0041 | **over** | `length` 55.7% (1,253) `weight` 12.3% (138) `free_space` 9.4% (26) `sql` 1.8% (36) |
| 1.9% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |

### `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/resources`

**65.4%** of the maximum divergence from the repository, against a null median of 42.6% over 999 resamples of the same size — an excess of +22.8 points, and 51 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/resources`

**55.8%** of the maximum divergence from the repository, against a null median of 27.9% over 999 resamples of the same size — an excess of +27.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.5% | `computer-languages` | 0.4847 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 7.2% | `computing` | 0.0649 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 5.8% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 5.6% | `computing-theory` | 0.0741 | 0.0020 | **over** | `type` 50.1% (3,578) `recursive` 17.2% (81) `fnv` 5.9% (16) `certificate` 4.3% (73) |
| 5.6% | `drawing` | 0.0667 | 0.0006 | **over** | `map` 54.5% (16) `mapping` 39.3% (108) `copy` 4.4% (10) `design` 1.2% (4) |
| 2.5% | `person` | 0.0612 | 0.0108 | **over** | `reader` 39.5% (381) `child` 11.3% (346) `mapper` 9.5% (309) `logger` 6.9% (45) |
| 2.0% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 1.9% | `software` | 0.0000 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |

### `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/resources`

**59.9%** of the maximum divergence from the repository, against a null median of 35.2% over 999 resamples of the same size — an excess of +24.7 points, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.1% | `computer-languages` | 0.4864 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 15.4% | `printing` | 0.2000 | 0.0023 | **over** | `type` 37.0% (3,578) `ret` 35.5% (32) `text` 5.2% (2,273) `offset` 4.5% (446) |
| 5.4% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 3.3% | `programming` | 0.0000 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.5% | `gastronomy` | 0.0430 | 0.0029 | **over** | `fork` 20.2% (335) `hash` 18.5% (213) `digest` 12.1% (115) `consume` 10.1% (85) |
| 2.3% | `weaving` | 0.0333 | 0.0011 | **over** | `template` 70.6% (115) `thread` 15.7% (405) `end` 12.0% (788) `fill` 0.9% (65) |
| 2.0% | `computing` | 0.1334 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 1.9% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |

### `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/resources`

**49.0%** of the maximum divergence from the repository, against a null median of 31.2% over 999 resamples of the same size — an excess of +17.7 points, and 16 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/test/resources`

**50.0%** of the maximum divergence from the repository, against a null median of 50.0% over 999 resamples of the same size — an excess of +0.0 points, and 999 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/test/resources`

**57.3%** of the maximum divergence from the repository, against a null median of 57.0% over 999 resamples of the same size — an excess of +0.3 points, and 497 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/test/resources`

**51.3%** of the maximum divergence from the repository, against a null median of 42.8% over 999 resamples of the same size — an excess of +8.5 points, and 242 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/test/resources`

**54.1%** of the maximum divergence from the repository, against a null median of 47.2% over 999 resamples of the same size — an excess of +7.0 points, and 337 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/resources`

**44.5%** of the maximum divergence from the repository, against a null median of 29.0% over 999 resamples of the same size — an excess of +15.5 points, and 19 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/resources`

**44.1%** of the maximum divergence from the repository, against a null median of 21.4% over 999 resamples of the same size — an excess of +22.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.9% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 7.4% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 5.5% | `psychological_features` | 0.0666 | 0.0040 | **over** | `attachment` 40.9% (190) `reserve` 24.4% (46) `patience` 8.7% (4) `catch` 5.5% (121) |
| 5.3% | `astronomy` | 0.0681 | 0.0050 | **over** | `latitude` 11.5% (24) `alt` 10.9% (73) `longitude` 9.3% (23) `vlm` 8.0% (24) |
| 4.5% | `photography` | 0.0465 | 0.0012 | **over** | `filter` 51.9% (627) `exposure_time` 9.1% (2) `hdr` 8.2% (9) `process` 4.3% (1,022) |
| 4.3% | `programming` | 0.0001 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.9% | `computing` | 0.4229 | 0.2456 | **over** | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 3.1% | `economy` | 0.0531 | 0.0080 | **over** | `property` 40.6% (1,163) `manager` 13.4% (316) `total` 8.8% (216) `mark_down` 7.5% (33) |

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/resources`

**60.0%** of the maximum divergence from the repository, against a null median of 38.4% over 999 resamples of the same size — an excess of +21.6 points, and 31 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/resources`

**50.0%** of the maximum divergence from the repository, against a null median of 50.0% over 999 resamples of the same size — an excess of +0.0 points, and 999 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/resources`

**49.3%** of the maximum divergence from the repository, against a null median of 42.4% over 999 resamples of the same size — an excess of +6.8 points, and 258 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/resources`

**46.1%** of the maximum divergence from the repository, against a null median of 29.3% over 999 resamples of the same size — an excess of +16.8 points, and 12 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/resources`

**65.3%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of +23.0 points, and 66 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/resources`

**62.7%** of the maximum divergence from the repository, against a null median of 27.5% over 999 resamples of the same size — an excess of +35.2 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.8% | `business` | 0.2234 | 0.0041 | **over** | `success` 16.2% (94) `arr` 15.4% (36) `workflow` 12.2% (37) `geo` 11.6% (41) |
| 14.9% | `birdwatching` | 0.1944 | 0.0010 | **over** | `have` 99.2% (1,600) `gen` 0.5% (4) `scope` 0.2% (49) `red` 0.1% (11) |
| 8.6% | `school` | 0.1111 | 0.0003 | **over** | `school` 45.9% (1) `crichton` 25.5% (1) `mach` 13.7% (21) `quine` 8.8% (7) |
| 4.1% | `linguistics` | 0.0028 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 3.6% | `computing` | 0.1011 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 3.5% | `printing` | 0.0556 | 0.0023 | **over** | `type` 37.0% (3,578) `ret` 35.5% (32) `text` 5.2% (2,273) `offset` 4.5% (446) |
| 3.1% | `programming` | 0.0000 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.7% | `sports` | 0.0556 | 0.0057 | **over** | `timeout` 29.3% (365) `min` 16.6% (279) `buf` 14.4% (112) `match` 3.8% (623) |

### `tika-parsers/tika-parsers-ml/tika-vlm/src/test/resources`

**72.8%** of the maximum divergence from the repository, against a null median of 31.3% over 999 resamples of the same size — an excess of +41.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 26.2% | `astronomy` | 0.4162 | 0.0050 | **over** | `latitude` 11.5% (24) `alt` 10.9% (73) `longitude` 9.3% (23) `vlm` 8.0% (24) |
| 15.4% | `computing` | 0.0032 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 11.9% | `computer-languages` | 0.3841 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 2.7% | `programming` | 0.0000 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 2.4% | `linguistics` | 0.0089 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 1.9% | `law` | 0.0000 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 1.3% | `medicine` | 0.0000 | 0.0187 | under | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |
| 1.3% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/resources`

**15.3%** of the maximum divergence from the repository, against a null median of 3.6% over 999 resamples of the same size — an excess of +11.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.0% | `computer-languages` | 0.1692 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 4.4% | `linguistics` | 0.0250 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 3.7% | `computer_science` | 0.0034 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 3.6% | `publishing` | 0.0012 | 0.0161 | under | `table` 31.3% (899) `page` 18.3% (610) `text` 13.3% (2,273) `read` 8.7% (311) |
| 3.1% | `gastronomy` | 0.0190 | 0.0029 | **over** | `fork` 20.2% (335) `hash` 18.5% (213) `digest` 12.1% (115) `consume` 10.1% (85) |
| 3.0% | `aerospace` | 0.0127 | 0.0008 | **over** | `bdb` 99.6% (8) `metric` 0.4% (15) `mag` 0.1% (2) `burn` 0.0% (3) |
| 2.6% | `hydraulics` | 0.0000 | 0.0080 | under | `pipe` 99.9% (1,259) `module` 0.1% (172) `accumulator` 0.0% (9) |
| 2.6% | `person` | 0.0006 | 0.0108 | under | `reader` 39.5% (381) `child` 11.3% (346) `mapper` 9.5% (309) `logger` 6.9% (45) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/resources`

**55.1%** of the maximum divergence from the repository, against a null median of 16.4% over 999 resamples of the same size — an excess of +38.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.0% | `publishing` | 0.3195 | 0.0161 | **over** | `table` 31.3% (899) `page` 18.3% (610) `text` 13.3% (2,273) `read` 8.7% (311) |
| 18.5% | `computing` | 0.0076 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 6.3% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 2.9% | `literature` | 0.0815 | 0.0174 | **over** | `header` 41.9% (1,105) `writer` 16.1% (291) `text` 12.3% (2,273) `author` 11.0% (183) |
| 2.9% | `grammar` | 0.0561 | 0.0066 | **over** | `num` 59.6% (471) `clause` 7.8% (33) `modify` 5.3% (129) `number` 5.0% (779) |
| 2.1% | `town_planning` | 0.0291 | 0.0011 | **over** | `store` 39.8% (502) `current` 18.6% (74) `archive` 15.1% (95) `tenant` 8.5% (19) |
| 2.0% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 1.8% | `metrology` | 0.0394 | 0.0063 | **over** | `array` 28.9% (830) `entropy` 13.1% (96) `rate` 7.3% (148) `measurement` 5.6% (13) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/resources`

**67.7%** of the maximum divergence from the repository, against a null median of 18.2% over 999 resamples of the same size — an excess of +49.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.5% | `art` | 0.2073 | 0.0038 | **over** | `flag` 45.0% (325) `artist` 18.3% (29) `write` 8.4% (956) `art` 5.4% (34) |
| 9.3% | `computing` | 0.0362 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 6.9% | `film` | 0.1020 | 0.0013 | **over** | `int` 20.4% (83) `fps` 18.1% (36) `two` 16.3% (323) `process` 7.6% (1,022) |
| 6.0% | `rail-transport` | 0.1020 | 0.0041 | **over** | `pre` 22.5% (30) `exc` 21.3% (16) `helper` 14.2% (127) `uni` 7.6% (56) |
| 5.8% | `geometry` | 0.0941 | 0.0029 | **over** | `truncate` 34.6% (242) `tesseract` 19.1% (207) `rectangle` 6.5% (7) `point` 6.3% (176) |
| 5.2% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 3.3% | `media` | 0.0476 | 0.0004 | **over** | `drm` 75.6% (10) `photoshop` 12.4% (4) `produce` 5.4% (268) `angle` 5.1% (29) |
| 2.9% | `programming` | 0.0000 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/resources`

**49.6%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of +17.1 points, and 27 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/resources`

**40.5%** of the maximum divergence from the repository, against a null median of 15.8% over 999 resamples of the same size — an excess of +24.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.7% | `military` | 0.1484 | 0.0106 | **over** | `column` 10.5% (275) `predict` 9.3% (124) `password` 6.9% (197) `base` 5.8% (882) |
| 8.1% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 4.9% | `fashion` | 0.0485 | 0.0017 | **over** | `cap` 33.4% (244) `mac` 24.8% (113) `mask` 16.9% (57) `sax` 5.3% (243) |
| 4.6% | `computer_science` | 0.0992 | 0.0225 | **over** | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 4.6% | `programming` | 0.0003 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.0% | `athletics` | 0.0257 | 0.0002 | **over** | `mat` 38.9% (14) `put` 38.8% (132) `check_mark` 20.1% (2) `anchor` 1.9% (77) |
| 2.9% | `video-games` | 0.0426 | 0.0054 | **over** | `stats` 24.7% (45) `meta` 14.6% (185) `item` 11.4% (329) `oom` 4.9% (50) |
| 2.3% | `medicine` | 0.0000 | 0.0187 | under | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/resources`

**43.8%** of the maximum divergence from the repository, against a null median of 14.3% over 999 resamples of the same size — an excess of +29.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.7% | `pathology` | 0.2038 | 0.0036 | **over** | `tsd` 36.4% (32) `failure` 19.1% (201) `pem` 10.7% (17) `fld` 9.4% (5) |
| 7.4% | `electrochemistry` | 0.0742 | 0.0017 | **over** | `pem` 100.0% (17) `pile` 0.0% (2) |
| 4.8% | `broadcasting` | 0.0476 | 0.0010 | **over** | `seg` 18.8% (16) `gram` 17.8% (140) `def` 14.3% (14) `emission` 12.5% (32) |
| 4.4% | `programming` | 0.0000 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.6% | `automotive` | 0.0476 | 0.0038 | **over** | `auto` 29.6% (271) `constructor` 15.5% (210) `xl` 10.8% (63) `oversize` 6.2% (3) |
| 3.3% | `linguistics` | 0.0120 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.7% | `socialism` | 0.0264 | 0.0005 | **over** | `aes` 78.4% (5) `dsa` 21.6% (4) |
| 2.6% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/resources`

**90.5%** of the maximum divergence from the repository, against a null median of 47.6% over 999 resamples of the same size — an excess of +42.8 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/resources`

**41.1%** of the maximum divergence from the repository, against a null median of 17.7% over 999 resamples of the same size — an excess of +23.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.1% | `technical` | 0.0727 | 0.0009 | **over** | `node` 37.7% (606) `noisy` 36.4% (10) `language` 25.1% (3,157) `minimal` 0.4% (4) |
| 4.9% | `journalism` | 0.0557 | 0.0035 | **over** | `embed` 81.6% (1,667) `guj` 5.3% (1) `bom` 3.8% (28) `wire` 2.7% (79) |
| 4.6% | `quality` | 0.0668 | 0.0082 | **over** | `external` 9.0% (199) `available` 8.6% (58) `internal` 7.1% (57) `simple` 6.8% (187) |
| 4.3% | `anatomy` | 0.0556 | 0.0051 | **over** | `body` 40.9% (474) `socket` 17.0% (151) `iter` 7.8% (11) `colon` 5.6% (25) |
| 3.5% | `business` | 0.0448 | 0.0041 | **over** | `success` 16.2% (94) `arr` 15.4% (36) `workflow` 12.2% (37) `geo` 11.6% (41) |
| 3.0% | `linguistics` | 0.0146 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.8% | `computer-languages` | 0.0183 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 2.7% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/resources`

**50.2%** of the maximum divergence from the repository, against a null median of 16.4% over 999 resamples of the same size — an excess of +33.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 34.7% | `computer-graphics` | 0.4015 | 0.0090 | **over** | `instance` 26.3% (593) `jpeg` 18.0% (61) `mpeg` 10.2% (48) `renderer` 9.6% (22) |
| 6.0% | `business` | 0.0800 | 0.0041 | **over** | `success` 16.2% (94) `arr` 15.4% (36) `workflow` 12.2% (37) `geo` 11.6% (41) |
| 3.3% | `information-theory` | 0.0350 | 0.0003 | **over** | `bit` 37.0% (421) `decodable` 33.5% (1) `entropy` 16.3% (96) `lossless` 11.3% (1) |
| 2.6% | `computing` | 0.1297 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 2.2% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 2.1% | `computer-languages` | 0.0200 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 2.1% | `law` | 0.0013 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 1.8% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/resources`

**38.7%** of the maximum divergence from the repository, against a null median of 16.4% over 999 resamples of the same size — an excess of +22.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.4% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 5.4% | `music` | 0.0677 | 0.0067 | **over** | `ti` 18.9% (1,144) `album` 7.3% (30) `composer` 4.8% (11) `label` 4.6% (374) |
| 4.5% | `commerce` | 0.0600 | 0.0069 | **over** | `server` 68.8% (929) `packet` 9.4% (73) `package` 5.9% (236) `quote` 5.8% (68) |
| 4.3% | `quality` | 0.0620 | 0.0082 | **over** | `external` 9.0% (199) `available` 8.6% (58) `internal` 7.1% (57) `simple` 6.8% (187) |
| 4.2% | `computer-languages` | 0.0120 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 4.1% | `electricity` | 0.0398 | 0.0016 | **over** | `current` 43.6% (404) `arc` 20.5% (14) `power_point` 19.0% (27) `emf` 9.1% (29) |
| 3.5% | `law` | 0.0000 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 3.2% | `business` | 0.0408 | 0.0041 | **over** | `success` 16.2% (94) `arr` 15.4% (36) `workflow` 12.2% (37) `geo` 11.6% (41) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/resources`

**23.0%** of the maximum divergence from the repository, against a null median of 2.6% over 999 resamples of the same size — an excess of +20.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.4% | `computing` | 0.0920 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 9.6% | `aviation` | 0.0856 | 0.0124 | **over** | `rtf` 41.8% (146) `max` 33.1% (1,148) `threshold` 4.8% (202) `fis` 2.5% (5) |
| 8.5% | `software` | 0.0996 | 0.0216 | **over** | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 3.4% | `computer-languages` | 0.0255 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 2.9% | `linguistics` | 0.1239 | 0.0652 | **over** | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.6% | `manufacturing` | 0.0233 | 0.0034 | **over** | `datum` 80.7% (1,985) `ppt` 5.4% (58) `scale` 3.7% (88) `bom` 2.8% (28) |
| 2.6% | `number` | 0.0266 | 0.0049 | **over** | `value` 34.3% (1,954) `one` 12.9% (104) `digit` 12.6% (88) `nothing` 10.0% (146) |
| 2.5% | `electrotechnology` | 0.0000 | 0.0117 | under | `detector` 99.7% (1,268) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/resources`

**31.7%** of the maximum divergence from the repository, against a null median of 10.7% over 999 resamples of the same size — an excess of +20.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 5.5% | `healthcare` | 0.0387 | 0.0005 | **over** | `odt` 62.2% (28) `code` 22.2% (474) `cmt` 8.1% (1) `sep` 7.3% (5) |
| 5.5% | `technology` | 0.0387 | 0.0006 | **over** | `calibration` 73.0% (100) `odt` 9.9% (28) `total_loss` 9.2% (4) `silent` 2.5% (5) |
| 5.3% | `software` | 0.0911 | 0.0216 | **over** | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 5.2% | `pharmacology` | 0.0387 | 0.0010 | **over** | `ti` 82.1% (1,144) `api` 5.8% (67) `it` 5.0% (581) `po` 2.4% (49) |
| 5.0% | `buildings` | 0.0635 | 0.0097 | **over** | `log` 21.7% (538) `window` 20.2% (386) `tear_down` 16.5% (48) `machine` 7.8% (48) |
| 3.2% | `publishing` | 0.0608 | 0.0161 | **over** | `table` 31.3% (899) `page` 18.3% (610) `text` 13.3% (2,273) `read` 8.7% (311) |
| 3.0% | `computer_science` | 0.0704 | 0.0225 | **over** | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 2.9% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/resources`

**85.6%** of the maximum divergence from the repository, against a null median of 42.1% over 999 resamples of the same size — an excess of +43.5 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `computing` | 0.0000 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 8.0% | `physics` | 0.1601 | 0.0041 | **over** | `length` 55.7% (1,253) `weight` 12.3% (138) `free_space` 9.4% (26) `sql` 1.8% (36) |
| 7.5% | `astronautics` | 0.1333 | 0.0006 | **over** | `det` 43.4% (63) `slv` 22.5% (1) `probe` 14.6% (376) `prop` 6.2% (150) |
| 7.0% | `statistics` | 0.1333 | 0.0020 | **over** | `sigma` 18.6% (50) `doe` 10.0% (354) `class` 7.1% (1,570) `histogram` 7.0% (23) |
| 6.5% | `nautical` | 0.1333 | 0.0040 | **over** | `datum` 27.3% (1,985) `src` 25.6% (58) `att` 4.8% (82) `port` 4.0% (127) |
| 6.2% | `chemistry` | 0.1601 | 0.0132 | **over** | `buffer` 16.0% (432) `builder` 15.3% (189) `type` 14.1% (3,578) `char` 10.0% (604) |
| 5.2% | `military` | 0.1333 | 0.0106 | **over** | `column` 10.5% (275) `predict` 9.3% (124) `password` 6.9% (197) `base` 5.8% (882) |
| 4.1% | `medicine` | 0.1333 | 0.0187 | **over** | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/resources`

**45.8%** of the maximum divergence from the repository, against a null median of 23.4% over 999 resamples of the same size — an excess of +22.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.0% | `science-fiction` | 0.0822 | 0.0014 | **over** | `entity` 46.4% (299) `tesseract` 36.0% (207) `inner` 5.4% (49) `cred` 4.0% (17) |
| 5.0% | `computer-languages` | 0.1970 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 4.4% | `linguistics` | 0.0064 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 3.9% | `construction` | 0.0396 | 0.0006 | **over** | `fallback` 72.1% (147) `ocr` 16.0% (224) `render` 4.8% (132) `stp` 2.1% (20) |
| 3.9% | `programming` | 0.0005 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.5% | `religion` | 0.0396 | 0.0014 | **over** | `magic` 29.9% (209) `adam` 23.0% (36) `prior` 9.8% (10) `connection` 6.2% (274) |
| 3.1% | `education` | 0.0396 | 0.0026 | **over** | `candidate` 17.4% (203) `ref` 16.3% (192) `version` 9.6% (3,006) `class` 9.6% (1,571) |
| 3.0% | `law` | 0.0000 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/resources`

**41.4%** of the maximum divergence from the repository, against a null median of 9.1% over 999 resamples of the same size — an excess of +32.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.3% | `probability-theory` | 0.2218 | 0.0068 | **over** | `pdf` 99.9% (245) `outcome` 0.0% (14) `normal` 0.0% (75) `expected_value` 0.0% (1) |
| 17.6% | `software` | 0.2302 | 0.0216 | **over** | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 5.1% | `computing` | 0.1044 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 4.9% | `linguistics` | 0.0065 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.0% | `web-design` | 0.0197 | 0.0006 | **over** | `inline` 54.9% (89) `div` 30.2% (13) `accessibility` 13.8% (15) `xyz` 0.6% (2) |
| 2.0% | `telecommunication` | 0.0000 | 0.0163 | under | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |
| 1.9% | `medicine` | 0.0005 | 0.0187 | under | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |
| 1.8% | `chemistry` | 0.0479 | 0.0132 | **over** | `buffer` 16.0% (432) `builder` 15.3% (189) `type` 14.1% (3,578) `char` 10.0% (604) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/resources`

**43.7%** of the maximum divergence from the repository, against a null median of 11.7% over 999 resamples of the same size — an excess of +31.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 24.6% | `information-science` | 0.2455 | 0.0050 | **over** | `document` 96.9% (1,808) `align` 1.7% (60) `controlled_vocabulary` 0.4% (14) `keyword` 0.3% (7) |
| 7.5% | `politics` | 0.0898 | 0.0053 | **over** | `pas` 35.9% (223) `country` 12.1% (47) `zip` 8.0% (728) `alignment` 3.0% (27) |
| 4.0% | `computer-languages` | 0.0108 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 3.5% | `linguistics` | 0.0111 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 3.2% | `law` | 0.0000 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 2.6% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 2.5% | `software` | 0.0000 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 2.3% | `cryptography` | 0.0367 | 0.0047 | **over** | `encrypt` 22.1% (110) `password` 15.4% (196) `private_key` 13.3% (28) `md5` 12.4% (22) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/resources`

**37.0%** of the maximum divergence from the repository, against a null median of 22.1% over 999 resamples of the same size — an excess of +14.8 points, and 5 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/resources`

**70.6%** of the maximum divergence from the repository, against a null median of 32.6% over 999 resamples of the same size — an excess of +38.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.5% | `electricity` | 0.3315 | 0.0016 | **over** | `current` 43.6% (404) `arc` 20.5% (14) `power_point` 19.0% (27) `emf` 9.1% (29) |
| 10.0% | `finance` | 0.1667 | 0.0043 | **over** | `writer` 27.9% (291) `quant` 6.1% (20) `default` 5.6% (1,980) `note` 5.6% (425) |
| 9.2% | `networking` | 0.1667 | 0.0076 | **over** | `http` 33.8% (2,758) `resource` 30.8% (774) `request` 20.0% (862) `mime` 3.4% (621) |
| 7.0% | `mathematics` | 0.1667 | 0.0185 | **over** | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 4.9% | `computer-languages` | 0.0000 | 0.0699 | under | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 4.6% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.7% | `programming` | 0.0002 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 1.9% | `law` | 0.0000 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/resources`

**81.4%** of the maximum divergence from the repository, against a null median of 38.6% over 999 resamples of the same size — an excess of +42.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 42.9% | `computer-languages` | 1.0000 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 15.1% | `computing` | 0.0000 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 4.0% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.4% | `programming` | 0.0000 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 1.7% | `law` | 0.0000 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 1.4% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 1.3% | `software` | 0.0000 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 1.2% | `medicine` | 0.0000 | 0.0187 | under | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/resources`

**61.7%** of the maximum divergence from the repository, against a null median of 37.6% over 999 resamples of the same size — an excess of +24.1 points, and 23 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/resources`

**50.0%** of the maximum divergence from the repository, against a null median of 50.0% over 999 resamples of the same size — an excess of +0.0 points, and 999 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/test/resources`

**44.9%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of +12.0 points, and 63 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-core/src/test/resources`

**53.7%** of the maximum divergence from the repository, against a null median of 31.0% over 999 resamples of the same size — an excess of +22.7 points, and 5 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-integration-tests/src/test/resources`

**34.0%** of the maximum divergence from the repository, against a null median of 18.1% over 999 resamples of the same size — an excess of +15.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.0% | `computer-languages` | 0.3442 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 9.6% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 5.2% | `quality` | 0.0639 | 0.0082 | **over** | `external` 9.0% (199) `available` 8.6% (58) `internal` 7.1% (57) `simple` 6.8% (187) |
| 4.9% | `programming` | 0.0010 | 0.0390 | under | `handler` 42.2% (1,992) `factory` 4.6% (538) `tmp` 2.8% (328) `context` 2.4% (2,286) |
| 3.4% | `software` | 0.0764 | 0.0216 | **over** | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 3.3% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 2.7% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 2.4% | `telecommunication` | 0.0000 | 0.0163 | under | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/resources`

**81.4%** of the maximum divergence from the repository, against a null median of 56.9% over 999 resamples of the same size — an excess of +24.4 points, and 217 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/resources`

**63.4%** of the maximum divergence from the repository, against a null median of 38.4% over 999 resamples of the same size — an excess of +25.0 points, and 15 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/resources`

**45.0%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of +2.7 points, and 400 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/resources`

**64.2%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of +21.5 points, and 66 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/resources`

**49.3%** of the maximum divergence from the repository, against a null median of 42.4% over 999 resamples of the same size — an excess of +6.9 points, and 275 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/resources`

**62.9%** of the maximum divergence from the repository, against a null median of 35.7% over 999 resamples of the same size — an excess of +27.3 points, and 6 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/resources`

**67.4%** of the maximum divergence from the repository, against a null median of 58.1% over 999 resamples of the same size — an excess of +9.3 points, and 399 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/resources`

**62.8%** of the maximum divergence from the repository, against a null median of 48.2% over 999 resamples of the same size — an excess of +14.5 points, and 171 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/resources`

**66.6%** of the maximum divergence from the repository, against a null median of 35.5% over 999 resamples of the same size — an excess of +31.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.9% | `databases` | 0.2834 | 0.0025 | **over** | `entity` 18.7% (299) `jdbc` 15.6% (42) `bookmark` 8.6% (27) `select` 6.9% (87) |
| 18.8% | `computer-languages` | 0.4834 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 12.3% | `computing` | 0.0200 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 4.9% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.2% | `electronics` | 0.0667 | 0.0126 | **over** | `emitter` 55.5% (694) `input` 10.7% (1,082) `ti` 10.7% (1,144) `default` 2.6% (1,980) |
| 1.7% | `computer_science` | 0.0000 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |
| 1.6% | `software` | 0.0000 | 0.0216 | under | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 1.4% | `medicine` | 0.0000 | 0.0187 | under | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/resources`

**58.5%** of the maximum divergence from the repository, against a null median of 42.0% over 999 resamples of the same size — an excess of +16.5 points, and 109 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/resources`

**64.5%** of the maximum divergence from the repository, against a null median of 38.3% over 999 resamples of the same size — an excess of +26.2 points, and 17 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/resources`

**77.4%** of the maximum divergence from the repository, against a null median of 47.3% over 999 resamples of the same size — an excess of +30.1 points, and 48 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/resources`

**63.0%** of the maximum divergence from the repository, against a null median of 42.8% over 999 resamples of the same size — an excess of +20.2 points, and 63 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/resources`

**64.2%** of the maximum divergence from the repository, against a null median of 38.8% over 999 resamples of the same size — an excess of +25.4 points, and 13 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/resources`

**65.9%** of the maximum divergence from the repository, against a null median of 35.2% over 999 resamples of the same size — an excess of +30.6 points, and 4 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/test/resources`

**37.2%** of the maximum divergence from the repository, against a null median of 11.4% over 999 resamples of the same size — an excess of +25.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 39.2% | `computer-languages` | 0.5341 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 3.6% | `linguistics` | 0.0136 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.5% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 2.3% | `quality` | 0.0406 | 0.0082 | **over** | `external` 9.0% (199) `available` 8.6% (58) `internal` 7.1% (57) `simple` 6.8% (187) |
| 2.2% | `telecommunication` | 0.0000 | 0.0163 | under | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |
| 2.1% | `computing` | 0.1533 | 0.2456 | under | `metadata` 24.7% (4,371) `config` 6.2% (1,484) `parser` 6.0% (2,892) `byte` 3.4% (3,174) |
| 1.7% | `aviation` | 0.0000 | 0.0124 | under | `rtf` 41.8% (146) `max` 33.1% (1,148) `threshold` 4.8% (202) `fis` 2.5% (5) |
| 1.6% | `electrotechnology` | 0.0000 | 0.0117 | under | `detector` 99.7% (1,268) `wire` 0.2% (3) `wiring` 0.0% (12) `soar` 0.0% (1) |

### `tika-server/tika-server-core/src/test/resources`

**35.6%** of the maximum divergence from the repository, against a null median of 11.4% over 999 resamples of the same size — an excess of +24.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.4% | `computer-languages` | 0.3468 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 11.9% | `commerce` | 0.1160 | 0.0069 | **over** | `server` 68.8% (929) `packet` 9.4% (73) `package` 5.9% (236) `quote` 5.8% (68) |
| 8.2% | `linguistics` | 0.0011 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 2.6% | `mathematics` | 0.0000 | 0.0185 | under | `count` 20.1% (923) `value` 9.1% (1,975) `from` 6.3% (247) `rel` 5.8% (66) |
| 2.5% | `literature` | 0.0000 | 0.0174 | under | `header` 41.9% (1,105) `writer` 16.1% (291) `text` 12.3% (2,273) `author` 11.0% (183) |
| 2.3% | `telecommunication` | 0.0000 | 0.0163 | under | `file` 40.7% (3,339) `entry` 19.7% (840) `medium` 7.7% (449) `message` 3.8% (315) |
| 2.3% | `publishing` | 0.0000 | 0.0161 | under | `table` 31.3% (899) `page` 18.3% (610) `text` 13.3% (2,273) `read` 8.7% (311) |
| 1.8% | `computer_science` | 0.0027 | 0.0225 | under | `parser` 22.7% (2,892) `byte` 19.0% (3,174) `url` 11.6% (505) `format` 9.6% (690) |

### `tika-server/tika-server-standard/src/test/resources`

**35.0%** of the maximum divergence from the repository, against a null median of 16.2% over 999 resamples of the same size — an excess of +18.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `linguistics` | 0.0000 | 0.0652 | under | `name` 31.4% (4,005) `context` 18.4% (2,286) `prefix` 6.1% (660) `parse` 6.1% (3,081) |
| 6.2% | `probability-theory` | 0.0694 | 0.0068 | **over** | `pdf` 99.9% (245) `outcome` 0.0% (14) `normal` 0.0% (75) `expected_value` 0.0% (1) |
| 4.9% | `computer-languages` | 0.1757 | 0.0699 | **over** | `json` 57.4% (932) `xml` 41.4% (501) `sql` 0.5% (36) `java` 0.3% (289) |
| 4.8% | `medicine` | 0.0860 | 0.0187 | **over** | `uri` 39.8% (303) `type` 11.7% (3,578) `doc` 6.1% (540) `start` 5.4% (1,276) |
| 4.8% | `meteorology` | 0.0381 | 0.0008 | **over** | `low` 19.5% (87) `day` 16.3% (34) `same` 9.9% (564) `col` 9.8% (69) |
| 3.9% | `law` | 0.0000 | 0.0275 | under | `file` 19.1% (10,552) `client` 12.4% (819) `note` 2.5% (425) `default` 2.4% (1,980) |
| 2.7% | `software` | 0.0694 | 0.0216 | **over** | `excel` 22.8% (151) `pdf` 16.5% (245) `shift_jis` 8.4% (62) `factory_class` 7.0% (20) |
| 2.5% | `computing-theory` | 0.0256 | 0.0020 | **over** | `type` 50.1% (3,578) `recursive` 17.2% (81) `fnv` 5.9% (16) `certificate` 4.3% (73) |

### `tika-translate/src/test/resources`

**82.2%** of the maximum divergence from the repository, against a null median of 56.9% over 999 resamples of the same size — an excess of +25.2 points, and 162 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

Read, compared and resampled in 78.0 s, recorded rather than estimated.
