# Cleanup and uplift

The remainder of the 2026-08-17 whole-tree review, ordered for attack. What that session already landed: a javadoc compression pass over ~76 files (history narration, quoted measurements and plan references removed; `arm` replaced with control terminology in `FinanceTerms`, `LinguisticTerms`, `FiboTerms`), fifteen defect fixes each with a test written first, a README pass to the written-english rules, and regenerated self and Tika readings from the fixed reader. `cleanTest checkAll` green with all four suites executed; the `pinned` findings run separately and hold.

**Standing instruction: do not regenerate the self reading until the performance work below lands.** A full `./gradlew read` costs ~6 minutes on this tree and ~20 on Tika, almost all of it avoidable rework. The committed figures are a reading of the commit their reports name, which is the convention; regenerate once per reading-behaviour change after the rework is fixed, never per prose edit.

## 1. Performance — first

The diagnostics and the export each build their own reading of the same clone. One `./gradlew read` runs the full pipeline roughly ten times: each diagnostic report lands ~2 minutes apart on Tika, and `readingExport` then reruns everything once more in a fresh JVM, silently.

1. **Share one reading per clone across the diagnostics.** They already share a forked JVM; `TreeReading` on the test side is the stated home for the decision. Expected win: wall clock divided by roughly the number of diagnostics.
2. **Let the export consume the shared reading** instead of reparsing — or run it in the same JVM. Same fix extended across the task boundary.
3. **Bind a logger for `read`/`readingExport` and the extraction mains.** Engine logging currently falls to SLF4J's no-operation provider, so the export phase shows nothing for minutes and the extraction mains lost their progress lines when `System.out` was removed. `slf4j-simple` as `runtimeOnly` on the tasks' classpaths.
4. Smaller, measure before and after: `RankedWordTable.placeOf` calls `ranked.indexOf` per row (quadratic; 3,431 rows on Tika); `WrittenWords.asNamesOnly` replays one `saw()` per occurrence; `StatedDepth.deepest()` re-streams the whole map per call and `share()` calls it per concept; `ThemeReport`'s static `ORDINARY_ENGLISH` initialiser runs a full frequency-list reading in every JVM that loads the class, the export JVM included.

Measurement that settles it: wall-clock of `./gradlew read` on this tree and on the Tika clone at `43cbdae6`, before and after.

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
