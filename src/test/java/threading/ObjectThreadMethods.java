package threading;

import org.junit.jupiter.api.Test;

/**
 * @author William Walsh
 * @version 23 Oct 2022
 */
public class ObjectThreadMethods {

    @Test
    public void testObjectMethods() throws InterruptedException {
        A a = new A();
        a.wait(); // Causes the current thread to wait until
                  // another thread invokes the notify()/notifyAll() method for this object
                  // Containing thread must have access to the object's monitor, otherwise -> IllegalMonitorStateException

        a.notify();
    }
}

class A {

}
