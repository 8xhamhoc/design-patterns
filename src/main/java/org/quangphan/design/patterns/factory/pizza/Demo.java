package org.quangphan.design.patterns.factory.pizza;

public class Demo {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println("Pizza name: " + pizza.getName());

    }
}
