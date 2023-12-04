package org.quangphan.design.patterns.cor.callcenter;

public class Respondent extends CallHandler {

    public Respondent(String name) {
        super(name);
    }

    @Override
    protected void handle(Call call) {
        if (call.getType() == Type.SUPPORT) {
            System.out.println("Respondent " + getName() + " take the call");
        } else {
            forward(call);
        }
    }
}
