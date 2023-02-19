package com.satya.behavourial.state;

public class UnLockState implements MobileState {

    private MobileDevice mobile;

    public UnLockState(MobileDevice mobile) {
        this.mobile = mobile;
    }

    @Override
    public void power() {
        System.out.println("Switching to Lock state");
        mobile.setState(new LockState(this.mobile));
    }

    @Override
    public void home() {
        System.out.println("Show Menu");
    }

    @Override
    public void volumeUp() {
        System.out.println("Increase Volume");
    }
}
