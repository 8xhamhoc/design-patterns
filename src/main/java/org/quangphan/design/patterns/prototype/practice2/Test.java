package org.quangphan.design.patterns.prototype.practice2;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        B b = new B(2);

        A a = new A(10, b);

        A a2 = (A) a.clone();

        System.out.println(a);
        System.out.println(a2);

        a.setValue(11);
        b.setNumber(14);

        System.out.println(a);
        System.out.println(a2);

    }

}
