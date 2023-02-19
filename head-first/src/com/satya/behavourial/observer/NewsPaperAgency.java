package com.satya.behavourial.observer;

import java.util.ArrayList;
import java.util.List;

// Subject
public class NewsPaperAgency implements Subject{
    private List<Customer> customers;

    public NewsPaperAgency() {
        customers = new ArrayList<>();
    }

    @Override
    public void subscribe(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void unSubscribe(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomers() {
        customers.forEach(Customer::update);
    }

    public static void main(String[] args) {
        NewsPaperAgency agency = new NewsPaperAgency();
        Customer satya = new Customer("Satya", "satya.email");
        Customer venky = new Customer("Venky", "venky.email");
        Customer janu = new Customer("Janu", "Janu.email");
        agency.subscribe(satya);
        agency.subscribe(venky);
        agency.subscribe(janu);
        agency.notifyCustomers();
        agency.unSubscribe(satya);
        agency.notifyCustomers();

    }
}
