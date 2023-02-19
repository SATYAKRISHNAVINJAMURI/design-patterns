package com.satya.structural.proxy;

public class ProxyInternet implements Internet {
    @Override
    public void accessInternet() {
        System.out.println("Filter out unwanted websites");
        System.out.println("Accessing Internet");
    }
}
