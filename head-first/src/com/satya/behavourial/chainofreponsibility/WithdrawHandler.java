package com.satya.behavourial.chainofreponsibility;

public class WithdrawHandler extends Handler {
    public WithdrawHandler(Handler handler) {
        super(handler);
    }
    @Override
    public void handle() {
        System.out.println("withdraw money");
        passOn();
    }
}
