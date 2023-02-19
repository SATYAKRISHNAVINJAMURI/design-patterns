package com.satya.behavourial.chainofreponsibility;

public class LogoutHandler extends Handler {
    public LogoutHandler(Handler handler) {
        super(handler);
    }
    @Override
    public void handle() {
        System.out.println("logout");
        passOn();
    }
}
