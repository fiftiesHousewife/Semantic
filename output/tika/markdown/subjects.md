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
| [`cs` Computer Science](https://arxiv.org/list/cs/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 37.2% | keep | the nearest subject read, and nearer than chance reaches | linguistics, programming, computing, law |
| [`eess` Electrical Engineering and Systems Science](https://arxiv.org/list/eess/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 37.3% | discard | nearer than chance reaches, but a nearer subject was read | computing, programming, mathematics, law |
| [`nlin` Nonlinear Sciences](https://arxiv.org/list/nlin/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 56.8% | discard | a taxonomy of chance reaches this far | computing, mathematics, telecommunication, literature |
| [`cond-mat` Condensed Matter](https://arxiv.org/list/cond-mat/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 57.0% | discard | a taxonomy of chance reaches this far | computing, telecommunication, medicine, mathematics |
| [`q-fin` Quantitative Finance](https://arxiv.org/list/q-fin/recent) | [grp_q-fin](https://arxiv.org/category_taxonomy) | 57.9% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, mathematics |
| [`physics` Physics](https://arxiv.org/list/physics/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 60.3% | discard | a taxonomy of chance reaches this far | telecommunication, mathematics, industry, medicine |
| [`astro-ph` Astrophysics](https://arxiv.org/list/astro-ph/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 61.1% | discard | a taxonomy of chance reaches this far | computing, telecommunication, programming, geography |
| [`math` Mathematics](https://arxiv.org/list/math/recent) | [grp_math](https://arxiv.org/category_taxonomy) | 62.1% | discard | a taxonomy of chance reaches this far | mathematics, programming, law, geography |

The nearest subject stands **37.2%** of the maximum divergence away — 0% is two readings that are identical and 100% is two sharing no subject at all. Across 999 draws, the nearest a taxonomy of chance offered a field of 12 subjects was **42.5%**, so this placement **stands apart from chance**.

## At its leaves, by divergence

Every topic either side holds counts, so a thirty-word description is punished for being
narrower than a repository and the vaguest description wins.

| Subject | Group | Divergence | Kept | Why | Met on |
|---|---|--:|---|---|---|
| [`cs.CL` Computation and Language](https://arxiv.org/list/cs.CL/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 39.2% | keep | the nearest subject read, and nearer than chance reaches | computing, linguistics, programming, law |
| [`cs.NI` Networking and Internet Architecture](https://arxiv.org/list/cs.NI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 40.2% | discard | nearer than chance reaches, but a nearer subject was read | computing, programming, computer_science, industry |
| [`eess.AS` Audio and Speech Processing](https://arxiv.org/list/eess.AS/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 44.5% | discard | a taxonomy of chance reaches this far | computing, person, telecommunication, mathematics |
| [`eess.SY` Systems and Control](https://arxiv.org/list/eess.SY/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 46.7% | discard | a taxonomy of chance reaches this far | programming, computing, mathematics, computer_science |
| [`cs.SY` Systems and Control](https://arxiv.org/list/cs.SY/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 47.3% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`astro-ph.IM` Instrumentation and Methods for Astrophysics](https://arxiv.org/list/astro-ph.IM/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 48.1% | discard | a taxonomy of chance reaches this far | computing, law, computer_science, industry |
| [`eess.IV` Image and Video Processing](https://arxiv.org/list/eess.IV/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 49.4% | discard | a taxonomy of chance reaches this far | computing, programming, mathematics, telecommunication |
| [`cs.SI` Social and Information Networks](https://arxiv.org/list/cs.SI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 50.3% | discard | a taxonomy of chance reaches this far | computing, programming, law, mathematics |
| [`cs.DB` Databases](https://arxiv.org/list/cs.DB/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 50.4% | discard | a taxonomy of chance reaches this far | computing, programming, law, computer_science |
| [`cs.AI` Artificial Intelligence](https://arxiv.org/list/cs.AI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 50.8% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, mathematics |
| [`cs.LO` Logic in Computer Science](https://arxiv.org/list/cs.LO/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 52.1% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, mathematics |
| [`cs.GR` Graphics](https://arxiv.org/list/cs.GR/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 52.8% | discard | a taxonomy of chance reaches this far | computing, programming, law, computer_science |

The nearest subject stands **39.2%** of the maximum divergence away — 0% is two readings that are identical and 100% is two sharing no subject at all. Across 995 draws, the nearest a taxonomy of chance offered a field of 152 subjects was **43.1%**, so this placement **stands apart from chance**.

## At its leaves, by the mass both hold

The same readings and the same null, asking instead how much of what a subject is about this
repository is also about.

| Subject | Group | Divergence | Kept | Why | Met on |
|---|---|--:|---|---|---|
| [`cs.CL` Computation and Language](https://arxiv.org/list/cs.CL/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 57.5% | discard | a taxonomy of chance reaches this far | computing, linguistics, programming, law |
| [`eess.AS` Audio and Speech Processing](https://arxiv.org/list/eess.AS/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 57.6% | discard | a taxonomy of chance reaches this far | computing, person, telecommunication, mathematics |
| [`cs.DB` Databases](https://arxiv.org/list/cs.DB/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 60.6% | discard | a taxonomy of chance reaches this far | computing, programming, law, computer_science |
| [`cs.NI` Networking and Internet Architecture](https://arxiv.org/list/cs.NI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 61.9% | discard | a taxonomy of chance reaches this far | computing, programming, computer_science, industry |
| [`astro-ph.IM` Instrumentation and Methods for Astrophysics](https://arxiv.org/list/astro-ph.IM/recent) | [grp_physics](https://arxiv.org/category_taxonomy) | 63.6% | discard | a taxonomy of chance reaches this far | computing, law, computer_science, industry |
| [`stat.CO` Computation](https://arxiv.org/list/stat.CO/recent) | [grp_stat](https://arxiv.org/category_taxonomy) | 64.0% | discard | a taxonomy of chance reaches this far | computing, mathematics, video-games, soccer |
| [`cs.SY` Systems and Control](https://arxiv.org/list/cs.SY/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 67.1% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, computer_science |
| [`cs.AI` Artificial Intelligence](https://arxiv.org/list/cs.AI/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 67.3% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, mathematics |
| [`cs.GR` Graphics](https://arxiv.org/list/cs.GR/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 68.4% | discard | a taxonomy of chance reaches this far | computing, programming, law, computer_science |
| [`eess.SY` Systems and Control](https://arxiv.org/list/eess.SY/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 68.5% | discard | a taxonomy of chance reaches this far | programming, computing, mathematics, computer_science |
| [`eess.IV` Image and Video Processing](https://arxiv.org/list/eess.IV/recent) | [grp_eess](https://arxiv.org/category_taxonomy) | 68.9% | discard | a taxonomy of chance reaches this far | computing, programming, mathematics, telecommunication |
| [`cs.LO` Logic in Computer Science](https://arxiv.org/list/cs.LO/recent) | [grp_cs](https://arxiv.org/category_taxonomy) | 69.1% | discard | a taxonomy of chance reaches this far | linguistics, programming, law, mathematics |

The nearest subject stands **57.5%** of the maximum divergence away — 0% is two readings that are identical and 100% is two sharing no subject at all. Across 995 draws, the nearest a taxonomy of chance offered a field of 152 subjects was **56.7%**, so this placement **says only that the taxonomy is large**.

## Whether the placement reads subject matter or description length

The same repository, the same dictionaries and the same divergence at every row. Only the
descriptions get shorter, so a subject that changes places changed because of the words that
left it.

| Share of each description | Median words | Nearest subject | Divergence |
|---|--:|---|--:|
| full | 18 | `cs.CL` Computation and Language | 39.2% |
| 1/2 | 9 | `cs.NI` Networking and Internet Architecture | 41.4% |
| 1/4 | 5 | `cs.CL` Computation and Language | 43.3% |
| 1/16 | 2 | `cs.DB` Databases | 52.8% |

The nearest subject changes to **`cs.NI` Networking and Internet Architecture** once each description is cut to 1/2 of the words arXiv wrote, so the placement **reads description length rather than subject matter**.
