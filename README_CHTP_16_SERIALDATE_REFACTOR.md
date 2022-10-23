## Refactoring SerialDate
- Ordinal - relating to order - 1st, 2nd, 3rd
- Use \<pre\> for javadoc code formatting
- Abstract class names should not contain any implementation detail.
- **NB:** Base classes should not know about their derivatives.
- Abstract factory can be used to create class and contain abstract max and min methods.
- Open Interval      - (0, 2) -> 0 <  x <  2
- Closed Interval    - [0, 2] -> 0 <= x <= 2
- half-open interval - [0, 2) / (0, 2]
- Should pass symbols that represent domain concepts,   
  instead of intent-less integers. **DSL**
- Renaming methods which **convert things to strings** as .toString().
- Feature Envy - Code smell
  - Occurs when a class calls more method of an external class than on itself.
- If flag passed into method - you could refactor to 2 distinct methods
  - .toString()
  - .toShortString()
- Pushing methods up or down a class hierarchy
  - If the parent class contains all data needed for method then can keep in parent class.
  - Inappropriate abstract method - If there is no abstract form of the method, then move the method down into the derived class.
- Move states into Enum classes - inner enums or enum files
- **NB:** Enums can contain abstract methods and methods within the enum value.  
  Varying behaviour based on enum type:    
  <pre>
  enum DateInterval {
    OPEN {
        public boolean isIn(int d, int left, int right) {
            return d > left && d < right; 
        }
    },
    CLOSED {
        public boolean isIn(int d, int left, int right) {
            return d >= left && d <= right; 
        }
    }
    public abstract boolean isIn(int d, int left, int right);
  }
  </pre>