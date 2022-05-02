package org.quangphan.design.patterns.prototype.practice;

public class TAndC extends PrototypeCapableDocument {

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        TAndC tAndC = null;

        try {
            tAndC = (TAndC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}
