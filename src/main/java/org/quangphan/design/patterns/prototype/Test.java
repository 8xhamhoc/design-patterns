package org.quangphan.design.patterns.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        BundledShapeCache cache = new BundledShapeCache();

        Circle circle = (Circle) cache.get("circle");
        System.out.println("x: " + circle.x);
        System.out.println("y: " + circle.y);
        System.out.println("radius: " + circle.radius);

        Circle circle2 = (Circle) cache.get("circle");

        if (circle.equals(circle2)) {
            System.out.println("They are equal");
        }

        WalletPrototype walletPrototype = new WalletPrototype("891029281", "11111111");
        System.out.println("wallet 1: " + walletPrototype.getWalletNumber() + " - " + walletPrototype.getPassword());

        WalletPrototype walletPrototype1 = (WalletPrototype) walletPrototype.clone();
        walletPrototype1.setPassword("77777777");

        System.out.println("wallet 1: " + walletPrototype1.getWalletNumber() + " - " + walletPrototype1.getPassword());

        System.out.println("wallet 1: " + walletPrototype.getWalletNumber() + " - " + walletPrototype.getPassword());

        System.out.println("======== Deep copy ==========");

        RefType refType = new RefType("value1234");

        DeepCopy deepCopy = new DeepCopy(refType);

        System.out.println("Deep copy 1 value: " + deepCopy.getRefType().getValue());

        DeepCopy deepCopy1 = (DeepCopy) deepCopy.clone();

        System.out.println("Deep copy 2 value: " + deepCopy1.getRefType().getValue());

        refType.setValue("ABC12345");

        System.out.println("Deep copy 1 value: " + deepCopy.getRefType().getValue());
        System.out.println("Deep copy 2 value: " + deepCopy1.getRefType().getValue());

    }

}
