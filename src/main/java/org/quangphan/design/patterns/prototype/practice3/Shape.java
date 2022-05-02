package org.quangphan.design.patterns.prototype.practice3;

public abstract class Shape implements Cloneable {

    protected int x;
    protected int y;
    protected ShapeStyle shapeStyle;

    public Shape() {
        super();
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        Shape shape = (Shape) super.clone();

        if (shapeStyle != null) {
            shape.shapeStyle = shapeStyle.clone();
        }

        return shape;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ShapeStyle getShapeStyle() {
        return shapeStyle;
    }

    public void setShapeStyle(ShapeStyle shapeStyle) {
        this.shapeStyle = shapeStyle;
    }

    public abstract void draw();

    public abstract String type();

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", shapeStyle=" + shapeStyle +
                '}';
    }
}
