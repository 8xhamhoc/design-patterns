package org.quangphan.design.patterns.prototype;

public class DeepCopy implements Cloneable {

    private RefType refType;

    public DeepCopy() {
    }

    public DeepCopy(RefType refType) {
        this.refType = refType;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public RefType getRefType() {
        return refType;
    }

    public void setRefType(RefType refType) {
        this.refType = refType;
    }
}
