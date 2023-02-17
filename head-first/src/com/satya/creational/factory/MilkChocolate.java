package com.satya.creational.factory;

public class MilkChocolate extends   Chocolate {

    public MilkChocolate(int weight) {
        super(weight);
        this.type = ChocolateType.MILK;
    }

    public int getCost() {
        return super.getCost();
    }
}
