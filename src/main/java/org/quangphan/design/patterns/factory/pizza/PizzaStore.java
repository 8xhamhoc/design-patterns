package org.quangphan.design.patterns.factory.pizza;

public class PizzaStore {

    public Pizza orderPizza(String orderType) {

        Pizza pizza = SimplePizzaFactory.createPizza(orderType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
