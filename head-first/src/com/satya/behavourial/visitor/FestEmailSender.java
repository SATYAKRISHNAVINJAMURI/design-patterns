package com.satya.behavourial.visitor;

public class FestEmailSender implements EmailSender {
    @Override
    public void sendBTechEmail() {
        System.out.println("Send M Tech fest email");
    }

    @Override
    public void sendMTechEmail() {
        System.out.println("Send B Tech fest email");
    }
}
