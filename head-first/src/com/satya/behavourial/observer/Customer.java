package com.satya.behavourial.observer;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void update() {
        System.out.println("Updated customer " + name);
    }
}
