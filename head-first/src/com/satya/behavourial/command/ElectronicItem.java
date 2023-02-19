package com.satya.behavourial.command;

public class ElectronicItem {
    boolean switchedOn;

    public void pressSwitch() {
        System.out.println("Turning off lights");
        switchedOn = !switchedOn;
    }
}
