package org.quangphan.design.patterns.prototype.practice3;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        FillStyle fillStyle = new FillStyle();
        fillStyle.setFillColor(Color.GREEN);
        fillStyle.setFillPattern(FillPattern.DOT);
        circle.setFillStyle(fillStyle);
        circle.setRadius(30);

        System.out.println(circle);

        Circle clonedCircle = (Circle) circle.clone();
        System.out.println(clonedCircle);
        fillStyle.setFillColor(Color.RED);
        clonedCircle.setRadius(44);
        System.out.println(circle);
        System.out.println(clonedCircle);

    }

}
