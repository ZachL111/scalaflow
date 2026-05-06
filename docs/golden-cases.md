# Golden Cases

The case table exists so changes to lane boundaries are explicit.

The main golden fixture is `fixtures/golden/scoreboard.csv`. The matrix fixture is `fixtures/golden/lane-matrix.csv`. Together they cover `event-time skew`, `late input`, `window pressure`, and `sink lag` with different score ranges.

The purpose is to make intentional rule changes show up in review.
