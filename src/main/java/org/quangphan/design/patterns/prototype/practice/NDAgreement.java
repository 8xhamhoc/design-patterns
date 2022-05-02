package org.quangphan.design.patterns.prototype.practice;

public class NDAgreement extends PrototypeCapableDocument {

    private AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }

    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
    }

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        NDAgreement ndAgreement = (NDAgreement) super.clone();
        AuthorizedSignatory authorizedSignatory = (AuthorizedSignatory) ndAgreement.getAuthorizedSignatory().clone();
        ndAgreement.setAuthorizedSignatory(authorizedSignatory);
        return ndAgreement;
    }

    @Override
    public String toString() {
        return "NDAgreement{" +
                "authorizedSignatory=" + authorizedSignatory +
                ", vendorName=" + getVendorName() +
                '}';
    }
}
