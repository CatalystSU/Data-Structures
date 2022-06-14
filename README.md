# Data-Structures
Personal Implementation of various data structures in Java and Python

### Interesting finds
#### Vector vs ArrayList
Performance: ArrayList is faster. Since it is non-synchronized, while vector operations give slower performance since they are synchronized (thread-safe), if one thread works on a vector, it has acquired a lock on it, which forces any other thread wanting to work on it to have to wait until the lock is released.
