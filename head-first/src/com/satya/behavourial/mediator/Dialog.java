package com.satya.behavourial.mediator;

public class Dialog implements Mediator {
    TextBox userName;
    TextBox password;
    public Dialog(TextBox userName, TextBox password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void login() {
        System.out.println("Logged in " + userName);
    }
}
