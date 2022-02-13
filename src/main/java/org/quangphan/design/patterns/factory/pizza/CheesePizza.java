package org.quangphan.design.patterns.factory.pizza;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        setName("Cheese pizza");
    }

    @Override
    void prepare() {
        System.out.println("Pizza " + getName() + " is preparing");
    }

    @Override
    void bake() {
        System.out.println("It is baked in the terracotta furnace");
    }

    @Override
    void cut() {
        System.out.println("It is cut by knife");
    }

    @Override
    void box() {
        System.out.println("It is boxed by paper");
    }
}
