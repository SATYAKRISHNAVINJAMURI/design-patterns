package com.satya.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    System.out.println("Creating object");
                    instance = new Singleton();
                }
            }
        }
        System.out.println("Returing existing instance");
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();
    }
}
