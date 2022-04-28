package org.quangphan.design.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {

    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 11;
        circle.color = "Green";
        circle.radius = 17;
        cache.put("circle", circle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 16;
        rectangle.y = 21;
        rectangle.color = "Blue";
        rectangle.width = 3;
        rectangle.height = 12;
        cache.put("rectangle", rectangle);
    }

    public Shape get(String shape) {
        return cache.get(shape).clone();
    }

    public void set(String type, Shape shape) {
        cache.put(type, shape);
    }

}
