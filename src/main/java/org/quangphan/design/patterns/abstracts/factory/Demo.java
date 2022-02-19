package org.quangphan.design.patterns.abstracts.factory;

public class Demo {

    public static void main(String[] args) {

        Application application;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println("os name: " + osName);

        if ("windows 10".equals(osName)) {
            guiFactory = new WindowsFactory();
        } else {
            guiFactory = new MacFactory();
        }

        application = new Application(guiFactory);
        application.paint();

    }

}
