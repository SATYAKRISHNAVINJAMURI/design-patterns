package com.satya.behavourial.visitor;

public abstract class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void accept(EmailSender emailSender);

}
