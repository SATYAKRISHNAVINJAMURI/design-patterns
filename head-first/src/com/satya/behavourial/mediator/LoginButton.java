package com.satya.behavourial.mediator;

public class LoginButton {
    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void click() {
        mediator.login();
    }
}
