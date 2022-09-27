## Objects and Data Structures

- objects expose behaviour and hide data
- data structures expose data and don't have functions
- private variables
  - Why do we set them to private?
  - So that no other class will depend on them.
  - So that we can change them on a whim.
  - They are part of the implementation not part of public API.
- You can enforce an access policy using getter and setter methods
  - e.g. you can only set all fields of object at once but you may be able to get them one at a time. 
- A class should expose abstract interfaces to manipulate the essence of the data, without having to know its implementation.
- What representation of the data would be most useful for the client?
- We want to express the data in abstract terms.

### Objects vs Data Structures
- Objects hide their data behind abstractions.
- Objects expose methods to interact with the data - they define an access policy.
- the concept of the object influences the access policy
  - e.g. squares have a length and width
    - You can't construct a square without length and width
    - There are no width only boxes 
    - So you make constructor which only has length and width params. 
- Objects are data structures with a layer around them.
- Data Structures completely expose their data.
- Data Structures don't have functions.
- They are virtual opposites.

### Hybrids
- Bad - hybrid stuctures which are part Object part data structure
- They have methods to process their data
- They expose their data

### Data Transfer Objects
- Data structure class
- Private variables - public getters/setters
- No methods

### Active Record
- special form of DTO - Data Structure class
- save and find
- map to database tables
- Shouldn't contain business logic
  - This creates a hybrid object