package org.quangphan.design.patterns.singleton;

/**
 * Double checked locking singleton
 */
public class DoubleCheckedLockedSingleton {

    private static DoubleCheckedLockedSingleton instance;

    private DoubleCheckedLockedSingleton() {
    }

    public DoubleCheckedLockedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockedSingleton();
                }
            }
        }

        return instance;
    }
}
