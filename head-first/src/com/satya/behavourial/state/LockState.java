package com.satya.behavourial.state;

public class LockState implements MobileState {

    private MobileDevice mobile;

    public LockState(MobileDevice mobile) {
        this.mobile = mobile;
    }
    @Override
    public void power() {
        System.out.println("Switching to Unlock state");
        mobile.setState(new UnLockState(this.mobile));
    }

    @Override
    public void home() {
        System.out.println("Turn on the screen");
    }

    @Override
    public void volumeUp() {
        System.out.println("not supported");
    }
}
