package com.satya.behavourial.chainofreponsibility;

public class LoginHandler extends Handler {
    public LoginHandler(Handler handler) {
        super(handler);
    }
    @Override
    public void handle() {
        System.out.println("logged in");
        passOn();
    }
}
