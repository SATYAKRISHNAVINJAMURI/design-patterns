package com.satya.behavourial.state;

public class MobileDevice {
    private MobileState state;

    public void setState(MobileState state) {
        this.state = state;
    }

    MobileDevice() {
        this.state = new LockState(this);
    }

    public void pressHome() {
        state.home();
    }

    public void pressPower() {
        state.power();
    }

    public void pressVolumeUp() {
        state.volumeUp();
    }

    public static void main(String[] args) {
        MobileDevice mobile = new MobileDevice();
        mobile.pressVolumeUp();
        mobile.pressPower();;
        mobile.pressVolumeUp();
        mobile.pressPower();
        mobile.pressHome();
        mobile.pressVolumeUp();
    }
}
