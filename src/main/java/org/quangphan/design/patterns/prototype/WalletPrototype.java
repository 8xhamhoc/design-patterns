package org.quangphan.design.patterns.prototype;

public class WalletPrototype implements Cloneable {

    private String walletNumber;
    private String password;

    public WalletPrototype() {
    }

    public WalletPrototype(String walletNumber, String password) {
        this.walletNumber = walletNumber;
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getWalletNumber() {
        return walletNumber;
    }

    public void setWalletNumber(String walletNumber) {
        this.walletNumber = walletNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
