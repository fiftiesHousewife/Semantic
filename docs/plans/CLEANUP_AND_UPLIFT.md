# Cleanup and uplift

The remainder of the 2026-08-17 whole-tree review, ordered for attack. What that session already landed: a javadoc compression pass over ~76 files (history narration, quoted measurements and plan references removed; `arm` replaced with control terminology in `FinanceTerms`, `LinguisticTerms`, `FiboTerms`), fifteen defect fixes each with a test written first, a README pass to the written-english rules, and regenerated self and Tika readings from the fixed reader. `cleanTest checkAll` green with all four suites executed; the `pinned` findings run separately and hold.

**The standing instruction is discharged**: the performance work landed at `74dc734` and the reading was regenerated once at that commit. From here, regenerate once per reading-behaviour change, never per prose edit.

## 1. Performance — first

**Landed at `043083f` and `74dc734`.** `RepositoryReading` memoises parse, legibility and themes per instance; `TreeReading` memoises the reading, the bundled-vocabulary `CorroboratedReading` and the arXiv `PlacedField` per tree; `SubjectAreas` reads the described and archive subject sets once per JVM; the export runs as `ReadingExportDiagnostic` in the `read` JVM over the shared readings, with `readingExport` kept as the standalone path; `slf4j-simple` is bound on the engine test and extraction classpaths; the four small hot spots (`placeOf`, `asNamesOnly`, `deepest()`, the `ORDINARY_ENGLISH` statics) are fixed.

Measured on this tree: `./gradlew read` fell from 6m13s to 4m25s at `74dc734`, and to 3m04s at `af2f303`. The shared pipeline itself is ~13s (parse 1.3s, themes 9.2s, legibility 2.6s); the remaining minutes are per-class work the sharing cannot reach.

Landed at `af2f303`, with the mechanism changes the leads predicted:

1. **The security-function null reads each statement once** and pools a permuted function as the sum of its statements' committed mass, normalised once. `SecurityFunctionDiagnostic` fell from 77s to ~1s beyond the shared pipeline. The figures moved as predicted — the NIST statements carry no terminal punctuation, so the joined-text pooling had been merging sentences across every join — and the verdict held: the placement still says only that the framework has six functions.
2. **The names-population `VocabularyNull` is drawn once per JVM**: `ChosenWords.chanceFor` is the draw, `TreeReading.namesChance()` memoises it, and both `VocabularyReadingDiagnostic` and the export take the memo.
3. **The CSO index is built once per JVM**: `InjectedIndexes` memoises the word-keyed index per taxonomy source, shared by `ExportCommand` and `MatchedFixture`.

4. **The Tika measurement is taken**: `./gradlew read -Dcs.clone.dir=<tika at 43cbdae6>` runs in 13m51s against the ~20-minute baseline. The shared pipeline is ~84s of it (parse 6.5s, themes 66.4s, citing 11s); the statement-pooled security null holds at 0.8s on a tree this size. The remainder is per-class:

   | Class | Cost | What it is |
   |---|--:|---|
   | `ReadingExportDiagnostic` | 576s | Pays the first computation of every shared piece, then the CSO injected-taxonomy match — `CorroboratedReading.of` runs `TermReading` twice over the full parse, once admitting every match and once corroborated — and the writing |
   | `VocabularyReadingDiagnostic` | 139s | The checked and written populations' nulls: 999 draws of up to 766k occurrences against each of two references |
   | `OutOfDomainVocabularyDiagnostic` | 50s | Its own population sweep |

5. **`DrawnVocabulary` lays words out in sorted order and counts draws by index** (landed with the regeneration after `af2f303`). The sort fixed a defect the speedup exposed: an unmodifiable map salts its iteration order per JVM, so the seeded null had never drawn the same words in two JVMs — `VocabularyNullTest` pinned within-JVM reproducibility only. The index counting removed the string hash per drawn occurrence; two fresh JVMs now produce byte-identical vocabulary reports over the unchanged Tika clone.

Landed at `90fdb2a` and `dac4e11`, regenerated at `9a9f377`:

6. **The export's term pass runs once.** `TermReading` records every span it finds with its site and restated-type flag, kept per file in reading order, and both tallies replay from the record; the corroborated tally asks the sibling-filtered ladder once per distinct run. The record is faithful because narrowing cannot move the walk: a multi-word term survives every narrowing, and refusing a one-word span advances the walk by one word exactly as matching it does. `CorroboratedReadingTest` prices the reading in index asks and pins agreement with a second pass; the pinned findings held unchanged.
7. **The null's reference is laid out as an alias table** (Vose's pairing over the sorted layout): a drawn occurrence is one uniform whose integer part names a column and whose fraction chooses between the column's own word and its alias, so the binary search per occurrence is gone. The multinomial is exact and the draw is still one uniform per occurrence, but the mapping from uniforms to words changed, so every null-derived figure moved once with the regeneration; Tika's summary verdicts held on its unchanged tree.

Leads 8 and 9 as first stated on 2026-08-18 — build the rungs once per JVM, then store each taxonomy's normal forms on disk keyed by a digest of the dictionary and rules — are **measured and closed**: `readTimings` on this tree prices CSO's whole taxonomy-side normalisation at 0.5s (lemma rung 0.1s, sense rung 0.4s, index 0.1s), so sharing buys ~1s and storing buys half of that. The CSO match row is 58.7s against OLiA's 2.6s, and the cost sits on the **repository side of the match**: `TermSpans` normalises every candidate run at every position and length through `LemmaRuns` and `SenseRuns` per occurrence, with no memo from run to normal form, so the dictionary is asked afresh for runs it has answered thousands of times. The live lead is (8′) **memoise run → normal form per JVM** — distinct candidate runs are few against occurrences × lengths — predicted to collapse most of the 58.7s; measure on both trees, and the random stream is untouched so no figure moves.

Measured after both: the self read is 2m11s (from 2m58s), and the Tika read (pinned `43cbdae6`) is 8m13s (from 13m51s) — `ReadingExportDiagnostic` 356s (from 576s), `VocabularyReadingDiagnostic` 48s (from 139s), `OutOfDomainVocabularyDiagnostic` 28s (from 50s). What remains of the export's 356s is the first computation of the shared readings, the CSO injected-taxonomy match and the writing, now with no second parse pass in it.

Lead 8′ was built red-first, measured four ways and **refuted** at `639a8c3`: the CSO row held (58.7s to 58.3s masked, 27.0s against 27.3s unmasked on this tree, 31.2s against 29.1s on Tika), so it was not shipped. What the flight recording found instead landed as three fixes, each with its own probe row:

| Change | CSO row on this tree |
|---|--:|
| The reach settled once at `TermSpans` construction (`fa87a5c`) | 58.7s to 27.0s (365.6s to 29.1s on Tika) |
| `isRoot` asks a set of carried labels (`57d4ab2`) | 27.0s to 24.1s |
| The sort key computed once per node (`6b1199f`) | 24.1s to 16.0s |
| A poly-hierarchical subtree built once, cached where the path never cut it (`0d230f0`) | 16.0s to 2.9s |

The probe total fell 86.6s to 29.3s on this tree; `readTimings` records every run under Flight Recorder since `e4eccc3`, so rows from there on carry its ~2% overhead. The head of the probe is now the arXiv row (~9.4s): `SubjectNull.of` reads 999 synthetic descriptions through the full prose pipeline per chance field and `PlacedField.ofArxiv` draws two fields, 1,998 readings per read. Raising the extjwnl dictionary cache capacity is **measured and refuted** — unbounded worsened the row (9.4s to 11.7s), 65,536 moved nothing — because the dictionary reads are first lookups of distinct entries. The two live options, deliberately left unattacked: memoise word-level lookups inside the draw loop (result-identical, sized by the fixed description pool), or precompute the chance field as a derived bundled resource, which must be keyed to the reader version or a read quotes a stale instrument.

## 2. Test coverage policy

5. `ReachedSubjectTest` carries real subject-placement assertions but is tagged `diagnostic`, so `checkAll` never runs it; the five `Pinned*Findings` classes are excluded the same way by the `pinned` tag. Decide what runs them in CI, and correct CLAUDE.md's tagged-tests bullet — the build excludes four tags (`generate`, `diagnostic`, `pinned`, `backtest`), the doc names two.
6. **Landed.** Direct tests for the behaviour-bearing classes reached only through facades: `WordNetContrast`, `WordNetDomains`, `WordNetAbbreviations`, `DeclaredTypeWords` — including the per-sense domain lookup, the labelled-sense count, the initialism length cap and the chain ceiling, which no facade reaches.
7. JaCoCo holds one module-total floor; a wholly untested class hides behind well-tested neighbours. Consider a per-class floor.

## 3. Structure

8. Split the classes over the 150-line limit: `OwlClasses` (223), `PhraseTopics` (220), `WordNetLexicon` (219), `ParsedRepository` (206), `ThemeReading` (191), `ExportedReading` (178), `WikidataNameExtraction` (153).
9. Break the `theme`↔`term` package cycle: `ContentWords`, `WordSpecificity` and the published-term seam want a package both can depend on.
10. **Landed.** `PinnedSource` carries the permalink fetch and blob-id acceptance for the five pinned extractions; `BundledLines` reads a bundled resource's data lines for the eight classes that each carried the loop; `ValueBatches` cuts query values for both Wikidata extractors; `RdfXml` parses and streams elements for `OwlClasses` and `FiboManifest`.
11. `MarkdownRendering` builds HTML in string literals against the tree's own typed-tags convention. Non-urgent, filed with it (2026-08-18): the twelve extraction TSV renderers hold their provenance headers as text blocks — `FiboTermsTsv` (22 lines) down to `SqlFunctionTsv` (9) — and want them as classpath resource templates with format slots, byte-identity gated by the renderer tests and the unchanged committed TSVs, one regeneration at the end because string-literal prose leaves the corpus.
12. **Landed.** `WordNetEntries` is the one `Optional`-returning lookup — exact and inflected — and `WordNetContrast`, `WordNetLexicon`, `WordNetAbbreviations` and `WordNetSenses` all ask it, so the null checks and the duplicated catch blocks are gone.
13. Small items: stringly-typed rows in the two Wikidata extractors want records; fully-qualified inline types across ~15 files want imports; six report classes and ~14 extraction classes want `final`; `QleverWikidata` retries non-retryable failures and does not unescape `\"` in TSV literals. Two exports serialise in JVM-salted order — `ExportedTaxonomies.matchesByNormalisation` is an unmodifiable map, and equal-mass concept rows swap between runs — so two reads of one pinned tree differ by a row and key swap; both want a total order.

## 4. Doctrine

14. Bounds chosen rather than derived, each needing its derivation or a stated reason: `CitedWord.WRITTEN_BY_THE_LANGUAGE = 0.01`, `ThemeReading.LEAST_SIGHTINGS = 3`, `WordNetContrast.CHAIN_CEILING = 6`, `NameTokens.FAMILY_PREFIX_CEILING = 3`, `WordNetAbbreviations.LONGEST_INITIALISM = 4`, `SqlFunctions.SHORTEST_CONTENT_WORD = 2`, `WikidataNameExtraction.BEARER_FLOOR = 5`, and the hand list `WikidataInitialismExtraction.EXCLUDED_CLASSES`. The 2026-08-18 constants sweep adds the segmenter cluster, whose honest derivation is segmentation quality measured on the evaluation set: `WordSegmenter.MIN_COMPOUND_LENGTH = 6` and `MIN_AVERAGE_PIECE_LENGTH = 3.0`, `CompoundParses.MIN_PIECE_LENGTH = 2` / `MIN_RESIDUAL_LENGTH = 2` / `MAX_RESIDUAL_LENGTH = 3`, `PieceCost.PIECE_PENALTY = 3.0` / `CITED_TOKEN_RANK = 2000` / `COMMON_TWO_LETTER_RANK = 1000` / `SHORT_PIECE_MAX_LENGTH = 3`, `WordMorphology.MIN_STEM_LENGTH = 2` and its twelve-prefix hand list — the list itself wants a cited affix source (Hunspell's en `.aff` is the candidate) rather than a curation. `VocabularyNull.HEADROOM = 1.5` is separate and sharper: it trims a priority queue mid-loop, so a value too small silently discards claims the final quantile needed — it wants a derived floor or an assertion, whichever the arithmetic supports. Presentation limits (`*_SHOWN`, `*_NAMED`, `*_HELD`) and format facts (class-file offsets, column counts, the JSD bound) are out of scope: the first kind truncates reports, the second is cited.
15. Regenerate `fibo-terms.tsv` and `olia-terms.tsv` after replacing `arm`/"firing"/"staying silent" in the `FiboTermsTsv` and `OliaTermsTsv` header templates with control terminology.
16. CLAUDE.md's "held open" section still says concepts need a sibling accumulator with explicit abstention mass; `OpenSpaceAccumulator` is that class, so the note is stale.
17. The naming sweep: `backtest`/`panel` survive in `evaluation-set.tsv`'s column headers, `build.gradle.kts` comments and BACKLOG where CLAUDE.md mandates evaluation-set language.

## 5. Documentation

18. `docs/DEPENDENCIES.md` describes a tree that no longer exists — Java 21, tree-sitter, jtreesitter, JDT, JGit, TinkerPop, Jena and Caffeine as catalogued dependencies, and the origin repository's file counts. Rewrite against the actual catalog.
19. `docs/GLOSSARY.md` says every bundled taxonomy normalises to seven columns; `SkosRows.COLUMNS` is 8. Also its own metaphor list: "cruder cousin", "argues with", "shouting".
20. BACKLOG: strike the two landed queue rows (Java 25, the namespace move — noting `lexicon` still sits under `bi`), fix the `docs/SKILLS.md` links (the file lives at `.claude/skills/SKILLS.md`; CLAUDE.md and `.readingignore` carry the same stale path), and sweep its metaphors ("sets the bar", "stop voting", "must be silent").
21. The generator prose sweep — metaphors rendered into reports, each fix in the named class: `ThemeProse` ("earned a place"), `VocabularyReport` ("clear the bar", "beats"), `ReadingChanges`/`ChangeReport` ("above the bar", "cleared a stated bar"), `ReadingIndex` ("lit", "beat", "a denominator, not a finding"), `WalkthroughProse`/`ReadingWalkthrough` ("earned a place", "package rung"), `SubjectPlacementDiagnostic` ("horoscope", "the hop"), `OutOfDomainVocabularyDiagnostic` ("fires", "stays quiet"), plus the test-side preambles in `ThemeReadingDiagnostic` and `VocabularyReadingDiagnostic`. Un-hard-wrap the text-block preambles in the same pass (the skill forbids wrapped markdown), and trim the multi-paragraph preambles per the BACKLOG entry. Regenerate the readings once, after the performance fix.
22. NOTICE.md's WordNet heading and the licence-gap sentence carry metaphor and rhetoric; two bundled TSV headers (`nist-csf-functions.tsv`, `arxiv-taxonomy.tsv`) open with contrastive negation; `THE_LITERATURE.md` writes literal `&nbsp;` entities into a formula line.
23. `ExportCommand` lives in the test source set and runs production behaviour untested; decide its home.
