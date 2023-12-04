package org.quangphan.design.patterns.cor.atm;

public class Dollar50Dispense implements DispenseChain {

    protected DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {

    }
}
