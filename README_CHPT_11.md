## Systems

- Complexity sucks the life out of developers
- Abstract Factory Pattern
  - Interface/abstract class
  - When you have different types of items
  - enables extension(OCP)
- When building something, you build it to the requirements of today.  
  You implement to the requirements/stories of today.
- Entity Bean
  - It is an in-memory representation of relational data,
  - in other words, a table row.
- **NB:** A good API should just disappear from view. 
- **NB:** It is best to postpone decisions until the last possible moment
  - when you have the most amount of information
  - pre-mature decisions are plagued by suboptimal knowledge

### Dependency Injection
- Separation of concerns
    - to simplify
    - can separate object construction from usage with DI
- The main application shouldn't have dependencies on "sub-parts" of application.  
- Main shouldn't be concerned with object construction.  
- This removes any complexity around that concern.
- Container wires together dependencies - only when needed

### Cross-cutting concerns
- Examples: persistence, transaction handling, security, caching, failover
- These concerns cut across the boundaries of domain objects.
- The same strategy applies for all the objects.

### Aspect Oriented Programming
- is well suited to applying these behaviours across applications without pollution the business logic code.
- uses a declarative approach using annotations
- non-invasive
- AspectJ Library
  - Can add aspects that are triggered when field value changes, or when field value is referenced
  - Aspect, point cut

### Decorator Design Pattern
- You decorate a class with data or behaviour.
- Think of a Shape in a UI context.
- ShapeDecorator would store a reference to Shape but do something that shape doesn't do by itself.

