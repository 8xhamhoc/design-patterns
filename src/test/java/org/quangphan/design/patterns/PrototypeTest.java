package org.quangphan.design.patterns;

import org.junit.jupiter.api.Test;
import org.quangphan.design.patterns.prototype.practice.DocumentPrototypeManager;
import org.quangphan.design.patterns.prototype.practice.PrototypeCapableDocument;

public class PrototypeTest {

    @Test
    public void testGetClonedDocument() {

        PrototypeCapableDocument clonedTAC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedTAC.setVendorName("Mary Parker");
        System.out.println(clonedTAC);
        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);

        PrototypeCapableDocument clonedNDA2 = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDA2.setVendorName("Hahaha");
        System.out.println(clonedNDA2);
        System.out.println(clonedNDA);
    }
}
