package com.satya.creational.factory;

public class HotChocolateFactory implements ChocolateFactory {
    @Override
    public Chocolate getChocolate(int weight) {
        return new HotChocolate(weight);
    }
}
