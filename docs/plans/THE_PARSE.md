# The parse — what it walks past, and how far it recovers

### The names the parse still walks past — string literals

`JavaSource` now collects pattern bindings, labels and the distinguishing part of the package declaration. What is left is **string literals and text blocks**, and they are left on purpose rather than forgotten. A literal is neither a declaration nor a use of somebody else's declaration, so the rule that removes `String` and `assertThat` says nothing about it — and log messages, error text, SQL and embedded markup are authored vocabulary while format strings, separators and reflection names are not. **A literal is prose-shaped evidence and needs the trustworthiness reading before it can be admitted**, which is the `[HIGH]` item below and does not exist yet. Module declarations are absent because this tree has no `module-info.java` to measure one on.

**Measurement:** the count of word occurrences it adds, against λ and against the branches occupied. A gap that adds a thousand occurrences and moves no branch was not worth closing, and saying so is the finding.

### Matching a single word is misleading — match in context

## Stage 5 — the syntax parse

**A Java parse is in the tree** (`JavaSource`, JavaParser 3.28.2) and the self read runs on it, which is what lets the reading tell a declaration from a use. It is one language, no symbol resolution, and its error tolerance is measured rather than assumed — see the item below. What follows is still the polyglot stage:

tree-sitter, one parser interface across a polyglot tree, symbol extraction as `.scm` queries per language. **Measure the core/grammar version skew first** (core 0.26.6 against `tree-sitter-java` 0.23.5): ABI compatibility across it is not something to assume, and if it does not hold the alternative is `jtreesitter`, which needs Java 22 and is therefore a toolchain decision.

Error tolerance is a requirement, not a nicety: a pull request's head commit does not always compile, and a parser that refuses such a file cannot analyse the pull requests that most need analysing.

## What the parse walks past, measured on a file written to contain all of it

`JavaSource` collects declarations, imports and comments. Probed with one file written to contain every case, it returns `TYPE`, `METHOD`, `PARAMETER`, `FIELD` and `LOCAL` — and walks past five things the author wrote:

- **String literals and text blocks.** `"interest rate swap"` is authored text and the reading never sees it. This is the largest of the five and the least obvious: a literal is neither a declaration nor a use of somebody else's declaration, so the rule that removes `String` and `assertThat` says nothing about it. Log messages, error text, SQL, resource paths and embedded markup are all authored vocabulary — and format strings, separators and reflection names are not, so **a literal is prose-shaped evidence needing the trustworthiness reading above before it can be admitted**, not a sixth `NameForm` to add tomorrow.
- **The package declaration.** Parsed into `ParsedSource.packageName()` and used only to sort imports. Its segments — `parse`, `reading`, `theme`, `term`, `pipeline` — are the most deliberate taxonomy in the tree, chosen once each and never counted.
- **Pattern bindings.** `NameForm.LOCAL`'s javadoc claims it covers *"a loop variable and a pattern binding"*. It does not: JavaParser's `TypePatternExpr` is not a `VariableDeclarationExpr` and no pass collects it, so `subject instanceof String boundPattern` contributes nothing. **A stated coverage the code does not have** — the first thing to write is the failing test, and the javadoc is either made true or corrected.
- **Labels.** `outerLoop:` is a name an author chose. Rare, and free once the pass exists.
- **Module declarations.** No `module-info.java` in this tree, so the gap costs nothing here and would cost a reading of a modular repository everything it declares about its own boundaries.

**Measurement:** the count of word occurrences each adds, against λ and against the theme table. A gap that adds a thousand occurrences and moves no theme was not worth closing, and saying so is the finding.

## The parser's error tolerance, measured

The plan chose tree-sitter for parsing partly because error recovery is a documented strength, and the self read uses JavaParser instead — pure Java, no grammar binary, no JNI and no version skew, which for a Java-only reading is the cheaper honest choice. Its recovery is **narrower than the plan assumes, and now measured**: an error inside a method body leaves the surrounding declarations readable, while an error in the structure that holds the bodies — an unclosed type, a malformed signature — yields nothing at all for the whole file. `JavaSourceTest` pins both.

**Measurement that settles the choice:** take the head commits of a sample of open pull requests, count how many parse at all under each of JavaParser and `tree-sitter-java`, and count the declarations each recovers. A parser that refuses the commits most worth reading cannot be the one the pipeline standardises on.
