# Review Journal

I treated `scalaflow` as a project where the smallest useful behavior should still be inspectable.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its stream processing focus without claiming live deployment or external usage.

## Cases

- `baseline`: `event-time skew`, score 97, lane `hold`
- `stress`: `late input`, score 185, lane `ship`
- `edge`: `window pressure`, score 160, lane `ship`
- `recovery`: `sink lag`, score 176, lane `ship`
- `stale`: `event-time skew`, score 155, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
