# Functions

Functions are the first line of organisation in a program.  
Functions should:
- be a story about the system 
- have only one level of abstraction
- decompose a larger concept into a set of steps at the next abstraction level
- have all the statements at the same level of abstraction
- should be able to step down into the sub-functions - which are at the next level of abstraction
- be less than 20 lines
- should not have output arguments - arguments that are outputs of the function
- have an indent level less than 2
- only do 1 thing
- do 1 thing well
- not be able to be divided into sections - (does multiple things)
- turn out to be what you expected
- avoid side effects
- have a name starting with a verb

A long descriptive name is better than a short enigmatic name.  
Bodies of if else clauses should be single function calls.   
Bodies of try catch clauses should be single function calls.     
These functions can have descriptive names helping to clarify the intent.  

### SRP - Single Responsibility Principle
Functions should only have one "reason to change".

Flag arguments to functions highlight that there really should be 2 separate functions(isSuite).  
- renderForSuite()
- renderForSingleTest()

If functions have 2 or 3 arguments maybe they could be combined into an object.  
Circle makeCircle(double x, double y, double radius);  
vs  
Circle makeCircle(Point centre, double radius);  

The order of a functions arguments is important.

### Side Effect
When a function does something that you don't expect from the method signature.  
checkPassword() method initialising a session.  
This creates a coupling between checkPassword() and session initialisation.   
**NB:** Sessions shouldn't always be initialised, therefore this method shouldn't always be called.  

### CQR - Command Query Separation
This is when you break up complex logic into a query and a command.
if(attributeExists("username")) {
    setAttribute("username", "unclebob");
}