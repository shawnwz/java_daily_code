import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInt {
    
    private AtomicInteger counter = new AtomicInteger(0);

    public int next() {
        return counter.getAndIncrement();
    }
}


/*
public class Seq {
    private volatile int counter = 0;

    public int next(){
        return counter++;
    }
}
In this context the volatile keyword will only ensure that all threads will see the same counter value once code writes to it. However, the simple int incrementation is not an atomic operation - it consists of reading the value from memory, increasing it and saving back. It creates a window in which multiple threads read the same value, each one increments it and then all save the same value back to the memory overwriting each other’s results. So in this example volatile does not guarantee thread safety. A volatile counter could be enough in the scenario where there are threads that only write to a counter and threads that only read its value.
*/

/* 
public class Seq{
    private Integer counter = 0;

    public int next{
        sychronized (counter) {
            return counter++;
        }
    }
}
//In this example we are using the counter object as a guard of the critical section. Integer objects are immutable and each time counter++ is called the autoboxing is conducted that eventually results in counter being a new instance of Integer with the incremented value. Because of that the critical section might be accessible by more than one thread at the same time.
*/