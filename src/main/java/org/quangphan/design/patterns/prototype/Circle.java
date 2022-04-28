package org.quangphan.design.patterns.prototype;

public class Circle extends Shape {

    public int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);

        if (circle != null) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

}
