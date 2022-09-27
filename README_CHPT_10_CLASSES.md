## Classes

- Classes shouldn't have public variables
- Public methods should come before private methods  
  This follows the step-down principle.  
  Where the further down you go in a class the more implementation details you see. High Level -> Low Level
- Classes should only have one responsibility - one reason to change.
- The name of a class should describe the responsibility of the class.
- Ambiguous class names are a code smell. Classes with the names like:
  - Processor
  - Manager
  - Super - SuperDashboard

### Single Responsibility Principle
A class or module should have only one **reason to change**.

When breaking complex classes down more code is created but each new class is more succinct and cohesive.  
Would you rather a large press which has everything in it  
**OR**  
a large toolbox which has small sections for each different component.  
The second option leads to more organisation and in most production software systems a good goal is to reduce software complexity.   

A complex arrangement of simple classes   
is better than:  
a simple arrangement of complex classes.

### Code Smell
This helps to identify where a refactor is required.  
When there are many instance variables which interact with multiple methods,  
this suggests that a new class should be introduced.  

### Open Closed principle

A class should be open to extension but closed for modification.  
In other words, you should:
- be able to extend an existing class
- not have to modify an existing class
You could pass in a child class with new functionality instead of modifying an existing class and passing it in.
Can just pass in the extended class in place of the parent class. e.g.
- Sql and SqlUpdate  
A change to the system should be easy to do.

### Programming to an interface not to an implementation
Example in the book is if you have a Portfolio class which uses a TokyoStockExchange. The reference to the TokyoStockExchange in the porfolio should be an interface: StockExchange
<pre>
interface StockExchange {
    Money currentPrice(Currency currency);
}
</pre>
There are many benefits to this. 
If you want to change the used exchange you can pass in a different implementation of the same interface.  
**AND**
It is useful to create Stub implementations of the interface for testing purposes - a test double.  

### Dependency Inversion Principle
Classes should depend on abstractions not implementations.  
Interfaces represent abstract concepts, so our class can depend on an abstract concept instead of a concrete implementation.  


