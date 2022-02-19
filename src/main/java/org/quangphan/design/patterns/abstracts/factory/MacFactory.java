package org.quangphan.design.patterns.abstracts.factory;

import org.quangphan.design.patterns.abstracts.factory.button.Button;
import org.quangphan.design.patterns.abstracts.factory.button.MacButton;
import org.quangphan.design.patterns.abstracts.factory.checkbok.CheckBox;
import org.quangphan.design.patterns.abstracts.factory.checkbok.MacCheckBox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
