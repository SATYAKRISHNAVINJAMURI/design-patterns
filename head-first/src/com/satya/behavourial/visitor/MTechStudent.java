package com.satya.behavourial.visitor;

public class MTechStudent extends Student {
    public MTechStudent(String name, String email) {
        super(name, email);
    }

    @Override
    public void accept(EmailSender emailSender) {
        emailSender.sendMTechEmail();
    }
}
