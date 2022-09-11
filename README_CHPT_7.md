## Error Handling

- input can be abnormal
- devices can fail
- error handling code shouldn't obscure logic
- can wrap error handling in method called
  - tryDoX(), tryXXX()
- separate concerns - separate algorithm from error handling logic
- exception throwing breaks encapsulation
- methods know info of called methods - throws X;
- errors should provide enough context
- AOP - helps to separate error handling logic from business logic


### Special Case Pattern
Create a class that handles the special case for you.  
The client code doesn't have to deal with exceptional behaviour.  

### Don't return null
- Throw an exception
- Return a special case object
- Use empty objects - emptyList, emptyMap - CollectionUtils.emptyList();

### Don't pass null
- Avoid passing null to your methods
- forbid passing null by default
