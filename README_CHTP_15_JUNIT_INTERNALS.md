## JUnit Internals

- Scope encoding
  - prefixing object fields with 'f' is outdated
  - current IDE's syntax highlighting makes this distinction
- **NB:** Negative statements are slightly harder to understand than positive statements.
- Temporal Coupling
  - This is when 2 methods must be called in a specific order to function correctly.
  - Can highlight this by feeding the output of the first method as an input into the second method.
  - One solution is to combine the methods by calling the second method within the first method.
    <pre>
    void doTaskAThenTaskB() {
        doTaskA();
        // TaskB code
    }
    </pre>
- Sorting of methods by purpose
  - Group of analysis methods
  - Group of synthesis methods
