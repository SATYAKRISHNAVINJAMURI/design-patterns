package com.satya.behavourial.mediator;

public class WebPage {
    public static void main(String[] args) {
        LoginButton loginButton = new LoginButton();
        TextBox userName = new TextBox("satya");
        TextBox password = new TextBox("hello");
        Mediator mediator = new Dialog(userName, password);
        loginButton.setMediator(mediator);
        loginButton.click();
    }
}
