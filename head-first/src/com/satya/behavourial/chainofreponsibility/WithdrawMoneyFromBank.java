package com.satya.behavourial.chainofreponsibility;

public class WithdrawMoneyFromBank {
    public static void main(String[] args) {
        Handler handler = new LoginHandler(new WithdrawHandler(new LogoutHandler(null)));
        handler.handle();
    }
}
