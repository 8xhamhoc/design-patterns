package org.quangphan.design.patterns.prototype.practice3;

public class Line extends Shape {

    protected int x1;
    protected int y1;

    public Line() {
        super();
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        System.out.println("Cloning Line ...");
        return (Line) super.clone();
    }

    @Override
    public void draw() {

    }

    @Override
    public String type() {
        return null;
    }
}
