package org.quangphan.design.patterns.bridge.color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Draw triangle. " + color.fill());
    }
}
