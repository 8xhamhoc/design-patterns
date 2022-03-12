package org.quangphan.design.patterns.singleton;

/**
 * Thread-safe singleton
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    /**
     * Only one thread can access method at a time
     */
    public synchronized static ThreadSafeSingleton getInstance() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread - " + threadName);

        if (instance == null) {
            System.out.println("Initialize object by thread - " + threadName);
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }
}
