package org.quangphan.design.patterns.singleton;

public class Demo {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new MyThread().start();
        }

    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            ThreadSafeSingleton.getInstance();
        }
    }
}
