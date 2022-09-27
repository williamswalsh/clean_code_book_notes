## Emergence
- Good designs "emerge" from the code.

### Kent Becks 4 rules
The rules are stated in order of importance.
Your design must follow these rules:
- Must pass all the test
- Must not contain duplication
- Must express the intent of the programmer
- Must use as few classes as possible.

#### 1) Must pass all the test
- If the design cannot be verified by tests, then it is worthless.  
- Systems that cannot be tested are bad.  
- It is hard to test highly coupled systems.  
  - So if there is tests covering all development then classes will adhere more to SRP in the eventual aim of being testable.  

#### 2-4) Refactoring
- Tests allow us to change the code with confidence that we haven't broken existing behaviour. 
- They impart confidence in the programmer.

#### 2) No Duplication
- adds work, risk & complexity
- E.G.
<pre>
int size() { 
    return this.length-1; 
}
int isEmpty() { 
    return this.length-1 == 0;
}

Can remove this duplication by using:
int size() { 
    return this.length-1;
}
int isEmpty() { 
    return size() == 0;
}
</pre>
- **NB:** Reuse in the small
  - Creating small reusable things can simplify the overall system.

#### 3) Expressive Naming
- The intent should be clear
- You should not be surprised by content of function - name should represent behaviour of fx
- Ratio of time writing code to reading code, can be as much as 1:100,most time is spent reading code
- The possibility for miss-understandings should be minimized
- standard nomenclature - no slang, colloquialisms, etc.
- Take PRIDE in your workmanship - sign your name to them.
- Take CARE of what you created.

#### 4) Minimal Classes and methods
- Keep class & method counts low.
- Don't sacrifice any of the other 3 rules for this rule.
