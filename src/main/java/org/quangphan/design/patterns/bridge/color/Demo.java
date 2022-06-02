package org.quangphan.design.patterns.bridge.color;

public class Demo {

    public static void main(String[] args) {

        Shape triangle = new Triangle(new Red());
        Shape square = new Square(new Blue());

        triangle.draw();
        square.draw();
    }

}
