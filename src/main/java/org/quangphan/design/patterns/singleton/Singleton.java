package org.quangphan.design.patterns.singleton;

/**
 * Single for lazy initialization
 *
 */
public class Singleton {

    private static Singleton instance;
    private String value;

    private Singleton() {
    }

    public static Singleton getInstance() {

        /**
         * instance only initialized for the first time called
         */
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
