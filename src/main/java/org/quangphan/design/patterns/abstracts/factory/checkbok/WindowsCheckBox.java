package org.quangphan.design.patterns.abstracts.factory.checkbok;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("WindowsCheckBox paint");
    }
}
