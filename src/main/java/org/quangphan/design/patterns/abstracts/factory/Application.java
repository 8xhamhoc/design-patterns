package org.quangphan.design.patterns.abstracts.factory;

import org.quangphan.design.patterns.abstracts.factory.button.Button;
import org.quangphan.design.patterns.abstracts.factory.checkbok.CheckBox;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void paint() {
        this.button.paint();
        this.checkBox.paint();
    }
}
