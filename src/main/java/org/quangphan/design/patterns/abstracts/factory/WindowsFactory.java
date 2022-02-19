package org.quangphan.design.patterns.abstracts.factory;

import org.quangphan.design.patterns.abstracts.factory.button.Button;
import org.quangphan.design.patterns.abstracts.factory.button.WindowsButton;
import org.quangphan.design.patterns.abstracts.factory.checkbok.CheckBox;
import org.quangphan.design.patterns.abstracts.factory.checkbok.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
