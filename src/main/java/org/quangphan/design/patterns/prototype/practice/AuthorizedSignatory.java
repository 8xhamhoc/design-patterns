package org.quangphan.design.patterns.prototype.practice;

public class AuthorizedSignatory implements Cloneable {

    private String name;
    private String designation;

    public AuthorizedSignatory() {
    }

    public AuthorizedSignatory(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "AuthorizedSignatory{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
