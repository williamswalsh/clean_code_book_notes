## Concurrency

- Schedule - a plan for carrying out a process, giving lists of intended events and times.
  - Temporal element to schedule
- Concurrency is a decoupling strategy
  - It helps us to decouple **what gets done** from **when it gets done**.
- Web Containers like Spring provide concurrency features.
- Concurrency can improve performance when **wait times** are excessive.
- Concurrency incurs overhead:
  - for performance
  - for code
- **NB:** Try to separate "concurrency related" code from business logic.
- Limit the scope of shared data
- Use read only copies of data - when possible.
- Threads should be as independent as possible.

### Methods to partition behaviour
- Bound resources - queues, connection pools
- Mutual exclusion - limit thread access with mutex.
- Starvation - one thread is prohibited from proceeding due to other faster threads, leading to a thread waiting an excessive amount of time.
- Deadlock
  - thread1 is waiting for thread2 to finish
  - thread2 is waiting for thread1 to finish

### Execution Models
Producer-Consumer
- producers add to the queue
- consumers take from the queue
- producers inform consumer when queue is not empty
  - So that consumers can consume
- consumers inform producer when queue is not full
  - So that producers can produce

Readers-Writers
- Co-ordination of readers and writers
- readers need to have the most novel data
- writers need to write the most novel data
- writers need to block readers
- readers can block writers

### Testing
- Make your code tunable. Try to vary the:
  - programmatic configs
    - number of threads
    - threads per core - more causes more swapping - which can cause problems
    to arise
    - 
  - system configs
  - OS's executing the code
- Test code without multi-threading first
- Treat spurious failures as candidate threading issues
- Could have a feedback loop to control the tunable parameters ** 