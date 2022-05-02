package org.quangphan.design.patterns.prototype.practice;

public abstract class PrototypeCapableDocument implements Cloneable {

    private String vendorName;
    private String content;

    public PrototypeCapableDocument() {
    }

    public PrototypeCapableDocument(String vendorName, String content) {
        this.vendorName = vendorName;
        this.content = content;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;
}
