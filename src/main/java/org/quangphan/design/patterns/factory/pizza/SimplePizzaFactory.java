package org.quangphan.design.patterns.factory.pizza;

public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else {
            pizza = new ClaimPizza();
        }

        return pizza;
    }
}
