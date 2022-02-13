package org.quangphan.design.patterns.factory.pizza;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        setName("Pepperoni pizza");
    }

    @Override
    void prepare() {
        System.out.println("Pizza " + getName() + " is preparing");
    }

    @Override
    void bake() {
        System.out.println("It is bake in microwave oven");
    }

    @Override
    void cut() {
        System.out.println("It is cut by iron knife");
    }

    @Override
    void box() {
        System.out.println("It is boxed by papar box");
    }
}
