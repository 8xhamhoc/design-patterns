package org.quangphan.design.patterns.factory.pizza;

public abstract class Pizza {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();

}
