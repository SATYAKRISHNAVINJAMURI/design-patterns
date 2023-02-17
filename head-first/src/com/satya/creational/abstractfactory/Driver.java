package com.satya.creational.abstractfactory;

public class Driver {

    public static void main(String[] args) {
        Company company = new MsuCompany();
        company.createGpu();
    }
}
