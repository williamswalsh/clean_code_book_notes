## Boundaries

- Keep boundaries of software clean
- Map - has a very broad interface
- When using external library can wrap class in another class to control how it is used. Blocking certain interactions.
- Should make it "harder to misuse"
- learning tests - test the 3rd party api before designing with it
- boundary tests - tests that assert your beliefs about how the api works
  - provide confidence in how the API works

### Adapter Pattern
- This encapsulates the interaction with the API and provides a single place to change when the API evolves.
- Can make a FakeAdapter to test the third party API.
- shouldn't expose implementation details across a boundary.


