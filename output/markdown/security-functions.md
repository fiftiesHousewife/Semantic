# Security functions — CodeSemantics

The [NIST Cybersecurity Framework 2.0](https://www.nist.gov/cyberframework) partitions what
a security function does into six functions. Each is read from every statement NIST files
under it — its own overview and each outcome beneath it, pooled — through the same reading
this repository's own prose goes through, so the two are distributions over one topic space.

**The null permutes which statements belong to which function**, keeping every statement and
every function's size. A framework's functions share one document's vocabulary by
construction, so asking whether their words could have arisen by chance is already answered.
What is left to ask is whether the partition carries anything.

| Function | Statements | Divergence |
|---|--:|--:|
| `RC` RECOVER | 11 | 49.1% |
| `GV` GOVERN | 38 | 50.7% |
| `RS` RESPOND | 18 | 50.8% |
| `PR` PROTECT | 28 | 53.8% |
| `ID` IDENTIFY | 25 | 55.4% |
| `DE` DETECT | 14 | 55.8% |

The nearest function stands **49.1%** of the maximum divergence away, where a chance partition
of the same statements reaches **44.0%** over 999 draws. This placement **says only that the framework has six functions**.

A repository with no security surface should land here saying nothing, and saying nothing is
the correct outcome rather than a failure of the reading.
