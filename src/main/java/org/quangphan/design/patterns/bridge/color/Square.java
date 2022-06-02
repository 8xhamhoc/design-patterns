package org.quangphan.design.patterns.bridge.color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Draw square. " + color.fill());
    }
}
