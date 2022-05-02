package org.quangphan.design.patterns.prototype.practice3;

public class Circle extends Shape {

    protected int radius;
    protected FillStyle fillStyle;

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        System.out.println("Cloning circle...");

        Circle circle = (Circle) super.clone();
        circle.fillStyle = fillStyle.clone();

        return circle;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a new circle...");
    }

    @Override
    public String type() {
        return "Circle";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public FillStyle getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(FillStyle fillStyle) {
        this.fillStyle = fillStyle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", fillStyle=" + fillStyle +
                super.toString() +
                '}';
    }
}
