## Unit Tests

- In the past classes that test the code would be called Drivers.  
  As in, the class would "drive" the code. 
- TDD mandates writing a failing test at the beginning of development of a feature.
- The tests and prod code are written together.
- Test suites are important for:
  - Confidence in a system
  - Confidence in changing a system - refactor/update
- Test suites keeps your code flexible - flexible to change
- Must be readable and simple
- Test one concept

### Create a Domain specific language 
Examples:
- assertResponseIsXml();
- assertResponseContains("hello");

Domain specific language make the tests easier to write and to read.  
DSLs can be more succinct and expressive.

### One assert per test
This follows the principle of testing one concept per test.  
Makes the test simpler and aids expressiveness.

### Tests should be self-validating
You should not have to manually check if the test failed
- by looking at logs
- by comparing text files

The test should assert if the expected outcome occurred.
