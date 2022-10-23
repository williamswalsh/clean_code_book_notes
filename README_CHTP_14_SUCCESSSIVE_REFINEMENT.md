## Successive Refinement

- Marshal -> Apply order to a group of things
- Create domain specific expression for boolean expressions
  - if(elem.length() == 1) -> if(isBoolean)
- Fail Fast: report silent failures always - mostly in else statements.
- If you have multiple different behaviours with non-static state you can make an Abstract Parent class.  
  Then push all different behaviours into the specific sub-classes.
- If you have multiple different behaviours with no state you can make an Interface.  
  Then push all different behaviours into the specific implementing Classes.
- Abstract class - Identity
- Interface - a peripheral behavior of the class - not the identity
- Partitioning is an important behaviour of good software engineering
- **SRP - Should Class X contain the behaviour Y?**
