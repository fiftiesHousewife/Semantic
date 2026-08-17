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

Remaining:

4. **The Tika measurement is outstanding.** The plan's baseline was ~20 minutes at `43cbdae6`; on a large tree the shared parse and themes dominate, so the win there should be far larger than on this tree. Needs a clone: `git clone --depth 1 https://github.com/apache/tika` fetched at the pinned commit, then `./gradlew read -Dcs.clone.dir=<path>`.

## 2. Test coverage policy

5. `ReachedSubjectTest` carries real subject-placement assertions but is tagged `diagnostic`, so `checkAll` never runs it; the five `Pinned*Findings` classes are excluded the same way by the `pinned` tag. Decide what runs them in CI, and correct CLAUDE.md's tagged-tests bullet — the build excludes four tags (`generate`, `diagnostic`, `pinned`, `backtest`), the doc names two.
6. Direct tests for the behaviour-bearing classes reached only through facades: `WordNetContrast`, `WordNetDomains`, `WordNetAbbreviations`, `DeclaredTypeWords`.
7. JaCoCo holds one module-total floor; a wholly untested class hides behind well-tested neighbours. Consider a per-class floor.

## 3. Structure

8. Split the classes over the 150-line limit: `OwlClasses` (223), `PhraseTopics` (220), `WordNetLexicon` (219), `ParsedRepository` (206), `ThemeReading` (191), `ExportedReading` (178), `WikidataNameExtraction` (153).
9. Break the `theme`↔`term` package cycle: `ContentWords`, `WordSpecificity` and the published-term seam want a package both can depend on.
10. Deduplicate: the `published()`/`pinned()` fetch pasted across five extraction classes (one `PinnedSource` class); the bundled-TSV load pattern pasted across seven lexicon classes; `batches()` in both Wikidata extractors; the XML parse boilerplate in `OwlClasses` and `FiboManifest`.
11. `MarkdownRendering` builds HTML in string literals against the tree's own typed-tags convention.
12. `WordNetContrast`, `WordNetLexicon` and `WordNetAbbreviations` null-check extjwnl's returns at five sites; one package-private `Optional`-returning lookup (as `WordNetSenses.entry` already does) removes all of them.
13. Small items: stringly-typed rows in the two Wikidata extractors want records; fully-qualified inline types across ~15 files want imports; six report classes and ~14 extraction classes want `final`; `QleverWikidata` retries non-retryable failures and does not unescape `\"` in TSV literals.

## 4. Doctrine

14. Bounds chosen rather than derived, each needing its derivation or a stated reason: `CitedWord.WRITTEN_BY_THE_LANGUAGE = 0.01`, `ThemeReading.LEAST_SIGHTINGS = 3`, `WordNetContrast.CHAIN_CEILING = 6`, `NameTokens.FAMILY_PREFIX_CEILING = 3`, `WordNetAbbreviations.LONGEST_INITIALISM = 4`, `SqlFunctions.SHORTEST_CONTENT_WORD = 2`, `WikidataNameExtraction.BEARER_FLOOR = 5`, and the hand list `WikidataInitialismExtraction.EXCLUDED_CLASSES`.
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
