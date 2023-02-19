package com.satya.structural.adapter;

public class UIServiceImpl implements UIService {
    @Override
    public void displayMenu(XmlData xmlData) {
        System.out.println("Display menu.");
    }

    @Override
    public void displayProfile(XmlData xmlData) {
        System.out.println("Display name.");
    }
}
