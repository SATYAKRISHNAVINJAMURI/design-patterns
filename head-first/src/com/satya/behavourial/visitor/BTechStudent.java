package com.satya.behavourial.visitor;

public class BTechStudent extends Student {
    public BTechStudent(String name, String email) {
        super(name, email);
    }

    @Override
    public void accept(EmailSender emailSender) {
        emailSender.sendBTechEmail();
    }
}
