package org.quangphan.design.patterns.abstracts.factory.button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("WindowsButton paint");
    }
}
