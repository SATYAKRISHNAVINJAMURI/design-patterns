package com.satya.structural.proxy;


public class ProxyDriver {
    public static void main(String[] args) {
        Internet internet = new RealInternet();
        internet.accessInternet();
        Internet internet1 = new ProxyInternet();
        internet1.accessInternet();
    }
}
