package org.quangphan.design.patterns.prototype;

public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape shape) {
        if (shape != null) {
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) {
            return false;
        }

        Shape shape = (Shape) obj;

        return this.x == shape.x && this.y == shape.y && this.color.equals(shape.color);
    }

    public abstract Shape clone();

}
