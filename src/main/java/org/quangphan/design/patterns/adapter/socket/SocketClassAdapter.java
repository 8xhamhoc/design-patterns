package org.quangphan.design.patterns.adapter.socket;

public class SocketClassAdaptper extends Socket implements SocketAdapter {
    
    @Override
    public Volt get120Volt() {
        return null;
    }

    @Override
    public Volt get12Volt() {
        return null;
    }

    @Override
    public Volt get3Volt() {
        return null;
    }
}
