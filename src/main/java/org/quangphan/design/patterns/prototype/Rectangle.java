package org.quangphan.design.patterns.prototype;

public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);

        if (rectangle != null) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height;
    }

}
