package com.satya.behavourial.chainofreponsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handle();
    public void passOn() {
        if(next == null) {
            return;
        }
        next.handle();
    }
}
