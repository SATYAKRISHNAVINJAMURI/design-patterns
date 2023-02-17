package com.satya.creational.factory;

public class ColdChocolateFactory implements ChocolateFactory {
    @Override
    public Chocolate getChocolate(int weight) {
        return new ColdChocolate(weight);
    }
}
