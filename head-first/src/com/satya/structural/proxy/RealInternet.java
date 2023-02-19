package com.satya.structural.proxy;

public class RealInternet implements Internet {
    @Override
    public void accessInternet() {
        System.out.println("Accessing Internet");
    }
}
