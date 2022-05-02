package org.quangphan.design.patterns.prototype.practice2;

public class B implements Cloneable {

    private int number;

    public B(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "B{" +
                "number=" + number +
                '}';
    }
}
