# Scalaflow Walkthrough

I use this file as a small checklist before changing the Scala implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | event-time skew | 97 | hold |
| stress | late input | 185 | ship |
| edge | window pressure | 160 | ship |
| recovery | sink lag | 176 | ship |
| stale | event-time skew | 155 | ship |

Start with `stress` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `late input` against `event-time skew`, not the raw score alone.
