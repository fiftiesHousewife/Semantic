# Security functions — tika

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
| `ID` IDENTIFY | 25 | 43.4% |
| `PR` PROTECT | 28 | 45.3% |
| `RC` RECOVER | 11 | 47.9% |
| `GV` GOVERN | 38 | 50.7% |
| `DE` DETECT | 14 | 55.3% |
| `RS` RESPOND | 18 | 59.2% |

The nearest function stands **43.4%** of the maximum divergence away, where a chance partition
of the same statements reaches **39.6%** over 999 draws. This placement **says only that the framework has six functions**.

A repository with no security surface should land here saying nothing, and saying nothing is
the correct outcome rather than a failure of the reading.
