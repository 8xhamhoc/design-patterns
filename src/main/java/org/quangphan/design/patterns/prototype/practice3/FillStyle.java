package org.quangphan.design.patterns.prototype.practice3;

public class FillStyle implements Cloneable {

    protected Color fillColor;
    protected FillPattern fillPattern;

    @Override
    protected FillStyle clone() throws CloneNotSupportedException {
        return (FillStyle) super.clone();
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public FillPattern getFillPattern() {
        return fillPattern;
    }

    public void setFillPattern(FillPattern fillPattern) {
        this.fillPattern = fillPattern;
    }

    @Override
    public String toString() {
        return "FillStyle{" +
                "fillColor=" + fillColor +
                ", fillPattern=" + fillPattern +
                '}';
    }
}
