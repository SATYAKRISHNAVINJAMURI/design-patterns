package com.satya.structural.adapter;

public class FancyUIServiceImpl implements FancyUIService {
    @Override
    public void displayMenu(JsonData xmlData) {
        System.out.println("Display Fancy Menu");
    }

    @Override
    public void displayProfile(JsonData xmlData) {
        System.out.println("Display fance profile");
    }
}
