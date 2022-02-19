package org.quangphan.design.patterns.abstracts.factory;

import org.quangphan.design.patterns.abstracts.factory.button.Button;
import org.quangphan.design.patterns.abstracts.factory.checkbok.CheckBox;

public interface GUIFactory {

    Button createButton();
    CheckBox createCheckBox();
}
