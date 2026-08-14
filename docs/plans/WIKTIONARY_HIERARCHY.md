# The Wiktionary topic hierarchy — what is left of it

## The Wiktionary topic hierarchy — what is left of it

**The fold has landed.** `wiktionary-topic-hierarchy.tsv` carries wiktextract's own generalisation map at a
pinned revision, and `StatedTopics` reads it to tell a label a headword was given from one derived off
another it was given. Measured: 519 distinct topics to 479, `sciences` and its four restatements out of the
top fifteen entirely, `computing` first at ι 0.0824 leading 36 files. A fold that only reduced the label
count without moving the reading would have bought nothing; this one moved the top of the table.

Two things it does not do:

**`computing` and `computer_science` are still two labels for one subject**, because they are two
*resources'* labels — Wiktionary's and WordNet Domains's — and no bundled resource states that they are the
same subject. Nothing here may say it either. A hierarchy folds a resource into itself; reconciling two label
spaces needs a citation that maps between them, and WordNet Domains's own hierarchy is the first place to
look for one.

**A root by omission is not a root by statement.** The map generalises 690 of the vocabulary's 719 distinct
labels and is silent about 29 — `law`, `business`, `government`, `media`, `metrology`, `arts` among them.
Some of those are genuinely top-level and some only lack an entry, and the fold cannot tell which: a label
nothing generalises is never folded, so a missing entry silently keeps a duplicate reading alive. The 29 are
few enough to check against the map's own upper levels, and *checking* them is the work — the answer is a
citation or it is nothing.
