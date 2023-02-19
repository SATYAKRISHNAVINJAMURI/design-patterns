package com.satya.behavourial.observer;

public interface Subject {

    void subscribe(Customer customer);

    void notifyCustomers();

    void unSubscribe(Customer customer);
}
