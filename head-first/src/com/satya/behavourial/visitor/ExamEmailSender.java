package com.satya.behavourial.visitor;

public class ExamEmailSender implements EmailSender {
    @Override
    public void sendBTechEmail() {
        System.out.println("Send B Tech exam email");
    }

    @Override
    public void sendMTechEmail() {
        System.out.println("Send M Tech exam email");
    }
}
