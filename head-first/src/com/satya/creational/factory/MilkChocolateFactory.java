package com.satya.creational.factory;

public class MilkChocolateFactory implements ChocolateFactory {
    @Override
    public Chocolate getChocolate(int weight) {
        return new MilkChocolate(weight);
    }
}
