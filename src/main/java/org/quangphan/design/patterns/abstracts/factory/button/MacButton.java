package org.quangphan.design.patterns.abstracts.factory.button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("MacButton paint");
    }
}
