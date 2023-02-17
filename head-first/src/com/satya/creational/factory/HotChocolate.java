package com.satya.creational.factory;

public class HotChocolate extends   Chocolate {

    public HotChocolate(int weight) {
        super(weight);
        this.type = ChocolateType.HOT;
    }

    public int getCost() {
        return 2 * super.getCost();
    }
}
