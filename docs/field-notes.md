# Field Notes

`scalaflow` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `event-time skew`, `late input`, `window pressure`, and `sink lag`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`stress` tells me the happy path still works. `baseline` tells me whether the guardrail still has teeth.

The local verifier covers this data so the notes stay tied to code.
