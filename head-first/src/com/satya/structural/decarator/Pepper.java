package com.satya.structural.decarator;

public class Pepper extends PizzaDecorator {
    public Pepper(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" Pepper");
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }
}
