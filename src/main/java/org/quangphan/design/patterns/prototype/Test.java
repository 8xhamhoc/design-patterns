package org.quangphan.design.patterns.prototype;

public class Test {

    public static void main(String[] args) {

        BundledShapeCache cache = new BundledShapeCache();

        Circle circle = (Circle) cache.get("circle");
        System.out.println("x: " + circle.x);
        System.out.println("y: " + circle.y);
        System.out.println("radius: " + circle.radius);

        Circle circle2 = (Circle) cache.get("circle");

        if (circle.equals(circle2)) {
            System.out.println("They are equal");
        }
    }

}
