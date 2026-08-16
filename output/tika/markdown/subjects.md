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

| Subject | Group | Distance | Met on |
|---|---|--:|---|
| `cs` Computer Science | grp_cs | 0.3621 | linguistics, law, programming, computing |
| `eess` Electrical Engineering and Systems Science | grp_eess | 0.3871 | computing, programming, mathematics, law |
| `q-fin` Quantitative Finance | grp_q-fin | 0.5696 | linguistics, law, programming, mathematics |
| `cond-mat` Condensed Matter | grp_physics | 0.5882 | computing, telecommunication, medicine, mathematics |
| `nlin` Nonlinear Sciences | grp_physics | 0.5909 | computing, mathematics, telecommunication, literature |
| `physics` Physics | grp_physics | 0.6172 | mathematics, telecommunication, medicine, industry |
| `astro-ph` Astrophysics | grp_physics | 0.6230 | computing, telecommunication, geography, programming |
| `math` Mathematics | grp_math | 0.6328 | mathematics, geography, programming, law |

The nearest subject stands **0.3621 bits** away. Across 999 draws, the nearest a taxonomy of chance offered a field of 12 subjects was **0.4337 bits**, so this placement **stands apart from chance**.

## At its leaves, by divergence

Every topic either side holds counts, so a thirty-word description is punished for being
narrower than a repository and the vaguest description wins.

| Subject | Group | Distance | Met on |
|---|---|--:|---|
| `cs.CL` Computation and Language | grp_cs | 0.3817 | computing, linguistics, programming, law |
| `cs.NI` Networking and Internet Architecture | grp_cs | 0.4320 | computing, programming, computer_science, telecommunication |
| `cs.SY` Systems and Control | grp_cs | 0.4451 | law, linguistics, programming, computer_science |
| `eess.AS` Audio and Speech Processing | grp_eess | 0.4517 | computing, telecommunication, mathematics, person |
| `astro-ph.IM` Instrumentation and Methods for Astrophysics | grp_physics | 0.4558 | computing, law, computer_science, industry |
| `eess.SY` Systems and Control | grp_eess | 0.4784 | computing, programming, computer_science, law |
| `cs.AI` Artificial Intelligence | grp_cs | 0.4885 | linguistics, law, programming, computer_science |
| `cs.SI` Social and Information Networks | grp_cs | 0.4897 | law, computing, programming, computer_science |
| `cs.DB` Databases | grp_cs | 0.4962 | computing, programming, law, computer_science |
| `cs.CY` Computers and Society | grp_cs | 0.5040 | computing, law, programming, computer_science |
| `cs.LO` Logic in Computer Science | grp_cs | 0.5107 | linguistics, programming, law, computer_science |
| `eess.IV` Image and Video Processing | grp_eess | 0.5182 | computing, programming, mathematics, telecommunication |

The nearest subject stands **0.3817 bits** away. Across 995 draws, the nearest a taxonomy of chance offered a field of 152 subjects was **0.4375 bits**, so this placement **stands apart from chance**.

## At its leaves, by the mass both hold

The same readings and the same null, asking instead how much of what a subject is about this
repository is also about.

| Subject | Group | Distance | Met on |
|---|---|--:|---|
| `cs.CL` Computation and Language | grp_cs | 0.5800 | computing, linguistics, programming, law |
| `eess.AS` Audio and Speech Processing | grp_eess | 0.5836 | computing, telecommunication, mathematics, person |
| `astro-ph.IM` Instrumentation and Methods for Astrophysics | grp_physics | 0.5988 | computing, law, computer_science, industry |
| `cs.DB` Databases | grp_cs | 0.6084 | computing, programming, law, computer_science |
| `cs.SY` Systems and Control | grp_cs | 0.6381 | law, linguistics, programming, computer_science |
| `cs.NI` Networking and Internet Architecture | grp_cs | 0.6446 | computing, programming, computer_science, telecommunication |
| `stat.CO` Computation | grp_stat | 0.6541 | computing, mathematics, video-games, soccer |
| `cs.AI` Artificial Intelligence | grp_cs | 0.6566 | linguistics, law, programming, computer_science |
| `cs.CY` Computers and Society | grp_cs | 0.6882 | computing, law, programming, computer_science |
| `cs.LO` Logic in Computer Science | grp_cs | 0.6899 | linguistics, programming, law, computer_science |
| `cs.GR` Graphics | grp_cs | 0.6929 | computing, programming, law, computer_science |
| `cs.SI` Social and Information Networks | grp_cs | 0.6976 | law, computing, programming, computer_science |

The nearest subject stands **0.5800 bits** away. Across 995 draws, the nearest a taxonomy of chance offered a field of 152 subjects was **0.5753 bits**, so this placement **says only that the taxonomy is large**.
