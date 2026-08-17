# The `lexicon` module is a port

Copied from the Business Intelligence project, package names (`io.github.fiftieshousewife.bi.lexicon`) included,
so that a fix in either repository transfers as a straight diff. Prefer re-syncing it over diverging it.

## Where it has diverged, and why

| Change | Why |
|---|---|
| `Lexicon.senseCount(String)` and its `WordNetLexicon` implementation | The topical reading needs to know **how much of a word a sense-labelled resource speaks for**. WordNet Domains omits domain-less senses by construction — its own header says *"Factotum (domain-less) entries are absent from the published lift"* — so a word with six senses and one label has had one sixth of its meaning classified. Without the denominator, the one label reads as the word's subject, and `cite` reads as law. The count is a plain question about the dictionary and belongs beside the other questions this interface asks of it. |

`WordNetLexicon` is 177 lines with the addition, over this project's 150-line guide. It is left whole
deliberately: splitting a ported class diverges the port far more than adding one method to it, and the guide
is a convention where the port is a contract.

Nothing else differs. `VocabularyProvenanceTest` ports across with the module and covers both resource
directories.
