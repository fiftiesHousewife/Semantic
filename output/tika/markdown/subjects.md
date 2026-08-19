# Subjects — tika

Where this repository stands against arXiv's published subject taxonomy — 152 subject areas, each
read from the description arXiv states its subject matter in.

**Nothing here is matched.** No identifier is compared with a subject name, and no word of a
description has to appear in the code. A description is prose, so it goes through the reading
this repository's own prose goes through, and comes back as an intensity over the same
dictionary topics. The themes are the hop: once a scope and a subject are distributions over one
space, the divergence already used between two scopes places one against the other.

A ranking on its own would be a horoscope, because something is always nearest. The bar is what
a taxonomy of chance achieves — real description lengths filled with words drawn from the pooled
vocabulary of every description — and a field of 152 subjects must be read against the best of
152 chance attempts, not against an average one.

## At the level the taxonomy reports at, by divergence

| Subject | Group | Divergence | Kept | Why | Met on |
|---|---|--:|---|---|---|
| [`cs` Computer Science](https://arxiv.org/list/cs/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 37.0% | keep | the nearest subject read, and nearer than chance reaches | linguistics, computing, programming, law |
| [`eess` Electrical Engineering and Systems Science](https://arxiv.org/list/eess/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 39.0% | discard | nearer than chance reaches, but a nearer subject was read | computing, programming, mathematics, law |
| [`cond-mat` Condensed Matter](https://arxiv.org/list/cond-mat/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 55.0% | discard | a taxonomy of chance reaches this far | computing, software, medicine, telecommunication |
| [`nlin` Nonlinear Sciences](https://arxiv.org/list/nlin/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 56.5% | discard | a taxonomy of chance reaches this far | computing, mathematics, literature, telecommunication |
| [`q-fin` Quantitative Finance](https://arxiv.org/list/q-fin/recent) | [grp_q-fin](https://arxiv.org/category_taxonomy) | 59.6% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, mathematics |
| [`astro-ph` Astrophysics](https://arxiv.org/list/astro-ph/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 60.1% | discard | a taxonomy of chance reaches this far | computing, telecommunication, chemistry, programming |
| [`math` Mathematics](https://arxiv.org/list/math/recent) | [grp_math](https://arxiv.org/category_taxonomy) | 61.2% | discard | a taxonomy of chance reaches this far | mathematics, programming, law, linguistics |
| [`physics` Physics](https://arxiv.org/list/physics/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 61.3% | discard | a taxonomy of chance reaches this far | medicine, mathematics, telecommunication, law |

The nearest subject stands **37.0%** of the maximum divergence away — 0% is two readings that are identical and 100% is two sharing no subject at all. Across 999 draws, the nearest a taxonomy of chance offered a field of 12 subjects was **42.8%**, so this placement **stands apart from chance**.

## At its leaves, by divergence

Every topic either side holds counts, so a thirty-word description is punished for being
narrower than a repository and the vaguest description wins.

| Subject | Group | Divergence | Kept | Why | Met on |
|---|---|--:|---|---|---|
| [`cs.CL` Computation and Language](https://arxiv.org/list/cs.CL/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 42.2% | keep | the nearest subject read, and nearer than chance reaches | computing, linguistics, programming, law |
| [`cs.NI` Networking and Internet Architecture](https://arxiv.org/list/cs.NI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 42.4% | discard | nearer than chance reaches, but a nearer subject was read | computing, programming, computer_science, telecommunication |
| [`eess.AS` Audio and Speech Processing](https://arxiv.org/list/eess.AS/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 46.8% | discard | a taxonomy of chance reaches this far | computing, telecommunication, mathematics, programming |
| [`eess.SY` Systems and Control](https://arxiv.org/list/eess.SY/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 49.5% | discard | a taxonomy of chance reaches this far | computing, programming, computer_science, law |
| [`eess.IV` Image and Video Processing](https://arxiv.org/list/eess.IV/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 50.2% | discard | a taxonomy of chance reaches this far | computing, programming, mathematics, computer_science |
| [`cs.SY` Systems and Control](https://arxiv.org/list/cs.SY/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 50.7% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cs.SI` Social and Information Networks](https://arxiv.org/list/cs.SI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 51.7% | discard | a taxonomy of chance reaches this far | computing, programming, law, computer_science |
| [`cs.PL` Programming Languages](https://arxiv.org/list/cs.PL/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 52.5% | discard | a taxonomy of chance reaches this far | linguistics, programming, computing, law |
| [`cs.AI` Artificial Intelligence](https://arxiv.org/list/cs.AI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 52.5% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cs.LO` Logic in Computer Science](https://arxiv.org/list/cs.LO/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 52.5% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cs.CC` Computational Complexity](https://arxiv.org/list/cs.CC/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 53.7% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cs.GR` Graphics](https://arxiv.org/list/cs.GR/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 54.0% | discard | a taxonomy of chance reaches this far | computing, programming, law, computer_science |

The nearest subject stands **42.2%** of the maximum divergence away — 0% is two readings that are identical and 100% is two sharing no subject at all. Across 995 draws, the nearest a taxonomy of chance offered a field of 152 subjects was **46.4%**, so this placement **stands apart from chance**.

## At its leaves, by the mass both hold

The same readings and the same null, asking instead how much of what a subject is about this
repository is also about.

| Subject | Group | Divergence | Kept | Why | Met on |
|---|---|--:|---|---|---|
| [`eess.AS` Audio and Speech Processing](https://arxiv.org/list/eess.AS/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 56.1% | keep | the nearest subject read, and nearer than chance reaches | computing, telecommunication, mathematics, programming |
| [`cs.CL` Computation and Language](https://arxiv.org/list/cs.CL/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 57.8% | discard | nearer than chance reaches, but a nearer subject was read | computing, linguistics, programming, law |
| [`cs.NI` Networking and Internet Architecture](https://arxiv.org/list/cs.NI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 62.0% | discard | a taxonomy of chance reaches this far | computing, programming, computer_science, telecommunication |
| [`cs.DB` Databases](https://arxiv.org/list/cs.DB/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 62.7% | discard | a taxonomy of chance reaches this far | computing, programming, law, computer_science |
| [`astro-ph.IM` Instrumentation and Methods for Astrophysics](https://arxiv.org/list/astro-ph.IM/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 65.1% | discard | a taxonomy of chance reaches this far | computing, law, computer_science, electrotechnology |
| [`cs.GR` Graphics](https://arxiv.org/list/cs.GR/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 68.4% | discard | a taxonomy of chance reaches this far | computing, programming, law, computer_science |
| [`eess.IV` Image and Video Processing](https://arxiv.org/list/eess.IV/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 69.2% | discard | a taxonomy of chance reaches this far | computing, programming, mathematics, computer_science |
| [`cs.LO` Logic in Computer Science](https://arxiv.org/list/cs.LO/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 69.3% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cs.AI` Artificial Intelligence](https://arxiv.org/list/cs.AI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 69.3% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cs.CC` Computational Complexity](https://arxiv.org/list/cs.CC/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 69.3% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cs.SY` Systems and Control](https://arxiv.org/list/cs.SY/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 69.6% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cond-mat.dis-nn` Disordered Systems and Neural Networks](https://arxiv.org/list/cond-mat.dis-nn/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 70.2% | discard | a taxonomy of chance reaches this far | computing, software, medicine, telecommunication |

The nearest subject stands **56.1%** of the maximum divergence away — 0% is two readings that are identical and 100% is two sharing no subject at all. Across 995 draws, the nearest a taxonomy of chance offered a field of 152 subjects was **61.9%**, so this placement **stands apart from chance**.

## Whether the placement reads subject matter or description length

The same repository, the same dictionaries and the same divergence at every row. Only the
descriptions get shorter, so a subject that changes places changed because of the words that
left it.

| Share of each description | Median words | Nearest subject | Divergence |
|---|--:|---|--:|
| full | 18 | `cs.CL` Computation and Language | 42.2% |
| 1/2 | 9 | `cs.CL` Computation and Language | 45.8% |
| 1/4 | 5 | `cs.CL` Computation and Language | 48.0% |
| 1/16 | 2 | `cs.DB` Databases | 58.1% |

The nearest subject changes to **`cs.DB` Databases** once each description is cut to 1/16 of the words arXiv wrote, so the placement **holds down to the length the literature reports a reading surviving to**.
