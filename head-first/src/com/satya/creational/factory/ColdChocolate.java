package com.satya.creational.factory;

public class ColdChocolate extends   Chocolate {

    public ColdChocolate(int weight) {
        super(weight);
        this.type = ChocolateType.COLD;
    }

    public int getCost() {
        return super.getCost();
    }
}
