package org.quangphan.design.patterns.prototype.practice2;

public class A implements Cloneable {

    private int value;
    private B b;

    public A() {
    }

    public A(int value, B b) {
        this.value = value;
        this.b = b;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        A a = (A) super.clone();
        B b = (B) a.getB().clone();
        a.setB(b);
        return a;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                ", b=" + b +
                '}';
    }
}
