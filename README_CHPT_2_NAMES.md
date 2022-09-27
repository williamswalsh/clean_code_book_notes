### CHPT 2 - Meaningful names

When naming variables, methods, functions, classes etc. your name should answer these questions:
- why it exists
- what it does
- how it is used  

Code should not be implicit.  
Must avoid leaving "false clues" that obscure the meaning of code.  
Use intention revealing names.  
Don't use "noise words" like:
- class type e.g. String -> nameString
- a, the, info e.g. aCar, theCar, carInfo, carData

#### Interface/Implementation naming
You shouldn't use the I infront of interface, rather you should use Impl after the implementations of such interface.  
e.g. Interface: ShapeFactory, Implementation: ShapeFactoryImpl

Should use terms from the solution domain or problem domain.  
Professional programmers know that "Clarity is King".  
Your code will be read many more times than its written(once).  
A class name should not be a verb.  
Don't use colloquialisms or slang -> HolyHandGrenade :-D
Pick one word and stick with it - be consistent  
e.g. fetch, get, retrieve -> then retrieveCar, RetrieveBrand, RetrieveFactory  

**N.B.** A consistent lexicon is a great support to people who must read your code.  

