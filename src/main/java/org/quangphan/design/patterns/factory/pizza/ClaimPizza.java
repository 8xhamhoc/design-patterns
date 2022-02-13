package org.quangphan.design.patterns.factory.pizza;

public class ClaimPizza extends Pizza {

    public ClaimPizza() {
        setName("Claim pizza");
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
        System.out.println("It is cut by plastic knife");
    }

    @Override
    void box() {
        System.out.println("It is boxed by plastic bag");
    }
}
